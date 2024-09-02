import { Component } from '@angular/core';

@Component({
  selector: 'app-property-bind',
  templateUrl: './property-bind.component.html',
  styleUrl: './property-bind.component.css'
})
export class PropertyBindComponent {
    disable:boolean = true;
    displayDisable:string = '';
    toggleDisable() {
      this.disable === false ? this.displayDisable = 'anable': this.displayDisable = 'disabled';
      this.disable =!this.disable;
    }
} 
