import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import { SmshistoryRoutingModule } from './smshistory-routing.module';
import { SmshistoryComponent } from './smshistory.component';
import { PageHeaderModule } from './../../shared';
// import { DashboardModule } from '../dashboard/dashboard.module';
// import { BsComponentModule } from '../bs-component/bs-component.module';
import { SmsTimelineComponent } from './components';

@NgModule({
    imports: [CommonModule, SmshistoryRoutingModule, PageHeaderModule, FormsModule, NgbModule],
    declarations: [SmshistoryComponent, SmsTimelineComponent]
})
export class SmshistoryModule {}
