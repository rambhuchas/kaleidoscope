import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { SubscriptionRequest } from '../../models/subscription-request';
import { SubscriptionTransaction } from '../../models/subscription-transaction';

@Injectable({
    providedIn: 'root'
})
export class BackendService {
    constructor(private http: HttpClient) {}

    activateSubscribers(subscriptionRequest: SubscriptionRequest): Observable<any> {
        const body = JSON.stringify({ subscriptionRequest });
        let headers = new HttpHeaders({
            'Content-Type': 'application/json;charset=UTF-8'
        });
        let options = { headers: headers };
        console.log(body);
        return this.http.post<SubscriptionTransaction>('//localhost:9966/petclinic/api/subscriptions', subscriptionRequest, options);
        // return of('Success');
    }
}
