import { Component } from '@angular/core';
import { MarksheetService } from '../../services/marksheet.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-marksheet-update',
  templateUrl: './marksheet-update.component.html',
  styleUrl: './marksheet-update.component.css'
})
export class MarksheetUpdateComponent {

  marksheetData : any;

  constructor(private marksheetService: MarksheetService, private route: ActivatedRoute){}

  updateMarksheet(data : any)
  {
    // this.marksheetService.updateMarksheet
  }

  ngOnInit(): void {
    this.marksheetService.getMarksheetByRollno(this.route.snapshot.params['id']).subscribe(data => {
      this.marksheetData = data;
      console.log(this.marksheetData);
    });
  }
}
