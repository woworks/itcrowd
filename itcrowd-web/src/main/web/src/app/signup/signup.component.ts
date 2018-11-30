import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { first } from "rxjs/operators";
import { UserService } from "../shared/services/user.service";
import { Router } from "@angular/router";
import { User } from "../shared/models/user";

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  loading = false;
  submitted = false;
  user: User;

  constructor(private userService: UserService, private router: Router, private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.user = new User();
  }

  submit() {
    console.log('on submit - ', JSON.stringify(this.user));
    this.submitted = true;

    this.loading = true;
    this.userService.register(this.user)
      .pipe(first())
      .subscribe(
        data => {
          //this.alertService.success('Registration successful', true);
          this.router.navigate(['/login']);
          console.log('REGISTERED OK');
        },
        error => {
          //this.alertService.error(error);
          this.loading = false;
          console.log('ERROR WHEN REGISTER');
        });
  }

}
