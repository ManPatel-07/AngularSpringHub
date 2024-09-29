import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private getUrl = 'http://localhost:8080/book/getAll';
  private postUrl = 'http://localhost:8080/book/save';

  author_id = 0;

  constructor(private http: HttpClient) { }

  getBooks()
  {
    return this.http.get(`${this.getUrl}`);
  }

  createBook(book: Object, author_id: number)
  {
    console.log("service content " , author_id);

    return this.http.post(`${this.postUrl}/${author_id}`, book);
  }
  
}
