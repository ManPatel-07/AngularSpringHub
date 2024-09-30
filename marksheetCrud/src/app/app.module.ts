import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsModule } from '@angular/forms';
import { provideHttpClient, withInterceptorsFromDi } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MarksheetDataComponent } from './componets/marksheet-data/marksheet-data.component';
import { MarksheetCreateComponent } from './componets/marksheet-create/marksheet-create.component';
import { MarksheetUpdateComponent } from './componets/marksheet-update/marksheet-update.component';

@NgModule({
  declarations: [
    AppComponent,
    MarksheetDataComponent,
    MarksheetCreateComponent,
    MarksheetUpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormsModule
  ],
  providers: [
    provideHttpClient(withInterceptorsFromDi())
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
