import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LazyuserRoutingModule } from './lazyuser-routing.module';
import { LazylistComponent } from './lazylist/lazylist.component';
import { LazyloginComponent } from './lazylogin/lazylogin.component';


@NgModule({
  declarations: [
    LazylistComponent,
    LazyloginComponent
  ],
  imports: [
    CommonModule,
    LazyuserRoutingModule
  ]
})
export class LazyuserModule { }
