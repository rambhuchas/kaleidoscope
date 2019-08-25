import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class AuditVistService {
    constructor(private http: HttpClient) {}
    getAuditVisits(msisdn: String, startDate: String, endDate: String): Observable<any> {
        return this.http.get('//localhost:9966/petclinic/api/products/visits/' + msisdn + '/' + startDate + '/' + endDate + '');
    }

    getVisitedCustomers(): Observable<String[]> {
        const msisdnVisited: String[] = ['2340123456789', '23401234567123', '2349823741234'];
        return of(msisdnVisited);
    }
}
