package org.example.fintech.c;



public class FintechCCreditosAPI {

    // Método para enviar la solicitud de crédito
    public boolean solicitarCredito(double monto) throws Exception {
        // Se simula la respuesta de la Fintech C
        if(monto <= 3000) {
            return true; // Crédito autorizado
        } else {
            throw new Exception("El crédito no ha sido autorizado"); // Crédito no autorizado
        }
    }
}
