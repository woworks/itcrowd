import { Component, OnInit } from '@angular/core';
import {AuthenticationService} from "../../services/authentication.service";
import {User} from "../../models/user";
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  currentUser: User;

  constructor(private authService: AuthenticationService, private router: Router) { }

  ngOnInit() {
    this.authService.getCurrentUser().subscribe(user => this.currentUser = user);
  }

  logout() {
    this.authService.logout();
    this.router.navigate(['/']);
  }

  loggedIn(): boolean {
    return this.currentUser != null;
  }
}
