package com.genpact.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author 710008328
 * @generated
 */
public class TalendProcessSoap implements Serializable {
    private long _processId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _version;
    private String _className;
    private long _fileEntryId;
    private String _description;
    private String _context;

    public TalendProcessSoap() {
    }

    public static TalendProcessSoap toSoapModel(TalendProcess model) {
        TalendProcessSoap soapModel = new TalendProcessSoap();

        soapModel.setProcessId(model.getProcessId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setVersion(model.getVersion());
        soapModel.setClassName(model.getClassName());
        soapModel.setFileEntryId(model.getFileEntryId());
        soapModel.setDescription(model.getDescription());
        soapModel.setContext(model.getContext());

        return soapModel;
    }

    public static TalendProcessSoap[] toSoapModels(TalendProcess[] models) {
        TalendProcessSoap[] soapModels = new TalendProcessSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TalendProcessSoap[][] toSoapModels(TalendProcess[][] models) {
        TalendProcessSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TalendProcessSoap[models.length][models[0].length];
        } else {
            soapModels = new TalendProcessSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TalendProcessSoap[] toSoapModels(List<TalendProcess> models) {
        List<TalendProcessSoap> soapModels = new ArrayList<TalendProcessSoap>(models.size());

        for (TalendProcess model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TalendProcessSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _processId;
    }

    public void setPrimaryKey(long pk) {
        setProcessId(pk);
    }

    public long getProcessId() {
        return _processId;
    }

    public void setProcessId(long processId) {
        _processId = processId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getVersion() {
        return _version;
    }

    public void setVersion(String version) {
        _version = version;
    }

    public String getClassName() {
        return _className;
    }

    public void setClassName(String className) {
        _className = className;
    }

    public long getFileEntryId() {
        return _fileEntryId;
    }

    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getContext() {
        return _context;
    }

    public void setContext(String context) {
        _context = context;
    }
}
