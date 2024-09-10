import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompoAComponent } from './compo-a.component';

describe('CompoAComponent', () => {
  let component: CompoAComponent;
  let fixture: ComponentFixture<CompoAComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CompoAComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CompoAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
