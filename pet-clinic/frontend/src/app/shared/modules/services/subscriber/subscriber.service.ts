import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { SubscriptionTransaction } from '../../models/subscription-transaction';

@Injectable({
    providedIn: 'root'
})
export class SubscriberService {
    constructor(private http: HttpClient) {}
    getSubscriptionStatus(msisdn: string): Observable<SubscriptionTransaction[]> {
        // return of(this.churnDetails);
        // http://localhost:9966/petclinic/api/subscriptions/1/1/2019-01-01/2019-12-31/2018-01-01/2019-08-31/2340123456789/1/1/1
        ///{packId}/{pid}/{churnStartDate}/{churnEndDate}/{subStartDate}/{subEndDate}/{msisdn}/{churnType}/{subChannelId}/{unsubChannelId}
        const url = '//localhost:9966/petclinic/api/subscriptions/status/' + msisdn;
        console.log(url);

        return this.http.get<SubscriptionTransaction[]>(url);
    }

    getSubscriptionHistory(
        subscriptionTransaction: SubscriptionTransaction,
        startDate: string,
        endDate: string
    ): Observable<SubscriptionTransaction[]> {
        // return of(this.churnDetails);
        // http://localhost:9966/petclinic/api/subscriptions/1/1/2019-01-01/2019-12-31/2018-01-01/2019-08-31/2340123456789/1/1/1
        ///{packId}/{pid}/{churnStartDate}/{churnEndDate}/{subStartDate}/{subEndDate}/{msisdn}/{churnType}/{subChannelId}/{unsubChannelId}
        const url =
            '//localhost:9966/petclinic/api/subscriptions/history/' + subscriptionTransaction.msisdn + '/' + startDate + '/' + endDate;
        console.log(url);

        return this.http.get<SubscriptionTransaction[]>(url);
    }
}
