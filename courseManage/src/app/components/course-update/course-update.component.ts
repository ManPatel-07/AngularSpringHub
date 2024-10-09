import { Component } from '@angular/core';
import { CoursesService } from '../../services/courses.service';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentService } from '../../services/student.service';

@Component({
  selector: 'app-course-update',
  templateUrl: './course-update.component.html',
  styleUrl: './course-update.component.css'
})
export class CourseUpdateComponent {

  course :  any = {
    courseName: '',
    description: '',
    students: []
  };

  courseData : any = {
    courseName: '',
    description: ''
  };

  id : number = 0;

  constructor(private courseService: CoursesService,
              private route: ActivatedRoute,
              private router: Router,
              private studentService: StudentService
  ) { }

  ngOnInit()
  {
    this.getSelectedCourse();
  }

  getSelectedCourse()
  {
    this.id = this.route.snapshot.params['id'];
    this.courseService.getCourseByCourseId(this.id).subscribe(data => {
      this.course = data;
      console.log(data);
    })
  }

  getCourseDetailsById()
  {

  }

  updateCourse(formValue: any)
  {
    this.courseData = {
      courseName: formValue.courseName,
      description: formValue.description
    }

    this.courseService.updateCourseDetails(this.courseData, this.id).subscribe(data => {
      console.log(data);
      this.router.navigate(['/courseList']);
    });
    this.router.navigate(['/courseList']);

    console.log(this.courseData);
    console.warn(this.id);
  }

  removeStudent(student_id : number)
  {
    this.studentService.studentDeleteFromCourse(this.id, student_id).subscribe(data => {
      console.log(data);
      this.getSelectedCourse();
    });
  }
  
}
