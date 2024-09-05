import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AllprodComponent } from './allprod/allprod.component';
import { ProductComponent } from './product/product.component';
import { ProdInfoComponent } from './prod-info/prod-info.component';
import { TestComponent } from './test/test.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AllprodComponent,
    ProductComponent,
    ProdInfoComponent,
    TestComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [
    AllprodComponent,
    ProductComponent,
    ProdInfoComponent,
    TestComponent
  ]
})
export class BasicprojModule { }
