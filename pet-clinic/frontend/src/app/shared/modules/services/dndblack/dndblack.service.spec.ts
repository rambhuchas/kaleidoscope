import { TestBed } from '@angular/core/testing';

import { DndblackService } from './dndblack.service';

describe('DndblackService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DndblackService = TestBed.get(DndblackService);
    expect(service).toBeTruthy();
  });
});
