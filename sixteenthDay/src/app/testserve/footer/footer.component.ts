import { UserdataService } from './../../services/userdata.service';
import { Component } from '@angular/core';


@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrl: './footer.component.css'
})
export class FooterComponent {

  userss:any;

  constructor(private userData: UserdataService)
  {
    this.userss = userData.users();
  }

}
