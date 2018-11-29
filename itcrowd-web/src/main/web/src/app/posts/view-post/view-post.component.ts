import { Component, OnInit } from '@angular/core';
import { PostService } from "../../shared/services/post.service";
import { Post } from "../../shared/models/post";
import { ActivatedRoute } from "@angular/router";
import { environment } from "../../../environments/environment";
import { AuthenticationService } from "../../shared/services/authentication.service";
import { User } from "../../shared/models/user";

@Component({
  selector: 'app-view-post',
  templateUrl: './view-post.component.html',
  styleUrls: ['./view-post.component.css']
})
export class ViewPostComponent implements OnInit {

  post: Post = new Post();
  imageURL: string;
  private currentUser: User;

  constructor(private postService: PostService, private route: ActivatedRoute, private authService: AuthenticationService) {
  }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      let id = params.get('id');
      this.postService.getById(id).subscribe(data => {
        this.post = data;
        this.imageURL = encodeURI(environment.server + 'images/' + data.imageFileName);
      })

    });
    this.authService.getCurrentUser().subscribe(user => this.currentUser = user);
  }

  loggedIn(): boolean {
    return this.currentUser != null;
  }



}
