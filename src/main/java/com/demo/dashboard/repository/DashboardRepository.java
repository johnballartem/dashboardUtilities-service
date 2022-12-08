package com.demo.dashboard.repository;


import com.demo.dashboard.repository.model.CommonBean;
import com.demo.dashboard.utility.exception.DBException;

import java.sql.SQLException;
import java.util.List;

public interface DashboardRepository {

    public List<CommonBean> getProducts(String mensajeTransaccion) throws DBException, SQLException;

    public List<CommonBean> getCustomerRoots(String mensajeTransaccion) throws DBException, SQLException;

    public List<CommonBean> getCustomerLeafs(String mensajeTransaccion) throws DBException, SQLException;

    public List<CommonBean> getPackSizes(String mensajeTransaccion) throws DBException, SQLException;

    public List<CommonBean> getUnitTypes(String mensajeTransaccion) throws DBException, SQLException;

    public List<CommonBean> getCategories(String mensajeTransaccion) throws DBException, SQLException;

    public List<CommonBean> getDistributorRoots(String mensajeTransaccion) throws DBException, SQLException;

    public List<CommonBean> getDistributorLeafs(String mensajeTransaccion) throws DBException, SQLException;

    public List<CommonBean> getManufacturers(String mensajeTransaccion) throws DBException, SQLException;

}
