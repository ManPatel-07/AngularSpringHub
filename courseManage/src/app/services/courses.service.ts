import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private postUrl = "http://localhost:8080/course/save";
  private getUrl = "http://localhost:8080/course/getAll";
  private deleteUrl = "http://localhost:8080/course/delete";
  private getById = "http://localhost:8080/course/getById";
  private putUrl = "http://localhost:8080/course/updateById";

  constructor(private http:HttpClient) { }

  createCourse(data : any)
  {
    return this.http.post(`${this.postUrl}`, data);
  }

  getAllCourses(): Observable<any>
  {
    return this.http.get(`${this.getUrl}`);
  }

  delteCourseData(id : number)
  {
    return this.http.delete(`${this.deleteUrl}/${id}`);
  }

  getCourseByCourseId(id : number)
  {
    return this.http.get(`${this.getById}/${id}`);
  }

  updateCourseDetails(data: any, id: number)
  {
    return this.http.put(`${this.putUrl}/${id}`, data);
  }
}
