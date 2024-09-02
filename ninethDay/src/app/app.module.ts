import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { UserAuthModule } from './user-auth/user-auth.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountComponent } from './count/count.component';
import { PropertyBindComponent } from './property-bind/property-bind.component';
import { IfelseConditionComponent } from './ifelse-condition/ifelse-condition.component';

@NgModule({
  declarations: [
    AppComponent,
    CountComponent,
    PropertyBindComponent,
    IfelseConditionComponent
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
