import { TestBed } from '@angular/core/testing';

import { ChurnService } from './churn.service';

describe('ChurnService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ChurnService = TestBed.get(ChurnService);
    expect(service).toBeTruthy();
  });
});
