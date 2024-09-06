import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnotherformComponent } from './anotherform.component';

describe('AnotherformComponent', () => {
  let component: AnotherformComponent;
  let fixture: ComponentFixture<AnotherformComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AnotherformComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AnotherformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
