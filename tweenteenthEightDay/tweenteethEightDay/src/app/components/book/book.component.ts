import { Component } from '@angular/core';
import { BookService } from '../../services/book.service';
import { AuthorService } from '../../services/author.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})
export class BookComponent {

  book = {
    title: '',
    isbn: '',
    author_id: null,
  };

  authorrId : any;

  authors: any;

  constructor(private bookService:BookService,private authorService:AuthorService, private router:Router) { }

  ngOnInit() {
    this.authorService.getAuthors().subscribe(data => {
      this.authors = data;
    });
  }

  saveBook() {

    console.log(this.book.author_id);

    this.authorrId = this.book.author_id;

    this.bookService.createBook(this.book, this.authorrId).subscribe(data => {
      console.log('Book created successfully');
      this.router.navigate(['/authors']);

    });
  }
}
