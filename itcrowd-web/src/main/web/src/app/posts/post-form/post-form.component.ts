import { Component, Input, OnInit } from '@angular/core';
import { EditorModule } from 'primeng/editor';
import { ChipsModule } from 'primeng/chips';
import { Post } from "../../shared/models/post";
import { SelectItem } from "primeng/api";
import { PostsService } from "../../shared/services/posts.service";
import { Router } from "@angular/router";


@Component({
  selector: 'app-post-form',
  templateUrl: './post-form.component.html',
  styleUrls: ['./post-form.component.css']
})
export class PostFormComponent implements OnInit {

  @Input()
  post: Post;

  categories: SelectItem[] = [
    {label: 'Select City', value: null},
    {label: 'Category1', value: 'Category1'},
    {label: 'Category2', value: 'Category2'},
    {label: 'Category3', value: 'Category3'}
  ];

  constructor(private postsService: PostsService, private router: Router) {
  }

  ngOnInit() {
    console.log('post = ', this.post);
    if (!this.post) {
      this.post = new Post();
      this.post.id = null;
    }
  }

  save() {
    console.log('post save = ' + JSON.stringify(this.post));
    this.postsService.save(this.post).subscribe(data => {
      console.log('Post was saved: id = ', data.id);
      this.router.navigate(['/']);
    });
  }
}
