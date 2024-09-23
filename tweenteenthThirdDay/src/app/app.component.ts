import { Component } from '@angular/core';
import { UserDataService } from './services/user-data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'tweenteenthThirdDay';
  user:any;

  constructor(private userData:UserDataService){
      userData.users().subscribe((data) => {
        this.user = data;
        console.log(data);
      });
  }


  saveData(formData:any)
  {
    console.log(formData);
    this.userData.saveUsers(formData).subscribe((data) => {
      console.log(data);
    });
  }
}
