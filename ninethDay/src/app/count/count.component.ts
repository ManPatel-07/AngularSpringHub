import { Component } from '@angular/core';

@Component({
  selector: 'app-count',
  templateUrl: './count.component.html',
  styleUrl: './count.component.css'
})
export class CountComponent {
  counter = 0;
  increaseCount()
  {
    this.counter++;
  }
  decreseCount()
  {
    this.counter--;
  }
}
