import { Component } from '@angular/core';

@Component({
  selector: 'app-forl',
  standalone: true,
  imports: [],
  templateUrl: './forl.component.html',
  styleUrl: './forl.component.css',
})
export class ForlComponent {
  students: any[] = [
    { id: 191, name: 'Raj' },
    { id: 192, name: 'Rohit' },
    { id: 193, name: 'Prakash' },
    { id: 194, name: 'Pulkit' },
    { id: 195, name: 'Mohit' },
    { id: 196, name: 'Mohan' },
  ];
}
