import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../../models/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) {
  }

  getActiveProducts(): Observable<Product[]> {
    return this.http.get<Product[]>('//localhost:9966/petclinic/api/products/active');
  }
}
