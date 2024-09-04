import { Component } from '@angular/core';

@Component({
  selector: 'app-todolist',
  templateUrl: './todolist.component.html',
  styleUrl: './todolist.component.css'
})
export class TodolistComponent {

  list:any[] = [];
  addTask(task: string)
  {
    this.list.push({id: this.list.length, name: task}); 
    console.log(this.list);
  }

  removeTask(id : number)
  {
    console.log(id);
    this.list = this.list.filter(item => item.id!==id);
  }
}
