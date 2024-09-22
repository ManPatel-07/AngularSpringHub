import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'tweenSecondDay';

  isAboutPage = false;

  constructor(private router: Router) {
    this.router.events.subscribe((val) => {
      // Adjust logic to detect route change and hide/show content
      this.isAboutPage = this.router.url === '/dashboard';
    });

    this.router.events.subscribe((val) => {
      // Adjust logic to detect route change and hide/show content
      this.isAboutPage = this.router.url === '/tables';
    });
  }
}
