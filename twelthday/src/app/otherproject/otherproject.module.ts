import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsersComponent } from './users/users.component';
import { UsersInfoComponent } from './users-info/users-info.component';
import { AllUsersComponent } from './all-users/all-users.component';



@NgModule({
  declarations: [
    UsersComponent,
    UsersInfoComponent,
    AllUsersComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    UsersComponent,
    UsersInfoComponent,
    AllUsersComponent
  ]
})
export class OtherprojectModule { }
