import {Component, Input, OnInit} from '@angular/core';
import {Post} from "../../models/post";

@Component({
  selector: 'app-post-card-big',
  templateUrl: './post-card-big.component.html',
  styleUrls: ['./post-card-big.component.css']
})
export class PostCardBigComponent implements OnInit {

  @Input()
  post: Post;

  constructor() { }

  ngOnInit() {
  }

}
