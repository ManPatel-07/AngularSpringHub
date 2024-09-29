import { Router } from '@angular/router';
import { AuthorService } from './../../services/author.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-author',
  templateUrl: './author.component.html',
  styleUrl: './author.component.css'
})
export class AuthorComponent {

  author = {
    name: '',
    bio: ''
  };

  constructor(private authorService:AuthorService, private router:Router){}

  saveAuthor()
  {
    this.authorService.createAuthor(this.author).subscribe(data => {
      console.log(data);
      this.router.navigate(['/authors']);
    });
  }
}
