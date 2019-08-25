import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { DndblackComponent } from './dndblack.component';
import { DndblackRoutingModule } from './dndblack-routing.module';

import { PageHeaderModule } from 'src/app/shared';
import { BsComponentModule } from '../bs-component/bs-component.module';

@NgModule({
  declarations: [DndblackComponent],
  imports: [
    CommonModule,
    DndblackRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    PageHeaderModule,
    BsComponentModule
  ]
})
export class DndblackModule { }
