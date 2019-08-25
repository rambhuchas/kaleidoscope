import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';
import { ReportService } from './../../shared/modules/services/report/report.service';
import { DailyReport } from '../../shared/modules/models/dailyreport';
import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { NgbDateParserFormatter } from '@ng-bootstrap/ng-bootstrap';

@Component({
    selector: 'app-charts',
    templateUrl: './charts.component.html',
    styleUrls: ['./charts.component.scss'],
    animations: [routerTransition()]
})
export class ChartsComponent implements OnInit {
    public isCollapsed = true;

    dailyReport: DailyReport[];

    subRevenue: number;
    subretryRevenue: number;
    renewalRevenue: number;
    totalRevenue: number;

    allDates: Date[];

    startDate: String;
    endDate: String;

    startDateObj: NgbDateStruct;
    endDateObj: NgbDateStruct;

    errorMessage: string;
    responseStatus: number;
    // bar chart
    public barChartOptions: any = {
        scaleShowVerticalLines: false,
        responsive: true
    };
    public barChartLabels: string[] = [
        '2006',
        '2007',
        '2008',
        '2009',
        '2010',
        '2011',
        '2012',
        '2013',
        '2014'
    ];
    public barChartType: string;
    public barChartLegend: boolean;

    public barChartData: any[] = [
        { data: [65, 59, 80, 81, 56, 55, 40, 70, 65], label: 'Series A' },
        { data: [28, 48, 40, 19, 86, 27, 90, 78, 70], label: 'Series B' }
    ];

    // Doughnut
    public doughnutChartLabels: string[] = [
        'Download Sales',
        'In-Store Sales',
        'Mail-Order Sales'
    ];
    public doughnutChartData: number[] = [350, 450, 100];
    public doughnutChartType: string;

    // Radar
    public radarChartLabels: string[] = [
        'Eating',
        'Drinking',
        'Sleeping',
        'Designing',
        'Coding',
        'Cycling',
        'Running'
    ];
    public radarChartData: any = [
        { data: [65, 59, 90, 81, 56, 55, 40], label: 'Series A' },
        { data: [28, 48, 40, 19, 96, 27, 100], label: 'Series B' }
    ];
    public radarChartType: string;

    // Pie
    public pieChartLabels: string[] = [
        'Download Sales',
        'In-Store Sales',
        'Mail Sales'
    ];
    public pieChartData: number[] = [300, 500, 100];
    public pieChartType: string;

    // PolarArea
    public polarAreaChartLabels: string[] = [
        'Download Sales',
        'In-Store Sales',
        'Mail Sales',
        'Telesales',
        'Corporate Sales'
    ];
    public polarAreaChartData: number[] = [300, 500, 100, 40, 120];
    public polarAreaLegend: boolean;

    public polarAreaChartType: string;

    // lineChart
    public lineChartData: Array<any> = [
        { data: [65, 59, 80, 81, 56, 55, 40], label: 'Series A' },
        { data: [28, 48, 40, 19, 86, 27, 90], label: 'Series B' },
        { data: [18, 48, 77, 9, 100, 27, 40], label: 'Series C' }
    ];
    public lineChartLabels: Array<any> = [
        'January',
        'February',
        'March',
        'April',
        'May',
        'June',
        'July'
    ];
    public lineChartOptions: any = {
        responsive: true
    };
    public lineChartColors: Array<any> = [
        {
            // grey
            backgroundColor: 'rgba(148,159,177,0.2)',
            borderColor: 'rgba(148,159,177,1)',
            pointBackgroundColor: 'rgba(148,159,177,1)',
            pointBorderColor: '#fff',
            pointHoverBackgroundColor: '#fff',
            pointHoverBorderColor: 'rgba(148,159,177,0.8)'
        },
        {
            // dark grey
            backgroundColor: 'rgba(77,83,96,0.2)',
            borderColor: 'rgba(77,83,96,1)',
            pointBackgroundColor: 'rgba(77,83,96,1)',
            pointBorderColor: '#fff',
            pointHoverBackgroundColor: '#fff',
            pointHoverBorderColor: 'rgba(77,83,96,1)'
        },
        {
            // grey
            backgroundColor: 'rgba(148,159,177,0.2)',
            borderColor: 'rgba(148,159,177,1)',
            pointBackgroundColor: 'rgba(148,159,177,1)',
            pointBorderColor: '#fff',
            pointHoverBackgroundColor: '#fff',
            pointHoverBorderColor: 'rgba(148,159,177,0.8)'
        }
    ];
    public lineChartLegend: boolean;
    public lineChartType: string;

    // New Line Chart
    public newLineChartData: Array<any> = [
        { data: [], label: 'Sub' },
        { data: [], label: 'Sub Retry' },
        { data: [], label: 'Renewal' },
        { data: [], label: 'Total' }
    ];
    public newLineChartLabels: Array<any> = [];
    public newLineChartColors: Array<any> = [
        {
            // grey
            backgroundColor: 'rgba(148,159,177,0.2)',
            borderColor: 'rgba(148,159,177,1)',
            pointBackgroundColor: 'rgba(148,159,177,1)',
            pointBorderColor: '#fff',
            pointHoverBackgroundColor: '#fff',
            pointHoverBorderColor: 'rgba(148,159,177,0.8)'
        },
        {
            // dark grey
            backgroundColor: 'rgba(77,83,96,0.2)',
            borderColor: 'rgba(77,83,96,1)',
            pointBackgroundColor: 'rgba(77,83,96,1)',
            pointBorderColor: '#fff',
            pointHoverBackgroundColor: '#fff',
            pointHoverBorderColor: 'rgba(77,83,96,1)'
        },
        {
            // grey
            backgroundColor: 'rgba(148,159,177,0.2)',
            borderColor: 'rgba(148,159,177,1)',
            pointBackgroundColor: 'rgba(148,159,177,1)',
            pointBorderColor: '#fff',
            pointHoverBackgroundColor: '#fff',
            pointHoverBorderColor: 'rgba(148,159,177,0.8)'
        },
        {
            // dark grey
            backgroundColor: 'rgba(77,83,96,0.2)',
            borderColor: 'rgba(77,83,96,1)',
            pointBackgroundColor: 'rgba(77,83,96,1)',
            pointBorderColor: '#fff',
            pointHoverBackgroundColor: '#fff',
            pointHoverBorderColor: 'rgba(77,83,96,1)'
        }
    ];

    // events
    public chartClicked(e: any): void {
        // console.log(e);
    }

    public chartHovered(e: any): void {
        // console.log(e);
    }

    public randomize(): void {
        // Only Change 3 values
        const data = [
            Math.round(Math.random() * 100),
            59,
            80,
            Math.random() * 100,
            56,
            Math.random() * 100,
            40
        ];
        const clone = JSON.parse(JSON.stringify(this.barChartData));
        clone[0].data = data;
        this.barChartData = clone;
        /**
         * (My guess), for Angular to recognize the change in the dataset
         * it has to change the dataset variable directly,
         * so one way around it, is to clone the data, change it and then
         * assign it;
         */
    }

    //onSelectDate(date: NgbDateStruct){
      //if (date != null) {
          //this.startDate = date;   //needed for first time around due to ngModel not binding during ngOnInit call. Seems like a bug in ng2.
          //this.startDate = this.ngbDateParserFormatter.format(date);
      //}
    //}

    constructor(private reportService: ReportService, private ngbDateParserFormatter: NgbDateParserFormatter) {
      var todaysDate = new Date();
      //Initialize with current week data
      this.startDateObj = this.fromModel(new Date(todaysDate.getTime() - (7 * 24 * 60 * 60 * 1000)));
      this.endDateObj = this.fromModel(todaysDate);
      this.initializeData();
    }

    initializeData(){
      this.allDates = [];
      this.dailyReport = [];

      this.subRevenue = 0;
      this.subretryRevenue = 0;
      this.renewalRevenue = 0;
      this.totalRevenue = 0;

    }

    fromModel(date: Date): NgbDateStruct {
      return date ? {
        year: date.getFullYear(),
        month: date.getMonth() + 1,
        day: date.getDate()
      } : null;
    }

    getDailyReportData() {
      this.initializeData();
      //.pipe()
      //.flatMap(person => http.get('/api/dealer/' + person.zipCode))
      //.map(res => res.json())
      //console.log("startDateObj: " + JSON.stringify(this.startDate));
      // console.log("endDateObj: " + JSON.stringify(this.endDate));
      this.startDate = this.startDateObj.year + "-" + this.startDateObj.month + "-" + this.startDateObj.day;
      this.endDate = this.endDateObj.year + "-" + this.endDateObj.month + "-" + this.endDateObj.day;

      // console.log("startDate: " + this.startDate);
      // console.log("endDate: " + this.endDate);
      /*.map(
        dailyReport => {
          {date} => this.allDates;
        }
      )*/

      this.reportService.getDailyReport(this.startDate, this.endDate)
      .subscribe(
        dailyReportObservable => {
          this.dailyReport = dailyReportObservable;
          //console.log(this.dailyReport);
          this.dailyReport.forEach( item => {

            this.subRevenue+=item.subRevenue;
            this.newLineChartData[0].data.push(item.subRevenue);

            this.subretryRevenue+=item.subretryRevenue;
            this.newLineChartData[1].data.push(item.subretryRevenue);

            this.renewalRevenue+=item.renewalRevenue;
            this.newLineChartData[2].data.push(item.renewalRevenue);

            this.totalRevenue+=item.totalRevenue;
            this.newLineChartData[3].data.push(item.totalRevenue);

            this.newLineChartLabels.push(item.date);

          });
        },
        error => this.errorMessage = error as any
      );
      //var example = this.dailyReport.pipe(map(({ date }) => date));
      //console.log(example);

      //totalRevenue = this.dailyReport.flatMap(callback, this, value, index, array, thisArg)
    }

    ngOnInit() {
        this.barChartType = 'bar';
        this.barChartLegend = true;
        this.doughnutChartType = 'doughnut';
        this.radarChartType = 'radar';
        this.pieChartType = 'pie';
        this.polarAreaLegend = true;
        this.polarAreaChartType = 'polarArea';
        this.lineChartLegend = true;
        this.lineChartType = 'line';
        this.getDailyReportData();
    }
}
