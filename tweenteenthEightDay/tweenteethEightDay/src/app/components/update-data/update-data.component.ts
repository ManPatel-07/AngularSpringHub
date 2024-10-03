import { Component } from '@angular/core';
import { AuthorService } from '../../services/author.service';
import { ActivatedRoute, Router } from '@angular/router';
import { BookService } from '../../services/book.service';

@Component({
  selector: 'app-update-data',
  templateUrl: './update-data.component.html',
  styleUrl: './update-data.component.css'
})
export class UpdateDataComponent {

  author : any;

  id : number = 0;

  bookId : number = 0;

  constructor(private authorService: AuthorService,
              private route: ActivatedRoute,
              private bookService: BookService,
              private router: Router
  ){}

  ngOnInit() {
    this.author = {
      name: '',
      bio: '',
      books: []
    };

    this.id = this.route.snapshot.params['id'];
    this.getByIdAuthor(this.id);
  }

  getByIdAuthor(author_id : number)
  {
    console.log("Data From Update : ",author_id);
    this.authorService.getAuthorById(author_id).subscribe(data => {
      this.author = data;
      console.log(this.author);
    });
  }

  updateAuthor(data: any)
  {
    this.authorService.putAuthorById(this.id, data).subscribe(data => {
      console.log('Author updated successfully');
      this.getByIdAuthor(this.id);
      this.router.navigate(['/authors']);
    });
    console.log(data);
  }

  updateBook(data: any)
  {
    console.log("Book Update Data",data);
    
    this.bookId = data.id;

    this.bookService.updateById(this.bookId, this.id, data).subscribe(data => {
      console.log('Book updated successfully');
      this.getByIdAuthor(this.author.id);
      this.router.navigate(['/authors']);
    });
  }
  
}
