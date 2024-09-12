import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LazyadminRoutingModule } from './lazyadmin-routing.module';
import { LazylistComponent } from './lazylist/lazylist.component';
import { LazyloginComponent } from './lazylogin/lazylogin.component';
console.log("Lazy Load this amin module");

@NgModule({
  declarations: [
    LazylistComponent,
    LazyloginComponent
  ],
  imports: [
    CommonModule,
    LazyadminRoutingModule
  ]
})
export class LazyadminModule { }
