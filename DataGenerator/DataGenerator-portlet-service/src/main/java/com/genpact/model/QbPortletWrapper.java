package com.genpact.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QbPortlet}.
 * </p>
 *
 * @author 710008328
 * @see QbPortlet
 * @generated
 */
public class QbPortletWrapper implements QbPortlet, ModelWrapper<QbPortlet> {
    private QbPortlet _qbPortlet;

    public QbPortletWrapper(QbPortlet qbPortlet) {
        _qbPortlet = qbPortlet;
    }

    @Override
    public Class<?> getModelClass() {
        return QbPortlet.class;
    }

    @Override
    public String getModelClassName() {
        return QbPortlet.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("portlet_id", getPortlet_id());
        attributes.put("portlet_name", getPortlet_name());
        attributes.put("portlet_label_name", getPortlet_label_name());
        attributes.put("project_id", getProject_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long portlet_id = (Long) attributes.get("portlet_id");

        if (portlet_id != null) {
            setPortlet_id(portlet_id);
        }

        String portlet_name = (String) attributes.get("portlet_name");

        if (portlet_name != null) {
            setPortlet_name(portlet_name);
        }

        String portlet_label_name = (String) attributes.get(
                "portlet_label_name");

        if (portlet_label_name != null) {
            setPortlet_label_name(portlet_label_name);
        }

        Long project_id = (Long) attributes.get("project_id");

        if (project_id != null) {
            setProject_id(project_id);
        }
    }

    /**
    * Returns the primary key of this qb portlet.
    *
    * @return the primary key of this qb portlet
    */
    @Override
    public long getPrimaryKey() {
        return _qbPortlet.getPrimaryKey();
    }

    /**
    * Sets the primary key of this qb portlet.
    *
    * @param primaryKey the primary key of this qb portlet
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _qbPortlet.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the portlet_id of this qb portlet.
    *
    * @return the portlet_id of this qb portlet
    */
    @Override
    public long getPortlet_id() {
        return _qbPortlet.getPortlet_id();
    }

    /**
    * Sets the portlet_id of this qb portlet.
    *
    * @param portlet_id the portlet_id of this qb portlet
    */
    @Override
    public void setPortlet_id(long portlet_id) {
        _qbPortlet.setPortlet_id(portlet_id);
    }

    /**
    * Returns the portlet_name of this qb portlet.
    *
    * @return the portlet_name of this qb portlet
    */
    @Override
    public java.lang.String getPortlet_name() {
        return _qbPortlet.getPortlet_name();
    }

    /**
    * Sets the portlet_name of this qb portlet.
    *
    * @param portlet_name the portlet_name of this qb portlet
    */
    @Override
    public void setPortlet_name(java.lang.String portlet_name) {
        _qbPortlet.setPortlet_name(portlet_name);
    }

    /**
    * Returns the portlet_label_name of this qb portlet.
    *
    * @return the portlet_label_name of this qb portlet
    */
    @Override
    public java.lang.String getPortlet_label_name() {
        return _qbPortlet.getPortlet_label_name();
    }

    /**
    * Sets the portlet_label_name of this qb portlet.
    *
    * @param portlet_label_name the portlet_label_name of this qb portlet
    */
    @Override
    public void setPortlet_label_name(java.lang.String portlet_label_name) {
        _qbPortlet.setPortlet_label_name(portlet_label_name);
    }

    /**
    * Returns the project_id of this qb portlet.
    *
    * @return the project_id of this qb portlet
    */
    @Override
    public long getProject_id() {
        return _qbPortlet.getProject_id();
    }

    /**
    * Sets the project_id of this qb portlet.
    *
    * @param project_id the project_id of this qb portlet
    */
    @Override
    public void setProject_id(long project_id) {
        _qbPortlet.setProject_id(project_id);
    }

    @Override
    public boolean isNew() {
        return _qbPortlet.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _qbPortlet.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _qbPortlet.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _qbPortlet.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _qbPortlet.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _qbPortlet.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _qbPortlet.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _qbPortlet.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _qbPortlet.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _qbPortlet.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _qbPortlet.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new QbPortletWrapper((QbPortlet) _qbPortlet.clone());
    }

    @Override
    public int compareTo(QbPortlet qbPortlet) {
        return _qbPortlet.compareTo(qbPortlet);
    }

    @Override
    public int hashCode() {
        return _qbPortlet.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<QbPortlet> toCacheModel() {
        return _qbPortlet.toCacheModel();
    }

    @Override
    public QbPortlet toEscapedModel() {
        return new QbPortletWrapper(_qbPortlet.toEscapedModel());
    }

    @Override
    public QbPortlet toUnescapedModel() {
        return new QbPortletWrapper(_qbPortlet.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _qbPortlet.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _qbPortlet.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _qbPortlet.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof QbPortletWrapper)) {
            return false;
        }

        QbPortletWrapper qbPortletWrapper = (QbPortletWrapper) obj;

        if (Validator.equals(_qbPortlet, qbPortletWrapper._qbPortlet)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public QbPortlet getWrappedQbPortlet() {
        return _qbPortlet;
    }

    @Override
    public QbPortlet getWrappedModel() {
        return _qbPortlet;
    }

    @Override
    public void resetOriginalValues() {
        _qbPortlet.resetOriginalValues();
    }
}
