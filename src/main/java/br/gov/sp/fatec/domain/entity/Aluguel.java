package br.gov.sp.fatec.domain.entity;

import java.sql.Date;

import br.gov.sp.fatec.domain.enums.AluguelStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


public class Aluguel {
    private Date dataInicio;
    private Date dataFim;
    private double valor;
    private String status;

    // getters
    public Date getDataInicio() {
        return this.dataInicio;
    }

    public Date getDataFim() {
        return this.dataFim;
    }

    public double getValor() {
        return this.valor;
    }

    public String getStatus() {
        return this.status;
    }

    // setters
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}