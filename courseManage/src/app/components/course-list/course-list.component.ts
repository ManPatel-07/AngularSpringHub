import { Component } from '@angular/core';
import { CoursesService } from '../../services/courses.service';

@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html',
  styleUrl: './course-list.component.css'
})
export class CourseListComponent
{
  courseData : any;

  constructor(private courseService: CoursesService){}

  ngOnInit()
  {
    this.getCourse();
  }

  getCourse()
  {
    this.courseService.getAllCourses().subscribe(courses => {
      this.courseData = courses;
      console.log(this.courseData);
    });
  }
}
