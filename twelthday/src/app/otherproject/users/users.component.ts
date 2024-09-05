import { Component } from '@angular/core';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrl: './users.component.css'
})
export class UsersComponent {

  recivedUsers: any[] = [];
  userDataFun(arr: any[])
  {
    this.recivedUsers = arr;
  }

  shawUserData()
  {
    console.log(this.recivedUsers);
  }
}
