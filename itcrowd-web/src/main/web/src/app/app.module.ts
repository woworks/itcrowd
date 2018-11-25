import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BooksComponent } from './books/books.component';
import { BookComponent } from './book/book.component';
import { TableModule } from "primeng/table";
import { AppRoutingModule } from "./app-routing.module";
import { HTTP_INTERCEPTORS, HttpClientModule } from "@angular/common/http";
import { FormsModule } from "@angular/forms";
import { CheckboxModule, ChipsModule, DropdownModule, EditorModule } from "primeng/primeng";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { LoginComponent } from './login/login.component';
import { BasicAuthInterceptor } from "./shared/helpers/basic-auth.interceptor";
import { ErrorInterceptor } from "./shared/helpers/error.interceptor";
import { HeaderComponent } from './shared/components/header/header.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './shared/components/footer/footer.component';
import { TopPostRowComponent } from './home/top-post-row/top-post-row.component';
import { RecentPostsComponent } from './home/recent-posts/recent-posts.component';
import { MainBlockComponent } from './home/main-block/main-block.component';
import { FeaturedPostsComponent } from './home/featured-posts/featured-posts.component';
import { BottomBlockComponent } from './home/bottom-block/bottom-block.component';
import { PostCardComponent } from './shared/components/post-card/post-card.component';
import { PostCardBigComponent } from './shared/components/post-card-big/post-card-big.component';
import { SignupComponent } from './signup/signup.component';
import { ViewPostComponent } from './posts/view-post/view-post.component';
import { NewPostComponent } from './posts/new-post/new-post.component';
import { PostFormComponent } from './posts/post-form/post-form.component';

@NgModule({
  declarations: [
    AppComponent,
    BooksComponent,
    BookComponent,
    LoginComponent,
    HeaderComponent,
    HomeComponent,
    FooterComponent,
    TopPostRowComponent,
    RecentPostsComponent,
    MainBlockComponent,
    FeaturedPostsComponent,
    BottomBlockComponent,
    PostCardComponent,
    PostCardBigComponent,
    SignupComponent,
    ViewPostComponent,
    NewPostComponent,
    PostFormComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    //primeng modules
    TableModule,
    DropdownModule,
    CheckboxModule,
    EditorModule,
    ChipsModule
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: BasicAuthInterceptor, multi: true },
    { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true },
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
