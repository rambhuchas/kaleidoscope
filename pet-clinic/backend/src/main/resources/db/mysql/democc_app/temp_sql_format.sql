-- Daily Report
 
SELECT
    DATE,
    SUM(total_clicks) total_clicks,
    SUM(total_clicks_only_msisdn) total_clicks_only_msisdn,
    SUM(total_clicks_unique_msisdn) total_clicks_unique_msisdn,
    SUM(first_conform_pg_visit) first_conform_pg_visit,
    SUM(second_conform_pg_visit) second_conform_pg_visit,
    SUM(sub_failed) sub_failed,
    SUM(sub_request) sub_request,
    SUM(sub_success) sub_success,
    SUM(sub_success * price) sub_revenue,
    SUM(subretry_failed) subretry_failed,
    SUM(subretry_success) subretry_success,
    SUM(subretry_success * price) subretry_revenue,
    SUM(renewal_failed) renewal_failed,
    SUM(renewal_success) renewal_success,
    SUM(renewal_success * price) renewal_revenue,
    (
        SUM(sub_success * price) + SUM(subretry_success * price) + SUM(renewal_success * price)
    ) total_revenue,
    SUM(unsub_request) unsub_request,
    SUM(unsub_success) unsub_success,
    SUM(churn_subretry) churn_subretry,
    SUM(churn_renewal) churn_renewal
FROM
    report_hourly
WHERE
    DATE BETWEEN ? AND ? $ cond
GROUP BY
    1
UNION ALL
SELECT
    'TOTAL',
    SUM(total_clicks) total_clicks,
    SUM(total_clicks_only_msisdn) total_clicks_only_msisdn,
    SUM(total_clicks_unique_msisdn) total_clicks_unique_msisdn,
    SUM(first_conform_pg_visit) first_conform_pg_visit,
    SUM(second_conform_pg_visit) second_conform_pg_visit,
    SUM(sub_failed) sub_failed,
    SUM(sub_request) sub_request,
    SUM(sub_success) sub_success,
    SUM(sub_success * price) sub_revenue,
    SUM(subretry_failed) subretry_failed,
    SUM(subretry_success) subretry_success,
    SUM(subretry_success * price) subretry_revenue,
    SUM(renewal_failed) renewal_failed,
    SUM(renewal_success) renewal_success,
    SUM(renewal_success * price) renewal_revenue,
    (
        SUM(sub_success * price) + SUM(subretry_success * price) + SUM(renewal_success * price)
    ) total_revenue,
    SUM(unsub_request) unsub_request,
    SUM(unsub_success) unsub_success,
    SUM(churn_subretry) churn_subretry,
    SUM(churn_renewal) churn_renewal
FROM
    report_hourly
WHERE
    DATE BETWEEN ? AND ? $ cond 
 
    
-- Ad Agency Report (MIS) - vs
SELECT
    cr_dt,
    prod_desc,
    total_clicks,
    total_clicks_only_msisdn,
    total_clicks_unique_msisdn,
    sub_request,
    sub_success,
    sub_revenue,
    sub_failed,
    subretry_success,
    subretry_revenue,
    renewal_success,
    renewal_revenue,
    unsub,
    churn
FROM
    report_ad_agency
JOIN product USING(pack_id, pid)
WHERE
    YEAR(cr_dt) = ? AND MONTH(cr_dt) = ? AND vs = ?
GROUP BY
    1,
    pack_id,
    pid;

-- Ad Agency Report (MIS) - Non vs
SELECT
    cr_dt,
    SUM(total_clicks) total_clicks,
    SUM(total_clicks_only_msisdn) total_clicks_only_msisdn,
    SUM(total_clicks_unique_msisdn) total_clicks_unique_msisdn,
    SUM(sub_request) sub_request,
    SUM(sub_success) sub_success,
    SUM(sub_revenue) sub_revenue,
    SUM(sub_failed) sub_failed,
    SUM(subretry_success) subretry_success,
    SUM(subretry_revenue) subretry_revenue,
    SUM(renewal_success) renewal_success,
    SUM(renewal_revenue) renewal_revenue,
    SUM(unsub) unsub,
    SUM(churn) churn
FROM
    report_ad_agency
WHERE
    YEAR(cr_dt) = ? AND MONTH(cr_dt) = ? AND vs IN(
    SELECT DISTINCT
        vs
    FROM
        vs_details
    WHERE
        vs_name LIKE 'Opera%'
)
GROUP BY
    1;

-- CommonDAOImpl.getSubscriberQueueByMsisdnService()
SELECT
    subs_id,
    ACTION,
    a.state,
    msisdn,
    temp,
    trans_id,
    trans_resp,
    channel_id,
    MODE AS channel_name,
    pid,
    prod_name,
    temp_prod,
    catid,
    via_ip,
    validity,
    validity_desc,
    counter,
    cr_dt,
    mod_dt,
    via_sub,
    sms_flg,
    subs_type,
    service_id,
    pack_id,
    b.service_num,
    ppid,
    price,
    price_alias,
    temp_price,
    sc,
    billing_sc,
    sub_keyword,
    unsub_keyword,
    ismsg,
    msg_link
FROM
    subscriber_queue a
JOIN product b USING(pack_id, pid)
JOIN price_points USING(price)
JOIN CHANNEL USING
    (channel_id)
WHERE
    msisdn = ? AND pack_id = ?
GROUP BY
    msisdn,
    ACTION,
    pack_id