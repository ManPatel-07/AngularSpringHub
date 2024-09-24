import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsersDataComponent } from './components/users-data/users-data.component';
import { CreateUserComponent } from './components/create-user/create-user.component';
import { UpdateUserComponent } from './components/update-user/update-user.component';

const routes: Routes = [
  {
    path: 'users',
    component: UsersDataComponent
  },
  {
    path: 'createUser',
    component: CreateUserComponent
  },
  {
    path: '',
    redirectTo: 'users',
    pathMatch: 'full'
  },
  {
    path: 'update-user/:id',
    component: UpdateUserComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
