import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';
import { AuditVistService } from './../../shared/modules/services/auditvisit/auditvisit.service';
import { AuditVisit } from '../../shared/modules/models/auditvisit';

import { ProductService } from './../../shared/modules/services/product/product.service';
import { Product } from '../../shared/modules/models/product';

import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { FormControl } from '@angular/forms';

@Component({
    selector: 'app-wap',
    templateUrl: './wap.component.html',
    styleUrls: ['./wap.component.scss'],
    animations: [routerTransition()]
})
export class WapComponent implements OnInit {
    msisdn: String;
    startDateObj: NgbDateStruct;
    endDateObj: NgbDateStruct;
    auditVisits: AuditVisit[];
    errorMessage: String;

    msisdnSearchTerm: FormControl = new FormControl();
    myBooks = <any>[];

    activeProducts: Product[];

    constructor(private auditVistService: AuditVistService, private productService: ProductService) {}

    ngOnInit () {
      this.getActiveProducts();
      this.msisdnSearchTerm.valueChanges.subscribe(
        term => {
          if (term !== '') {
            this.auditVistService.getVisitedCustomers().subscribe(
              data => {
                this.myBooks = data as any[];
                //console.log(data[0].BookName);
            });
          }
      });
    }

    getActiveProducts() {
      this.productService.getActiveProducts().subscribe(
        activeProductsObservable => {
          this.activeProducts = activeProductsObservable;
          console.log(this.activeProducts);
        },
        error => this.errorMessage = error as any
      );
    }

    getAuditVisits() {
        this.auditVistService.getAuditVisits(
            this.msisdn,
            this.startDateObj.year + '-' + this.startDateObj.month + '-' + this.startDateObj.day,
            this.endDateObj.year + '-' + this.endDateObj.month + '-' + this.endDateObj.day
        ).subscribe(
          auditVisitsObservable => {
            this.auditVisits = auditVisitsObservable;
            console.log(this.auditVisits);
          },
          error => this.errorMessage = error as any
        );
    }
}
