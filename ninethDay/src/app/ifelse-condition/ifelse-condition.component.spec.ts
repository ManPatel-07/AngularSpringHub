import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IfelseConditionComponent } from './ifelse-condition.component';

describe('IfelseConditionComponent', () => {
  let component: IfelseConditionComponent;
  let fixture: ComponentFixture<IfelseConditionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [IfelseConditionComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IfelseConditionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
