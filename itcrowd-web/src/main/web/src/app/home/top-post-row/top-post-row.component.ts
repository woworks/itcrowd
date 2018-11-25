import { Component, OnInit } from '@angular/core';
import {Post} from "../../shared/models/post";

@Component({
  selector: 'app-top-post-row',
  templateUrl: './top-post-row.component.html',
  styleUrls: ['./top-post-row.component.css']
})
export class TopPostRowComponent implements OnInit {
  topPosts: Post[];

  constructor() { }

  ngOnInit() {
    this.topPosts = [
      {
        id: '1',
        title: 'This is the title number One',
        createdDate: new Date(),
        modifiedDate: new Date(),
        body: 'one one one',
        category: 'CategoryOne',
        tags: ['one', 'two', 'three'],
        authorName: 'Admin Administrator',
        authorUsername: 'admin',
        views: 0,
        upVotes: 0,
        downVotes: 0
      },
      {
        id: '2',
        title: 'This is the title number Two',
        createdDate: new Date(),
        modifiedDate: new Date(),
        body: 'one one one',
        category: 'CategoryTwo',
        tags: ['one', 'two', 'three'],
        authorName: 'Admin Administrator',
        authorUsername: 'admin',
        views: 0,
        upVotes: 0,
        downVotes: 0
      }
      ];
  }

}
