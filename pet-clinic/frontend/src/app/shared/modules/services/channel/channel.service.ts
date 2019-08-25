import { Injectable } from '@angular/core';
import { Channel } from '../../models/channel';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ChannelService {

  channels: Channel[];

  constructor(private http: HttpClient) {
    /*
    this.channels = [
      {
        'channelId': 1,
        'channelDesc': 'WAP'
      },
      {
        'channelId': 2,
        'channelDesc': 'SMS'
      },
      {
        'channelId': 3,
        'channelDesc': 'USSD'
      },
      {
        'channelId': 4,
        'channelDesc': 'CUSTCARE'
      },
      {
        'channelId': 5,
        'channelDesc': 'OBD'
      },
      {
        'channelId': 6,
        'channelDesc': 'Backend'
      }
    ];
    */
  }

  getAllChannels(): Observable<Channel[]> {
    return this.http.get<Channel[]>('//localhost:9966/petclinic/api/channels');
  }

}
