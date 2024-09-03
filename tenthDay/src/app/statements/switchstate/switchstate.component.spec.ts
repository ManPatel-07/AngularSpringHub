import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SwitchstateComponent } from './switchstate.component';

describe('SwitchstateComponent', () => {
  let component: SwitchstateComponent;
  let fixture: ComponentFixture<SwitchstateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SwitchstateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SwitchstateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
