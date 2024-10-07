import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private postUrl = 'http://localhost:8080/student/save';
  private getUrl = 'http://localhost:8080/student/getAll';
  private deleteUrl = 'http://localhost:8080/student/delete';

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
}
