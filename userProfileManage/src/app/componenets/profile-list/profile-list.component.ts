import { Component } from '@angular/core';
import { ProfileService } from '../../services/profile.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-profile-list',
  templateUrl: './profile-list.component.html',
  styleUrl: './profile-list.component.css'
})
export class ProfileListComponent {

  profiles: any;

  constructor(private profileService: ProfileService,
              private router: Router
  ) { }

  ngOnInit(): void {
    this.loadProfiles();
  }

  loadProfiles(): void {
    this.profileService.getAllProfiles().subscribe(data => {
      console.log(data);
      this.profiles = data;
    });
  }

  viewProfileImage(profile: any): void {
    const imageData = 'data:' + profile.profilePicture.fileType + ';base64,' + profile.profilePicture.data;
    const imageWindow = window.open();
    if (imageWindow) {
      imageWindow.document.write('<img src="' + imageData + '" />');
    }
  } 

  deleteProfile(profile: any)
  {
    console.log(profile.id);

    this.profileService.deleteProfileById(profile.id).subscribe(data => {
      console.log(data);
      this.loadProfiles();
    });
  }

  editProfile(profile: any)
  {
    this.router.navigate(['/profileUpdate', profile.id]);
  }

}
