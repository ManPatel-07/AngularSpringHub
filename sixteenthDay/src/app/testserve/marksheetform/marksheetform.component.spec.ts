import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MarksheetformComponent } from './marksheetform.component';

describe('MarksheetformComponent', () => {
  let component: MarksheetformComponent;
  let fixture: ComponentFixture<MarksheetformComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MarksheetformComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MarksheetformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
