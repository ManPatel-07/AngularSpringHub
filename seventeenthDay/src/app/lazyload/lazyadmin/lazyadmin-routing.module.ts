import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LazylistComponent } from './lazylist/lazylist.component';
import { LazyloginComponent } from './lazylogin/lazylogin.component';

const routes: Routes = [
  {path:'lazylist', component:LazylistComponent},
  {path:'lazylogin', component:LazyloginComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LazyadminRoutingModule { }
