import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Login2Component } from './login2/login2.component';
import { Signup2Component } from './signup2/signup2.component';
import { Mainpage2Component } from './mainpage2/mainpage2.component';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [
    Login2Component,
    Signup2Component,
    Mainpage2Component
  ],
  imports: [
    CommonModule,
    RouterModule
  ],
  exports:[
    Login2Component,
    Signup2Component,
    Mainpage2Component
  ]
})
export class Form2routingModule { }
