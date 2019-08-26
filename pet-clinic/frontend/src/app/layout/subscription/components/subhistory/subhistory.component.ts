import { Component, OnInit, Input } from '@angular/core';
import { SubscriptionTransaction } from 'src/app/shared/modules/models/subscription-transaction';
import { SubscriberService } from '../../../../shared/modules/services/subscriber/subscriber.service';

@Component({
  selector: 'app-subhistory',
  templateUrl: './subhistory.component.html',
  styleUrls: ['./subhistory.component.scss']
})
export class SubHistoryComponent implements OnInit {
  model: any;

  @Input() selectedSubscription: SubscriptionTransaction;

  errorMessage: any;

  subscriptionTransaction: SubscriptionTransaction[];

  constructor(private subService: SubscriberService) { }

  ngOnInit() {
  }

  onSelect() {
    // const startDate = this.startDateObj.year + '-' + this.startDateObj.month + '-' + this.startDateObj.day;
    // const endDate = this.endDateObj.year + '-' + this.endDateObj.month + '-' + this.endDateObj.day;
    const startDate = '1900-01-01';
    const endDate = '2100-12-31';
    this.subService.getSubscriptionHistory(this.selectedSubscription, startDate, endDate).subscribe(
        subTransObservable => {
            this.subscriptionTransaction = subTransObservable;
            console.log(this.subscriptionTransaction);
        },
        error => (this.errorMessage = error as any)
    );
  }
}
