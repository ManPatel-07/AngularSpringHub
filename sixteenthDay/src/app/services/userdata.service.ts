import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserdataService {

  constructor() { }
  users()
  {
    return [
      {name: 'John', email: 'John@example.com'},
      {name: 'Jane', email: 'Jane@example.com'},
      {name: 'Bob', email: 'Bob@example.com'}
    ]
  }
}
