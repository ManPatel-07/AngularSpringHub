import { Component } from '@angular/core';
import { AuthorService } from '../../services/author.service';
import { BookService } from '../../services/book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-author-list',
  templateUrl: './author-list.component.html',
  styleUrl: './author-list.component.css'
})
export class AuthorListComponent {

  authors: any;

  constructor(private authorService:AuthorService,
              private bookService:BookService,
            private route:Router ){}

  ngOnInit() {
    this.getAuthorData();
  }

  getAuthorData()
  {
    this.authorService.getAuthors().subscribe(data => {
      this.authors = data;
    });
  }

  deleteBook(book_id: number)
  {
    console.log(book_id);
    this.bookService.deleteBook(book_id).subscribe((data) => {
      console.log("Book deleted ...");
      this.getAuthorData();
    });

    this.getAuthorData();
  }

  editAuthor(author_id: number)
  {
    console.log(author_id);
    this.route.navigate(['/updateData', author_id]);
  }

  deleteAuthor(author_id: number)
  {
    this.authorService.deleteAuthorById(author_id).subscribe((data) => {
      console.log("Author deleted ...");
      this.getAuthorData();
    });
    this.getAuthorData();
  }
}
