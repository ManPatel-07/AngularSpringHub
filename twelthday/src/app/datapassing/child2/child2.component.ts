import { Component , Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrl: './child2.component.css'
})
export class Child2Component {

  @Output() item = new EventEmitter<string>();

  @Output() item2 = new EventEmitter<string>();
  
}
