import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout.component';

const routes: Routes = [
    {
        path: '',
        component: LayoutComponent,
        children: [
            { path: '', redirectTo: 'charts', pathMatch: 'prefix' },
            { path: 'charts', loadChildren: () => import('./charts/charts.module').then(m => m.ChartsModule) },
            { path: 'subscription', loadChildren: () => import('./subscription/subscription.module').then(m => m.SubscriptionModule) },
            { path: 'smshistory', loadChildren: () => import('./smshistory/smshistory.module').then(m => m.SmshistoryModule) },
            { path: 'wap', loadChildren: () => import('./wap/wap.module').then(m => m.WapModule) },
            { path: 'backend', loadChildren: () => import('./backend/backend.module').then(m => m.BackendModule) },
            { path: 'dnd', loadChildren: () => import('./dndblack/dndblack.module').then(m => m.DndblackModule) },
            { path: 'cmsmanage', loadChildren: () => import('./content/content.module').then(m => m.ContentModule) },
            { path: 'churn', loadChildren: () => import('./churn/churn.module').then(m => m.ChurnModule) },
            { path: 'dashboard', loadChildren: () => import('./dashboard/dashboard.module').then(m => m.DashboardModule) },
            { path: 'tables', loadChildren: () => import('./tables/tables.module').then(m => m.TablesModule) },
            { path: 'forms', loadChildren: () => import('./form/form.module').then(m => m.FormModule) },
            { path: 'bs-element', loadChildren: () => import('./bs-element/bs-element.module').then(m => m.BsElementModule) },
            { path: 'grid', loadChildren: () => import('./grid/grid.module').then(m => m.GridModule) },
            { path: 'components', loadChildren: () => import('./bs-component/bs-component.module').then(m => m.BsComponentModule) },
            { path: 'blank-page', loadChildren: () => import('./blank-page/blank-page.module').then(m => m.BlankPageModule) },
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class LayoutRoutingModule {}
