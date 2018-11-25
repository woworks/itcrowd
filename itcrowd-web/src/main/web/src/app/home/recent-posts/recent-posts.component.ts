import {Component, OnInit} from '@angular/core';
import {Post} from "../../shared/models/post";

@Component({
  selector: 'app-recent-posts',
  templateUrl: './recent-posts.component.html',
  styleUrls: ['./recent-posts.component.css']
})
export class RecentPostsComponent implements OnInit {

  private recentPosts: Post[];

  constructor() {
  }

  ngOnInit() {
    this.recentPosts = [
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
      },
      {
        id: '3',
        title: 'This is the title number Three',
        date: new Date(),
        body: 'one one one',
        category: 'CategoryThree'
      },
      {
        id: '4',
        title: 'This is the title number Four',
        date: new Date(),
        body: 'one one one',
        category: 'CategoryFour'
      },
      {
        id: '5',
        title: 'This is the title number Five',
        date: new Date(),
        body: 'one one one',
        category: 'CategoryFive'
      },
      {
        id: '6',
        title: 'This is the title number Six',
        date: new Date(),
        body: 'one one one',
        category: 'CategorySix'
      },
    ];
  }

}
