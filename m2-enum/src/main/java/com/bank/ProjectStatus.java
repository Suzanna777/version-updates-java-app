package com.bank;

public enum ProjectStatus {

    OPEN, CLOSED, PROGRESS("IN PROGRESS");

    String status; // value

    // cons
    ProjectStatus(String status) {
        this.status = status;
    }
    // empty cons
    ProjectStatus(){
    }

}
