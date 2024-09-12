import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LazyloginComponent } from './lazylogin/lazylogin.component';
import { LazylistComponent } from './lazylist/lazylist.component';

const routes: Routes = [
  {path:'lazylogin', component: LazyloginComponent},
  {path:'lazylist', component: LazylistComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LazyuserRoutingModule { }
