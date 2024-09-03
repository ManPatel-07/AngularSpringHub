import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-formm',
  templateUrl: './formm.component.html',
  styleUrl: './formm.component.css'
})
export class FormmComponent {

  userData:any = {};
  getData(data:any)
  {
    console.log(data);
    this.userData = data;
  }
}
