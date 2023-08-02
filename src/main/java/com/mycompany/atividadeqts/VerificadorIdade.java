package com.mycompany.atividadeqts;

public class VerificadorIdade {
    public String verificarIdade(int idade) {
        if (idade > 60) {
            return "Entrada não Aconselhada.";
        } else if (idade > 18) {
            return "Entrada Liberada";
        } else {
            return "Entrada Proibida";
        }
    }
}

