import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
    selector: 'app-date-picker',
    templateUrl: './date-picker.component.html',
    styleUrls: ['./date-picker.component.scss']
})
export class DatePickerComponent implements OnInit {
    model: any;
    //@Input() bgClass: string;
    //@Input() icon: string;
    //@Input() count: number;
    @Input() label: string;
    //@Input() data: number;
    //@Output() event: EventEmitter<any> = new EventEmitter();
    constructor() { }

    ngOnInit() {
    }

}
