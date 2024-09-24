import { Component } from '@angular/core';
import { User } from '../../classes/user';
import { UserDataService } from '../../services/user-data.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrl: './update-user.component.css'
})

export class UpdateUserComponent {

  id: number = 0;

  constructor(private userDataService: UserDataService,
     private route: ActivatedRoute,
    private router: Router){}
  
  user: User = new User();

  ngOnInit()
  {
    this.id = this.route.snapshot.params['id'];
    this.userDataService.getUserById(this.id).subscribe((data) => {
      this.user = data;
    }, err => console.log(err));
  }
  onSubmit() 
  {
    this.id = this.route.snapshot.params['id'];
    this.userDataService.updateUser(this.id, this.user).subscribe((data) => {
      console.log("User updated successfully");
      this.router.navigate(['/users']);
    });
  }
}
