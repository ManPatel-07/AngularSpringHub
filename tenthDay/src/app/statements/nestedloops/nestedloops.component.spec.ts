import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NestedloopsComponent } from './nestedloops.component';

describe('NestedloopsComponent', () => {
  let component: NestedloopsComponent;
  let fixture: ComponentFixture<NestedloopsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [NestedloopsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NestedloopsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
