import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MarksheetService {

  private getUrl = "http://localhost:8080/marksheet/all";
  private postUrl = "http://localhost:8080/marksheet/save";
  private putUrl = "http://localhost:8080/marksheet";
  private getByRollNo = "http://localhost:8080/marksheet";

  constructor(private http:HttpClient) { }

  getMarksheet()
  {
    return this.http.get(`${this.getUrl}`);
  }

  postMarksheet(data: any)
  {
    return this.http.post(`${this.postUrl}`, data);
  }

  updateMarksheet(data: any, id: number)
  {
    return this.http.put(`${this.putUrl}/${id}`, data);
  }

  getMarksheetByRollno(rollno: number)
  {
    return this.http.get(`${this.getByRollNo}/${rollno}`);
  }
}
