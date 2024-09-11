import { Component } from '@angular/core';
import { MarksheetService } from '../../services/marksheet.service';

@Component({
  selector: 'app-marksheetform',
  templateUrl: './marksheetform.component.html',
  styleUrl: './marksheetform.component.css'
})
export class MarksheetformComponent {

  constructor(private marksheetService: MarksheetService){}

  saveMarksheetData(data:any)
  {
    console.log(data);
    this.marksheetService.saveMarksheet(data).subscribe((result)=>{
      console.log(result);
    });
  }

}
