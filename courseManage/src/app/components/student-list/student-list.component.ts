import { Component } from '@angular/core';
import { StudentService } from '../../services/student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrl: './student-list.component.css'
})
export class StudentListComponent
{
  studentsData : any;

  constructor(private studentService:StudentService){}

  ngOnInit()
  {
    this.getStudentList();
  }

  getStudentList(){
    return this.studentService.getStudentData().subscribe(data => {
      this.studentsData = data;
      console.log(data);
    });
  }

  deleteStudentById(student_id: number)
  {
    this.studentService.deleteStudentData(student_id).subscribe(data => {
      console.log(data);
      
    });
    this.getStudentList();
  }
}
