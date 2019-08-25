import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WapComponent } from './wap.component';

const routes: Routes = [
    {
        path: '',
        component: WapComponent
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class WapRoutingModule {}
