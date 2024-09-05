import { Component } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrl: './test.component.css'
})
export class TestComponent {

  // items: any[] = [
  //   { id: 1, name: 'Item 1' },
  //   { id: 2, name: 'Item 2' },
  //   { id: 3, name: 'Item 3' },
  // ];

  // selectedIndex: number | null = null;
  // selectedId: number | null = null;

  // onItemClick(id: number, index: number) {
  //   this.selectedId = id; // Store the clicked item's ID
  //   this.selectedIndex = index; // Store the clicked item's index

  //   this.items = this.items.filter(items => items.id !== id);
  // }
  
  name: string = '';
}
