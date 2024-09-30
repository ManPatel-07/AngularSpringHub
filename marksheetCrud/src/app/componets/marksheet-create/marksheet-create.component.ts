import { Component } from '@angular/core';
import { MarksheetService } from '../../services/marksheet.service';

@Component({
  selector: 'app-marksheet-create',
  templateUrl: './marksheet-create.component.html',
  styleUrl: './marksheet-create.component.css'
})
export class MarksheetCreateComponent {

  constructor(private marksheetService: MarksheetService){}

  createMarksheet(data: any)
  {
    this.marksheetService.postMarksheet(data).subscribe(result => {console.log(result);});
  }

}
