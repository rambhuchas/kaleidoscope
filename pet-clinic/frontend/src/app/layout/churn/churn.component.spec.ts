import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChurnComponent } from './churn.component';

describe('ChurnComponent', () => {
  let component: ChurnComponent;
  let fixture: ComponentFixture<ChurnComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChurnComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChurnComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
