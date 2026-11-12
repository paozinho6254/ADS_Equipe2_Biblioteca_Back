package com.unibiblio.domain.enums;

public enum StatusReserva {
    // Em espera
    ATIVA, 
    // Foi entregue para aquele da fila
    ATENDIDA,
    // FOi cancelado antes de pegar o livro
    CANCELADA
}
