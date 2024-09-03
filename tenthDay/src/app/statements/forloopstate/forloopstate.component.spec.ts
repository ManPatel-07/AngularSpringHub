import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ForloopstateComponent } from './forloopstate.component';

describe('ForloopstateComponent', () => {
  let component: ForloopstateComponent;
  let fixture: ComponentFixture<ForloopstateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ForloopstateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ForloopstateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
