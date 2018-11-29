export class Post {
  id: string;
  title: string;
  body: string;
  createdDate: Date;
  modifiedDate: Date;
  categoryCode: string;
  category: string;
  imageFileName: string;
  tags: string[];
  authorName: string;
  authorUsername: string;
  views: number;
  upVotes: number;
  downVotes: number;
  rating: number;
}
