import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthorService {

  private getUrl = 'http://localhost:8080/author/getAll';
  private postUrl = 'http://localhost:8080/author/save';

  constructor(private http:HttpClient) { }

  getAuthors()
  {
    return this.http.get(`${this.getUrl}`);
  }

  createAuthor(author: Object)
  {
    return this.http.post(`${this.postUrl}`, author);
  }

}
