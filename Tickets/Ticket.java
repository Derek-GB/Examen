/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tickets;

/**
 *
 * @author Student
 */
public class Ticket {
    
    private int numero;
    private TipoTicket tipo;

    public int getNumero() {
        return numero;
    }

    public TipoTicket getTipo() {
        return tipo;
    }

    public Ticket(int numero, TipoTicket tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    
     public Ticket() {
        this(-1,null);
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", tipo=" + tipo + '}';
    }
    
    
}
