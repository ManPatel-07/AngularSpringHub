import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child3',
  templateUrl: './child3.component.html',
  styleUrl: './child3.component.css'
})
export class Child3Component {

  @Output() arrayEmitter = new EventEmitter<any[]>(); // EventEmitter for an array of objects

  // Example array of objects using any[]
  people: any[] = [
    { name: 'John Doe', age: 30 },
    { name: 'Jane Smith', age: 25 },
    { name: 'Alice Johnson', age: 28 }
  ];

  sendArray() {
    this.arrayEmitter.emit(this.people); // Emit the array of objects when the button is clicked
  }
  
}
