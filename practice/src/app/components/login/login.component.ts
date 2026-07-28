import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css',
})
export class LoginComponent {
   
  isLoggedIn: boolean = true;
  login() {
    {
      this.isLoggedIn = true;
    }
  }
  logout() {
    {
      this.isLoggedIn = false;
    }
  }
}
