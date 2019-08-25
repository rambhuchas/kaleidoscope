export class SmsDto {
    msisdn: number;
    smsMessage: string;
    shortCode: string; // int - audit_mo; string - sms_queue
    createdDate: Date; // date - audit_mo
    state: string; // sms_queue only smsVO.getState()==2?"Sent":"Not Sent"
    mobileOriginatedMessage: boolean; // sms_queue only smsVO.getState()==2?"Sent":"Not Sent"
}
