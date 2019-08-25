import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-smstimeline',
  templateUrl: './smstimeline.component.html',
  styleUrls: ['./smstimeline.component.scss']
})
export class SmsTimelineComponent implements OnInit {
  model: any;

  @Input() inverted: boolean;
  @Input() cardStatus: String;
  @Input() badgeIcon: String;
  @Input() heading: String;
  @Input() message: String;
  @Input() messageTime: String;

  constructor() { }

  ngOnInit() {
  }

}
