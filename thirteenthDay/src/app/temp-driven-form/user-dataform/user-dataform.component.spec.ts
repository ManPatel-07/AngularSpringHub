import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserDataformComponent } from './user-dataform.component';

describe('UserDataformComponent', () => {
  let component: UserDataformComponent;
  let fixture: ComponentFixture<UserDataformComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UserDataformComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserDataformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
