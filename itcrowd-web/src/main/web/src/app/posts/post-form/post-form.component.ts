import { Component, Input, OnInit } from '@angular/core';
import { EditorModule } from 'primeng/editor';
import { ChipsModule } from 'primeng/chips';
import { Post } from "../../shared/models/post";
import { SelectItem } from "primeng/api";
import { PostService } from "../../shared/services/post.service";
import { Router } from "@angular/router";
import { CategoryService } from '../../shared/services/category.service';
import { FileService } from "../../shared/services/file.service";
import { environment } from '../../../environments/environment';


@Component({
  selector: 'app-post-form',
  templateUrl: './post-form.component.html',
  styleUrls: ['./post-form.component.css']
})
export class PostFormComponent implements OnInit {

  @Input()
  post: Post;

  uploadURL = environment.api + '/files/upload';
  uploadedFiles: any[] = [];



  categories: SelectItem[] = [
    {label: 'Select Category', value: null}
  ];

  constructor(private postService: PostService, private categoryService: CategoryService, private router: Router,
              private fileService: FileService) {
  }

  ngOnInit() {
    console.log('post = ', this.post);
    if (!this.post) {
      this.post = new Post();
      this.post.id = null;
    }


    this.categoryService.getAll().subscribe(data => {
      data.forEach(cat => this.categories.push({label: cat.name, value: cat.code}));
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
      this.fileService.upload(file).subscribe(data => console.log('reply from upload = ', JSON.stringify(data)));
    });
  }
}
