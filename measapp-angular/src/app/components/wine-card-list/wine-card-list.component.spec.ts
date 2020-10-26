import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WineCardListComponent } from './wine-card-list.component';

describe('WineCardListComponent', () => {
  let component: WineCardListComponent;
  let fixture: ComponentFixture<WineCardListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WineCardListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WineCardListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
