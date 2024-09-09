import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-reactivefoms',
  templateUrl: './reactivefoms.component.html',
  styleUrl: './reactivefoms.component.css'
})
export class ReactivefomsComponent {

  loginForm = new FormGroup({
    user: new FormControl(''),
    password: new FormControl('')
  });


  loginUser()
  {
    console.log(this.loginForm.value);
  }
}
