import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { DndBlacklist } from '../../models/dndblacklist';

@Injectable({
    providedIn: 'root'
})
export class DndblackService {
    constructor(private http: HttpClient) {}

    addBlackList(name: string): Observable<any> {
        const body = JSON.stringify({ name });
        console.log('within dndblackservice::: ' + body);
        console.log('within dndblackservice::: Plain Name::: ' + name);
        return this.http.post<DndBlacklist>('//localhost:9966/petclinic/api/blacklist', name);
    }

    getBlackList(): Observable<any> {
        return this.http.get('//localhost:9966/petclinic/api/blacklist');
    }
}
