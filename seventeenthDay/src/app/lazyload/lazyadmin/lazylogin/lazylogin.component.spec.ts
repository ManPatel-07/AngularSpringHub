import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LazyloginComponent } from './lazylogin.component';

describe('LazyloginComponent', () => {
  let component: LazyloginComponent;
  let fixture: ComponentFixture<LazyloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LazyloginComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LazyloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
