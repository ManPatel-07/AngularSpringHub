import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';
// import { provideHttpClient, withInterceptors, withInterceptorsFromDi } from '@angular/common/http';
import { TestserveModule } from './testserve/testserve.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    TestserveModule,
    HttpClientModule
  ],
  providers: [
    // provideHttpClient(withInterceptorsFromDi())
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
