import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CompoAComponent } from './compo-a/compo-a.component';
import { CompoBComponent } from './compo-b/compo-b.component';
import { RouterModule, Routes } from '@angular/router';
import { Home2Component } from './home2/home2.component';

@NgModule({
  declarations: [
    CompoAComponent,
    CompoBComponent,
    Home2Component
  ],
  imports: [
    CommonModule,
    RouterModule
  ],
  exports:[
    CompoAComponent,
    CompoBComponent,
    Home2Component,
    RouterModule
  ]
})
export class TestmodModule { }
