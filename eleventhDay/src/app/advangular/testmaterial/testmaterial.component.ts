import { Component } from '@angular/core';


@Component({
  selector: 'app-testmaterial',
  templateUrl: './testmaterial.component.html',
  styleUrl: './testmaterial.component.css'
})
export class TestmaterialComponent {
  hidden = false;

  toggleBadgeVisibility() {
    this.hidden = !this.hidden;
  }
}
