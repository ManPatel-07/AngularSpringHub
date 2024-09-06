import { Component } from '@angular/core';
import { Observable, of } from 'rxjs';

@Component({
  selector: 'app-inbuildpipes',
  templateUrl: './inbuildpipes.component.html',
  styleUrl: './inbuildpipes.component.css'
})
export class InbuildpipesComponent {
  title: string = 'Hello World!';

  today: Date = new Date();

  data = {
    name: 'John Doe',
    age: 30,
    address: {
      street: '123 Main St',
      city: 'New York',
      state: 'NY'
    }
  }

  usersDetails : any[] = [
    {name: 'xyz', email: 'xyz@gmail.com'},
    {name: 'abc', email: 'abc@gmail.com'},
    {name: 'pqr', email: 'pqr@gmail.com'}
  ];

  asyncData$: Observable<string> = of('Data loaded asynchronously');
}
