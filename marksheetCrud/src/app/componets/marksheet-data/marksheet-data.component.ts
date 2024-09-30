import { Component } from '@angular/core';
import { MarksheetService } from '../../services/marksheet.service';

@Component({
  selector: 'app-marksheet-data',
  templateUrl: './marksheet-data.component.html',
  styleUrl: './marksheet-data.component.css'
})
export class MarksheetDataComponent {

  marksheetData : any;

  constructor(private marksheetService:MarksheetService){}  

  ngOnInit(): void {
    this.marksheetList();
  }

  marksheetList()
  {
    this.marksheetService.getMarksheet().subscribe(data => {
      this.marksheetData = data;
      console.log(data);
    });
  }

}
