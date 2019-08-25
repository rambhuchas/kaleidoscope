import { Channel } from './channel';
import { Product } from './product';
import { PriceDetails } from './pricedetails';

export class SubscriptionRequest {
    selectedProduct: Product;
    msisdnNumbers: String;
    selectedChannel: Channel;
    selectedPriceDetails: PriceDetails;
}
