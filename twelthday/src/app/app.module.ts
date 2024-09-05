import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { OtherprojectModule } from './otherproject/otherproject.module'; 
import { FormsModule } from '@angular/forms';
import { BasicprojModule } from './basicproj/basicproj.module';
import { DatapassingModule } from './datapassing/datapassing.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    DatapassingModule,
    BasicprojModule,
    FormsModule,
    OtherprojectModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
