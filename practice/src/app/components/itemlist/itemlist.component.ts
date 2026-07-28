import { Component } from '@angular/core';
import { ItemComponent } from '../item/item.component';

@Component({
  selector: 'app-itemlist',
  standalone: true,
  imports: [ItemComponent],
  templateUrl: './itemlist.component.html',
  styleUrl: './itemlist.component.css',
})
export class ItemlistComponent {
  items: any[] = new Array(2);
  showItems: boolean = false;
}
