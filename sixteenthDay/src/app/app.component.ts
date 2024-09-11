import { Component } from '@angular/core';

import { MarksheetService } from './services/marksheet.service';
import { UserdataService } from './services/userdata.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  userss:any;

  students:any;

  constructor(private userdata: UserdataService, private marksheetService: MarksheetService){
    console.log('userdata:- ', userdata.users());

    this.userss = userdata.users();

    marksheetService.usersMarksheet()
                      .subscribe((student) =>{
                          this.students = student; 
                          console.log(student);
                      });
  }
}
