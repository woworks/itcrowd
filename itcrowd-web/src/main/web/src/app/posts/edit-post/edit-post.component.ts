import { Component, OnInit } from '@angular/core';
import { Post } from "../../shared/models/post";
import { PostService } from "../../shared/services/post.service";
import { ActivatedRoute } from "@angular/router";

@Component({
  selector: 'app-edit-post',
  templateUrl: './edit-post.component.html',
  styleUrls: ['./edit-post.component.css']
})
export class EditPostComponent implements OnInit {
  postToEdit: Post;

  constructor(private postService: PostService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      let id = params.get('id');
      this.postService.getById(id).subscribe(data => {
        this.postToEdit = data;
        //this.imageURL = encodeURI(environment.server + 'images/' + data.imageFileName);
      })

    });
  }

}
