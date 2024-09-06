import { PipesTopicModule } from './pipes-topic/pipes-topic.module';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { TempDrivenFormModule } from './temp-driven-form/temp-driven-form.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    PipesTopicModule,
    TempDrivenFormModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
