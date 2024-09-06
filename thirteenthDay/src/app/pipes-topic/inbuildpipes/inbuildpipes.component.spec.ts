import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InbuildpipesComponent } from './inbuildpipes.component';

describe('InbuildpipesComponent', () => {
  let component: InbuildpipesComponent;
  let fixture: ComponentFixture<InbuildpipesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [InbuildpipesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InbuildpipesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
