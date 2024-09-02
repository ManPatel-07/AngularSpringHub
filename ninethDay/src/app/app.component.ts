import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ninethDay';

  displayData:string = '';
  getVal(val:string)
  {
    console.log(val);
    this.displayData = val;
  }

  show:boolean = true;
  showButton = 'Hide';
  getShowVal()
  {
    this.show = !this.show;
    this.show === true ? this.showButton='Hide' : this.showButton='Show';
  }

  eventLis(val:string)
  {
    console.log(val);
  }

}
