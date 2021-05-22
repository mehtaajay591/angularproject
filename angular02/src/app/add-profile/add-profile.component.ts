import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ImageUploadService } from '../services/image-upload.service';
import { Router } from '@angular/router';
import { Profile } from '../model/profile.model';

@Component({
  selector: 'app-add-profile',
  templateUrl: './add-profile.component.html',
  styleUrls: ['./add-profile.component.scss']
})
export class AddProfileComponent implements OnInit {

  image: any;
  selectedFile: File;
  fileName = 'hey';

  profileDetails: FormGroup = new FormGroup({
    title: new FormControl('', Validators.required),
    imageOriginalName: new FormControl('', Validators.required),
    status: new FormControl('', Validators.required)
  });

  constructor(private uploadImage: ImageUploadService, private router: Router) {
  }

  ngOnInit() {
  }

  getPhoto(event: any) {
    this.selectedFile = event.target.files[0];
    const reader = new FileReader();

    reader.readAsDataURL(event.target.files[0]);
    reader.onload = (event) => { // called once readAsDataURL is completed
      this.image = reader.result; // add source to image
    };
    reader.onerror = function () {
      console.log(reader.error);
    };
  }

  formSubmitted() {
    const profileDetails: Profile = this.profileDetails.value;
    console.log(profileDetails);
    this.uploadImage.uploadProfileDetails(this.selectedFile, this.fileName, profileDetails).subscribe();
    this.router.navigate(['/profileList']);
  }


}
