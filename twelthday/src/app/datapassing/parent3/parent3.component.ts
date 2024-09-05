import { Component } from '@angular/core';

@Component({
  selector: 'app-parent3',
  templateUrl: './parent3.component.html',
  styleUrl: './parent3.component.css'
})
export class Parent3Component {

  // handleArray(arr: any[]) 
  // {
  //   console.log(arr);
  // }

  receivedArray: any[] = []; // Store the received array of objects

  handleArray(array: any[]) {
    this.receivedArray = array; // Assign the received array to the component's property
  }
}
