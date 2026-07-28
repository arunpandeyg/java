import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ForlComponent } from './forl.component';

describe('ForlComponent', () => {
  let component: ForlComponent;
  let fixture: ComponentFixture<ForlComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ForlComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ForlComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
