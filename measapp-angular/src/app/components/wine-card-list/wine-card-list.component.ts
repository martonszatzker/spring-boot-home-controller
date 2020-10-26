import { Component, OnInit } from '@angular/core';
import {DefaultService, UserData} from "../../../../projects/measapp-client-lib/src";

@Component({
  selector: 'app-wine-card-list',
  templateUrl: './wine-card-list.component.html',
  styleUrls: ['./wine-card-list.component.scss']
})
export class WineCardListComponent implements OnInit {

  users:  UserData[];

  constructor(private userService: DefaultService) { }

  ngOnInit(): void {

    this.userService.simpleTestCall(null,null).subscribe(
      response => {
        console.log('returned',response);
        this.users = response;
      }
    )

  }

}
