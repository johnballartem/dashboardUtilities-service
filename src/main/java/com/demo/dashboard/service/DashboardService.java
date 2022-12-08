package com.demo.dashboard.service;
import com.demo.dashboard.repository.DashboardRepository;
import com.demo.dashboard.repository.model.CommonBean;
import com.demo.dashboard.utility.exception.DBException;
import com.demo.dashboard.utility.property.Constantes;
import com.demo.dashboard.utility.property.PropertiesExternos;
import com.demo.dashboard.utility.request.*;
import com.demo.dashboard.utility.types.ResponseStatusType;
import com.demo.dashboard.utility.response.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
public class DashboardService implements Serializable {

    private static final long serialVersionUID = 1L;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private PropertiesExternos propertiesExternos;

    @Autowired
    private DashboardRepository dashboardRepository;

    public StandardGetCommonBeansResponse getProducts(String msjTx, HeaderRequest headerRequest) throws Exception {

        List<CommonBeanResponse> commonBeanResponseList = new ArrayList<CommonBeanResponse>();
        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();
        logger.info(msjTx + Constantes.METODOINICIO + "getProducts");
        logger.info(Constantes.SEPARADOR);
        ResponseStatusType responseStatus = new ResponseStatusType();

        try {
            logger.info(msjTx + Constantes.ACTIVIDAD1);
            List<CommonBean> commonBeanList = new ArrayList<CommonBean>();

            commonBeanList = dashboardRepository.getProducts(msjTx);

            if(commonBeanList!=null && commonBeanList.size()>0){

                commonBeanList.stream().forEach(commonBean -> {
                    CommonBeanResponse commonBeanResponse = new CommonBeanResponse();
                    commonBeanResponse.setValue(commonBean.getValue());
                    commonBeanResponse.setLabel(commonBean.getLabel());
                    commonBeanResponseList.add(commonBeanResponse);
                });
                responseStatus.setCodigoRespuesta(Constantes.OK);
                responseStatus.setMensajeRespuesta(Constantes.EJECUCION_EXITOSA);
            }else{
                logger.info(msjTx + "entra idf2 1: ");
                responseStatus.setCodigoRespuesta(propertiesExternos.dashboard_utilities_Idf2_Codigo);
                responseStatus.setMensajeRespuesta(propertiesExternos.dashboard_utilities_Idf2_Mensaje);
            }

            responseStatus.setIdTransaccion(headerRequest.getIdTransaccion());
            response.setResponseAudit(responseStatus);
            response.setCommonBeanResponseList(commonBeanResponseList);
        }catch(DBException dbEx){
            responseStatus.setCodigoRespuesta(dbEx.getCode());
            responseStatus.setMensajeRespuesta(dbEx.getMessage());
            response.setResponseAudit(responseStatus);
        } catch (Exception ex) {
            logger.error(msjTx + Constantes.MENSAJERROR + ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }

        return response;
    }

    public StandardGetCommonBeansResponse getCustomerRoots(String msjTx, HeaderRequest headerRequest) throws Exception {

        List<CommonBeanResponse> commonBeanResponseList = new ArrayList<CommonBeanResponse>();
        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();
        logger.info(msjTx + Constantes.METODOINICIO + "getCustomerRoots");
        logger.info(Constantes.SEPARADOR);
        ResponseStatusType responseStatus = new ResponseStatusType();

        try {
            logger.info(msjTx + Constantes.ACTIVIDAD1);
            List<CommonBean> commonBeanList = new ArrayList<CommonBean>();

            commonBeanList = dashboardRepository.getCustomerRoots(msjTx);

            if(commonBeanList!=null && commonBeanList.size()>0){

                commonBeanList.stream().forEach(commonBean -> {
                    CommonBeanResponse commonBeanResponse = new CommonBeanResponse();
                    commonBeanResponse.setValue(commonBean.getValue());
                    commonBeanResponse.setLabel(commonBean.getLabel());
                    commonBeanResponseList.add(commonBeanResponse);
                });
                responseStatus.setCodigoRespuesta(Constantes.OK);
                responseStatus.setMensajeRespuesta(Constantes.EJECUCION_EXITOSA);
            }else{
                logger.info(msjTx + "entra idf2 1: ");
                responseStatus.setCodigoRespuesta(propertiesExternos.dashboard_utilities_Idf2_Codigo);
                responseStatus.setMensajeRespuesta(propertiesExternos.dashboard_utilities_Idf2_Mensaje);
            }

            responseStatus.setIdTransaccion(headerRequest.getIdTransaccion());
            response.setResponseAudit(responseStatus);
            response.setCommonBeanResponseList(commonBeanResponseList);
        }catch(DBException dbEx){
            responseStatus.setCodigoRespuesta(dbEx.getCode());
            responseStatus.setMensajeRespuesta(dbEx.getMessage());
            response.setResponseAudit(responseStatus);
        } catch (Exception ex) {
            logger.error(msjTx + Constantes.MENSAJERROR + ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }

        return response;
    }

    public StandardGetCommonBeansResponse getCustomerLeafs(String msjTx, HeaderRequest headerRequest) throws Exception {

        List<CommonBeanResponse> commonBeanResponseList = new ArrayList<CommonBeanResponse>();
        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();
        logger.info(msjTx + Constantes.METODOINICIO + "getCustomerLeafs");
        logger.info(Constantes.SEPARADOR);
        ResponseStatusType responseStatus = new ResponseStatusType();

        try {
            logger.info(msjTx + Constantes.ACTIVIDAD1);
            List<CommonBean> commonBeanList = new ArrayList<CommonBean>();

            commonBeanList = dashboardRepository.getCustomerLeafs(msjTx);

            if(commonBeanList!=null && commonBeanList.size()>0){

                commonBeanList.stream().forEach(commonBean -> {
                    CommonBeanResponse commonBeanResponse = new CommonBeanResponse();
                    commonBeanResponse.setValue(commonBean.getValue());
                    commonBeanResponse.setLabel(commonBean.getLabel());
                    commonBeanResponseList.add(commonBeanResponse);
                });
                responseStatus.setCodigoRespuesta(Constantes.OK);
                responseStatus.setMensajeRespuesta(Constantes.EJECUCION_EXITOSA);
            }else{
                logger.info(msjTx + "entra idf2 1: ");
                responseStatus.setCodigoRespuesta(propertiesExternos.dashboard_utilities_Idf2_Codigo);
                responseStatus.setMensajeRespuesta(propertiesExternos.dashboard_utilities_Idf2_Mensaje);
            }

            responseStatus.setIdTransaccion(headerRequest.getIdTransaccion());
            response.setResponseAudit(responseStatus);
            response.setCommonBeanResponseList(commonBeanResponseList);
        }catch(DBException dbEx){
            responseStatus.setCodigoRespuesta(dbEx.getCode());
            responseStatus.setMensajeRespuesta(dbEx.getMessage());
            response.setResponseAudit(responseStatus);
        } catch (Exception ex) {
            logger.error(msjTx + Constantes.MENSAJERROR + ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }

        return response;
    }

    public StandardGetCommonBeansResponse getPackSizes(String msjTx, HeaderRequest headerRequest) throws Exception {

        List<CommonBeanResponse> commonBeanResponseList = new ArrayList<CommonBeanResponse>();
        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();
        logger.info(msjTx + Constantes.METODOINICIO + "getPackSizes");
        logger.info(Constantes.SEPARADOR);
        ResponseStatusType responseStatus = new ResponseStatusType();

        try {
            logger.info(msjTx + Constantes.ACTIVIDAD1);
            List<CommonBean> commonBeanList = new ArrayList<CommonBean>();

            commonBeanList = dashboardRepository.getPackSizes(msjTx);

            if(commonBeanList!=null && commonBeanList.size()>0){

                commonBeanList.stream().forEach(commonBean -> {
                    CommonBeanResponse commonBeanResponse = new CommonBeanResponse();
                    commonBeanResponse.setValue(commonBean.getValue());
                    commonBeanResponse.setLabel(commonBean.getLabel());
                    commonBeanResponseList.add(commonBeanResponse);
                });
                responseStatus.setCodigoRespuesta(Constantes.OK);
                responseStatus.setMensajeRespuesta(Constantes.EJECUCION_EXITOSA);
            }else{
                logger.info(msjTx + "entra idf2 1: ");
                responseStatus.setCodigoRespuesta(propertiesExternos.dashboard_utilities_Idf2_Codigo);
                responseStatus.setMensajeRespuesta(propertiesExternos.dashboard_utilities_Idf2_Mensaje);
            }

            responseStatus.setIdTransaccion(headerRequest.getIdTransaccion());
            response.setResponseAudit(responseStatus);
            response.setCommonBeanResponseList(commonBeanResponseList);
        }catch(DBException dbEx){
            responseStatus.setCodigoRespuesta(dbEx.getCode());
            responseStatus.setMensajeRespuesta(dbEx.getMessage());
            response.setResponseAudit(responseStatus);
        } catch (Exception ex) {
            logger.error(msjTx + Constantes.MENSAJERROR + ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }

        return response;
    }

    public StandardGetCommonBeansResponse getUnitTypes(String msjTx, HeaderRequest headerRequest) throws Exception {

        List<CommonBeanResponse> commonBeanResponseList = new ArrayList<CommonBeanResponse>();
        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();
        logger.info(msjTx + Constantes.METODOINICIO + "getUnitTypes");
        logger.info(Constantes.SEPARADOR);
        ResponseStatusType responseStatus = new ResponseStatusType();

        try {
            logger.info(msjTx + Constantes.ACTIVIDAD1);
            List<CommonBean> commonBeanList = new ArrayList<CommonBean>();

            commonBeanList = dashboardRepository.getUnitTypes(msjTx);

            if(commonBeanList!=null && commonBeanList.size()>0){

                commonBeanList.stream().forEach(commonBean -> {
                    CommonBeanResponse commonBeanResponse = new CommonBeanResponse();
                    commonBeanResponse.setValue(commonBean.getValue());
                    commonBeanResponse.setLabel(commonBean.getLabel());
                    commonBeanResponseList.add(commonBeanResponse);
                });
                responseStatus.setCodigoRespuesta(Constantes.OK);
                responseStatus.setMensajeRespuesta(Constantes.EJECUCION_EXITOSA);
            }else{
                logger.info(msjTx + "entra idf2 1: ");
                responseStatus.setCodigoRespuesta(propertiesExternos.dashboard_utilities_Idf2_Codigo);
                responseStatus.setMensajeRespuesta(propertiesExternos.dashboard_utilities_Idf2_Mensaje);
            }

            responseStatus.setIdTransaccion(headerRequest.getIdTransaccion());
            response.setResponseAudit(responseStatus);
            response.setCommonBeanResponseList(commonBeanResponseList);
        }catch(DBException dbEx){
            responseStatus.setCodigoRespuesta(dbEx.getCode());
            responseStatus.setMensajeRespuesta(dbEx.getMessage());
            response.setResponseAudit(responseStatus);
        } catch (Exception ex) {
            logger.error(msjTx + Constantes.MENSAJERROR + ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }

        return response;
    }

    public StandardGetCommonBeansResponse getCategories(String msjTx, HeaderRequest headerRequest) throws Exception {

        List<CommonBeanResponse> commonBeanResponseList = new ArrayList<CommonBeanResponse>();
        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();
        logger.info(msjTx + Constantes.METODOINICIO + "getCategories");
        logger.info(Constantes.SEPARADOR);
        ResponseStatusType responseStatus = new ResponseStatusType();

        try {
            logger.info(msjTx + Constantes.ACTIVIDAD1);
            List<CommonBean> commonBeanList = new ArrayList<CommonBean>();

            commonBeanList = dashboardRepository.getCategories(msjTx);

            if(commonBeanList!=null && commonBeanList.size()>0){

                commonBeanList.stream().forEach(commonBean -> {
                    CommonBeanResponse commonBeanResponse = new CommonBeanResponse();
                    commonBeanResponse.setValue(commonBean.getValue());
                    commonBeanResponse.setLabel(commonBean.getLabel());
                    commonBeanResponseList.add(commonBeanResponse);
                });
                responseStatus.setCodigoRespuesta(Constantes.OK);
                responseStatus.setMensajeRespuesta(Constantes.EJECUCION_EXITOSA);
            }else{
                logger.info(msjTx + "entra idf2 1: ");
                responseStatus.setCodigoRespuesta(propertiesExternos.dashboard_utilities_Idf2_Codigo);
                responseStatus.setMensajeRespuesta(propertiesExternos.dashboard_utilities_Idf2_Mensaje);
            }

            responseStatus.setIdTransaccion(headerRequest.getIdTransaccion());
            response.setResponseAudit(responseStatus);
            response.setCommonBeanResponseList(commonBeanResponseList);
        }catch(DBException dbEx){
            responseStatus.setCodigoRespuesta(dbEx.getCode());
            responseStatus.setMensajeRespuesta(dbEx.getMessage());
            response.setResponseAudit(responseStatus);
        } catch (Exception ex) {
            logger.error(msjTx + Constantes.MENSAJERROR + ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }

        return response;
    }

    public StandardGetCommonBeansResponse getDistributorRoots(String msjTx, HeaderRequest headerRequest) throws Exception {

        List<CommonBeanResponse> commonBeanResponseList = new ArrayList<CommonBeanResponse>();
        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();
        logger.info(msjTx + Constantes.METODOINICIO + "getDistributorRoots");
        logger.info(Constantes.SEPARADOR);
        ResponseStatusType responseStatus = new ResponseStatusType();

        try {
            logger.info(msjTx + Constantes.ACTIVIDAD1);
            List<CommonBean> commonBeanList = new ArrayList<CommonBean>();

            commonBeanList = dashboardRepository.getDistributorRoots(msjTx);

            if(commonBeanList!=null && commonBeanList.size()>0){

                commonBeanList.stream().forEach(commonBean -> {
                    CommonBeanResponse commonBeanResponse = new CommonBeanResponse();
                    commonBeanResponse.setValue(commonBean.getValue());
                    commonBeanResponse.setLabel(commonBean.getLabel());
                    commonBeanResponseList.add(commonBeanResponse);
                });
                responseStatus.setCodigoRespuesta(Constantes.OK);
                responseStatus.setMensajeRespuesta(Constantes.EJECUCION_EXITOSA);
            }else{
                logger.info(msjTx + "entra idf2 1: ");
                responseStatus.setCodigoRespuesta(propertiesExternos.dashboard_utilities_Idf2_Codigo);
                responseStatus.setMensajeRespuesta(propertiesExternos.dashboard_utilities_Idf2_Mensaje);
            }

            responseStatus.setIdTransaccion(headerRequest.getIdTransaccion());
            response.setResponseAudit(responseStatus);
            response.setCommonBeanResponseList(commonBeanResponseList);
        }catch(DBException dbEx){
            responseStatus.setCodigoRespuesta(dbEx.getCode());
            responseStatus.setMensajeRespuesta(dbEx.getMessage());
            response.setResponseAudit(responseStatus);
        } catch (Exception ex) {
            logger.error(msjTx + Constantes.MENSAJERROR + ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }

        return response;
    }

    public StandardGetCommonBeansResponse getDistributorLeafs(String msjTx, HeaderRequest headerRequest) throws Exception {

        List<CommonBeanResponse> commonBeanResponseList = new ArrayList<CommonBeanResponse>();
        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();
        logger.info(msjTx + Constantes.METODOINICIO + "getDistributorLeafs");
        logger.info(Constantes.SEPARADOR);
        ResponseStatusType responseStatus = new ResponseStatusType();

        try {
            logger.info(msjTx + Constantes.ACTIVIDAD1);
            List<CommonBean> commonBeanList = new ArrayList<CommonBean>();

            commonBeanList = dashboardRepository.getDistributorLeafs(msjTx);

            if(commonBeanList!=null && commonBeanList.size()>0){

                commonBeanList.stream().forEach(commonBean -> {
                    CommonBeanResponse commonBeanResponse = new CommonBeanResponse();
                    commonBeanResponse.setValue(commonBean.getValue());
                    commonBeanResponse.setLabel(commonBean.getLabel());
                    commonBeanResponseList.add(commonBeanResponse);
                });
                responseStatus.setCodigoRespuesta(Constantes.OK);
                responseStatus.setMensajeRespuesta(Constantes.EJECUCION_EXITOSA);
            }else{
                logger.info(msjTx + "entra idf2 1: ");
                responseStatus.setCodigoRespuesta(propertiesExternos.dashboard_utilities_Idf2_Codigo);
                responseStatus.setMensajeRespuesta(propertiesExternos.dashboard_utilities_Idf2_Mensaje);
            }

            responseStatus.setIdTransaccion(headerRequest.getIdTransaccion());
            response.setResponseAudit(responseStatus);
            response.setCommonBeanResponseList(commonBeanResponseList);
        }catch(DBException dbEx){
            responseStatus.setCodigoRespuesta(dbEx.getCode());
            responseStatus.setMensajeRespuesta(dbEx.getMessage());
            response.setResponseAudit(responseStatus);
        } catch (Exception ex) {
            logger.error(msjTx + Constantes.MENSAJERROR + ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }

        return response;
    }

    public StandardGetCommonBeansResponse getManufacturers(String msjTx, HeaderRequest headerRequest) throws Exception {

        List<CommonBeanResponse> commonBeanResponseList = new ArrayList<CommonBeanResponse>();
        StandardGetCommonBeansResponse response = new StandardGetCommonBeansResponse();
        logger.info(msjTx + Constantes.METODOINICIO + "getManufacturers");
        logger.info(Constantes.SEPARADOR);
        ResponseStatusType responseStatus = new ResponseStatusType();

        try {
            logger.info(msjTx + Constantes.ACTIVIDAD1);
            List<CommonBean> commonBeanList = new ArrayList<CommonBean>();

            commonBeanList = dashboardRepository.getManufacturers(msjTx);

            if(commonBeanList!=null && commonBeanList.size()>0){

                commonBeanList.stream().forEach(commonBean -> {
                    CommonBeanResponse commonBeanResponse = new CommonBeanResponse();
                    commonBeanResponse.setValue(commonBean.getValue());
                    commonBeanResponse.setLabel(commonBean.getLabel());
                    commonBeanResponseList.add(commonBeanResponse);
                });
                responseStatus.setCodigoRespuesta(Constantes.OK);
                responseStatus.setMensajeRespuesta(Constantes.EJECUCION_EXITOSA);
            }else{
                logger.info(msjTx + "entra idf2 1: ");
                responseStatus.setCodigoRespuesta(propertiesExternos.dashboard_utilities_Idf2_Codigo);
                responseStatus.setMensajeRespuesta(propertiesExternos.dashboard_utilities_Idf2_Mensaje);
            }

            responseStatus.setIdTransaccion(headerRequest.getIdTransaccion());
            response.setResponseAudit(responseStatus);
            response.setCommonBeanResponseList(commonBeanResponseList);
        }catch(DBException dbEx){
            responseStatus.setCodigoRespuesta(dbEx.getCode());
            responseStatus.setMensajeRespuesta(dbEx.getMessage());
            response.setResponseAudit(responseStatus);
        } catch (Exception ex) {
            logger.error(msjTx + Constantes.MENSAJERROR + ex.getMessage(), ex);
            throw new Exception(ex.getMessage());
        }

        return response;
    }
}
