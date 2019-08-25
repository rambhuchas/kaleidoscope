import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { DailyReport } from '../../models/dailyreport';

@Injectable({
  providedIn: 'root'
})
export class ReportService {

  constructor(private http: HttpClient) {
  }

  getDailyReport(startDate: String, endDate: String): Observable<any> {
    return this.http.get('//localhost:9966/petclinic/api/report/daily-aggregated/'+startDate+'/'+endDate+'?packId=2&pId=1');
  }
}
