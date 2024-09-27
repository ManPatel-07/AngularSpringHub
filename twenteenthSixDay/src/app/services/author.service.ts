import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthorService {

  constructor(private http:HttpClient) { }

  private postAuthURL = "http://localhost:8080/author/save";
  private postBookURL = "http://localhost:8080/book/save";

  createAuthor(data: any)
  {
    return this.http.post(`${this.postAuthURL}`, data);
  }

  createBook(data: any)
  {
    return this.http.post(`${this.postBookURL}`, data);
  }
}
