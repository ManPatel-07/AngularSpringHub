import { Component } from '@angular/core';
import { AuthorService } from '../../services/author.service';

@Component({
  selector: 'app-author-list',
  templateUrl: './author-list.component.html',
  styleUrl: './author-list.component.css'
})
export class AuthorListComponent {

  authors: any;

  constructor(private authorService:AuthorService){}

  ngOnInit() {
    this.authorService.getAuthors().subscribe(data => {
      this.authors = data;
    });
  }
}
