package org.example.patronadapter;

import org.example.implementacion.AdaptadorFintechA;
import org.example.implementacion.AdaptadorFintechC;
import org.example.implementacion.AdaptadorFitechB;
import org.example.implementacion.FintechCreditoRespuesta;
import org.example.implementacion.FintechSolicitudCredito;
import org.example.implementacion.InterfaceFintechAdaptador;

/**
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Adapter
 * Tipo de Clase: Main()
 */
public class PatronAdapterMain {

    public static void main(String[] args) {

        FintechSolicitudCredito request = new FintechSolicitudCredito();
        request.setCliente("Cristiano Ronaldo");
        request.setValor(2000); // Cambiar el valor para probar diferentes casos

        InterfaceFintechAdaptador FinancieraB = new AdaptadorFitechB();
        FintechCreditoRespuesta FBresponse = FinancieraB.EnvioSolicitudCredito(request);
        System.out.println("Resultado aprobación Financiera <<B>>: > " + FBresponse.isAprobacion() + "\n");

        if (FBresponse.isAprobacion()) {
            System.out.println("Felicitaciones!!!!!, la Financiera <<B>> aprobó su solicitud de crédito." + "\n");
        } else {
            System.out.println("Lo sentimos, la Financiera <<B>> no aprobó su crédito");
        }

        InterfaceFintechAdaptador FinancieraA = new AdaptadorFintechA();
        FintechCreditoRespuesta FAresponse = FinancieraA.EnvioSolicitudCredito(request);
        System.out.println("Resultado aprobación Financiera <<A>>: > " + FAresponse.isAprobacion() + "\n");

        if (FAresponse.isAprobacion()) {
            System.out.println("Felicitaciones!!!!!, la Financiera <<A>> aprobó su solicitud de crédito.");
        } else {
            System.out.println("Lo sentimos, la Financiera <<A>> no aprobó su crédito");
        }

        InterfaceFintechAdaptador FinancieraC = new AdaptadorFintechC(); // Nueva Fintech C
        FintechCreditoRespuesta FCresponse = FinancieraC.EnvioSolicitudCredito(request);
        System.out.println("Resultado aprobación Financiera <<C>>: > " + FCresponse.isAprobacion() + "\n");

        if (FCresponse.isAprobacion()) {
            System.out.println("Felicitaciones!!!!!, la Financiera <<C>> aprobó su solicitud de crédito.");
        } else {
            System.out.println("Lo sentimos, la Financiera <<C>> no aprobó su crédito");
        }
    }
}

/*
public class PatronAdapterMain {


    public static void main(String[] args) {

        FintechSolicitudCredito request = new FintechSolicitudCredito();
        request.setCliente("Cristiano Ronaldo");
        request.setValor(1000);

        InterfaceFintechAdaptador FinancieraB = new AdaptadorFitechB();
        FintechCreditoRespuesta FBresponse = FinancieraB.EnvioSolicitudCredito(request);
        System.out.println("Resultado aprobación Financiera <<B>>: > " + FBresponse.isAprobacion() + "\n");

        if (FBresponse.isAprobacion()) {
            System.out.println("Felicitaciones!!!!!, la Financiera <<B>> aprobó su solicitud de crédito." + "\n");
        }
        else
        {
            System.out.println("Lo sentimos, la Financiera <<B>> no aprobó su crédito");
        }



        InterfaceFintechAdaptador FinancieraA = new AdaptadorFintechA();
        FintechCreditoRespuesta FAresponse = FinancieraA.EnvioSolicitudCredito(request);
        System.out.println("Resultado aprobación Financiera <<A>>: > " + FAresponse.isAprobacion() + "\n");

        if (FAresponse.isAprobacion()) {
            System.out.println("Felicitaciones!!!!!, la Financiera <<A>> aprobó su solicitud de crédito.");
        }
        else
        {
            System.out.println("Lo sentimos, la Financiera <<A>> no aprobó su crédito");
        }

    }

}

 */