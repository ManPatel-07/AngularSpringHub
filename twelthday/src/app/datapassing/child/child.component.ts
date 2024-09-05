import { Component, Input , Output , EventEmitter} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
  @Input() item = 0;

  @Input() other = 0;

  @Input() dataobj : {name: string, age: number } = { name : '', age: 0 };

  @Input() userDetails : {name : string, email : string} = { name : '', email : ''};

  @Output() objectEmitter = new EventEmitter<{ name: string; age: number }>();

  sendObject() {
    const person = { name: 'John Doe', age: 30 };
    this.objectEmitter.emit(person); // Emit the object when the button is clicked
  }
}
