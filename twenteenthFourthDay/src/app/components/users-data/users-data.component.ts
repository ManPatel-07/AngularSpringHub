import { Component } from '@angular/core';
import { User } from '../../classes/user';
import { UserDataService } from '../../services/user-data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-users-data',
  templateUrl: './users-data.component.html',
  styleUrl: './users-data.component.css'
})
export class UsersDataComponent {
  users: User[] = [];

  constructor(private userDataService: UserDataService, private router:Router) {}

  ngOnInit(): void {
    this.getUsers();
  }

  private getUsers()
  {
    this.userDataService.getUserList().subscribe((data) => {
      this.users = data;
    })
  }

  navigateDeleteUser(id: number)
  {
    this.userDataService.deleteUser(id).subscribe(()=>{
      this.getUsers();
    })
    console.log(id);
  }

  updateUser(id : number)
  {
    this.router.navigate(['update-user' , id])
  }
}
