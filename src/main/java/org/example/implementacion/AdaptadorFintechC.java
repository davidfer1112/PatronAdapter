package org.example.implementacion;

import org.example.fintech.c.FintechCCreditosAPI;


public class AdaptadorFintechC implements InterfaceFintechAdaptador {

    @Override
    public FintechCreditoRespuesta EnvioSolicitudCredito(FintechSolicitudCredito request) {
        FintechCreditoRespuesta response = new FintechCreditoRespuesta();
        FintechCCreditosAPI api = new FintechCCreditosAPI();

        try {
            // Intenta solicitar el crédito con la Fintech C
            boolean aprobado = api.solicitarCredito(request.getValor());
            response.setAprobacion(aprobado);
        } catch (Exception e) {
            // Si se lanza una excepción, el crédito no ha sido autorizado
            System.out.println("Error: " + e.getMessage());
            response.setAprobacion(false);
        }

        return response;
    }
}
