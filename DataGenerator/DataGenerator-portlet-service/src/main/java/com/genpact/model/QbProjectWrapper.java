package com.genpact.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QbProject}.
 * </p>
 *
 * @author 710008328
 * @see QbProject
 * @generated
 */
public class QbProjectWrapper implements QbProject, ModelWrapper<QbProject> {
    private QbProject _qbProject;

    public QbProjectWrapper(QbProject qbProject) {
        _qbProject = qbProject;
    }

    @Override
    public Class<?> getModelClass() {
        return QbProject.class;
    }

    @Override
    public String getModelClassName() {
        return QbProject.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("project_id", getProject_id());
        attributes.put("project_name", getProject_name());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long project_id = (Long) attributes.get("project_id");

        if (project_id != null) {
            setProject_id(project_id);
        }

        String project_name = (String) attributes.get("project_name");

        if (project_name != null) {
            setProject_name(project_name);
        }
    }

    /**
    * Returns the primary key of this qb project.
    *
    * @return the primary key of this qb project
    */
    @Override
    public long getPrimaryKey() {
        return _qbProject.getPrimaryKey();
    }

    /**
    * Sets the primary key of this qb project.
    *
    * @param primaryKey the primary key of this qb project
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _qbProject.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the project_id of this qb project.
    *
    * @return the project_id of this qb project
    */
    @Override
    public long getProject_id() {
        return _qbProject.getProject_id();
    }

    /**
    * Sets the project_id of this qb project.
    *
    * @param project_id the project_id of this qb project
    */
    @Override
    public void setProject_id(long project_id) {
        _qbProject.setProject_id(project_id);
    }

    /**
    * Returns the project_name of this qb project.
    *
    * @return the project_name of this qb project
    */
    @Override
    public java.lang.String getProject_name() {
        return _qbProject.getProject_name();
    }

    /**
    * Sets the project_name of this qb project.
    *
    * @param project_name the project_name of this qb project
    */
    @Override
    public void setProject_name(java.lang.String project_name) {
        _qbProject.setProject_name(project_name);
    }

    @Override
    public boolean isNew() {
        return _qbProject.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _qbProject.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _qbProject.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _qbProject.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _qbProject.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _qbProject.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _qbProject.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _qbProject.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _qbProject.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _qbProject.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _qbProject.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new QbProjectWrapper((QbProject) _qbProject.clone());
    }

    @Override
    public int compareTo(QbProject qbProject) {
        return _qbProject.compareTo(qbProject);
    }

    @Override
    public int hashCode() {
        return _qbProject.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<QbProject> toCacheModel() {
        return _qbProject.toCacheModel();
    }

    @Override
    public QbProject toEscapedModel() {
        return new QbProjectWrapper(_qbProject.toEscapedModel());
    }

    @Override
    public QbProject toUnescapedModel() {
        return new QbProjectWrapper(_qbProject.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _qbProject.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _qbProject.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _qbProject.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof QbProjectWrapper)) {
            return false;
        }

        QbProjectWrapper qbProjectWrapper = (QbProjectWrapper) obj;

        if (Validator.equals(_qbProject, qbProjectWrapper._qbProject)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public QbProject getWrappedQbProject() {
        return _qbProject;
    }

    @Override
    public QbProject getWrappedModel() {
        return _qbProject;
    }

    @Override
    public void resetOriginalValues() {
        _qbProject.resetOriginalValues();
    }
}
