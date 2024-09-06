import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InbuildpipesComponent } from './inbuildpipes/inbuildpipes.component';
import { UsdInrPipe } from './usd-inr.pipe';



@NgModule({
  declarations: [
    InbuildpipesComponent,
    UsdInrPipe,
  ],
  imports: [
    CommonModule
  ],
  exports: [
    InbuildpipesComponent
  ]
})
export class PipesTopicModule { }
