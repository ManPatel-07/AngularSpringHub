import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IfstateComponent } from './ifstate.component';

describe('IfstateComponent', () => {
  let component: IfstateComponent;
  let fixture: ComponentFixture<IfstateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [IfstateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IfstateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
