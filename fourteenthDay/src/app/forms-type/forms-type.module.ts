import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactivefomsComponent } from './reactivefoms/reactivefoms.component';
import { FormsModule ,ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    ReactivefomsComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    FormsModule  
  ],
  exports:[
    ReactivefomsComponent
  ]
})
export class FormsTypeModule { }
