import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PropertyBindComponent } from './property-bind.component';

describe('PropertyBindComponent', () => {
  let component: PropertyBindComponent;
  let fixture: ComponentFixture<PropertyBindComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PropertyBindComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PropertyBindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
