package com.genpact.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.genpact.service.http.QbProjectServiceSoap}.
 *
 * @author 710008328
 * @see com.genpact.service.http.QbProjectServiceSoap
 * @generated
 */
public class QbProjectSoap implements Serializable {
    private long _project_id;
    private String _project_name;

    public QbProjectSoap() {
    }

    public static QbProjectSoap toSoapModel(QbProject model) {
        QbProjectSoap soapModel = new QbProjectSoap();

        soapModel.setProject_id(model.getProject_id());
        soapModel.setProject_name(model.getProject_name());

        return soapModel;
    }

    public static QbProjectSoap[] toSoapModels(QbProject[] models) {
        QbProjectSoap[] soapModels = new QbProjectSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static QbProjectSoap[][] toSoapModels(QbProject[][] models) {
        QbProjectSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new QbProjectSoap[models.length][models[0].length];
        } else {
            soapModels = new QbProjectSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static QbProjectSoap[] toSoapModels(List<QbProject> models) {
        List<QbProjectSoap> soapModels = new ArrayList<QbProjectSoap>(models.size());

        for (QbProject model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new QbProjectSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _project_id;
    }

    public void setPrimaryKey(long pk) {
        setProject_id(pk);
    }

    public long getProject_id() {
        return _project_id;
    }

    public void setProject_id(long project_id) {
        _project_id = project_id;
    }

    public String getProject_name() {
        return _project_name;
    }

    public void setProject_name(String project_name) {
        _project_name = project_name;
    }
}
