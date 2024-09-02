/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guanzon.auto.validator.service;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.guanzon.appdriver.base.GRider;
import org.guanzon.auto.model.service.Model_JobOrder_Master;

/**
 *
 * @author Arsiela
 */
public class Validator_JobOrder_Master  implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_JobOrder_Master poEntity;

    Validator_JobOrder_Master(Object foValue){
        poEntity = (Model_JobOrder_Master) foValue;
    }

    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }

    @Override
    public boolean isEntryOkay() {
        if(poEntity.getTransNo()== null) {
            psMessage = "Transaction No is not set.";
            return false;
        } else {
            if (poEntity.getTransNo().isEmpty()){
                psMessage = "Transaction No is not set.";
                return false;
            }
        }
        
        if(poEntity.getClientID() == null) {
            psMessage = "Buying Customer is not set.";
            return false;
        } else {
            if (poEntity.getClientID().trim().isEmpty()){
                psMessage = "Buying Customer is not set.";
                return false;
            }
        }
        
//        if(poEntity.getBranchCD()== null) {
//            psMessage = "Branch is not set.";
//            return false;
//        } else {
//            if (poEntity.getBranchCD().isEmpty()){
//                psMessage = "Branch is not set.";
//                return false;
//            }
//        }
        
        if(poEntity.getWorkCtgy()== null) {
            psMessage = "Work Category is not set.";
            return false;
        } else {
            if (poEntity.getWorkCtgy().trim().isEmpty()){
                psMessage = "Work Categor is not set.";
                return false;
            }
        }
        
        if(poEntity.getWorkCtgy().equals("2")){ //jobo for sales
            if(poEntity.getSourceNo()== null) {
                psMessage = "VSP is not set.";
                return false;
            } else {
                if (poEntity.getSourceNo().trim().isEmpty()){
                    psMessage = "VSP is not set.";
                    return false;
                }
            }
        }
        
        if(poEntity.getSerialID()== null) {
            psMessage = "Vehicle is not set.";
            return false;
        } else {
            if (poEntity.getSerialID().trim().isEmpty()){
                psMessage = "Vehicle is not set.";
                return false;
            }
        }
        
//        try {
//        } catch (SQLException ex) {
//            Logger.getLogger(Validator_JobOrder_Master.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        return true;
    }

    
    @Override
    public String getMessage() {
        return psMessage;
    }
    
    private static String xsDateShort(Date fdValue) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(fdValue);
        return date;
    }

    private static String xsDateShort(String fsValue) throws org.json.simple.parser.ParseException, java.text.ParseException {
        SimpleDateFormat fromUser = new SimpleDateFormat("MMMM dd, yyyy");
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        String lsResult = "";
        lsResult = myFormat.format(fromUser.parse(fsValue));
        return lsResult;
    }
    
    /*Convert Date to String*/
    private LocalDate strToDate(String val) {
        DateTimeFormatter date_formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(val, date_formatter);
        return localDate;
    }
    
    
}
