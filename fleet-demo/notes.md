### Focus
* Earnings per day (Ola) or week (Uber) **per vehicle**
* Current platform only provides the entire operator bill details without any sorting - both operator bill and net Earnings
* Also provides per driver and per vehicle based performance
* Ola has incentives data not properly reported and buggy
* Online payment data is **UNAVAILABLE** in both ola and uber report data
* Surge or Peak pricing details **UNAVAILABLE** in both report data
* Common Terminologies:

    ```
    e.g., one trip and collects 1000 with ola charges as 30% which is 300
    Prime Play: Base fare 40 + 8/km + 1/minute; after 15 km 12/km

    Any toll charges are paid by the driver and taken directly from the **Collected Cash**. This is not reflected in the operator bill or in the amount to be repaid back to ola

    Ride Earnings = Raw Fare + Peak Pricing

    this rate is after deducting the ola commission. you earn exactly what you were earning before.

    For Each Trip (OLA)
    ----------------------
    Cash Collected = 389 (customer service -1.00, customer fine -50.00, play convenience fee -21.78, gst -26.00, upfront fare adj +10.00)
    Customer Bill (only relevant for customers) = 300.22
    Operator Bill (Key Metric) = 238.80
    Taxes = -0.06
    Driver To Pay back to Ola = 389 (-) 238.80 = 150.26
    Operator Bill = Cash Collected - Ola/Uber Charges to be paid (contains tax, ola fees, others)
    ---------------------------
    Net Earnings = Operator Bill + Incentives - Fines
    ```
* Operators are only interested in the Net Earnings and Operator Bill. Not bothered about the taxes, fees, etc
* They are interested in **peak pricing and cash collected (as a ratio of net earnings)**
* Operator bill - **DOESN'T INCLUDE INCENTIVE**
* Net Earnings = Operator Bill + Incentives - Fines. This will be reconciled end of day for Ola and end of week for Uber
* Sometimes Net Earnings can be less than the Cash collected in case incentives is more - at which point, fees payment to OLA will be adjusted accordingly

### Key Metrics to show - Phase-I
* Net Earnings Per Vehicle must be shown upfront
* Vehicle wise Net Earnings sorted by highest earnings Vehicle
* Merged with both Ola and Uber
* Weekly Top Incentive and Top Ride Distance across both Ola and Uber can be highlighted

### Collection of master trip details from driver - Phase-II
* Cash collected, lease or commission type or attached own vehicle, vehicle details, operator payment return, settlement details
* Uber has name, email and vehicle number
* Ola has both name and mobile number
* Driver settlement based on Driver wise net earnings - will be key

### Vehicle In/Out Details and Run km and time - Phase-III
* Need to map the in and out km details
* Trip km only contains the booked trip - doesn't contain the idle km, ride distance from booking to pick up the customer
* We need to determine the idle time

### Expenses - General Category - Phase-IV
##### Vehicle Maintenance
* Tyre
* Oil
* Mechanical
* A/C
##### Driver
* Payment
* Beta
* Misc
##### Vehicle Mgmt
* FC
* RC
* Insurance
* EMI/Due

### Admin Staff Expenses (Common Expenses unrelated to vehicle) - Phase-V
* Internal
* Back Office

### Wish List
* Out of Uber/Ola based rides tracking
* Trip KM, Expenses and Cash Collection
