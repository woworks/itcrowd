import { Injectable } from '@angular/core';
import { environment } from "../../../environments/environment";
import { Post } from "../models/post";
import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class FileService {

  private url = environment.api;
  private endpoint = 'files';

  constructor(private httpClient: HttpClient) { }

  upload(file: File): Observable<Object> {
    console.log('file to save = ', JSON.stringify(file.name));
    // this.http is the injected HttpClient
    const uploadData = new FormData();
    uploadData.append('file', file, file.name);
    return this.httpClient.post(`${this.url}/${this.endpoint}/upload`, uploadData);
  }
}
