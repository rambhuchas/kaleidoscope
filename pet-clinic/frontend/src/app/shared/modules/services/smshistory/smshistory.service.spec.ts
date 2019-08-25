import { TestBed } from '@angular/core/testing';

import { SmsHistoryService } from './smshistory.service';

describe('SmsHistoryService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SmsHistoryService = TestBed.get(SmsHistoryService);
    expect(service).toBeTruthy();
  });
});
