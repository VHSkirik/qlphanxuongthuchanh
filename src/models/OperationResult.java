/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ducanh
 */
public enum OperationResult {
    ADD_SUCCESS,
    ADD_FAILURE,
    EDIT_SUCCESS,
    EDIT_FAILURE,
    DELETE_SUCCESS,
    DELETE_FAILURE;
    
    public boolean isSuccess(){
        return this == ADD_SUCCESS||this == EDIT_SUCCESS||this == DELETE_SUCCESS;
    }
    
    public boolean isFailure(){
        return !isSuccess();
    }
}
