import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PostCardBigComponent } from './post-card-big.component';

describe('PostCardBigComponent', () => {
  let component: PostCardBigComponent;
  let fixture: ComponentFixture<PostCardBigComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PostCardBigComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PostCardBigComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
