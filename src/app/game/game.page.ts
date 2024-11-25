import { Component, OnInit } from '@angular/core';
import { GameApiService } from '../services/game-api.service';


@Component({
  selector: 'app-game',
  templateUrl: './game.page.html',
  styleUrls: ['./game.page.scss'],
})
export class GamePage  {
 numero: number = 0;
 mensaje: string = '';
 constructor(
  private api: GameApiService

 ) { }
 
 
 async onClickAdivinar() {
  await this.api.guess(this.numero)
  .then(data => this.mensaje = data.message)
  .catch(data => this.mensaje = data.error.message)
  }
  async onClickReiniciar() {
  await this.api.restart()
  this.mensaje = '';
  this.numero = 0;
  }
}
