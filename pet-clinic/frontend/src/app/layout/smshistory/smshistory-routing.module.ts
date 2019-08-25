import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SmshistoryComponent } from './smshistory.component';

const routes: Routes = [
  {
      path: '',
      component: SmshistoryComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SmshistoryRoutingModule { }
