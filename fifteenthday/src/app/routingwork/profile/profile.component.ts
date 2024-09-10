import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrl: './profile.component.css'
})
export class ProfileComponent {

  profileId: string | null = '';

  constructor(private route: ActivatedRoute, private router: Router) {}

  ngOnInit() {
    this.loadProfile();
  }

  loadProfile() {
    this.profileId = this.route.snapshot.paramMap.get('id');
  }

  goToProfile(id: number) {
      this.router.navigate(['/profile', id]).then(() => {
      this.loadProfile();
    });
  }







  // routeSub: Subscription | undefined;

  // constructor(private route: ActivatedRoute, private router: Router) {}

  // ngOnInit() {
  //   this.routeSub = this.route.paramMap.subscribe(params => {
  //     this.profileId = params.get('id');
  //   });
  // }

  // goToProfile(id: number) {
  //   this.router.navigate(['/profile', id]);
  // }

  // ngOnDestroy() {
  //   if (this.routeSub) {
  //     this.routeSub.unsubscribe();
  //   }
  // }
}
