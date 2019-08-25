import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OperatorRoutingModule } from './operator-routing.module';
import { OperatorComponent } from './operator.component';

@NgModule({
    imports: [CommonModule, OperatorRoutingModule],
    declarations: [OperatorComponent],
    exports: [OperatorComponent]
})
export class OperatorModule {}
