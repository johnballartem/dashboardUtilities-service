package com.demo.dashboard.controller;

import com.demo.dashboard.service.DashboardService;
import com.demo.dashboard.utility.property.Constantes;
import com.demo.dashboard.utility.property.PropertiesExternos;
import com.demo.dashboard.utility.request.*;
import com.demo.dashboard.utility.response.*;
import com.demo.dashboard.utility.types.ResponseStatusType;
import com.demo.dashboard.utility.util.DashboardUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
@RequestMapping(Constantes.BASEPATH)
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class DashboardController {

    private final Logger logger = LoggerFactory.getLogger(DashboardController.class);

    @Autowired
    private PropertiesExternos prop;

    @Autowired
    private DashboardService dashboardService;

    @GetMapping (value = Constantes.PATHMETODO_GET_PRODUCTS, produces = "application/json")
    public StandardGetCommonBeansResponse getProducts(
            @RequestHeader(name = "idTransaccion", required = true) String idTransaccion,
            @RequestHeader(name = "userId", required = false) String userId,
            @RequestHeader(name = "msgid", required = false) String msgid,
            @RequestHeader(name = "timestamp", required = false) String timestamp,
            @RequestHeader(name = "accept", required = false) String accept,
            @RequestHeader(name = "aplicacion", required = false) String aplicacion
    ) throws JsonProcessingException {

        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();

        String requestPrint = null;
        String responsePrint = null;
        long tiempoInicio = System.currentTimeMillis();

        ResponseStatusType responseStatus = new ResponseStatusType();

        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setIdTransaccion(idTransaccion);
        headerRequest.setUserId(userId);
        headerRequest.setMsgid(msgid);
        headerRequest.setAccept(accept);
        headerRequest.setTimestamp(new Date());
        headerRequest.setAplicacion(aplicacion);
        String idtx = headerRequest.getIdTransaccion();

        String msjTx = Constantes.CHAR_CORCHETE_IZQUIERDO + Constantes.GET_PRODUCTS + Constantes.ID_TXT + idtx
                + Constantes.MSG_ID + msgid + Constantes.CORCHETE;
        logger.info(msjTx + Constantes.SEPARADOR);
        logger.info(msjTx + Constantes.INICIO_METODO + Constantes.GET_PRODUCTS);
        logger.info(msjTx + Constantes.SEPARADOR);

        try {
            logger.info(msjTx + Constantes.PARAMETROSENTRADA);
            logger.info(msjTx + Constantes.PARAMETROSHEADER + Constantes.SALTO_LINEA
                    + DashboardUtil.printPrettyJSONString(headerRequest));
            logger.info(msjTx + Constantes.PARAMETROSBODY + Constantes.SALTO_LINEA + requestPrint);
            logger.info(msjTx + Constantes.PARAMETROSOBLIGATORIOS);
            logger.info(msjTx + Constantes.VALIDACIONPARAMETROSCORRECTOS);

            response = dashboardService.getProducts(msjTx, headerRequest);

        } catch (Exception e) {
            responseStatus.setCodigoRespuesta(prop.dashboard_utilities_Idt3_Codigo);
            responseStatus.setMensajeRespuesta(prop.dashboard_utilities_Idt3_Mensaje + Constantes.ESPACIO + e.getMessage());
            responseStatus.setIdTransaccion(idtx);
            response.setResponseAudit(responseStatus);
        } finally {
            responsePrint = DashboardUtil.printPrettyJSONString(response);
            logger.info(msjTx + Constantes.DEVOLVERRESPONSE + Constantes.SALTO_LINEA + responsePrint);
            logger.info(msjTx + Constantes.SEPARADOR);
            logger.info(msjTx + Constantes.FIN_METODO + Constantes.GET_PRODUCTS + Constantes.TIEMPO_TOTAL
                    + (System.currentTimeMillis() - tiempoInicio) + Constantes.MILISEGUNDOS);
            logger.info(msjTx + Constantes.SEPARADOR);
        }
        return response;
    }

    @GetMapping (value = Constantes.PATHMETODO_GET_CUSTOMER_ROOTS, produces = "application/json")
    public StandardGetCommonBeansResponse getCustomerRoots(
            @RequestHeader(name = "idTransaccion", required = true) String idTransaccion,
            @RequestHeader(name = "userId", required = false) String userId,
            @RequestHeader(name = "msgid", required = false) String msgid,
            @RequestHeader(name = "timestamp", required = false) String timestamp,
            @RequestHeader(name = "accept", required = false) String accept,
            @RequestHeader(name = "aplicacion", required = false) String aplicacion
    ) throws JsonProcessingException {

        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();

        String requestPrint = null;
        String responsePrint = null;
        long tiempoInicio = System.currentTimeMillis();

        ResponseStatusType responseStatus = new ResponseStatusType();

        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setIdTransaccion(idTransaccion);
        headerRequest.setUserId(userId);
        headerRequest.setMsgid(msgid);
        headerRequest.setAccept(accept);
        headerRequest.setTimestamp(new Date());
        headerRequest.setAplicacion(aplicacion);
        String idtx = headerRequest.getIdTransaccion();

        String msjTx = Constantes.CHAR_CORCHETE_IZQUIERDO + Constantes.GET_CUSTOMER_ROOTS + Constantes.ID_TXT + idtx
                + Constantes.MSG_ID + msgid + Constantes.CORCHETE;
        logger.info(msjTx + Constantes.SEPARADOR);
        logger.info(msjTx + Constantes.INICIO_METODO + Constantes.GET_CUSTOMER_ROOTS);
        logger.info(msjTx + Constantes.SEPARADOR);

        try {
            logger.info(msjTx + Constantes.PARAMETROSENTRADA);
            logger.info(msjTx + Constantes.PARAMETROSHEADER + Constantes.SALTO_LINEA
                    + DashboardUtil.printPrettyJSONString(headerRequest));
            logger.info(msjTx + Constantes.PARAMETROSBODY + Constantes.SALTO_LINEA + requestPrint);
            logger.info(msjTx + Constantes.PARAMETROSOBLIGATORIOS);
            logger.info(msjTx + Constantes.VALIDACIONPARAMETROSCORRECTOS);

            response = dashboardService.getCustomerRoots(msjTx, headerRequest);

        } catch (Exception e) {
            responseStatus.setCodigoRespuesta(prop.dashboard_utilities_Idt3_Codigo);
            responseStatus.setMensajeRespuesta(prop.dashboard_utilities_Idt3_Mensaje + Constantes.ESPACIO + e.getMessage());
            responseStatus.setIdTransaccion(idtx);
            response.setResponseAudit(responseStatus);
        } finally {
            responsePrint = DashboardUtil.printPrettyJSONString(response);
            logger.info(msjTx + Constantes.DEVOLVERRESPONSE + Constantes.SALTO_LINEA + responsePrint);
            logger.info(msjTx + Constantes.SEPARADOR);
            logger.info(msjTx + Constantes.FIN_METODO + Constantes.GET_CUSTOMER_ROOTS + Constantes.TIEMPO_TOTAL
                    + (System.currentTimeMillis() - tiempoInicio) + Constantes.MILISEGUNDOS);
            logger.info(msjTx + Constantes.SEPARADOR);
        }
        return response;
    }

    @GetMapping (value = Constantes.PATHMETODO_GET_CUSTOMER_LEAFS, produces = "application/json")
    public StandardGetCommonBeansResponse getCustomerLeafs(
            @RequestHeader(name = "idTransaccion", required = true) String idTransaccion,
            @RequestHeader(name = "userId", required = false) String userId,
            @RequestHeader(name = "msgid", required = false) String msgid,
            @RequestHeader(name = "timestamp", required = false) String timestamp,
            @RequestHeader(name = "accept", required = false) String accept,
            @RequestHeader(name = "aplicacion", required = false) String aplicacion
    ) throws JsonProcessingException {

        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();

        String requestPrint = null;
        String responsePrint = null;
        long tiempoInicio = System.currentTimeMillis();

        ResponseStatusType responseStatus = new ResponseStatusType();

        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setIdTransaccion(idTransaccion);
        headerRequest.setUserId(userId);
        headerRequest.setMsgid(msgid);
        headerRequest.setAccept(accept);
        headerRequest.setTimestamp(new Date());
        headerRequest.setAplicacion(aplicacion);
        String idtx = headerRequest.getIdTransaccion();

        String msjTx = Constantes.CHAR_CORCHETE_IZQUIERDO + Constantes.GET_CUSTOMER_LEAFS + Constantes.ID_TXT + idtx
                + Constantes.MSG_ID + msgid + Constantes.CORCHETE;
        logger.info(msjTx + Constantes.SEPARADOR);
        logger.info(msjTx + Constantes.INICIO_METODO + Constantes.GET_CUSTOMER_LEAFS);
        logger.info(msjTx + Constantes.SEPARADOR);

        try {
            logger.info(msjTx + Constantes.PARAMETROSENTRADA);
            logger.info(msjTx + Constantes.PARAMETROSHEADER + Constantes.SALTO_LINEA
                    + DashboardUtil.printPrettyJSONString(headerRequest));
            logger.info(msjTx + Constantes.PARAMETROSBODY + Constantes.SALTO_LINEA + requestPrint);
            logger.info(msjTx + Constantes.PARAMETROSOBLIGATORIOS);
            logger.info(msjTx + Constantes.VALIDACIONPARAMETROSCORRECTOS);

            response = dashboardService.getCustomerLeafs(msjTx, headerRequest);

        } catch (Exception e) {
            responseStatus.setCodigoRespuesta(prop.dashboard_utilities_Idt3_Codigo);
            responseStatus.setMensajeRespuesta(prop.dashboard_utilities_Idt3_Mensaje + Constantes.ESPACIO + e.getMessage());
            responseStatus.setIdTransaccion(idtx);
            response.setResponseAudit(responseStatus);
        } finally {
            responsePrint = DashboardUtil.printPrettyJSONString(response);
            logger.info(msjTx + Constantes.DEVOLVERRESPONSE + Constantes.SALTO_LINEA + responsePrint);
            logger.info(msjTx + Constantes.SEPARADOR);
            logger.info(msjTx + Constantes.FIN_METODO + Constantes.GET_CUSTOMER_LEAFS + Constantes.TIEMPO_TOTAL
                    + (System.currentTimeMillis() - tiempoInicio) + Constantes.MILISEGUNDOS);
            logger.info(msjTx + Constantes.SEPARADOR);
        }
        return response;
    }

    @GetMapping (value = Constantes.PATHMETODO_GET_PACK_SIZES, produces = "application/json")
    public StandardGetCommonBeansResponse getPackSizes(
            @RequestHeader(name = "idTransaccion", required = true) String idTransaccion,
            @RequestHeader(name = "userId", required = false) String userId,
            @RequestHeader(name = "msgid", required = false) String msgid,
            @RequestHeader(name = "timestamp", required = false) String timestamp,
            @RequestHeader(name = "accept", required = false) String accept,
            @RequestHeader(name = "aplicacion", required = false) String aplicacion
    ) throws JsonProcessingException {

        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();

        String requestPrint = null;
        String responsePrint = null;
        long tiempoInicio = System.currentTimeMillis();

        ResponseStatusType responseStatus = new ResponseStatusType();

        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setIdTransaccion(idTransaccion);
        headerRequest.setUserId(userId);
        headerRequest.setMsgid(msgid);
        headerRequest.setAccept(accept);
        headerRequest.setTimestamp(new Date());
        headerRequest.setAplicacion(aplicacion);
        String idtx = headerRequest.getIdTransaccion();

        String msjTx = Constantes.CHAR_CORCHETE_IZQUIERDO + Constantes.GET_PACK_SIZES + Constantes.ID_TXT + idtx
                + Constantes.MSG_ID + msgid + Constantes.CORCHETE;
        logger.info(msjTx + Constantes.SEPARADOR);
        logger.info(msjTx + Constantes.INICIO_METODO + Constantes.GET_PACK_SIZES);
        logger.info(msjTx + Constantes.SEPARADOR);

        try {
            logger.info(msjTx + Constantes.PARAMETROSENTRADA);
            logger.info(msjTx + Constantes.PARAMETROSHEADER + Constantes.SALTO_LINEA
                    + DashboardUtil.printPrettyJSONString(headerRequest));
            logger.info(msjTx + Constantes.PARAMETROSBODY + Constantes.SALTO_LINEA + requestPrint);
            logger.info(msjTx + Constantes.PARAMETROSOBLIGATORIOS);
            logger.info(msjTx + Constantes.VALIDACIONPARAMETROSCORRECTOS);

            response = dashboardService.getPackSizes(msjTx, headerRequest);

        } catch (Exception e) {
            responseStatus.setCodigoRespuesta(prop.dashboard_utilities_Idt3_Codigo);
            responseStatus.setMensajeRespuesta(prop.dashboard_utilities_Idt3_Mensaje + Constantes.ESPACIO + e.getMessage());
            responseStatus.setIdTransaccion(idtx);
            response.setResponseAudit(responseStatus);
        } finally {
            responsePrint = DashboardUtil.printPrettyJSONString(response);
            logger.info(msjTx + Constantes.DEVOLVERRESPONSE + Constantes.SALTO_LINEA + responsePrint);
            logger.info(msjTx + Constantes.SEPARADOR);
            logger.info(msjTx + Constantes.FIN_METODO + Constantes.GET_PACK_SIZES + Constantes.TIEMPO_TOTAL
                    + (System.currentTimeMillis() - tiempoInicio) + Constantes.MILISEGUNDOS);
            logger.info(msjTx + Constantes.SEPARADOR);
        }
        return response;
    }

    @GetMapping (value = Constantes.PATHMETODO_GET_UNIT_TYPES, produces = "application/json")
    public StandardGetCommonBeansResponse getUnitTypes(
            @RequestHeader(name = "idTransaccion", required = true) String idTransaccion,
            @RequestHeader(name = "userId", required = false) String userId,
            @RequestHeader(name = "msgid", required = false) String msgid,
            @RequestHeader(name = "timestamp", required = false) String timestamp,
            @RequestHeader(name = "accept", required = false) String accept,
            @RequestHeader(name = "aplicacion", required = false) String aplicacion
    ) throws JsonProcessingException {

        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();

        String requestPrint = null;
        String responsePrint = null;
        long tiempoInicio = System.currentTimeMillis();

        ResponseStatusType responseStatus = new ResponseStatusType();

        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setIdTransaccion(idTransaccion);
        headerRequest.setUserId(userId);
        headerRequest.setMsgid(msgid);
        headerRequest.setAccept(accept);
        headerRequest.setTimestamp(new Date());
        headerRequest.setAplicacion(aplicacion);
        String idtx = headerRequest.getIdTransaccion();

        String msjTx = Constantes.CHAR_CORCHETE_IZQUIERDO + Constantes.GET_UNIT_TYPES + Constantes.ID_TXT + idtx
                + Constantes.MSG_ID + msgid + Constantes.CORCHETE;
        logger.info(msjTx + Constantes.SEPARADOR);
        logger.info(msjTx + Constantes.INICIO_METODO + Constantes.GET_UNIT_TYPES);
        logger.info(msjTx + Constantes.SEPARADOR);

        try {
            logger.info(msjTx + Constantes.PARAMETROSENTRADA);
            logger.info(msjTx + Constantes.PARAMETROSHEADER + Constantes.SALTO_LINEA
                    + DashboardUtil.printPrettyJSONString(headerRequest));
            logger.info(msjTx + Constantes.PARAMETROSBODY + Constantes.SALTO_LINEA + requestPrint);
            logger.info(msjTx + Constantes.PARAMETROSOBLIGATORIOS);
            logger.info(msjTx + Constantes.VALIDACIONPARAMETROSCORRECTOS);

            response = dashboardService.getUnitTypes(msjTx, headerRequest);

        } catch (Exception e) {
            responseStatus.setCodigoRespuesta(prop.dashboard_utilities_Idt3_Codigo);
            responseStatus.setMensajeRespuesta(prop.dashboard_utilities_Idt3_Mensaje + Constantes.ESPACIO + e.getMessage());
            responseStatus.setIdTransaccion(idtx);
            response.setResponseAudit(responseStatus);
        } finally {
            responsePrint = DashboardUtil.printPrettyJSONString(response);
            logger.info(msjTx + Constantes.DEVOLVERRESPONSE + Constantes.SALTO_LINEA + responsePrint);
            logger.info(msjTx + Constantes.SEPARADOR);
            logger.info(msjTx + Constantes.FIN_METODO + Constantes.GET_UNIT_TYPES + Constantes.TIEMPO_TOTAL
                    + (System.currentTimeMillis() - tiempoInicio) + Constantes.MILISEGUNDOS);
            logger.info(msjTx + Constantes.SEPARADOR);
        }
        return response;
    }

    @GetMapping (value = Constantes.PATHMETODO_GET_CATEGORIES, produces = "application/json")
    public StandardGetCommonBeansResponse getCategories(
            @RequestHeader(name = "idTransaccion", required = true) String idTransaccion,
            @RequestHeader(name = "userId", required = false) String userId,
            @RequestHeader(name = "msgid", required = false) String msgid,
            @RequestHeader(name = "timestamp", required = false) String timestamp,
            @RequestHeader(name = "accept", required = false) String accept,
            @RequestHeader(name = "aplicacion", required = false) String aplicacion
    ) throws JsonProcessingException {

        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();

        String requestPrint = null;
        String responsePrint = null;
        long tiempoInicio = System.currentTimeMillis();

        ResponseStatusType responseStatus = new ResponseStatusType();

        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setIdTransaccion(idTransaccion);
        headerRequest.setUserId(userId);
        headerRequest.setMsgid(msgid);
        headerRequest.setAccept(accept);
        headerRequest.setTimestamp(new Date());
        headerRequest.setAplicacion(aplicacion);
        String idtx = headerRequest.getIdTransaccion();

        String msjTx = Constantes.CHAR_CORCHETE_IZQUIERDO + Constantes.GET_CATEGORIES + Constantes.ID_TXT + idtx
                + Constantes.MSG_ID + msgid + Constantes.CORCHETE;
        logger.info(msjTx + Constantes.SEPARADOR);
        logger.info(msjTx + Constantes.INICIO_METODO + Constantes.GET_CATEGORIES);
        logger.info(msjTx + Constantes.SEPARADOR);

        try {
            logger.info(msjTx + Constantes.PARAMETROSENTRADA);
            logger.info(msjTx + Constantes.PARAMETROSHEADER + Constantes.SALTO_LINEA
                    + DashboardUtil.printPrettyJSONString(headerRequest));
            logger.info(msjTx + Constantes.PARAMETROSBODY + Constantes.SALTO_LINEA + requestPrint);
            logger.info(msjTx + Constantes.PARAMETROSOBLIGATORIOS);
            logger.info(msjTx + Constantes.VALIDACIONPARAMETROSCORRECTOS);

            response = dashboardService.getCategories(msjTx, headerRequest);

        } catch (Exception e) {
            responseStatus.setCodigoRespuesta(prop.dashboard_utilities_Idt3_Codigo);
            responseStatus.setMensajeRespuesta(prop.dashboard_utilities_Idt3_Mensaje + Constantes.ESPACIO + e.getMessage());
            responseStatus.setIdTransaccion(idtx);
            response.setResponseAudit(responseStatus);
        } finally {
            responsePrint = DashboardUtil.printPrettyJSONString(response);
            logger.info(msjTx + Constantes.DEVOLVERRESPONSE + Constantes.SALTO_LINEA + responsePrint);
            logger.info(msjTx + Constantes.SEPARADOR);
            logger.info(msjTx + Constantes.FIN_METODO + Constantes.GET_CATEGORIES + Constantes.TIEMPO_TOTAL
                    + (System.currentTimeMillis() - tiempoInicio) + Constantes.MILISEGUNDOS);
            logger.info(msjTx + Constantes.SEPARADOR);
        }
        return response;
    }

    @GetMapping (value = Constantes.PATHMETODO_GET_DISTRIBUTOR_ROOTS, produces = "application/json")
    public StandardGetCommonBeansResponse getDistributorRoots(
            @RequestHeader(name = "idTransaccion", required = true) String idTransaccion,
            @RequestHeader(name = "userId", required = false) String userId,
            @RequestHeader(name = "msgid", required = false) String msgid,
            @RequestHeader(name = "timestamp", required = false) String timestamp,
            @RequestHeader(name = "accept", required = false) String accept,
            @RequestHeader(name = "aplicacion", required = false) String aplicacion
    ) throws JsonProcessingException {

        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();

        String requestPrint = null;
        String responsePrint = null;
        long tiempoInicio = System.currentTimeMillis();

        ResponseStatusType responseStatus = new ResponseStatusType();

        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setIdTransaccion(idTransaccion);
        headerRequest.setUserId(userId);
        headerRequest.setMsgid(msgid);
        headerRequest.setAccept(accept);
        headerRequest.setTimestamp(new Date());
        headerRequest.setAplicacion(aplicacion);
        String idtx = headerRequest.getIdTransaccion();

        String msjTx = Constantes.CHAR_CORCHETE_IZQUIERDO + Constantes.GET_DISTRIBUTOR_ROOTS + Constantes.ID_TXT + idtx
                + Constantes.MSG_ID + msgid + Constantes.CORCHETE;
        logger.info(msjTx + Constantes.SEPARADOR);
        logger.info(msjTx + Constantes.INICIO_METODO + Constantes.GET_DISTRIBUTOR_ROOTS);
        logger.info(msjTx + Constantes.SEPARADOR);

        try {
            logger.info(msjTx + Constantes.PARAMETROSENTRADA);
            logger.info(msjTx + Constantes.PARAMETROSHEADER + Constantes.SALTO_LINEA
                    + DashboardUtil.printPrettyJSONString(headerRequest));
            logger.info(msjTx + Constantes.PARAMETROSBODY + Constantes.SALTO_LINEA + requestPrint);
            logger.info(msjTx + Constantes.PARAMETROSOBLIGATORIOS);
            logger.info(msjTx + Constantes.VALIDACIONPARAMETROSCORRECTOS);

            response = dashboardService.getDistributorRoots(msjTx, headerRequest);

        } catch (Exception e) {
            responseStatus.setCodigoRespuesta(prop.dashboard_utilities_Idt3_Codigo);
            responseStatus.setMensajeRespuesta(prop.dashboard_utilities_Idt3_Mensaje + Constantes.ESPACIO + e.getMessage());
            responseStatus.setIdTransaccion(idtx);
            response.setResponseAudit(responseStatus);
        } finally {
            responsePrint = DashboardUtil.printPrettyJSONString(response);
            logger.info(msjTx + Constantes.DEVOLVERRESPONSE + Constantes.SALTO_LINEA + responsePrint);
            logger.info(msjTx + Constantes.SEPARADOR);
            logger.info(msjTx + Constantes.FIN_METODO + Constantes.GET_DISTRIBUTOR_ROOTS + Constantes.TIEMPO_TOTAL
                    + (System.currentTimeMillis() - tiempoInicio) + Constantes.MILISEGUNDOS);
            logger.info(msjTx + Constantes.SEPARADOR);
        }
        return response;
    }

    @GetMapping (value = Constantes.PATHMETODO_GET_DISTRIBUTOR_LEAFS, produces = "application/json")
    public StandardGetCommonBeansResponse getDistributorLeafs(
            @RequestHeader(name = "idTransaccion", required = true) String idTransaccion,
            @RequestHeader(name = "userId", required = false) String userId,
            @RequestHeader(name = "msgid", required = false) String msgid,
            @RequestHeader(name = "timestamp", required = false) String timestamp,
            @RequestHeader(name = "accept", required = false) String accept,
            @RequestHeader(name = "aplicacion", required = false) String aplicacion
    ) throws JsonProcessingException {

        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();

        String requestPrint = null;
        String responsePrint = null;
        long tiempoInicio = System.currentTimeMillis();

        ResponseStatusType responseStatus = new ResponseStatusType();

        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setIdTransaccion(idTransaccion);
        headerRequest.setUserId(userId);
        headerRequest.setMsgid(msgid);
        headerRequest.setAccept(accept);
        headerRequest.setTimestamp(new Date());
        headerRequest.setAplicacion(aplicacion);
        String idtx = headerRequest.getIdTransaccion();

        String msjTx = Constantes.CHAR_CORCHETE_IZQUIERDO + Constantes.GET_DISTRIBUTOR_LEAFS + Constantes.ID_TXT + idtx
                + Constantes.MSG_ID + msgid + Constantes.CORCHETE;
        logger.info(msjTx + Constantes.SEPARADOR);
        logger.info(msjTx + Constantes.INICIO_METODO + Constantes.GET_DISTRIBUTOR_LEAFS);
        logger.info(msjTx + Constantes.SEPARADOR);

        try {
            logger.info(msjTx + Constantes.PARAMETROSENTRADA);
            logger.info(msjTx + Constantes.PARAMETROSHEADER + Constantes.SALTO_LINEA
                    + DashboardUtil.printPrettyJSONString(headerRequest));
            logger.info(msjTx + Constantes.PARAMETROSBODY + Constantes.SALTO_LINEA + requestPrint);
            logger.info(msjTx + Constantes.PARAMETROSOBLIGATORIOS);
            logger.info(msjTx + Constantes.VALIDACIONPARAMETROSCORRECTOS);

            response = dashboardService.getDistributorLeafs(msjTx, headerRequest);

        } catch (Exception e) {
            responseStatus.setCodigoRespuesta(prop.dashboard_utilities_Idt3_Codigo);
            responseStatus.setMensajeRespuesta(prop.dashboard_utilities_Idt3_Mensaje + Constantes.ESPACIO + e.getMessage());
            responseStatus.setIdTransaccion(idtx);
            response.setResponseAudit(responseStatus);
        } finally {
            responsePrint = DashboardUtil.printPrettyJSONString(response);
            logger.info(msjTx + Constantes.DEVOLVERRESPONSE + Constantes.SALTO_LINEA + responsePrint);
            logger.info(msjTx + Constantes.SEPARADOR);
            logger.info(msjTx + Constantes.FIN_METODO + Constantes.GET_DISTRIBUTOR_LEAFS + Constantes.TIEMPO_TOTAL
                    + (System.currentTimeMillis() - tiempoInicio) + Constantes.MILISEGUNDOS);
            logger.info(msjTx + Constantes.SEPARADOR);
        }
        return response;
    }

    @GetMapping (value = Constantes.PATHMETODO_GET_MANUFACTURERS, produces = "application/json")
    public StandardGetCommonBeansResponse getManufacturers(
            @RequestHeader(name = "idTransaccion", required = true) String idTransaccion,
            @RequestHeader(name = "userId", required = false) String userId,
            @RequestHeader(name = "msgid", required = false) String msgid,
            @RequestHeader(name = "timestamp", required = false) String timestamp,
            @RequestHeader(name = "accept", required = false) String accept,
            @RequestHeader(name = "aplicacion", required = false) String aplicacion
    ) throws JsonProcessingException {

        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();

        String requestPrint = null;
        String responsePrint = null;
        long tiempoInicio = System.currentTimeMillis();

        ResponseStatusType responseStatus = new ResponseStatusType();

        HeaderRequest headerRequest = new HeaderRequest();
        headerRequest.setIdTransaccion(idTransaccion);
        headerRequest.setUserId(userId);
        headerRequest.setMsgid(msgid);
        headerRequest.setAccept(accept);
        headerRequest.setTimestamp(new Date());
        headerRequest.setAplicacion(aplicacion);
        String idtx = headerRequest.getIdTransaccion();

        String msjTx = Constantes.CHAR_CORCHETE_IZQUIERDO + Constantes.GET_MANUFACTURERS + Constantes.ID_TXT + idtx
                + Constantes.MSG_ID + msgid + Constantes.CORCHETE;
        logger.info(msjTx + Constantes.SEPARADOR);
        logger.info(msjTx + Constantes.INICIO_METODO + Constantes.GET_MANUFACTURERS);
        logger.info(msjTx + Constantes.SEPARADOR);

        try {
            logger.info(msjTx + Constantes.PARAMETROSENTRADA);
            logger.info(msjTx + Constantes.PARAMETROSHEADER + Constantes.SALTO_LINEA
                    + DashboardUtil.printPrettyJSONString(headerRequest));
            logger.info(msjTx + Constantes.PARAMETROSBODY + Constantes.SALTO_LINEA + requestPrint);
            logger.info(msjTx + Constantes.PARAMETROSOBLIGATORIOS);
            logger.info(msjTx + Constantes.VALIDACIONPARAMETROSCORRECTOS);

            response = dashboardService.getManufacturers(msjTx, headerRequest);

        } catch (Exception e) {
            responseStatus.setCodigoRespuesta(prop.dashboard_utilities_Idt3_Codigo);
            responseStatus.setMensajeRespuesta(prop.dashboard_utilities_Idt3_Mensaje + Constantes.ESPACIO + e.getMessage());
            responseStatus.setIdTransaccion(idtx);
            response.setResponseAudit(responseStatus);
        } finally {
            responsePrint = DashboardUtil.printPrettyJSONString(response);
            logger.info(msjTx + Constantes.DEVOLVERRESPONSE + Constantes.SALTO_LINEA + responsePrint);
            logger.info(msjTx + Constantes.SEPARADOR);
            logger.info(msjTx + Constantes.FIN_METODO + Constantes.GET_MANUFACTURERS + Constantes.TIEMPO_TOTAL
                    + (System.currentTimeMillis() - tiempoInicio) + Constantes.MILISEGUNDOS);
            logger.info(msjTx + Constantes.SEPARADOR);
        }
        return response;
    }

}
