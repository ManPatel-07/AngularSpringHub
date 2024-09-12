import { TestBed } from '@angular/core/testing';

import { CrudServService } from './crud-serv.service';

describe('CrudServService', () => {
  let service: CrudServService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CrudServService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
