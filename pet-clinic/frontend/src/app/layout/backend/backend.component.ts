import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';

import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { FormControl } from '@angular/forms';

import { Product } from 'src/app/shared/modules/models/product';
import { ProductService } from 'src/app/shared/modules/services/product/product.service';

import { Channel } from 'src/app/shared/modules/models/channel';
import { ChannelService } from '../../shared/modules/services/channel/channel.service';

import { PriceDetails } from 'src/app/shared/modules/models/pricedetails';
import { PriceDetailsService } from 'src/app/shared/modules/services/pricedetails/pricedetails.service';

import { SubscriptionRequest } from '../../shared/modules/models/subscription-request';
import { SubscriptionTransaction } from '../../shared/modules/models/subscription-transaction';
import { BackendService } from 'src/app/shared/modules/services/backend/backend.service';

@Component({
    selector: 'app-backend',
    templateUrl: './backend.component.html',
    styleUrls: ['./backend.component.scss'],
    animations: [routerTransition()]
})
export class BackendComponent implements OnInit {
    activeProducts: Product[];
    channels: Channel[];
    priceDetailsList: PriceDetails[];

    subscriptionRequest: SubscriptionRequest;

    errorMessage: any;

    showMsg: boolean;
    activatedNumbers: string;

    constructor(
        private productService: ProductService,
        private channelService: ChannelService,
        private priceDetailsService: PriceDetailsService,
        private backendService: BackendService
    ) {
        this.activatedNumbers = '';
        this.subscriptionRequest = {
            msisdnNumbers: '',
            selectedChannel: null,
            selectedPriceDetails: null,
            selectedProduct: null
        };
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

        this.priceDetailsService.getActiveProducts().subscribe(
            priceObservable => {
                this.priceDetailsList = priceObservable;
                console.log(this.priceDetailsList);
            },
            error => (this.errorMessage = error as any)
        );
    }

    activateSubscribers() {
        this.backendService.activateSubscribers(this.subscriptionRequest).subscribe(
            subDetailsObservable => {
                this.showMsg = true;
                const inserteddSubscribers: SubscriptionTransaction[] = subDetailsObservable;
                inserteddSubscribers.forEach( (insertedSubscriber) => {
                    this.activatedNumbers += ', ';
                    this.activatedNumbers += insertedSubscriber.msisdn;
                });
                console.log('Returned Items: ' + JSON.stringify(inserteddSubscribers));
                // console.log(subDetailsObservable);
            },
            error => {
                this.showMsg = true;
                this.errorMessage = error as any;
            }
        );
    }
}
