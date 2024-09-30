import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MarksheetCreateComponent } from './marksheet-create.component';

describe('MarksheetCreateComponent', () => {
  let component: MarksheetCreateComponent;
  let fixture: ComponentFixture<MarksheetCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MarksheetCreateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MarksheetCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
