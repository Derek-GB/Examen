/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

/**
 *
 * @author Student
 */
public class Ticket {
       private int numero;
    private TipoTicket tipo;
    private int contador=0;

    public int getNumero() {
        return numero;
    }

    public TipoTicket getTipo() {
        return tipo;
    }

    public Ticket(TipoTicket tipo) {
        this.numero = ++contador;
        this.tipo = tipo;
    }
    
     public Ticket() {
        this(null);
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
}


