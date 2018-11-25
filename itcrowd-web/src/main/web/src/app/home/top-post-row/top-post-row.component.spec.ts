import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TopPostRowComponent } from './top-post-row.component';

describe('TopPostRowComponent', () => {
  let component: TopPostRowComponent;
  let fixture: ComponentFixture<TopPostRowComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TopPostRowComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TopPostRowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
