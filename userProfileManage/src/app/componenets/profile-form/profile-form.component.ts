import { Router } from '@angular/router';
import { ProfileService } from './../../services/profile.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-profile-form',
  templateUrl: './profile-form.component.html',
  styleUrl: './profile-form.component.css'
})
export class ProfileFormComponent {

  profileForm = {
   name: '',
   email: '',
   profilePicture: null
  }

  constructor(private profileService: ProfileService,
              private router: Router
  ){}

  submitForm()
  {
    const formData = new FormData();
    formData.append('name', this.profileForm.name); 
    formData.append('email', this.profileForm.email);
  
    if (this.profileForm.profilePicture) {
      formData.append('profilePicture', this.profileForm.profilePicture);
    }
  
    this.profileService.createProfile(formData).subscribe(data => {
      console.log(data);
      this.router.navigate(['/profileList']);
    });
  }

  onFileChange(event: any) {
    const file = event.target.files[0];
    this.profileForm.profilePicture = file;
  }

}
