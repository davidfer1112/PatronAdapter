
package org.example.implementacion;
import org.example.fintech.b.FintechBSolicitudCredito;
import org.example.fintech.b.FintechBRespuestaCredito;
import org.example.fintech.b.FintechBCreditosAPI;

public class AdaptadorFitechB implements InterfaceFintechAdaptador {

    @Override
    public FintechCreditoRespuesta EnvioSolicitudCredito(FintechSolicitudCredito request) {
        FintechBSolicitudCredito FBrequest = new FintechBSolicitudCredito();
        FBrequest.setNombreCliente(request.getCliente());
        FBrequest.setValorSolicitado(request.getValor());

        FintechBCreditosAPI api = new FintechBCreditosAPI();
        FintechBRespuestaCredito FBresponse = api.sendCreditRequest(FBrequest);

        FintechCreditoRespuesta response = new FintechCreditoRespuesta();
        response.setAprobacion(FBresponse.isResultadoAprobacion());
        return response;
    }

}