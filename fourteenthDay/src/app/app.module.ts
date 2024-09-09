import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsTypeModule } from './forms-type/forms-type.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsTypeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
