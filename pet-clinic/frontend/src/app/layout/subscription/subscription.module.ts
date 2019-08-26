import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import { SubscriptionRoutingModule } from './subscription-routing.module';
import { SubscriptionComponent } from './subscription.component';
import { PageHeaderModule } from '../../shared';
import { BsComponentModule } from '../bs-component/bs-component.module';

import { SubHistoryComponent } from './components';

@NgModule({
    imports: [CommonModule, SubscriptionRoutingModule, PageHeaderModule, BsComponentModule, NgbModule, FormsModule],
    declarations: [SubscriptionComponent, SubHistoryComponent]
})
export class SubscriptionModule {}
