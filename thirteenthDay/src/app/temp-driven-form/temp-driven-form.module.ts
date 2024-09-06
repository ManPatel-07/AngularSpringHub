import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BasicFormComponent } from './basic-form/basic-form.component';
import { FormsModule } from '@angular/forms';
import { UserDataformComponent } from './user-dataform/user-dataform.component';
import { AnotherformComponent } from './anotherform/anotherform.component';


@NgModule({
  declarations: [
    BasicFormComponent,
    UserDataformComponent,
    AnotherformComponent,
  ],
  imports: [
    CommonModule,
    FormsModule,
  ],
  exports: [
    BasicFormComponent,
    UserDataformComponent,
    AnotherformComponent
  ]
})
export class TempDrivenFormModule { }
