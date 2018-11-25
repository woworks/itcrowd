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
        date: new Date(),
        body: 'one one one',
        category: 'CategoryOne'
      },
      {
        id: '2',
        title: 'This is the title number Two',
        date: new Date(),
        body: 'one one one',
        category: 'CategoryTwo'
      }
      ];
  }

}
