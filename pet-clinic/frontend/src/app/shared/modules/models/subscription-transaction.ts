export interface SubscriptionTransaction {
    subRevenue: number;
    subretryRevenue: number;
    renewalRevenue: number;
    totalRevenue: number;
    date: Date;
    operationDate: Date; // Subsciprtion Audit

    // Common for Sub Audit and MSISDN History starts
    action: number;
    prodName: string; // Churn
    subChannelName: string; // Churn
    amountCharged: number;
    lastValidity: number;
    expiryDate: Date;
    lastTransactionId: string;
    lastTransactionResponse: string;
    requestDate: Date;
    // Common for Sub Audit and MSISDN History ends

    // MSISDN History with Unsub Option starts
    status: string;
    msisdn: number; // Churn
    packId: number;
    pid: number;
    totalChargedTillNow: number;
    firstChargedDate: Date;
    lastChargeTriedDate: Date;
    // MSISDN History with Unsub Option ends

    subChannelId: number; // Churn
    unsubChannelId: number; // Churn
    unsubChannelName: string; // Churn
    totalReTriedTillNow: number;
    churnType: string;
    churnedDate: Date;
    viaSub: number;
    auditActionDesc: string;
}
