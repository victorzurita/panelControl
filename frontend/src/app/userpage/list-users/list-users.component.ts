import { Component, OnInit } from '@angular/core';
import { TableData } from '../../md/md-table/md-table.component';

declare interface Table_With_Checkboxes {
  id?: number;
  ischecked?: boolean;
  product_name: string;
  type: string;
  quantity: number;
  price: any;
  amount: string;
}

export interface TableData2 {
  headerRow: string[];
  dataRows: Table_With_Checkboxes[];
}

@Component({
  selector: 'app-list-users',
  templateUrl: './list-users.component.html',
  styleUrls: ['./list-users.component.css']
})

export class ListUsersComponent implements OnInit {
  public tableData1: TableData;

  constructor() { }

  ngOnInit() {
    this.tableData1 = {
            headerRow: [ '#', 'Nombre', 'Cargo', 'Creado', 'Actions'],
            dataRows: [
                ['1', 'Rafael Encinas', 'Develop', '3 de abril 2018 10:00pm', 'btn-simple'],
                ['2', 'Maira Tejerina', 'Administrador', '3 de abril 2018 10:00pm', 'btn-simple'],
                ['2', 'Maira Tejerina', 'Administrador', '3 de abril 2018 10:00pm', 'btn-simple'], 
                ['3', 'David Soliz', 'Supervisor', '3 de abril 2018 10:00pm', 'btn-simple'],
                ['4','Victor Zurita', 'Supervisor', '3 de abril 2018 10:00pm', 'btn-simple'],
                ['5', 'Alvaro Dickens', 'Operador', '3 de abril 2018 10:00pm', 'btn-simple']
            ]
         };
  }

}
