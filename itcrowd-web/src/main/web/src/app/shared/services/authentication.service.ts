import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';
import {User} from "../models/user";
import {el} from "@angular/platform-browser/testing/src/browser_util";
import {BehaviorSubject, Observable} from "rxjs";
import { environment } from "../../../environments/environment";

@Injectable({ providedIn: 'root' })
export class AuthenticationService {

  currentUserSubject = new BehaviorSubject<User>(this.getCurrentUserFromStorage());

  constructor(private http: HttpClient) { }

  apiUrl = environment.server;
  private endpoint = 'users';

  login2(username: string, password: string) {
    return this.http.post<any>(`${this.apiUrl}authenticate`, { username, password })
      .pipe(map(user => {
        // login successful if there's a user in the response
        if (user) {
          // store user details and basic auth credentials in local storage
          // to keep user logged in between page refreshes
          user.authdata = window.btoa(username + ':' + password);
          let userStr = JSON.stringify(user);
          localStorage.setItem('currentUser', userStr);
          this.currentUserSubject.next(user);
        }

        return user;
      }));
  }

  login(username: string, password: string) {

    const headers = new HttpHeaders({
      authorization : 'Basic ' + btoa(username + ':' + password)
    });

    return this.http.get<any>(`${this.apiUrl}user/${username}`, {headers: headers})
      .pipe(map(user => {
        // login successful if there's a user in the response
        if (user) {
          // store user details and basic auth credentials in local storage
          // to keep user logged in between page refreshes
          user.authdata = window.btoa(username + ':' + password);
          let userStr = JSON.stringify(user);
          localStorage.setItem('currentUser', userStr);
          this.currentUserSubject.next(user);
        }

        return user;
      }));
  }

  logout() {
    // remove user from local storage to log user out
    localStorage.removeItem('currentUser');
    this.currentUserSubject.next(null);
  }

  public getCurrentUser(): Observable<User> {
    return this.currentUserSubject.asObservable();
  }

  private getCurrentUserFromStorage(): User {
    let currentUser = localStorage.getItem('currentUser');
    if (currentUser){
      return JSON.parse(currentUser) as User;
    } else {
      return null;
    }
  }
}
