import { Component } from '@angular/core';

@Component({
  selector: 'app-ifstate',
  templateUrl: './ifstate.component.html',
  styleUrl: './ifstate.component.css'
})
export class IfstateComponent {
  contain:string = 'yes';
  title:boolean = false;

  getMsg:string = '';

  getTime(currentTime:any) {
    if(currentTime >= 5 && currentTime < 12 )
    {
      this.getMsg = "good morning";
    }
    else if(currentTime >= 12 && currentTime < 18)
    {
      this.getMsg = "Good Afternoon";
    }
    else if(currentTime >= 18 && currentTime < 21)
    {
      this.getMsg = "Good Evening";
    }
    else{
      this.getMsg = "Good Night";
    }
  }
}
