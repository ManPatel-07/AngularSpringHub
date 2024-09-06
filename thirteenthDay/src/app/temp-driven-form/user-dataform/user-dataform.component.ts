import { Component } from '@angular/core';

@Component({
  selector: 'app-user-dataform',
  templateUrl: './user-dataform.component.html',
  styleUrl: './user-dataform.component.css'
})
export class UserDataformComponent {

  user = {
    name: '',
    email: '',
    address: {
      street: '',
      city: '',
      pin: ''
    }
  }

  allUsers : any[] = [];

  userData(item: any) 
  {
    this.user.name = item.name;
    this.user.email = item.email;
    this.user.address.street = item.street;
    this.user.address.city = item.city;
    this.user.address.pin = item.pinNo;

    console.log(item);
    console.log(this.user);
    this.allUsers.push(this.user);
  }

  shawAllUsersData()
  {
    console.log(this.allUsers);
  }
}
