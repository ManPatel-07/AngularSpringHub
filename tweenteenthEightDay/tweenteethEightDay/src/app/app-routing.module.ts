import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthorComponent } from './components/author/author.component';
import { BookComponent } from './components/book/book.component';
import { AuthorListComponent } from './components/author-list/author-list.component';

const routes: Routes = [
  { path: 'add-author', component: AuthorComponent },
  { path: 'add-book', component: BookComponent },
  { path: 'authors', component: AuthorListComponent },
  { path: '', redirectTo: 'authors', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
