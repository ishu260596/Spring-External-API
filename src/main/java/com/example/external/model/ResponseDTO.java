package com.example.external.model;

import javax.annotation.Generated;

import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ResponseDTO implements Serializable {

    private int status;

    private String type;

    private DataDTO data;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public DataDTO getData() {
        return data;
    }

    @Override
    public String toString() {
        return
                "ResponseDTO{" +
                        "status = '" + status + '\'' +
                        ",type = '" + type + '\'' +
                        ",data = '" + data + '\'' +
                        "}";
    }
}