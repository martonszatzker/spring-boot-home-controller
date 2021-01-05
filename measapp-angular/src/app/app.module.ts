import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LeftMenuComponent } from './components/left-menu/left-menu.component';
import { HelloComponent } from "./hello.component";

import { SidenavService } from "./services/sidenav.service";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { FlexLayoutModule } from "@angular/flex-layout";
import { MaterialModule } from "./material.module";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { WineCardComponent } from './components/wine-card/wine-card.component';
import { WineCardListComponent } from './components/wine-card-list/wine-card-list.component';

import { DefaultService } from "../../projects/measapp-client-lib/src";
import {TranslateLoader, TranslateModule, TranslateService} from "@ngx-translate/core";
import {TranslateHttpLoader} from "@ngx-translate/http-loader";

export function HttpLoaderFactory(httpClient: HttpClient) {
  return new TranslateHttpLoader(httpClient);
}

export const routes =  [
  { path: 'accounts', component: HelloComponent, label: 'Accounts' },
  { path: 'contacts', component: WineCardComponent, label: 'Contacts' },
  { path: 'activities', component: WineCardListComponent, label: 'Activities' }
];


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LeftMenuComponent,
    HelloComponent,
    WineCardComponent,
    WineCardListComponent,
  ],
  imports: [
    TranslateModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    }),
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    FormsModule,
    FlexLayoutModule,
    ReactiveFormsModule
  ],
  providers: [ SidenavService,
               DefaultService,
               TranslateService],
  bootstrap: [ AppComponent ]
})
export class AppModule {

  constructor(public translate: TranslateService) {
    translate.addLangs(['en', 'fr']);
    translate.setDefaultLang('en');

    const browserLang = translate.getBrowserLang();
    translate.use(browserLang.match(/en|fr/) ? browserLang : 'en');
  }


 }
