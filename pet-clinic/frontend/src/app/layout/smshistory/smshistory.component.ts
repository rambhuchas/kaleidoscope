import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';
import { SmsHistoryService } from 'src/app/shared/modules/services/smshistory/smshistory.service';
import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { SmsDto } from 'src/app/shared/modules/models/smsdto';

@Component({
    selector: 'app-smshistory',
    templateUrl: './smshistory.component.html',
    styleUrls: ['./smshistory.component.scss'],
    animations: [routerTransition()]
})
export class SmshistoryComponent implements OnInit {
    errorMessage: any;

    smsDetailList: SmsDto[];
    msisdn: string;
    startDate: string;
    endDate: string;

    startDateObj: NgbDateStruct;
    endDateObj: NgbDateStruct;

    constructor(private smhistoryService: SmsHistoryService) {}

    ngOnInit() {}

    getSmsDetails() {
        this.startDate = this.startDateObj.year + '-' + this.startDateObj.month + '-' + this.startDateObj.day;
        this.endDate = this.endDateObj.year + '-' + this.endDateObj.month + '-' + this.endDateObj.day;
        this.smhistoryService.getSmsDetails(this.msisdn, this.startDate, this.endDate).subscribe(
            smsObservable => {
                this.smsDetailList = smsObservable;
                console.log(this.smsDetailList);
            },
            error => (this.errorMessage = error as any)
        );
    }
}
