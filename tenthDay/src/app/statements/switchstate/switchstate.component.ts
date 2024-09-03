import { Component } from '@angular/core';

@Component({
  selector: 'app-switchstate',
  templateUrl: './switchstate.component.html',
  styleUrl: './switchstate.component.css'
})
export class SwitchstateComponent {
  display: string = 'red';

  Day : string = '';

  weekDayFun(day: string) 
  {
    this.Day = day;
  }
}
