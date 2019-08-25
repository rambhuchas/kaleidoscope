import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import { ChurnComponent } from './churn.component';
import { ChurnRoutingModule } from './churn-routing.module';
import { PageHeaderModule } from './../../shared';

@NgModule({
  declarations: [ChurnComponent],
  imports: [
    CommonModule,
    PageHeaderModule,
    ChurnRoutingModule,
    FormsModule,
    NgbModule
  ]
})
export class ChurnModule { }
