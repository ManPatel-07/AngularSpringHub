import { UserDataService } from './../../services/user-data.service';
import { Component } from '@angular/core';
import { User } from '../../classes/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrl: './create-user.component.css'
})
export class CreateUserComponent {

  user: User = new User();

  constructor(private userDataService: UserDataService,
              private router: Router){}


  saveUser()
  {
    this.userDataService.createUser(this.user).subscribe((data) => {
      console.log(data);
      this.goToUserList();
    },
    error => console.log(error));
  }
  

  goToUserList()
  {
    this.router.navigate(['/users']); 
  }

  onSubmit()
  {
    console.log(this.user);
    this.saveUser()
  }
  ngOnInit() {};
}
