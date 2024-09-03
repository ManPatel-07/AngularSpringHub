import { Component } from '@angular/core';

@Component({
  selector: 'app-stylebind',
  templateUrl: './stylebind.component.html',
  styleUrl: './stylebind.component.css'
})
export class StylebindComponent {
  color = 'red';
  bgColor = 'green';
  fontSize = '10px';
  changeColor(val:string)
  {
    this.bgColor = val;
  }

  changeFontSize(val:string)
  {
    this.fontSize = val+'px';
  }
}
