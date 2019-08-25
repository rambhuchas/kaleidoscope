import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SmshistoryComponent } from './smshistory.component';

describe('SmshistoryComponent', () => {
  let component: SmshistoryComponent;
  let fixture: ComponentFixture<SmshistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SmshistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SmshistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
