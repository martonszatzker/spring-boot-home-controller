import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {WineCardComponent} from "./components/wine-card/wine-card.component";

const routes: Routes = [
  {
        path: '',
        redirectTo: '/',
        pathMatch: 'full',
  },
  {
    path: 'wine',
    component: WineCardComponent,
    pathMatch: 'full',
  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
