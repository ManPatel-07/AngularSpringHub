import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { TestmaterialComponent } from './testmaterial/testmaterial.component';
import { TodolistComponent } from './todolist/todolist.component';

import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatBadgeModule} from '@angular/material/badge';

@NgModule({
  declarations: [
    TestmaterialComponent,
    TodolistComponent
  ],
  imports: [
    CommonModule,
    MatSlideToggleModule,
    MatIconModule,
    MatButtonModule,
    MatBadgeModule
    ],
  exports: [
    TestmaterialComponent,
    TodolistComponent
  ]
})
export class AdvangularModule { }
