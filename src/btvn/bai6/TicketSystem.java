package btvn.bai6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketSystem {
    private Queue<Ticket> ticketQueue;
    private int currentNumber;

    public TicketSystem() {
        this.ticketQueue = new LinkedList<>();
        this.currentNumber = 1;
    }

    public void issueTicket(String issuedTime) {
        Ticket t = new Ticket(currentNumber, issuedTime);
        ticketQueue.add(t);
        currentNumber++;
    }

    public Ticket callNext() {
        if (ticketQueue.isEmpty()) {
            return null;
        }
        return ticketQueue.poll();
    }
}
