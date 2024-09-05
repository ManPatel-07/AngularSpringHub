import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { Child2Component } from './child2/child2.component';
import { Parent2Component } from './parent2/parent2.component';
import { Child3Component } from './child3/child3.component';
import { Parent3Component } from './parent3/parent3.component';


@NgModule({
  declarations: [
    ParentComponent,
    ChildComponent,
    Child2Component,
    Parent2Component,
    Child3Component,
    Parent3Component,
  ],
  imports: [
    CommonModule
  ],
  exports: [
    ParentComponent,
    ChildComponent,
    Parent2Component,
    Child2Component,
    Child3Component,
    Parent3Component
  ]
})
export class DatapassingModule { }
