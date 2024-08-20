/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import java.util.ArrayList;
import java.util.Iterator;
import Tickets.TipoTicket;

/**
 *
 * @author Student
 */
public class ListaTickets {
    private ArrayList<Ticket> lista;
    
    public ListaTickets(){
       lista = new ArrayList<>();
    }

    public Iterator<Ticket> getLista() {
        return lista.iterator();
    }
    
    public boolean agregar(Ticket ticket){
        return lista.add(ticket);
    }
    
    public Ticket eliminar(int posicion){
        return lista.remove(posicion);
    }
    
    public void eliminar(Ticket valor){
        lista.remove(valor);
    }
    
    public Ticket buscar(TipoTicket tipo){
        for(Ticket ticket : lista){
            if (ticket.getTipo() == tipo){
                return ticket;
            }
        }
        return null;
    }
    
    public Ticket primerElemento(){
        return lista.get(0);
    }
        
    public int contar(TipoTicket tipo){
        int cantidad = 0;
        for(Ticket ticket : lista){
            if (ticket.getTipo() == tipo){
                cantidad+=1;
            }
        }
        return cantidad;
    }
    
}
