import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MarksheetDataComponent } from './marksheet-data.component';

describe('MarksheetDataComponent', () => {
  let component: MarksheetDataComponent;
  let fixture: ComponentFixture<MarksheetDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MarksheetDataComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MarksheetDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
