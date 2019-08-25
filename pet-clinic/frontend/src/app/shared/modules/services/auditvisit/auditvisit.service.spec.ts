import { TestBed } from '@angular/core/testing';

import { AuditVistService } from './auditvisit.service';

describe('AuditVistService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AuditVistService = TestBed.get(AuditVistService);
    expect(service).toBeTruthy();
  });
});
