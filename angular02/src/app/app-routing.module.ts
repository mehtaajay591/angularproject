import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProfileComponent } from './profile/profile.component';
import { AddProfileComponent } from './add-profile/add-profile.component';


const routes: Routes = [
  { path: "", redirectTo: "setProfile", pathMatch: "full"},
  { path: "setProfile", component: AddProfileComponent},
  { path: "profileList", component: ProfileComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
