import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import { BackendComponent } from './backend.component';
import { BackendRoutingModule } from './backend-routing.module';
import { PageHeaderModule } from 'src/app/shared';

@NgModule({
  declarations: [BackendComponent],
  imports: [
    CommonModule,
    PageHeaderModule,
    BackendRoutingModule,
    FormsModule,
    NgbModule
  ]
})
export class BackendModule { }
