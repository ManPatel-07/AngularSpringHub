import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LazylistComponent } from './lazylist.component';

describe('LazylistComponent', () => {
  let component: LazylistComponent;
  let fixture: ComponentFixture<LazylistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LazylistComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LazylistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
