import { Component } from '@angular/core';

@Component({
  selector: 'app-forloopstate',
  templateUrl: './forloopstate.component.html',
  styleUrl: './forloopstate.component.css'
})
export class ForloopstateComponent {
  users = ['user1', 'user2', 'user3', 'user4', 'user5']
  userDetails = [
    { name: 'man', email: 'man@example.com', no: 7777 },
    { name: 'pratham', email: 'pratham@example.com', no: 9999 },
    {name : 'kushal', email: 'kushal@example.com', no: 8888}
  ]

  items = [
    { id: 1, name: 'Apple' }, 
    { id: 2, name: 'Banana' },
    { id: 3, name: 'Cherry' }
  ];

  trackById(item: any): number {
    return item.id; // Unique identifier for the item
  }

  productData = [
    {name : '4*4 Cube', price : 400 , description : 'It hard to solve as compair to 3*3'},
    {name : 'HexaGone Cube', price : 808 , description : 'Hardest Cube'},
    {name : '2*2 Cube', price : 200 , description : 'Esiest Cube'}
  ]
              
}
