import { RouterModule, Routes } from "@angular/router";
import { NgModule } from "@angular/core";
import { LoginComponent } from "./login/login.component";
import { AuthGuard } from "./shared/guards/auth.guard";
import { HomeComponent } from "./home/home.component";
import { SignupComponent } from "./signup/signup.component";
import { ViewPostComponent } from "./posts/view-post/view-post.component";
import { NewPostComponent } from "./posts/new-post/new-post.component";
import { EditPostComponent } from "./posts/edit-post/edit-post.component";

const routes: Routes = [
  { path: '' , component: HomeComponent},
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },
  {
    path: 'posts',
    children: [
      {
        path: 'add',
        component: NewPostComponent,
        canActivate: [AuthGuard],
      },
      {
        path: ':id',
        component: ViewPostComponent
      },
      {
        path: ':id/edit',
        component: EditPostComponent,
        canActivate: [AuthGuard],
      },

    ]
  }
  /*{
    path: 'books',
    children: [
      {
        path: '',
        component: BooksComponent,
        canActivate: [AuthGuard],
      },
      {
        path: ':id',
        component: BookComponent,
        canActivate: [AuthGuard]
      }
    ]
  }*/
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ],
  providers: []
})

export class AppRoutingModule {

}
