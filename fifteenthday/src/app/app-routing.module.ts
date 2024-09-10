import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './routingwork/home/home.component';
import { UserComponent } from './routingwork/user/user.component';
import { AboutComponent } from './routingwork/about/about.component';
import { ProfileComponent } from './routingwork/profile/profile.component';
import { AboutCompanyComponent } from './routingwork/about-company/about-company.component';
import { AboutMeComponent } from './routingwork/about-me/about-me.component';
import { SignupComponent } from './formrouting/signup/signup.component';
import { LoginComponent } from './formrouting/login/login.component';
import { MainpageComponent } from './formrouting/mainpage/mainpage.component';
import { Home2Component } from './testmod/home2/home2.component';
import { CompoAComponent } from './testmod/compo-a/compo-a.component';
import { CompoBComponent } from './testmod/compo-b/compo-b.component';
import { Mainpage2Component } from './form2routing/mainpage2/mainpage2.component';
import { Login2Component } from './form2routing/login2/login2.component';


const routes: Routes = [
  {
    path: 'mainPage2',
    component: Mainpage2Component,
    children:[
      {path: 'login2', component: Login2Component}
    ]
  },
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'home2',
    component: Home2Component,
    children:[
      {path: 'compoA', component: CompoAComponent},
      {path: 'compoB', component: CompoBComponent}
    ]
  },
  {
    path: 'main2',
    component: MainpageComponent,
    children:[
      {path: 'login', component: LoginComponent}
    ]
  },
  {
    path: 'user',
    component: UserComponent
  },
  {
    path: 'about',
    component: AboutComponent,
    children:[
      {path: 'company', component: AboutCompanyComponent},
      {path: 'me', component: AboutMeComponent}
    ]
  },
  {
    path: 'user/:id',
    component: UserComponent
  },
  {
    path:'profile',
    component: ProfileComponent
  },
  {
    path: 'profile/:id',
    component: ProfileComponent
  },
  {
    path: '**',
    component: HomeComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
