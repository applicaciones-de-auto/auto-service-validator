/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guanzon.auto.validator.service;

/**
 *
 * @author Arsiela
 */
public class ValidatorFactory {
    
    public enum TYPE{
        Job_Order_Master,
        Job_Order_Labor,
        Job_Order_Parts
    }
    
    public static ValidatorInterface make(ValidatorFactory.TYPE foType, Object foValue){
        switch (foType) {
            case Job_Order_Master:
                return new Validator_Job_Order_Master(foValue);
            case Job_Order_Labor:
                return new Validator_Job_Order_Labor(foValue);
            case Job_Order_Parts:
                return new Validator_Job_Order_Parts(foValue);
            default:
                return null;
        }
    }
    
}
