/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guanzon.auto.validator.service;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.auto.service.model.Model_Job_Order_Labor;

/**
 *
 * @author Arsiela
 */
public class Validator_JobOrder_Labor implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Job_Order_Labor poEntity;
    
    public Validator_JobOrder_Labor(Object foValue){
        poEntity = (Model_Job_Order_Labor) foValue;
    }

    @Override
    public void setGRider(GRider foValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEntryOkay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
