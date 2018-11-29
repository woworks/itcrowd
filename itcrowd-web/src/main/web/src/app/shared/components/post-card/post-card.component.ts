import {Component, Input, OnInit} from '@angular/core';
import {Post} from "../../models/post";
import { environment } from "../../../../environments/environment";

@Component({
  selector: 'app-post-card',
  templateUrl: './post-card.component.html',
  styleUrls: ['./post-card.component.css']
})
export class PostCardComponent implements OnInit {

  @Input()
  post: Post;

  imagesLocation: string;

  constructor() { }

  ngOnInit() {
    this.imagesLocation = environment.server + 'images';
  }

}
