import { Injectable } from '@angular/core';
import { environment } from '../../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Category } from '../models/category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private url = environment.api;
  private endpoint = 'categories';

  constructor(private httpClient: HttpClient) {
  }

  public getAll(): Observable<Category[]> {
    return this.httpClient
      .get<Category[]>(`${this.url}/${this.endpoint}`);
  }

  getTop(num: number): Observable<Category[]> {
    return this.httpClient
      .get<Category[]>(`${this.url}/${this.endpoint}?top=$num`);
  }
}
