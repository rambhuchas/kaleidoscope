import { ProductId } from './productid';

export interface Product {

  pidServiceId: ProductId;

  packId: string;

  sc: string;

  serviceNum: string;

  prodName: string;

  prodDesc: string;

  subKeyword: string;

  unsubKeyword: string;

  state: BigInteger;

}
