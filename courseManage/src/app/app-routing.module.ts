import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CourseListComponent } from './components/course-list/course-list.component';
import { CourseComponent } from './components/course/course.component';
import { StudentComponent } from './components/student/student.component';
import { StudentListComponent } from './components/student-list/student-list.component';
import { CourseUpdateComponent } from './components/course-update/course-update.component';

const routes: Routes = [
  {path: 'courseList', component: CourseListComponent},
  {path: 'course', component: CourseComponent},
  {path: 'student', component: StudentComponent},
  {path: 'studentList', component: StudentListComponent},
  {path: 'editCourse/:id', component: CourseUpdateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
