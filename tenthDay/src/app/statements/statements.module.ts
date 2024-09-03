import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IfstateComponent } from './ifstate/ifstate.component';
import { ElseifstateComponent } from './elseifstate/elseifstate.component';
import { SwitchstateComponent } from './switchstate/switchstate.component';
import { ForloopstateComponent } from './forloopstate/forloopstate.component';
import { NestedloopsComponent } from './nestedloops/nestedloops.component';
import { StylebindComponent } from './stylebind/stylebind.component';
import { FormmComponent } from './formm/formm.component';
import { FormsModule } from '@angular/forms';
import { ToggleComponent } from './toggle/toggle.component';


@NgModule({
  declarations: [
    IfstateComponent,
    ElseifstateComponent,
    SwitchstateComponent,
    ForloopstateComponent,
    NestedloopsComponent,
    StylebindComponent,
    FormmComponent,
    ToggleComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [
    IfstateComponent,
    ElseifstateComponent,
    SwitchstateComponent,
    ForloopstateComponent,
    NestedloopsComponent,
    StylebindComponent,
    FormmComponent,
    ToggleComponent
  ]
})
export class StatementsModule { }
