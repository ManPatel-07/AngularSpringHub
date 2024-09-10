import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { Form2routingModule } from './form2routing/form2routing.module';
import { FormroutingModule } from './formrouting/formrouting.module';
import { RoutingworkModule } from './routingwork/routingwork.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestmodModule } from "./testmod/testmod.module";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RoutingworkModule,
    FormroutingModule,
    TestmodModule,
    Form2routingModule
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
