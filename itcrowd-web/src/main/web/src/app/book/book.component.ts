import { Component, OnInit } from '@angular/core';
import { Book } from "../shared/models/book";
import {ActivatedRoute, Router} from "@angular/router";
import { BookService} from "../shared/services/book.service";
import { Author} from "../shared/models/author";
import { Genre } from "../shared/models/genre";
import { AuthorService } from "../shared/services/author.service";
import { GenreService } from "../shared/services/genre.service";

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  book: Book = {id: 0, title: '', author: null, genres: []};
  authors: Author[];
  genres: Genre[];
  selectedGenres: string[] = [];

  constructor(private route: ActivatedRoute, private bookService: BookService, private authorService: AuthorService,
              private genreService: GenreService, private router: Router) { }

  ngOnInit() {

    this.authorService.list().subscribe(data => {
      this.authors = data;
    });


    this.route.paramMap.subscribe(params => {
      let id = params.get('id');
      console.log('id  = ', id);
      if (id === 'new') {
        this.book = {
          author: null,
          genres: [],
          id: -1,
          title: ''
        };
        this.genreService.list().subscribe(data => {
          this.genres = data;
        });
      } else {
        this.bookService.getById(Number(id)).subscribe(data => {
          this.book = data;

          this.genreService.list().subscribe(data => {
            this.genres = data;
          });

          data.genres.forEach(item => this.selectedGenres.push('' + item.id));
        })
      }

    });
  }

  saveBook() {
    console.log('book save = ' + JSON.stringify(this.book));
    this.bookService.save(this.book).subscribe(data => {
      console.log('Book was saved');
      this.router.navigate(['/books']);
    });
  }

 cancel() {
   this.router.navigate(['/books']);
 }

 toggleGenre($event: any) {
    this.book.genres = [];
    this.genres.forEach(genre => {
      if (this.selectedGenres.lastIndexOf('' + genre.id) >= 0) {
        this.book.genres.push(genre);
      }
    });
  }
}
