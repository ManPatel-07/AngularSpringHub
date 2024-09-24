import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../classes/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserDataService {

  private getUrl = "http://localhost:8080/form/findAll";
  private postUrl = "http://localhost:8080/form/save";
  private deleteUrl = "http://localhost:8080/form/delete";
  private getById = "http://localhost:8080/form/find";
  private putUrl = "http://localhost:8080/form/update";

  constructor(private http: HttpClient) { }

  getUserList(): Observable<User[]>
  {
    return this.http.get<User[]>(`${this.getUrl}`);
  }

  createUser(user: User): Observable<Object> 
  {
    return this.http.post(`${this.postUrl}`, user);
  }

  deleteUser(id: number)
  {
    return this.http.delete(`${this.deleteUrl}/${id}`);
  }

  getUserById(id : number) : Observable<User>
  {
    return this.http.get<User>(`${this.getById}/${id}`);
  }

  updateUser(id: number, data: any)
  {
    return this.http.put(`${this.putUrl}/${id}`, data);
  }
}
