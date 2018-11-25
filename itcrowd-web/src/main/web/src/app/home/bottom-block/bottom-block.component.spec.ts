import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BottomBlockComponent } from './bottom-block.component';

describe('BottomBlockComponent', () => {
  let component: BottomBlockComponent;
  let fixture: ComponentFixture<BottomBlockComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BottomBlockComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BottomBlockComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
