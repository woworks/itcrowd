import { Component, OnInit } from '@angular/core';
import {Post} from "../../shared/models/post";
import { PostService } from '../../shared/services/post.service';

@Component({
  selector: 'app-top-post-row',
  templateUrl: './top-post-row.component.html',
  styleUrls: ['./top-post-row.component.css']
})
export class TopPostRowComponent implements OnInit {
  topPosts: Post[];

  constructor(private postService: PostService) { }

  ngOnInit() {
    this.postService.getPopular(2).subscribe(data => {
      this.topPosts = data;
    });
  }

}
