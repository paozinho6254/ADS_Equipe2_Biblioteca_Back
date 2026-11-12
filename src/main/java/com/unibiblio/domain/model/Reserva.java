package com.unibiblio.domain.model;

import com.unibiblio.domain.enums.StatusReserva;
import java.util.Date;

public class Reserva {

    private int id;
    private Date dataReserva;
    private StatusReserva status;

    public Reserva(int id, Date dataReserva, StatusReserva status) {
        this.id = id;
        this.dataReserva = dataReserva;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", dataReserva=" + dataReserva + ", status=" + status + "]";
    }

}
