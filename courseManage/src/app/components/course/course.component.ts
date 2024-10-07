import { Component } from '@angular/core';
import { CoursesService } from '../../services/courses.service';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrl: './course.component.css'
})
export class CourseComponent {

  course = {
    "courseName":'',
    "description":''
  };

  constructor(private courseService: CoursesService){}

  ngOnInit()
  {
  }

  saveCourseData(data:any)
  {
    this.courseService.createCourse(data).subscribe(data => {
      console.log(data);
    });
  }
}
