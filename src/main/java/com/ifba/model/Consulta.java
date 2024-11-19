package com.ifba.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Consulta {
    private UUID id;
    private LocalDateTime data;
    private Boolean retorno;
    private BigDecimal valor;
    private StatusPagamento statusPagamento;
    private StatusConsulta StatusConsulta;
    private Paciente Paciente;
    private Medico medico;
    private Receita receita;
    

}
