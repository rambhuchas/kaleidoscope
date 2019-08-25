import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ChartsModule as Ng2Charts } from 'ng2-charts';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';

import { ChartsRoutingModule } from './charts-routing.module';
import { ChartsComponent } from './charts.component';
// import { PageHeaderModule } from '../../shared';
import { StatModule } from '../../shared';
import { BsComponentModule } from '../bs-component/bs-component.module'

@NgModule({
    imports: [CommonModule, Ng2Charts, ChartsRoutingModule, StatModule, BsComponentModule, NgbModule, FormsModule],
    declarations: [ChartsComponent]
})
export class ChartsModule {}
