package ru.netology.TicketManager;

import ru.netology.TicketManager.Ticket;
import ru.netology.TicketManager.TicketsManager;
import ru.netology.repository.TicketsRepository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    TicketsRepository repo = new TicketsRepository();
    TicketsManager manager = new TicketsManager(repo);

    Ticket ticket1 = new Ticket(1, 500, "LED", "DM", 12);
    Ticket ticket2 = new Ticket(2, 1, "KAM", "DM", 1);
    Ticket ticket3 = new Ticket(3, 100, "LED", "DM", 5);
    Ticket ticket4 = new Ticket(4, 5000, "IST", "LED", 8);

    @Test
    void findTicket() {
        Ticket ticket = new Ticket();
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);

        Ticket[] actual = manager.findAll("KEN", "KAM");
        Ticket[] expected = {ticket1};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAndSort() {
        Ticket ticket = new Ticket();
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);

        Ticket[] actual = manager.findAll("DM", "LED");
        Ticket[] expected = {ticket3, ticket1};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);

        Ticket[] actual = repo.findAll();
        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4};

        assertArrayEquals(expected, actual);
    }
}
