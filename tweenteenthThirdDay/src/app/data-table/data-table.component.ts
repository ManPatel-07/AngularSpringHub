import { Router } from '@angular/router';

import { Component } from '@angular/core';
import { UserDataService } from '../services/user-data.service';

@Component({
  selector: 'app-data-table',
  templateUrl: './data-table.component.html',
  styleUrl: './data-table.component.css'
})
export class DataTableComponent {

  user : any = {};

  constructor(private userData:UserDataService, private router:Router){
    userData.users().subscribe((data) => {
      this.user = data;
      console.log(data);
    });
  }

  navigateToContent(id: number)
  {
    // this.router.navigate(['/delete', id]);
    this.userData.deleteUser(id).subscribe(()=>{console.log("deleted ...")});
  }
  
}
