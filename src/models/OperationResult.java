package models;

public enum OperationResult {
    ADD_SUCCESS,
    ADD_FAILURE,
    EDIT_SUCCESS,
    EDIT_FAILURE,
    DELETE_SUCCESS,
    DELETE_FAILURE,
    LOGIN_SUCCESS,
    LOGIN_FAILURE;

    public boolean isSuccess() {
        return this == ADD_SUCCESS || this == EDIT_SUCCESS || this == DELETE_SUCCESS;
    }

    public boolean isFailure() {
        return !isSuccess();
    }

    public boolean isLoginSuccess() {
        return this == LOGIN_SUCCESS;
    }
}
