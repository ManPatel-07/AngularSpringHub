import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { dataType } from './userData';

@Injectable({
  providedIn: 'root'
})
export class CrudServService {

  constructor() { }

  getData()
  {
    const data:dataType = {
      name: 'John Doe',
      rollno: 101,
      maths: 87,
      science: 84,
      english: 92
    }
  }
}
