import { Injectable } from '@angular/core';
import { ChurnRequest } from '../../models/churn-request';
import { Observable, of } from 'rxjs';
import { ChurnDetails } from '../../models/churndetails';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class ChurnService {
    churnDetails: ChurnDetails[];

    constructor(private http: HttpClient) {
        this.churnDetails = [
            {
                churnChannel: 'SMS',
                churnedDate: '2019-08-15',
                churnType: 'UnSub',
                msisdn: '234987987123',
                prodName: 'Football',
                subChannel: 'WAP',
                lastValidity: '2019-08-14',
                amountCharged: '50.00',
                expiryDate: '2019-08-25',
                totalChargedTillNow: '200.00',
                requestDate: '2019-08-15',
                firstChargedDate: '2019-08-15',
                viaSub: 'Subscriber'
            }
        ];
    }
    getChurnDetails(churnRequest: ChurnRequest): Observable<ChurnDetails[]> {
        // return of(this.churnDetails);
        // http://localhost:9966/petclinic/api/subscriptions/1/1/2019-01-01/2019-12-31/2018-01-01/2019-08-31/2340123456789/1/1/1
        ///{packId}/{pid}/{churnStartDate}/{churnEndDate}/{subStartDate}/{subEndDate}/{msisdn}/{churnType}/{subChannelId}/{unsubChannelId}
        let url = '//localhost:9966/petclinic/api/subscriptions/';
        url = url.concat(churnRequest.selectedProduct.packId, '/');
        url = url.concat(churnRequest.selectedProduct.pidServiceId.pid, '/');
        url = url.concat(churnRequest.churnStartDateObj.year + '', '-',
        churnRequest.churnStartDateObj.month + '', '-', churnRequest.churnStartDateObj.day + '', '/');
        url = url.concat(churnRequest.churnEndDateObj.year + '', '-',
        churnRequest.churnEndDateObj.month + '', '-', churnRequest.churnEndDateObj.day + '', '/');

        let startdate = '';
        if (churnRequest.startDateObj != null) {
            startdate = churnRequest.startDateObj.year + '-'
            + churnRequest.startDateObj.month
            + '-' + churnRequest.startDateObj.day;
        }
        url = url.concat(startdate, '/');

        let enddate = '';
        if (churnRequest.endDateObj != null) {
            enddate = churnRequest.endDateObj.year + '-'
            + churnRequest.endDateObj.month
            + '-' + churnRequest.endDateObj.day;
        }
        url = url.concat(enddate, '/');
        url = url.concat(churnRequest.msisdn, '/');
        url = url.concat(churnRequest.selectedChurnType, '/');
        url = url.concat(churnRequest.selectedSubChannel.channelId + '', '/');
        url = url.concat(churnRequest.selectedChurnChannel.channelId + '');

        console.log(url);

        return this.http.get<ChurnDetails[]>(url);
    }
}
