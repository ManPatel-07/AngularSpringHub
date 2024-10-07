import { Component } from '@angular/core';
import { StudentService } from '../../services/student.service';
import { CoursesService } from '../../services/courses.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrl: './student.component.css'
})
export class StudentComponent
{

  courses : any;
  student = {
    "studentName":"",
    "email":"",
    "courses":[]
  };

  constructor(private studentService:StudentService,
              private courseService: CoursesService){}


  ngOnInit(){
    this.getCourseData();
  }

  getCourseData()
  {
    this.courseService.getAllCourses().subscribe(data => {
      this.courses = data;
      console.log(data);
    });
  }

  enrollStudent(data: any)
  {

    console.log(data);
    // this.studentService.saveStudentData(data).subscribe(data => {
    //   console.log(data);
    // });
  }


  // getStudentData()
  // {
  //   this.studentService.getStudentData().subscribe(data => {
  //     this.student = data;
  //   });
  // }
}
