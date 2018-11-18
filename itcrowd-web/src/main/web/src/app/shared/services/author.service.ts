import { Injectable } from '@angular/core';
import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";
import {Author} from "../models/author";

@Injectable({
  providedIn: 'root'
})
export class AuthorService {

  private url='http://localhost:8080/api';
  private endpoint = 'authors';

  constructor(private httpClient: HttpClient) { }

  list(): Observable<Author[]> {
    return this.httpClient
      .get<Author[]>(`${this.url}/${this.endpoint}`);
  }
}
