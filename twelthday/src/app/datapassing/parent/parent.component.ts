import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent {
  data = 10;

  anotherData = 20;

  childObj = { name: 'John Doe', age: 30 };

  userInfo = [
    { name : 'xyz', email: 'xyz@example.com' },
    { name : 'abc', email: 'abc@example.com' },
    { name : 'pqr', email: 'pqr@example.com' },
    { name : 'stu', email: 'stu@example.com' }
  ]
  changeValue()
  {
    this.data = Math.floor(Math.random()*10);
  }

  receivedObject: { name: string; age: number } = { name: '', age: 0};

  handleObject(obj: { name: string; age: number }) {
    this.receivedObject = obj; // Store the received object
  }
}
