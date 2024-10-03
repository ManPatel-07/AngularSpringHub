import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthorService {

  private getUrl = 'http://localhost:8080/author/getAll';
  private postUrl = 'http://localhost:8080/author/save';
  private getByIdUrl = 'http://localhost:8080/author/getByIdAuthor';
  private putByIdUrl = 'http://localhost:8080/author/updateById';
  private delteByIdUrl = 'http://localhost:8080/author/delete';

  constructor(private http:HttpClient) { }

  getAuthors()
  {
    return this.http.get(`${this.getUrl}`);
  }

  createAuthor(author: Object)
  {
    return this.http.post(`${this.postUrl}`, author);
  }

  getAuthorById(author_id: number)
  {
    return this.http.get(`${this.getByIdUrl}/${author_id}`);
  }

  putAuthorById(author_id: number, author: any)
  {
    return this.http.put(`${this.putByIdUrl}/${author_id}`, author);
  }

  deleteAuthorById(author_id: number)
  {
    return this.http.delete(`${this.delteByIdUrl}/${author_id}`);
  }
}
