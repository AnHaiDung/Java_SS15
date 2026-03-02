package btvn.bai6;

import java.util.Scanner;

public class Ticket {
    private int ticketNumber;
    private String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    @Override
    public String toString() {
        return "Số " + ticketNumber + " (phát lúc " + issuedTime + ")";
    }
}
