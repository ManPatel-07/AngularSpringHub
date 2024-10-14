import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {

  constructor(private http : HttpClient) { }

  private apiUrl = 'http://localhost:8080/api/profiles';

  createProfile(data : any)
  {
    return this.http.post(`${this.apiUrl}/create`, data);
  }

  getAllProfiles()
  {
    return this.http.get(`${this.apiUrl}`);
  }

  deleteProfileById(profileId: number)
  {
    return this.http.delete(`${this.apiUrl}/${profileId}`);
  }

  profileFindById(profileId: number)
  {
    return this.http.get(`${this.apiUrl}/${profileId}`);
  }

  updateProfileById(profileId: number, data: any)
  {
    return this.http.put(`${this.apiUrl}/${profileId}`, data);
  }
}
