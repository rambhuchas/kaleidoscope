import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DndblackComponent } from './dndblack.component';

const routes: Routes = [
  {
    path: '', component: DndblackComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DndblackRoutingModule { }
