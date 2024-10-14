import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProfileListComponent } from './componenets/profile-list/profile-list.component';
import { ProfileFormComponent } from './componenets/profile-form/profile-form.component';
import { ProfileUpdateComponent } from './componenets/profile-update/profile-update.component';

const routes: Routes = [
  {path: 'profileList', component: ProfileListComponent},
  {path: 'profileForm', component: ProfileFormComponent},
  {path: 'profileUpdate/:id', component: ProfileUpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
