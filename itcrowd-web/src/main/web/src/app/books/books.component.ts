import { Component, OnInit } from '@angular/core';
import {Book} from "../shared/models/book";
import {BookService} from "../shared/services/book.service";

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  books: Book[];

  constructor(private bookService: BookService) { }

  ngOnInit() {
    this.bookService.list().subscribe(data => {
      this.books = data;
    });
  }

}
