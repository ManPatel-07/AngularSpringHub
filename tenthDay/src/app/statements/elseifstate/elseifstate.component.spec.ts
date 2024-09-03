import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ElseifstateComponent } from './elseifstate.component';

describe('ElseifstateComponent', () => {
  let component: ElseifstateComponent;
  let fixture: ComponentFixture<ElseifstateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ElseifstateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ElseifstateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
