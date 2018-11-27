import { Component, Input, OnInit } from '@angular/core';
import { EditorModule } from 'primeng/editor';
import { ChipsModule } from 'primeng/chips';
import { Post } from "../../shared/models/post";
import { SelectItem } from "primeng/api";
import { PostService } from "../../shared/services/post.service";
import { Router } from "@angular/router";
import { CategoryService } from '../../shared/services/category.service';


@Component({
  selector: 'app-post-form',
  templateUrl: './post-form.component.html',
  styleUrls: ['./post-form.component.css']
})
export class PostFormComponent implements OnInit {

  @Input()
  post: Post;

  uploadedFiles: any[] = [];

  categories: SelectItem[] = [
    {label: 'Select Category', value: null}
  ];

  constructor(private postService: PostService, private categoryService: CategoryService, private router: Router) {
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
}
