import { Component } from '@angular/core';
import { AuthorService } from '../../services/author.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})
export class BookComponent {

  constructor(private authorService: AuthorService){}

  postBook(data: any)
  {
    this.authorService.createBook(data).subscribe(result => console.log(result));
  }
}
