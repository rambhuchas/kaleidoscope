
import { Channel } from './channel';
import { Product } from './product';
import { ProductId } from './productid';
import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';

export class ChurnRequest {
  selectedProduct: Product;
  msisdn: string;
  selectedChurnType: string;

  startDateObj: NgbDateStruct;
  endDateObj: NgbDateStruct;
  churnStartDateObj: NgbDateStruct;
  churnEndDateObj: NgbDateStruct;

  selectedSubChannel: Channel;
  selectedChurnChannel: Channel;

}
