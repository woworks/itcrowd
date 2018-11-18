import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Book} from "../models/book";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private url='http://localhost:8080/api';
  private endpoint = 'books';

  constructor(private httpClient: HttpClient) { }

  list(): Observable<Book[]> {
    let headers: HttpHeaders = new HttpHeaders({
      'Authorization': 'Basic ' + sessionStorage.getItem('token')
    });

    let options = { headers: headers };
    return this.httpClient
      .get<Book[]>(`${this.url}/${this.endpoint}`, options);
  }

  getById(id: number): Observable<Book> {
    return this.httpClient
      .get<Book>(`${this.url}/${this.endpoint}/${id}`);
  }

  save(book: Book): Observable<Book> {
    console.log(JSON.stringify(book));
    console.log(`${this.url}/${this.endpoint}/${book.id}`);
    return this.httpClient
      .post<Book>(`${this.url}/${this.endpoint}/${book.id}`, book);
  }

  authOptions() {
    let headers: HttpHeaders = new HttpHeaders({
      'Authorization': 'Basic ' + sessionStorage.getItem('token')
    });

    let options = { headers: headers };

    return options;
  }
}
