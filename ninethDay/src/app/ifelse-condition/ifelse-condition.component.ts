import { Component } from '@angular/core';

@Component({
  selector: 'app-ifelse-condition',
  templateUrl: './ifelse-condition.component.html',
  styleUrl: './ifelse-condition.component.css'
})
export class IfelseConditionComponent {
  condition=true;
  isLoggedIn=true;

  elIfCondition = "red";

  status = "success";
}
