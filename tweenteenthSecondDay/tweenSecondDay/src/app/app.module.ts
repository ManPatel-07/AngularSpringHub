import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NavbarComponent } from './view/navbar/navbar.component';
import { SidebarComponent } from './view/sidebar/sidebar.component';
import { BodyContentComponent } from './view/body-content/body-content.component';
import { ScriptjscodeComponent } from './view/scriptjscode/scriptjscode.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidebarComponent,
    BodyContentComponent,
    ScriptjscodeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
