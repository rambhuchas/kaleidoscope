import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { PriceDetails } from '../../models/pricedetails';

@Injectable({
  providedIn: 'root'
})
export class PriceDetailsService {

  constructor(private http: HttpClient) {
  }

  getActiveProducts(): Observable<PriceDetails[]> {
    return this.http.get<PriceDetails[]>('//localhost:9966/petclinic/api/prices/active');
  }
}
