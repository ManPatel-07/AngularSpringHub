import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MarksheetService {

  url = "http://localhost:8080/marksheet/all";
  saveURL = "http://localhost:8080/marksheet/save";

  constructor(private http: HttpClient) { }

  saveMarksheet(data: any)
  {
    return this.http.post(this.saveURL, data)
  }

  usersMarksheet()
  {
    return this.http.get(this.url);
  }
}
