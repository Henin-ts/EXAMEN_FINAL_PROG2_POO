package com.fraisDeScolariter;

import java.lang.reflect.Array;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Frais frais1 = new Frais(1,"inscription",200_000 , LocalDate.of(2025,8,29));

        TypeDePaiement P1 = new TypeDePaiement(1,2_000, Instant.now());
        TypeDePaiement P2 = new TypeDePaiement( 2,50_000 , Instant.now());

    }
}
