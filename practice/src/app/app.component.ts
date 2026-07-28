import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { ControlFlowComponent } from './components/control-flow/control-flow.component';
import { ForlComponent } from './components/forl/forl.component';
import { ItemlistComponent } from './components/itemlist/itemlist.component';



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule,
    RouterOutlet,
    LoginComponent,
    ControlFlowComponent,
    ForlComponent,
    ItemlistComponent,
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'practice';
}
