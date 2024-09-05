import { Component } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {

  reciveData: any[] = [];
  handleProdInfo(arr: any[]) 
  {
    // console.log(arr);
    this.reciveData = arr;
  }

  removeByIndex(index: number)
  {
    console.log(index);
    this.reciveData.splice(index, 1);
  }

}
