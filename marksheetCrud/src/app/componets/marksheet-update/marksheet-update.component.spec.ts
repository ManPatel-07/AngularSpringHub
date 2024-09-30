import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MarksheetUpdateComponent } from './marksheet-update.component';

describe('MarksheetUpdateComponent', () => {
  let component: MarksheetUpdateComponent;
  let fixture: ComponentFixture<MarksheetUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MarksheetUpdateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MarksheetUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
