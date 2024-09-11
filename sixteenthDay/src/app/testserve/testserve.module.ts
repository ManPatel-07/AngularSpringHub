import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FooterComponent } from './footer/footer.component';
import { MarksheetformComponent } from './marksheetform/marksheetform.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    FooterComponent,
    MarksheetformComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [
    FooterComponent,
    MarksheetformComponent
  ]
})
export class TestserveModule { }
