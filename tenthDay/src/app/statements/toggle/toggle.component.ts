import { Component } from '@angular/core';

@Component({
  selector: 'app-toggle',
  templateUrl: './toggle.component.html',
  styleUrl: './toggle.component.css'
})
export class ToggleComponent {

  display = false;  
  toggleDetails = false;
  toggleSettings = false;
  toggle() {
    this.display =!this.display;
  }

  toggleDetailsView() {
    this.toggleDetails =!this.toggleDetails;
  }

  toggleSettingsView() {
    this.toggleSettings =!this.toggleSettings;
  }

}
