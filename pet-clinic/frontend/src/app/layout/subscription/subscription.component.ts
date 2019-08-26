import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';
import { SubscriberService } from '../../shared/modules/services/subscriber/subscriber.service';
import { SubscriptionTransaction } from '../../shared/modules/models/subscription-transaction';
import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';

@Component({
    selector: 'app-subscription',
    templateUrl: './subscription.component.html',
    styleUrls: ['./subscription.component.scss'],
    animations: [routerTransition()]
})
export class SubscriptionComponent implements OnInit {
    public isCollapsed = true;
    public isCollapsed2 = true;
    errorMessage: any;

    msisdn: string;
    subscriptionTransaction: SubscriptionTransaction[];

    selectedSubscriptionHistory: SubscriptionTransaction[];

    startDateObj: NgbDateStruct;
    endDateObj: NgbDateStruct;

    constructor(private subService: SubscriberService) {}

    ngOnInit() {}

    getSubscriptionStatus() {
        this.subService.getSubscriptionStatus(this.msisdn).subscribe(
            subTransObservable => {
                this.subscriptionTransaction = subTransObservable;
                console.log(this.subscriptionTransaction);
            },
            error => (this.errorMessage = error as any)
        );
    }

    onSelect(singleSubscription: SubscriptionTransaction) {
        // const startDate = this.startDateObj.year + '-' + this.startDateObj.month + '-' + this.startDateObj.day;
        // const endDate = this.endDateObj.year + '-' + this.endDateObj.month + '-' + this.endDateObj.day;
        const startDate = '1900-01-01';
        const endDate = '2100-12-31';
        this.subService.getSubscriptionHistory(singleSubscription, startDate, endDate).subscribe(
            subTransObservable => {
                this.selectedSubscriptionHistory = subTransObservable;
                console.log(this.selectedSubscriptionHistory);
            },
            error => (this.errorMessage = error as any)
        );
    }
}
