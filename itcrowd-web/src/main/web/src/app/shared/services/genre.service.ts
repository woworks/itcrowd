import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Author } from "../models/author";

@Injectable({
  providedIn: 'root'
})
export class GenreService {

  private url='http://localhost:8080/api';
  private endpoint = 'genres';

  constructor(private httpClient: HttpClient) { }

  list(): Observable<Author[]> {
    return this.httpClient
      .get<Author[]>(`${this.url}/${this.endpoint}`);
  }
}
