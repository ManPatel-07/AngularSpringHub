import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthorComponent } from './components/author/author.component';
import { BookComponent } from './components/book/book.component';

const routes: Routes = [
  {
    path : 'author',
    component: AuthorComponent
  },
  {
    path:'',
    redirectTo: '/author',
    pathMatch: 'full'
  },
  {
    path: 'book',
    component: BookComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
