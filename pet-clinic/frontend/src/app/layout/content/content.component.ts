import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.scss'],
  animations: [routerTransition()]
})
export class ContentComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
