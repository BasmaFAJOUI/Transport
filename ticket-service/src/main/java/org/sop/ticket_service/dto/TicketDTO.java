package org.sop.ticket_service.dto;

import java.time.LocalDate;

public class TicketDTO {
    private String id;
    private String userId;
    private String trajetId;
    private LocalDate dateTicket;
    private float montant;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTrajetId() {
        return trajetId;
    }

    public void setTrajetId(String trajetId) {
        this.trajetId = trajetId;
    }

    public LocalDate getDateTicket() {
        return dateTicket;
    }

    public void setDateTicket(LocalDate dateTicket) {
        this.dateTicket = dateTicket;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }
}
