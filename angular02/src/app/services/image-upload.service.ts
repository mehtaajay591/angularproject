import { HttpClient, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Profile } from '../model/profile.model';
@Injectable({
  providedIn: 'root'
})
export class ImageUploadService {

  constructor(private https: HttpClient) { }
  uploadProfileDetails(image: File, fileName: string, profileDetails: Profile ) {

    let imageData = new FormData();
    imageData.append('image', image);
    imageData.append('profileDetails',JSON.stringify(profileDetails))
    return this.https.post('http://localhost:8080/savefile', imageData, {
      reportProgress: true,
      responseType: 'text'
    });
  }
  
}
