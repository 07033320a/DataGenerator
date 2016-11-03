package com.genpact.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.genpact.service.http.QbPortletServiceSoap}.
 *
 * @author 710008328
 * @see com.genpact.service.http.QbPortletServiceSoap
 * @generated
 */
public class QbPortletSoap implements Serializable {
    private long _portlet_id;
    private String _portlet_name;
    private String _portlet_label_name;
    private long _project_id;

    public QbPortletSoap() {
    }

    public static QbPortletSoap toSoapModel(QbPortlet model) {
        QbPortletSoap soapModel = new QbPortletSoap();

        soapModel.setPortlet_id(model.getPortlet_id());
        soapModel.setPortlet_name(model.getPortlet_name());
        soapModel.setPortlet_label_name(model.getPortlet_label_name());
        soapModel.setProject_id(model.getProject_id());

        return soapModel;
    }

    public static QbPortletSoap[] toSoapModels(QbPortlet[] models) {
        QbPortletSoap[] soapModels = new QbPortletSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static QbPortletSoap[][] toSoapModels(QbPortlet[][] models) {
        QbPortletSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new QbPortletSoap[models.length][models[0].length];
        } else {
            soapModels = new QbPortletSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static QbPortletSoap[] toSoapModels(List<QbPortlet> models) {
        List<QbPortletSoap> soapModels = new ArrayList<QbPortletSoap>(models.size());

        for (QbPortlet model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new QbPortletSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _portlet_id;
    }

    public void setPrimaryKey(long pk) {
        setPortlet_id(pk);
    }

    public long getPortlet_id() {
        return _portlet_id;
    }

    public void setPortlet_id(long portlet_id) {
        _portlet_id = portlet_id;
    }

    public String getPortlet_name() {
        return _portlet_name;
    }

    public void setPortlet_name(String portlet_name) {
        _portlet_name = portlet_name;
    }

    public String getPortlet_label_name() {
        return _portlet_label_name;
    }

    public void setPortlet_label_name(String portlet_label_name) {
        _portlet_label_name = portlet_label_name;
    }

    public long getProject_id() {
        return _project_id;
    }

    public void setProject_id(long project_id) {
        _project_id = project_id;
    }
}
