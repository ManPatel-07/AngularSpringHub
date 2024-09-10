import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {

  profileId: string | null = '';

  constructor(private route: ActivatedRoute) {}

  ngOnInit() {
    this.profileId = this.route.snapshot.paramMap.get('id');
  }
}
