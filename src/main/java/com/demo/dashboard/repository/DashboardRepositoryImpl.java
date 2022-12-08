package com.demo.dashboard.repository;

import com.demo.dashboard.repository.model.*;
import com.demo.dashboard.utility.exception.DBException;
import com.demo.dashboard.utility.property.PropertiesExternos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.*;

@Service
public class DashboardRepositoryImpl implements DashboardRepository {

    private static final Logger logger = LoggerFactory.getLogger(DashboardRepositoryImpl.class);

    @Autowired
    private PropertiesExternos propertiesExternos;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<CommonBean> getProducts(String mensajeTransaccion) throws DBException, SQLException{

        logger.info(mensajeTransaccion + " ====== [Inicio] getProducts====== ");

        String sqlList = "";
        String sqlSorting = "";
        String searchSortField="P.NA_PRODUCT";
        String searchSortType="asc";

        sqlList =
                "SELECT " +
                        "P.ID_PRODUCT ID, " +
                        "P.NA_PRODUCT DESCRIPTION " +
                        "FROM ISD_PRODUCT P " ;

        //Sorting
        sqlSorting= " order by " + searchSortField + " " + searchSortType;

        sqlList = sqlList + sqlSorting;

        logger.info(mensajeTransaccion + "query: " + sqlList);
        List<CommonBean> commonBeanList = new ArrayList<>();

        commonBeanList = jdbcTemplate.query(sqlList.toString(),new CommonBeanListMapper());

        return commonBeanList;
    }

    public List<CommonBean> getCustomerRoots(String mensajeTransaccion) throws DBException, SQLException{

        logger.info(mensajeTransaccion + " ====== [Inicio] getCustomerRoots====== ");

        String sqlList = "";
        String sqlSorting = "";
        String searchSortField="CR.NA_CUSTOMER_ROOT";
        String searchSortType="asc";

        sqlList =
                "SELECT " +
                        "CR.ID_CUSTOMER_ROOT ID, " +
                        "CR.NA_CUSTOMER_ROOT DESCRIPTION " +
                        "FROM ISD_CUSTOMER_ROOT CR " ;

        //Sorting
        sqlSorting= " order by " + searchSortField + " " + searchSortType;

        sqlList = sqlList + sqlSorting;

        logger.info(mensajeTransaccion + "query: " + sqlList);
        List<CommonBean> commonBeanList = new ArrayList<>();

        commonBeanList = jdbcTemplate.query(sqlList.toString(),new CommonBeanListMapper());

        return commonBeanList;
    }

    public List<CommonBean> getCustomerLeafs(String mensajeTransaccion) throws DBException, SQLException{

        logger.info(mensajeTransaccion + " ====== [Inicio] getCustomerLeafs====== ");

        String sqlList = "";
        String sqlSorting = "";
        String searchSortField="CL.NA_CUSTOMER_LEAF";
        String searchSortType="asc";

        sqlList =
                "SELECT " +
                        "CL.ID_CUSTOMER_LEAF ID, " +
                        "CL.NA_CUSTOMER_LEAF DESCRIPTION " +
                        "FROM ISD_CUSTOMER_LEAF CL " ;

        //Sorting
        sqlSorting= " order by " + searchSortField + " " + searchSortType;

        sqlList = sqlList + sqlSorting;

        logger.info(mensajeTransaccion + "query: " + sqlList);
        List<CommonBean> commonBeanList = new ArrayList<>();

        commonBeanList = jdbcTemplate.query(sqlList.toString(),new CommonBeanListMapper());

        return commonBeanList;
    }

    public List<CommonBean> getPackSizes(String mensajeTransaccion) throws DBException, SQLException{

        logger.info(mensajeTransaccion + " ====== [Inicio] getPackSizes====== ");

        String sqlList = "";
        String sqlSorting = "";
        String searchSortField="PS.NA_PACK_SIZE";
        String searchSortType="asc";

        sqlList =
                "SELECT " +
                        "PS.ID_PACK_SIZE ID, " +
                        "PS.NA_PACK_SIZE DESCRIPTION " +
                        "FROM ISD_PACK_SIZE PS " ;

        //Sorting
        sqlSorting= " order by " + searchSortField + " " + searchSortType;

        sqlList = sqlList + sqlSorting;

        logger.info(mensajeTransaccion + "query: " + sqlList);
        List<CommonBean> commonBeanList = new ArrayList<>();

        commonBeanList = jdbcTemplate.query(sqlList.toString(),new CommonBeanListMapper());

        return commonBeanList;
    }

    public List<CommonBean> getUnitTypes(String mensajeTransaccion) throws DBException, SQLException{

        logger.info(mensajeTransaccion + " ====== [Inicio] getUnitTypes====== ");

        String sqlList = "";
        String sqlSorting = "";
        String searchSortField="UT.NA_UNIT_TYPE";
        String searchSortType="asc";

        sqlList =
                "SELECT " +
                        "UT.ID_UNIT_TYPE ID, " +
                        "UT.NA_UNIT_TYPE DESCRIPTION " +
                        "FROM ISD_UNIT_TYPE UT " ;

        //Sorting
        sqlSorting= " order by " + searchSortField + " " + searchSortType;

        sqlList = sqlList + sqlSorting;

        logger.info(mensajeTransaccion + "query: " + sqlList);
        List<CommonBean> commonBeanList = new ArrayList<>();

        commonBeanList = jdbcTemplate.query(sqlList.toString(),new CommonBeanListMapper());

        return commonBeanList;
    }

    public List<CommonBean> getCategories(String mensajeTransaccion) throws DBException, SQLException{

        logger.info(mensajeTransaccion + " ====== [Inicio] getCategories====== ");

        String sqlList = "";
        String sqlSorting = "";
        String searchSortField="C.NA_CATEGORY";
        String searchSortType="asc";

        sqlList =
                "SELECT " +
                        "C.ID_CATEGORY ID, " +
                        "C.NA_CATEGORY DESCRIPTION " +
                        "FROM ISD_CATEGORY C " ;

        //Sorting
        sqlSorting= " order by " + searchSortField + " " + searchSortType;

        sqlList = sqlList + sqlSorting;

        logger.info(mensajeTransaccion + "query: " + sqlList);
        List<CommonBean> commonBeanList = new ArrayList<>();

        commonBeanList = jdbcTemplate.query(sqlList.toString(),new CommonBeanListMapper());

        return commonBeanList;
    }

    public List<CommonBean> getDistributorRoots(String mensajeTransaccion) throws DBException, SQLException{

        logger.info(mensajeTransaccion + " ====== [Inicio] getDistributorRoots====== ");

        String sqlList = "";
        String sqlSorting = "";
        String searchSortField="DR.NA_DISTRIBUTOR_ROOT";
        String searchSortType="asc";

        sqlList =
                "SELECT " +
                        "DR.ID_DISTRIBUTOR_ROOT ID, " +
                        "DR.NA_DISTRIBUTOR_ROOT DESCRIPTION " +
                        "FROM ISD_DISTRIBUTOR_ROOT DR " ;

        //Sorting
        sqlSorting= " order by " + searchSortField + " " + searchSortType;

        sqlList = sqlList + sqlSorting;

        logger.info(mensajeTransaccion + "query: " + sqlList);
        List<CommonBean> commonBeanList = new ArrayList<>();

        commonBeanList = jdbcTemplate.query(sqlList.toString(),new CommonBeanListMapper());

        return commonBeanList;
    }

    public List<CommonBean> getDistributorLeafs(String mensajeTransaccion) throws DBException, SQLException{

        logger.info(mensajeTransaccion + " ====== [Inicio] getDistributorLeafs====== ");

        String sqlList = "";
        String sqlSorting = "";
        String searchSortField="DL.NA_DISTRIBUTOR_LEAF";
        String searchSortType="asc";

        sqlList =
                "SELECT " +
                        "DL.ID_DISTRIBUTOR_LEAF ID, " +
                        "DL.NA_DISTRIBUTOR_LEAF DESCRIPTION " +
                        "FROM ISD_DISTRIBUTOR_LEAF DL " ;

        //Sorting
        sqlSorting= " order by " + searchSortField + " " + searchSortType;

        sqlList = sqlList + sqlSorting;

        logger.info(mensajeTransaccion + "query: " + sqlList);
        List<CommonBean> commonBeanList = new ArrayList<>();

        commonBeanList = jdbcTemplate.query(sqlList.toString(),new CommonBeanListMapper());

        return commonBeanList;
    }

    public List<CommonBean> getManufacturers(String mensajeTransaccion) throws DBException, SQLException{

        logger.info(mensajeTransaccion + " ====== [Inicio] getManufacturers====== ");

        String sqlList = "";
        String sqlSorting = "";
        String searchSortField="M.NA_MANUFACTURER";
        String searchSortType="asc";

        sqlList =
                "SELECT " +
                        "M.ID_MANUFACTURER ID, " +
                        "M.NA_MANUFACTURER DESCRIPTION " +
                        "FROM ISD_MANUFACTURER M " ;

        //Sorting
        sqlSorting= " order by " + searchSortField + " " + searchSortType;

        sqlList = sqlList + sqlSorting;

        logger.info(mensajeTransaccion + "query: " + sqlList);
        List<CommonBean> commonBeanList = new ArrayList<>();

        commonBeanList = jdbcTemplate.query(sqlList.toString(),new CommonBeanListMapper());

        return commonBeanList;
    }
}
