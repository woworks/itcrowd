import { Component, OnInit } from '@angular/core';
import '../../node_modules/primeng/resources/themes/omega/theme.css';
import '../../node_modules/primeng/resources/primeng.min.css';
import { AuthenticationService } from "./shared/services/authentication.service";
import { NavigationEnd, Router } from "@angular/router";
import { filter } from "rxjs/operators";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'itcrowd-app';
  userName;

  constructor(private authenticationService: AuthenticationService, private router: Router) {
    router.events.pipe(
      filter(event => event instanceof NavigationEnd)
    ).subscribe((event: NavigationEnd) => {
      console.log(event.url);
/*      let currentUser = this.authenticationService.getCurrentUser();
      if (currentUser){
        this.userName = currentUser.username;
      } else {
        this.userName = '';
      }*/
    });
  }

/*
  logout() {
    console.log('clearing currentUser');
    this.authenticationService.logout();
  }
*/
}
