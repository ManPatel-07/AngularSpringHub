import { Component , Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-users-info',
  templateUrl: './users-info.component.html',
  styleUrl: './users-info.component.css'
})
export class UsersInfoComponent {

  @Output() userDataEmitter = new EventEmitter<any[]>();

  userDetails: any[] = [
    {date: 3, month: 'Mar', year : 2005, name: 'Armaan'},
    {date: 15, month: 'Feb', year : 1987, name: 'Kushal'},
    {date: 18, month: 'Jan', year : 2006, name: 'Pratham'}
  ];

  emitUserData() {
    this.userDataEmitter.emit(this.userDetails);
  }

  // addUserData(date: number, month: string, year: number, name: string) {
  // {
  //   this.userDetails.push({date: date, month: month, year: year, name:name});
  // }
}
