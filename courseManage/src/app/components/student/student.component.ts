import { Component } from '@angular/core';
import { StudentService } from '../../services/student.service';
import { CoursesService } from '../../services/courses.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrl: './student.component.css'
})
export class StudentComponent
{
  student = {
    studentName: '',
    email: '',
    courses: [] 
  };

  courses: any[] = [];

  constructor(private courseService: CoursesService,
    private studentService: StudentService,
    private router: Router
  ) {}

  ngOnInit() {
    this.courseService.getAllCourses().subscribe(courses => {
      this.courses = courses;
    });
  }

  enrollStudent(studentFormData: any): void {
  
    const selectedCourses: number[] = [];

    this.courses.forEach(course => {
      if (course.isChecked) {
        selectedCourses.push(course.id);
      }
    });

    const studentData = {
      studentName: studentFormData.studentName,
      email: studentFormData.email,
      courses: selectedCourses
    };

    console.log(studentData);

    this.studentService.saveStudentData(studentData).subscribe(student => {
      console.log(student);
      this.router.navigate(['/studentList']);
    })

  }

    toggleCourseSelection(courseId: number, isChecked: boolean): void {
      const course = this.courses.find(c => c.id === courseId);
      if (course) {
        course.isChecked = isChecked;
      }
    }

  onCheckboxChange(event: Event, courseId: number): void {
    const target = event.target as HTMLInputElement; 

    if (target.checked) {
      console.log(`Course ID checked: ${courseId}`);
    }

    this.toggleCourseSelection(courseId, target.checked);
  }
}
