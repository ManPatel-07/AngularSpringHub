import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompoBComponent } from './compo-b.component';

describe('CompoBComponent', () => {
  let component: CompoBComponent;
  let fixture: ComponentFixture<CompoBComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CompoBComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CompoBComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
