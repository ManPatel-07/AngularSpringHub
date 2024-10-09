import { Component } from '@angular/core';
import { CoursesService } from '../../services/courses.service';
import { Router } from '@angular/router';

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

  constructor(private courseService: CoursesService,
    private router: Router
  ){}

  ngOnInit()
  {
  }

  saveCourseData(data:any)
  {
    this.courseService.createCourse(data).subscribe(data => {
      console.log(data);
       this.router.navigate(['/courseList']);
    });
    this.router.navigate(['/courseList']);
  }
}
