package com.genpact.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QbPortletField}.
 * </p>
 *
 * @author 710008328
 * @see QbPortletField
 * @generated
 */
public class QbPortletFieldWrapper implements QbPortletField,
    ModelWrapper<QbPortletField> {
    private QbPortletField _qbPortletField;

    public QbPortletFieldWrapper(QbPortletField qbPortletField) {
        _qbPortletField = qbPortletField;
    }

    @Override
    public Class<?> getModelClass() {
        return QbPortletField.class;
    }

    @Override
    public String getModelClassName() {
        return QbPortletField.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("field_id", getField_id());
        attributes.put("field_name", getField_name());
        attributes.put("field_label_name", getField_label_name());
        attributes.put("portlet_id", getPortlet_id());
        attributes.put("reference_portlet_id", getReference_portlet_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long field_id = (Long) attributes.get("field_id");

        if (field_id != null) {
            setField_id(field_id);
        }

        String field_name = (String) attributes.get("field_name");

        if (field_name != null) {
            setField_name(field_name);
        }

        String field_label_name = (String) attributes.get("field_label_name");

        if (field_label_name != null) {
            setField_label_name(field_label_name);
        }

        Long portlet_id = (Long) attributes.get("portlet_id");

        if (portlet_id != null) {
            setPortlet_id(portlet_id);
        }

        Long reference_portlet_id = (Long) attributes.get(
                "reference_portlet_id");

        if (reference_portlet_id != null) {
            setReference_portlet_id(reference_portlet_id);
        }
    }

    /**
    * Returns the primary key of this qb portlet field.
    *
    * @return the primary key of this qb portlet field
    */
    @Override
    public long getPrimaryKey() {
        return _qbPortletField.getPrimaryKey();
    }

    /**
    * Sets the primary key of this qb portlet field.
    *
    * @param primaryKey the primary key of this qb portlet field
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _qbPortletField.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the field_id of this qb portlet field.
    *
    * @return the field_id of this qb portlet field
    */
    @Override
    public long getField_id() {
        return _qbPortletField.getField_id();
    }

    /**
    * Sets the field_id of this qb portlet field.
    *
    * @param field_id the field_id of this qb portlet field
    */
    @Override
    public void setField_id(long field_id) {
        _qbPortletField.setField_id(field_id);
    }

    /**
    * Returns the field_name of this qb portlet field.
    *
    * @return the field_name of this qb portlet field
    */
    @Override
    public java.lang.String getField_name() {
        return _qbPortletField.getField_name();
    }

    /**
    * Sets the field_name of this qb portlet field.
    *
    * @param field_name the field_name of this qb portlet field
    */
    @Override
    public void setField_name(java.lang.String field_name) {
        _qbPortletField.setField_name(field_name);
    }

    /**
    * Returns the field_label_name of this qb portlet field.
    *
    * @return the field_label_name of this qb portlet field
    */
    @Override
    public java.lang.String getField_label_name() {
        return _qbPortletField.getField_label_name();
    }

    /**
    * Sets the field_label_name of this qb portlet field.
    *
    * @param field_label_name the field_label_name of this qb portlet field
    */
    @Override
    public void setField_label_name(java.lang.String field_label_name) {
        _qbPortletField.setField_label_name(field_label_name);
    }

    /**
    * Returns the portlet_id of this qb portlet field.
    *
    * @return the portlet_id of this qb portlet field
    */
    @Override
    public long getPortlet_id() {
        return _qbPortletField.getPortlet_id();
    }

    /**
    * Sets the portlet_id of this qb portlet field.
    *
    * @param portlet_id the portlet_id of this qb portlet field
    */
    @Override
    public void setPortlet_id(long portlet_id) {
        _qbPortletField.setPortlet_id(portlet_id);
    }

    /**
    * Returns the reference_portlet_id of this qb portlet field.
    *
    * @return the reference_portlet_id of this qb portlet field
    */
    @Override
    public long getReference_portlet_id() {
        return _qbPortletField.getReference_portlet_id();
    }

    /**
    * Sets the reference_portlet_id of this qb portlet field.
    *
    * @param reference_portlet_id the reference_portlet_id of this qb portlet field
    */
    @Override
    public void setReference_portlet_id(long reference_portlet_id) {
        _qbPortletField.setReference_portlet_id(reference_portlet_id);
    }

    @Override
    public boolean isNew() {
        return _qbPortletField.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _qbPortletField.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _qbPortletField.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _qbPortletField.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _qbPortletField.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _qbPortletField.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _qbPortletField.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _qbPortletField.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _qbPortletField.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _qbPortletField.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _qbPortletField.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new QbPortletFieldWrapper((QbPortletField) _qbPortletField.clone());
    }

    @Override
    public int compareTo(QbPortletField qbPortletField) {
        return _qbPortletField.compareTo(qbPortletField);
    }

    @Override
    public int hashCode() {
        return _qbPortletField.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<QbPortletField> toCacheModel() {
        return _qbPortletField.toCacheModel();
    }

    @Override
    public QbPortletField toEscapedModel() {
        return new QbPortletFieldWrapper(_qbPortletField.toEscapedModel());
    }

    @Override
    public QbPortletField toUnescapedModel() {
        return new QbPortletFieldWrapper(_qbPortletField.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _qbPortletField.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _qbPortletField.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _qbPortletField.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof QbPortletFieldWrapper)) {
            return false;
        }

        QbPortletFieldWrapper qbPortletFieldWrapper = (QbPortletFieldWrapper) obj;

        if (Validator.equals(_qbPortletField,
                    qbPortletFieldWrapper._qbPortletField)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public QbPortletField getWrappedQbPortletField() {
        return _qbPortletField;
    }

    @Override
    public QbPortletField getWrappedModel() {
        return _qbPortletField;
    }

    @Override
    public void resetOriginalValues() {
        _qbPortletField.resetOriginalValues();
    }
}
