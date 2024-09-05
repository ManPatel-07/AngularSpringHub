import { Component , Output, EventEmitter, output} from '@angular/core';

@Component({
  selector: 'app-prod-info',
  templateUrl: './prod-info.component.html',
  styleUrl: './prod-info.component.css'
})
export class ProdInfoComponent 
{
  @Output() prodData = new EventEmitter<any[]>();

  productInfo: any[]=[
    {name : 'nirma', date: '14 Mar 2014'},
    {name : 'xyz', date: '21 Feb 2005'},
    {name : 'abc', date: '23 Jun 2000'}
  ]

  sendArray()
  {
    this.prodData.emit(this.productInfo);
  }

  addInfo(date: string, prodName: string)
  {
    this.productInfo.push({name:prodName, date:date});
  }
}
