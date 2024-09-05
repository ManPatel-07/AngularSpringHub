import { Component } from '@angular/core';

@Component({
  selector: 'app-parent2',
  templateUrl: './parent2.component.html',
  styleUrl: './parent2.component.css'
})
export class Parent2Component {

  displayInfo: string[] = [];
  userInfo(info: string)
  {
    this.displayInfo.push(info);
    console.log(this.displayInfo);
  }

  secondInfo(info2: string)
  {
    console.log(info2);
  }
}
