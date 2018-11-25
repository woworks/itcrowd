import { Component, OnInit } from '@angular/core';
import { PostsService } from "../../shared/services/posts.service";
import { Post } from "../../shared/models/post";
import { ActivatedRoute } from "@angular/router";

@Component({
  selector: 'app-view-post',
  templateUrl: './view-post.component.html',
  styleUrls: ['./view-post.component.css']
})
export class ViewPostComponent implements OnInit {

  post: Post;

  constructor(private postService: PostsService, private route: ActivatedRoute) {
  }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      let id = params.get('id');
      console.log('id  = ', id);

      this.postService.getById(id).subscribe(data => {
        this.post = data;
      })

    });
  }

}
