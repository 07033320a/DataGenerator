package com.genpact.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.genpact.service.http.DataGeneratorServiceSoap}.
 *
 * @author 710008328
 * @see com.genpact.service.http.DataGeneratorServiceSoap
 * @generated
 */
public class DataGeneratorSoap implements Serializable {
    private long _id;
    private String _data;
    private String _type;
    private Date _createDate;

    public DataGeneratorSoap() {
    }

    public static DataGeneratorSoap toSoapModel(DataGenerator model) {
        DataGeneratorSoap soapModel = new DataGeneratorSoap();

        soapModel.setId(model.getId());
        soapModel.setData(model.getData());
        soapModel.setType(model.getType());
        soapModel.setCreateDate(model.getCreateDate());

        return soapModel;
    }

    public static DataGeneratorSoap[] toSoapModels(DataGenerator[] models) {
        DataGeneratorSoap[] soapModels = new DataGeneratorSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DataGeneratorSoap[][] toSoapModels(DataGenerator[][] models) {
        DataGeneratorSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DataGeneratorSoap[models.length][models[0].length];
        } else {
            soapModels = new DataGeneratorSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DataGeneratorSoap[] toSoapModels(List<DataGenerator> models) {
        List<DataGeneratorSoap> soapModels = new ArrayList<DataGeneratorSoap>(models.size());

        for (DataGenerator model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DataGeneratorSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getData() {
        return _data;
    }

    public void setData(String data) {
        _data = data;
    }

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        _type = type;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }
}
