import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MarksheetUpdateComponent } from './componets/marksheet-update/marksheet-update.component';
import { MarksheetDataComponent } from './componets/marksheet-data/marksheet-data.component';
import { MarksheetCreateComponent } from './componets/marksheet-create/marksheet-create.component';

const routes: Routes = [
  {
    path: 'update/:id',
    component: MarksheetUpdateComponent
  },
  {
    path: 'marksheetData',
    component: MarksheetDataComponent
  },
  {
    path: '',
    redirectTo: '/marksheetData',
    pathMatch: 'full'
  },
  {
    path : 'create',
    component: MarksheetCreateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
