import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { UserAuthModule } from './user-auth/user-auth.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserList2Component } from './user-list2/user-list2.component';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserList2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    UserAuthModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
