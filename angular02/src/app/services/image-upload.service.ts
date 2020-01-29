import { HttpClient, HttpRequest } from '@angular/common/http';
import { Injectable  } from '@angular/core';
@Injectable({
  providedIn: 'root'
})
export class ImageUploadService {

  constructor(private https: HttpClient) { }
  uploadImageToServer(image: File, fileName: string) {
    
    let imageData = new FormData();
    imageData.append('image', image);
    
    const newRequest = new HttpRequest('POST', 'http://192.168.0.103:8080/savefile', imageData, {
reportProgress: true,
responseType: 'text'
});
console.log("//",newRequest)
return this.https.request(newRequest);
  }
}
