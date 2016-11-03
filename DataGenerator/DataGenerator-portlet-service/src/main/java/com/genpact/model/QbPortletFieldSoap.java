package com.genpact.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.genpact.service.http.QbPortletFieldServiceSoap}.
 *
 * @author 710008328
 * @see com.genpact.service.http.QbPortletFieldServiceSoap
 * @generated
 */
public class QbPortletFieldSoap implements Serializable {
    private long _field_id;
    private String _field_name;
    private String _field_label_name;
    private long _portlet_id;
    private long _reference_portlet_id;

    public QbPortletFieldSoap() {
    }

    public static QbPortletFieldSoap toSoapModel(QbPortletField model) {
        QbPortletFieldSoap soapModel = new QbPortletFieldSoap();

        soapModel.setField_id(model.getField_id());
        soapModel.setField_name(model.getField_name());
        soapModel.setField_label_name(model.getField_label_name());
        soapModel.setPortlet_id(model.getPortlet_id());
        soapModel.setReference_portlet_id(model.getReference_portlet_id());

        return soapModel;
    }

    public static QbPortletFieldSoap[] toSoapModels(QbPortletField[] models) {
        QbPortletFieldSoap[] soapModels = new QbPortletFieldSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static QbPortletFieldSoap[][] toSoapModels(QbPortletField[][] models) {
        QbPortletFieldSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new QbPortletFieldSoap[models.length][models[0].length];
        } else {
            soapModels = new QbPortletFieldSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static QbPortletFieldSoap[] toSoapModels(List<QbPortletField> models) {
        List<QbPortletFieldSoap> soapModels = new ArrayList<QbPortletFieldSoap>(models.size());

        for (QbPortletField model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new QbPortletFieldSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _field_id;
    }

    public void setPrimaryKey(long pk) {
        setField_id(pk);
    }

    public long getField_id() {
        return _field_id;
    }

    public void setField_id(long field_id) {
        _field_id = field_id;
    }

    public String getField_name() {
        return _field_name;
    }

    public void setField_name(String field_name) {
        _field_name = field_name;
    }

    public String getField_label_name() {
        return _field_label_name;
    }

    public void setField_label_name(String field_label_name) {
        _field_label_name = field_label_name;
    }

    public long getPortlet_id() {
        return _portlet_id;
    }

    public void setPortlet_id(long portlet_id) {
        _portlet_id = portlet_id;
    }

    public long getReference_portlet_id() {
        return _reference_portlet_id;
    }

    public void setReference_portlet_id(long reference_portlet_id) {
        _reference_portlet_id = reference_portlet_id;
    }
}
