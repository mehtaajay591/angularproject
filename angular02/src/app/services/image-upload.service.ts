import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
@Injectable({
  providedIn: 'root'
})
export class ImageUploadService {

  constructor(private https: HttpClient) { }
  uploadImageToServer(image: File, fileName: string) {
    const imageData = new FormData();
    imageData.append('image', image, fileName);
    console.log(imageData)
    return this.https.post('http://localhost:8080/savefile', imageData, {
      reportProgress: true,
      responseType: 'text'
    });
  }
}
