import { Component } from '@angular/core';
import { AuthorService } from '../../services/author.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-author',
  templateUrl: './author.component.html',
  styleUrl: './author.component.css'
})
export class AuthorComponent {

  constructor(private athorService : AuthorService, private router:Router){}

  postAuthor(data: any)
  {
    this.athorService.createAuthor(data).subscribe(result => console.log(result));
    this.router.navigate(['/book']);
  }
}
