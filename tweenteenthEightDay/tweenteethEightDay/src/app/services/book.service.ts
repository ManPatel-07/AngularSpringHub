import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private getUrl = 'http://localhost:8080/book/getAll';
  private postUrl = 'http://localhost:8080/book/save';
  private deleteUrl = "http://localhost:8080/book/delete"
  private putByIdBookUrl = "http://localhost:8080/book";

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

  deleteBook(book_id: number) : Observable<any>
  {
    return this.http.delete(`${this.deleteUrl}/${book_id}`);
  }

  updateById(book_id: number, author_id: number, data: any)
  {
    return this.http.put(`${this.putByIdBookUrl}/${author_id}/updateById/${book_id}`, data);
  }
}
