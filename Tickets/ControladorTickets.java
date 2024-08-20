/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

/**
 *
 * @author Student
 */
public class ControladorTickets {
    private static ControladorTickets instancia;
    private ListaTickets tickets;
    
    public ControladorTickets getInstance(){
        if (instancia == null){
            instancia = new ControladorTickets();
        }
        return instancia;
    }
    
    private ControladorTickets(){
        this.tickets = new ListaTickets();
    }
    
    public void generarTicket(TipoTicket tipo){
        int numero = tickets.contar(tipo);
        tickets.agregar(new Ticket(tipo));
    }
    
    public Ticket atender(TipoTicket tipo){
        Ticket ticket = tickets.buscar(tipo);
        if (ticket == null){
            return tickets.eliminar(0);
        }
        tickets.eliminar(ticket);
        return ticket;
    }
    
}
