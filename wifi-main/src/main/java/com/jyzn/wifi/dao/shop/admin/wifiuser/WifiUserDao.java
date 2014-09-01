/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jyzn.wifi.dao.shop.admin.wifiuser;

import com.github.dactiv.orm.core.hibernate.support.HibernateSupportDao;
import com.jyzn.wifi.entity.shop.adimn.WifiUser;
import java.util.List;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public class WifiUserDao extends HibernateSupportDao<WifiUser, String>{
    
    public List<WifiUser>getAllUser(){
        //String sql = "SELECT ID, NAME FROM WIFIUSER ";
        //return getAll(new Order);
        return this.getAll(Order.asc("id"));
    }  
}
