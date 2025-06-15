package model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Frequencia {
    private Map<LocalDate, Boolean> registros;

    public Frequencia(){
        this.registros = new HashMap<>();
    }

    public void registrarPresenca(LocalDate data, boolean presente) {
        registros.put(data, presente);
    }

    public double calcularPresenca() {
        if (registros.isEmpty()) return 100.0;

        long totalDias = registros.size();
        long presente = registros.values().stream().filter(p -> p).count();

        return (presente * 100.0) / totalDias;
    }

}
