import { Component } from '@angular/core';
import { CoursesService } from '../../services/courses.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html',
  styleUrl: './course-list.component.css'
})
export class CourseListComponent
{
  courseData : any;

  constructor(private courseService: CoursesService,private router: Router){}

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

  deleteCourseById(course_id: number)
  {

    console.log(course_id);

    this.courseService.delteCourseData(course_id).subscribe(data => {
      console.log(data);
      this.getCourse();
    });
    this.getCourse();

  }

  updateCourseById(id : number)
  {
    console.log(id);
    this.router.navigate(['/editCourse', id]);
  }
}
