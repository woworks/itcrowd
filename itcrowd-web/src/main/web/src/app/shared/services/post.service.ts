import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import { Observable } from "rxjs";
import { environment } from "../../../environments/environment";
import { Post } from "../models/post";


@Injectable({
  providedIn: 'root'
})
export class PostService {

  private url = environment.api;
  private endpoint = 'posts';

  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Post[]> {
    return this.httpClient
      .get<Post[]>(`${this.url}/${this.endpoint}`);
  }

  getRecent(size: number): Observable<Post[]> {
    const options = size ? {params: new HttpParams().set('size', size.toString())} : {};
    return this.httpClient
      .get<Post[]>(`${this.url}/${this.endpoint}/recent`, options);
  }

  getPopular(size: number): Observable<Post[]> {
    const options = size ? {params: new HttpParams().set('size', size.toString())} : {};
    return this.httpClient
      .get<Post[]>(`${this.url}/${this.endpoint}/popular`, options);
  }

  getById(id: String): Observable<Post> {
    return this.httpClient
      .get<Post>(`${this.url}/${this.endpoint}/${id}`);
  }

  save(post: Post): Observable<Post> {
    console.log('post to save = ', JSON.stringify(post));

    return this.httpClient
      .post<Post>(`${this.url}/${this.endpoint}`, post);
  }
}
