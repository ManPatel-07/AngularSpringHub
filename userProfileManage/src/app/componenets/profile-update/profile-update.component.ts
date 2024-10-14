import { Component } from '@angular/core';
import { ProfileService } from '../../services/profile.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-profile-update',
  templateUrl: './profile-update.component.html',
  styleUrl: './profile-update.component.css'
})
export class ProfileUpdateComponent 
{

  profileId : any;

  profile : any;
  imageUrl : any;

  constructor(private profileService: ProfileService,
              private router: Router,
              private route: ActivatedRoute
  ){}

  ngOnInit()
  {
    this.profileId = this.route.snapshot.paramMap.get('id');
    this.profileById(); 
  }

  profileById()
  {
    this.profileService.profileFindById(this.profileId).subscribe(data => {
      this.profile = data;
      
      this.imageUrl = `data:${this.profile.profilePicture.fileType};base64,${this.profile.profilePicture.data}`;
      console.log(data);
    });
  }

  updateProfile(data: any)
  {
    this.profileService.updateProfileById(this.profileId, data).subscribe(data => {
      console.log(data);
      this.router.navigate(['profileList']);
    });
    
  }

}
