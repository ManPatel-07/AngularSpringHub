import { Component } from '@angular/core';

@Component({
  selector: 'app-nestedloops',
  templateUrl: './nestedloops.component.html',
  styleUrl: './nestedloops.component.css'
})
export class NestedloopsComponent {

  userDetails = [
    { name: 'man', email: 'man@example.com', Contact: { no1: '1111', no2 : '2222' } },
    { name: 'pratham', email: 'pratham@example.com', Contact: { no1: '3333', no2 : '4444' } },
    {name : 'kushal', email: 'kushal@example.com', Contact: { no1: '5555', no2 : '2222' }}
  ]

  users = [
    {
      name: 'Alice',
      books: ['1984', 'To Kill a Mockingbird', 'The Great Gatsby']
    },
    {
      name: 'Bob',
      books: ['Moby Dick', 'War and Peace']
    },
    {
      name: 'Charlie',
      books: ['The Catcher in the Rye', 'Pride and Prejudice', 'The Hobbit']
    }
  ];
  
}
