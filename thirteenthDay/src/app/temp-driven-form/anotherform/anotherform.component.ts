import { Component } from '@angular/core';

@Component({
  selector: 'app-anotherform',
  templateUrl: './anotherform.component.html',
  styleUrl: './anotherform.component.css'
})
export class AnotherformComponent {

  user = {
    name: '',
    email: '',
    address: {
      city: '',
      pinCode: ''
    }
  };

  allUserDetails: any[] = []; 

  onSubmit(userForm: any) {
   
    this.allUserDetails.push({ ...this.user });

    this.user = {
      name: '',
      email: '',
      address: {
        city: '',
        pinCode: ''
      }
    };
  }
}
