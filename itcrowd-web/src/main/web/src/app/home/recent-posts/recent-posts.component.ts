import {Component, OnInit} from '@angular/core';
import {Post} from "../../shared/models/post";
import { PostService } from '../../shared/services/post.service';

@Component({
  selector: 'app-recent-posts',
  templateUrl: './recent-posts.component.html',
  styleUrls: ['./recent-posts.component.css']
})
export class RecentPostsComponent implements OnInit {

  recentPosts: Post[];

  constructor(private postService: PostService) {
  }

  ngOnInit() {
    this.postService.getRecent(6).subscribe(data => {
      this.recentPosts = data;
    });
  }

}
