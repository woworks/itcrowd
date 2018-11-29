import { Component, Input, OnInit } from '@angular/core';
import { Post } from "../../shared/models/post";
import { SelectItem } from "primeng/api";
import { PostService } from "../../shared/services/post.service";
import { Router } from "@angular/router";
import { CategoryService } from '../../shared/services/category.service';
import { FileService } from "../../shared/services/file.service";
import { environment } from '../../../environments/environment';
import { Location } from '@angular/common';

interface City {
  name: string;
  code: string;
}

@Component({
  selector: 'app-post-form',
  templateUrl: './post-form.component.html',
  styleUrls: ['./post-form.component.css']
})
export class PostFormComponent implements OnInit {

  @Input()
  post: Post;

  imageURL: string;

  selectedCategory: SelectItem;
  categories: SelectItem[] = [
    {label: 'Select Category', value: null}
  ];

  uploadURL = environment.api + '/files/upload';
  uploadedFiles: any[] = [];


  cities1: SelectItem[];
  selectedCity1: City;

  constructor(private postService: PostService, private categoryService: CategoryService, private router: Router,
              private fileService: FileService, private location: Location) {
  }

  ngOnInit() {

    if (!this.post) {
      this.post = new Post();
      this.post.id = null;
     }

    this.categoryService.getAll().subscribe(data => {

      let selected: number = 0;
      data.forEach((cat, num) => {
        this.categories.push({label: cat.name, value: cat});
        if (this.post.categoryCode == cat.code){
          selected = num;
        }
      });

      this.selectedCategory = this.categories[selected + 1].value;
      this.imageURL = encodeURI(environment.server + 'images/' + this.post.imageFileName);
    });


  }

  save() {
    console.log('post save = ' + JSON.stringify(this.post));
    this.postService.save(this.post).subscribe(data => {
      console.log('Post was saved: id = ', data.id);
      this.router.navigate(['/']);
    });
  }

  fileUploader(event) {
    event.files.forEach(file => {
      console.log('file = ', JSON.stringify(file));
      this.fileService.upload(file).subscribe(
        filename => {
          console.log('reply from upload: filename = ', filename);
          this.post.imageFileName = filename;
        }
      );
    });
  }

  bindCategory($event: any) {
    let category = $event.value;
    this.post.category = category.name;
    this.post.categoryCode = category.code;
  }

  cancel() {
    this.location.back();
  }
}
