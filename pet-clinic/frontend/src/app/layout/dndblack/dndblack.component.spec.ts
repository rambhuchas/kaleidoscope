import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DndblackComponent } from './dndblack.component';

describe('DndblackComponent', () => {
  let component: DndblackComponent;
  let fixture: ComponentFixture<DndblackComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DndblackComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DndblackComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
