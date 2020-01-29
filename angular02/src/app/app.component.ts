import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ImageUploadService } from './services/image-upload.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'angular02';
  image: any;
  formss: FormGroup = new FormGroup({
    fname: new FormControl(),
    lname: new FormControl(),
    profileImage: new FormControl()
  })
  constructor(private uploadImage:ImageUploadService) {

  }
  getPhoto(event: any) {
    console.log(event.target.files[0]);
    let reader = new FileReader();

    const fileName=this.formss.value.fname+"_"+event.target.files[0].name+"_"+this.formss.value.lname;
    console.log(fileName);
    
    reader.readAsDataURL(event.target.files[0]);
    let abc:FileList=null;
    abc=event.target.files[0]
    reader.onload = (event) => { // called once readAsDataURL is completed
      this.image = reader.result; //add source to image
      
    }
    this.uploadImage.uploadImageToServer(event.target.files[0],fileName).subscribe();
    
    reader.onerror = function () {
      console.log(reader.error);
    };
  }
}
