import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private postUrl = "http://localhost:8080/course/save";
  private getUrl = "http://localhost:8080/course/getAll";

  constructor(private http:HttpClient) { }

  createCourse(data : any)
  {
    return this.http.post(`${this.postUrl}`, data);
  }

  getAllCourses()
  {
    return this.http.get(`${this.getUrl}`);
  }

}
