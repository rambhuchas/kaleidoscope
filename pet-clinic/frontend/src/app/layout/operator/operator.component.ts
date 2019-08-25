import { Component, OnInit } from '@angular/core';
//import { Operator } from './../../shared/modules/models/operator';
import { OperatorService } from './../../shared/modules/services/operator/operator.service';
import { Operator } from '../../shared/modules/models/operator';

@Component({
  selector: 'app-operator',
  templateUrl: './operator.component.html',
  styleUrls: ['./operator.component.scss']
})
export class OperatorComponent implements OnInit {

  operators: Operator[];
  errorMessage: string;
  responseStatus: number;

  constructor(private operatorService: OperatorService) {
    this.operators = [];
  }

  ngOnInit() {
    this.operatorService.getAll().subscribe(
      operators => this.operators = operators,
      error => this.errorMessage = error as any);
  }

}
