import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';
import { DndblackService } from '../../shared/modules/services/dndblack/dndblack.service';
import { DndBlacklist } from '../../shared/modules/models/dndblacklist';

@Component({
    selector: 'app-dndblack',
    templateUrl: './dndblack.component.html',
    styleUrls: ['./dndblack.component.scss'],
    animations: [routerTransition()]
})
export class DndblackComponent implements OnInit {
    blackListedNumbers: string;

    registeredBlackList: DndBlacklist[];
    errorMessage: any;

    constructor(private dndblackService: DndblackService) {
        this.dndblackService.getBlackList().subscribe(
            registeredBlackListObs => {
                this.registeredBlackList = registeredBlackListObs;
                // console.log(this.registeredBlackList);
            },
            error => (this.errorMessage = error as any)
        );
    }

    ngOnInit() {}

    addBlackList(): any {
        this.dndblackService.addBlackList(this.blackListedNumbers).subscribe(
            registeredBlackListObs => {
                const inserteddBlackList: DndBlacklist[] = registeredBlackListObs;
                // console.log('Returned Items: ' + JSON.stringify(inserteddBlackList));
                Array.prototype.push.apply(this.registeredBlackList, inserteddBlackList);
                // this.registeredBlackList.push.apply(inserteddBlackList);
                // console.log(this.registeredBlackList);
            },
            error => (this.errorMessage = error as any)
        );
    }
}
