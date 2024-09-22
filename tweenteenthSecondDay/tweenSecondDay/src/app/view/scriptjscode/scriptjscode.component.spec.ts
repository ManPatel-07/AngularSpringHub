import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ScriptjscodeComponent } from './scriptjscode.component';

describe('ScriptjscodeComponent', () => {
  let component: ScriptjscodeComponent;
  let fixture: ComponentFixture<ScriptjscodeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ScriptjscodeComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ScriptjscodeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
