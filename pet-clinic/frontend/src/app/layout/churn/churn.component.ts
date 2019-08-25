import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';

import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { FormControl } from '@angular/forms';
import { Product } from 'src/app/shared/modules/models/product';
import { ProductService } from 'src/app/shared/modules/services/product/product.service';
import { ChannelService } from '../../shared/modules/services/channel/channel.service';
import { Channel } from 'src/app/shared/modules/models/channel';
import { ChurnService } from '../../shared/modules/services/churn/churn.service';
import { ChurnRequest } from '../../shared/modules/models/churn-request';
import { ChurnDetails } from 'src/app/shared/modules/models/churndetails';

@Component({
    selector: 'app-churn',
    templateUrl: './churn.component.html',
    styleUrls: ['./churn.component.scss'],
    animations: [routerTransition()]
})
export class ChurnComponent implements OnInit {
    activeProducts: Product[];
    channels: Channel[];

    // selectedProduct: Product;
    // msisdn: String;
    // selectedChurnType: String;

    churnRequest: ChurnRequest;

    errorMessage: any;
    churnDetails: ChurnDetails[];

    constructor(private productService: ProductService, private channelService: ChannelService, private churnService: ChurnService) {
        this.churnRequest = new ChurnRequest();
        this.churnRequest.selectedProduct = null;
    }

    ngOnInit() {
        this.productService.getActiveProducts().subscribe(
            activeProductsObservable => {
                this.activeProducts = activeProductsObservable;
                console.log(this.activeProducts);
            },
            error => (this.errorMessage = error as any)
        );

        this.channelService.getAllChannels().subscribe(
            channelObservable => {
                this.channels = channelObservable;
                console.log(this.channels);
            },
            error => (this.errorMessage = error as any)
        );
    }

    getChurnDetails() {
        this.churnService.getChurnDetails(this.churnRequest).subscribe(
            churnDetailsObservable => {
                this.churnDetails = churnDetailsObservable;
                console.log(this.churnDetails);
            },
            error => (this.errorMessage = error as any)
        );
    }
}
