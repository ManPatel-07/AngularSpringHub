import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private postUrl = 'http://localhost:8080/student/save';
  private getUrl = 'http://localhost:8080/student/getAll';
  private deleteUrl = 'http://localhost:8080/student/delete';
  private deleteFromCourse = 'http://localhost:8080/student';

  constructor(private http: HttpClient) { }

  getStudentData()
  {
    return this.http.get(`${this.getUrl}`);
  }

  saveStudentData(studentData: any)
  {
    return this.http.post(`${this.postUrl}`, studentData);
  }

  deleteStudentData(studentId: number)
  {
    return this.http.delete(`${this.deleteUrl}/${studentId}`);
  }

  studentDeleteFromCourse(course_id: number, student_id:number)
  {
    return this.http.delete(`${this.deleteFromCourse}/${course_id}/delStudent/${student_id}`);
  }
}
