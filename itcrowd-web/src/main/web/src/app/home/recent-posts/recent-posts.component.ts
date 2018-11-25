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
      },
      {
        id: '3',
        title: 'This is the title number Three',
        createdDate: new Date(),
        modifiedDate: new Date(),
        body: 'one one one',
        category: 'CategoryThree',
        tags: ['one', 'two', 'three'],
        authorName: 'Admin Administrator',
        authorUsername: 'admin',
        views: 0,
        upVotes: 0,
        downVotes: 0
      },
      {
        id: '4',
        title: 'This is the title number Four',
        createdDate: new Date(),
        modifiedDate: new Date(),
        body: 'one one one',
        category: 'CategoryFour',
        tags: ['one', 'two', 'three'],
        authorName: 'Admin Administrator',
        authorUsername: 'admin',
        views: 0,
        upVotes: 0,
        downVotes: 0
      },
      {
        id: '5',
        title: 'This is the title number Five',
        createdDate: new Date(),
        modifiedDate: new Date(),
        body: 'one one one',
        category: 'CategoryFive',
        tags: ['one', 'two', 'three'],
        authorName: 'Admin Administrator',
        authorUsername: 'admin',
        views: 0,
        upVotes: 0,
        downVotes: 0
      },
      {
        id: '6',
        title: 'This is the title number Six',
        createdDate: new Date(),
        modifiedDate: new Date(),
        body: 'one one one',
        category: 'CategorySix',
        tags: ['one', 'two', 'three'],
        authorName: 'Admin Administrator',
        authorUsername: 'admin',
        views: 0,
        upVotes: 0,
        downVotes: 0
      },
    ];
  }

}
