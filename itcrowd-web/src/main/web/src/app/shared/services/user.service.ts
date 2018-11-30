import { Injectable } from '@angular/core';
import { User } from "../models/user";
import { HttpClient } from "@angular/common/http";
import { environment } from "../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private url = environment.server;
  private endpoint = 'users';

  constructor(private httpClient: HttpClient) { }

  register(user: User) {
    return this.httpClient.post(`${this.url}register`, user);
  }
}
