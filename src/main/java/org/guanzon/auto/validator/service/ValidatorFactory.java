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
        JobOrder_Master,
        JobOrder_Labor,
        JobOrder_Parts
    }
    
    public static ValidatorInterface make(ValidatorFactory.TYPE foType, Object foValue){
        switch (foType) {
            case JobOrder_Master:
                return new Validator_JobOrder_Master(foValue);
            case JobOrder_Labor:
                return new Validator_JobOrder_Labor(foValue);
            case JobOrder_Parts:
                return new Validator_JobOrder_Parts(foValue);
            default:
                return null;
        }
    }
    
}
