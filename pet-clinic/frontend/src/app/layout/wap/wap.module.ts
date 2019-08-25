import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import { PageHeaderModule } from '../../shared';

import { WapRoutingModule } from './wap-routing.module';
import { WapComponent } from './wap.component';

@NgModule({
  declarations: [WapComponent],
  imports: [
    CommonModule, WapRoutingModule, PageHeaderModule, FormsModule, NgbModule
  ]
})
export class WapModule { }
