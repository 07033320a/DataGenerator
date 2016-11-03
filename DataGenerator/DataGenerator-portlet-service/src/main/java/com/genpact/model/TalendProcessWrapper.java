package com.genpact.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TalendProcess}.
 * </p>
 *
 * @author 710008328
 * @see TalendProcess
 * @generated
 */
public class TalendProcessWrapper implements TalendProcess,
    ModelWrapper<TalendProcess> {
    private TalendProcess _talendProcess;

    public TalendProcessWrapper(TalendProcess talendProcess) {
        _talendProcess = talendProcess;
    }

    @Override
    public Class<?> getModelClass() {
        return TalendProcess.class;
    }

    @Override
    public String getModelClassName() {
        return TalendProcess.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("processId", getProcessId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("version", getVersion());
        attributes.put("className", getClassName());
        attributes.put("fileEntryId", getFileEntryId());
        attributes.put("description", getDescription());
        attributes.put("context", getContext());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long processId = (Long) attributes.get("processId");

        if (processId != null) {
            setProcessId(processId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String version = (String) attributes.get("version");

        if (version != null) {
            setVersion(version);
        }

        String className = (String) attributes.get("className");

        if (className != null) {
            setClassName(className);
        }

        Long fileEntryId = (Long) attributes.get("fileEntryId");

        if (fileEntryId != null) {
            setFileEntryId(fileEntryId);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String context = (String) attributes.get("context");

        if (context != null) {
            setContext(context);
        }
    }

    /**
    * Returns the primary key of this talend process.
    *
    * @return the primary key of this talend process
    */
    @Override
    public long getPrimaryKey() {
        return _talendProcess.getPrimaryKey();
    }

    /**
    * Sets the primary key of this talend process.
    *
    * @param primaryKey the primary key of this talend process
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _talendProcess.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the process ID of this talend process.
    *
    * @return the process ID of this talend process
    */
    @Override
    public long getProcessId() {
        return _talendProcess.getProcessId();
    }

    /**
    * Sets the process ID of this talend process.
    *
    * @param processId the process ID of this talend process
    */
    @Override
    public void setProcessId(long processId) {
        _talendProcess.setProcessId(processId);
    }

    /**
    * Returns the create date of this talend process.
    *
    * @return the create date of this talend process
    */
    @Override
    public java.util.Date getCreateDate() {
        return _talendProcess.getCreateDate();
    }

    /**
    * Sets the create date of this talend process.
    *
    * @param createDate the create date of this talend process
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _talendProcess.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this talend process.
    *
    * @return the modified date of this talend process
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _talendProcess.getModifiedDate();
    }

    /**
    * Sets the modified date of this talend process.
    *
    * @param modifiedDate the modified date of this talend process
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _talendProcess.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this talend process.
    *
    * @return the name of this talend process
    */
    @Override
    public java.lang.String getName() {
        return _talendProcess.getName();
    }

    /**
    * Sets the name of this talend process.
    *
    * @param name the name of this talend process
    */
    @Override
    public void setName(java.lang.String name) {
        _talendProcess.setName(name);
    }

    /**
    * Returns the version of this talend process.
    *
    * @return the version of this talend process
    */
    @Override
    public java.lang.String getVersion() {
        return _talendProcess.getVersion();
    }

    /**
    * Sets the version of this talend process.
    *
    * @param version the version of this talend process
    */
    @Override
    public void setVersion(java.lang.String version) {
        _talendProcess.setVersion(version);
    }

    /**
    * Returns the class name of this talend process.
    *
    * @return the class name of this talend process
    */
    @Override
    public java.lang.String getClassName() {
        return _talendProcess.getClassName();
    }

    /**
    * Sets the class name of this talend process.
    *
    * @param className the class name of this talend process
    */
    @Override
    public void setClassName(java.lang.String className) {
        _talendProcess.setClassName(className);
    }

    /**
    * Returns the file entry ID of this talend process.
    *
    * @return the file entry ID of this talend process
    */
    @Override
    public long getFileEntryId() {
        return _talendProcess.getFileEntryId();
    }

    /**
    * Sets the file entry ID of this talend process.
    *
    * @param fileEntryId the file entry ID of this talend process
    */
    @Override
    public void setFileEntryId(long fileEntryId) {
        _talendProcess.setFileEntryId(fileEntryId);
    }

    /**
    * Returns the description of this talend process.
    *
    * @return the description of this talend process
    */
    @Override
    public java.lang.String getDescription() {
        return _talendProcess.getDescription();
    }

    /**
    * Sets the description of this talend process.
    *
    * @param description the description of this talend process
    */
    @Override
    public void setDescription(java.lang.String description) {
        _talendProcess.setDescription(description);
    }

    /**
    * Returns the context of this talend process.
    *
    * @return the context of this talend process
    */
    @Override
    public java.lang.String getContext() {
        return _talendProcess.getContext();
    }

    /**
    * Sets the context of this talend process.
    *
    * @param context the context of this talend process
    */
    @Override
    public void setContext(java.lang.String context) {
        _talendProcess.setContext(context);
    }

    @Override
    public boolean isNew() {
        return _talendProcess.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _talendProcess.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _talendProcess.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _talendProcess.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _talendProcess.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _talendProcess.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _talendProcess.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _talendProcess.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _talendProcess.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _talendProcess.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _talendProcess.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TalendProcessWrapper((TalendProcess) _talendProcess.clone());
    }

    @Override
    public int compareTo(TalendProcess talendProcess) {
        return _talendProcess.compareTo(talendProcess);
    }

    @Override
    public int hashCode() {
        return _talendProcess.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<TalendProcess> toCacheModel() {
        return _talendProcess.toCacheModel();
    }

    @Override
    public TalendProcess toEscapedModel() {
        return new TalendProcessWrapper(_talendProcess.toEscapedModel());
    }

    @Override
    public TalendProcess toUnescapedModel() {
        return new TalendProcessWrapper(_talendProcess.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _talendProcess.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _talendProcess.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _talendProcess.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TalendProcessWrapper)) {
            return false;
        }

        TalendProcessWrapper talendProcessWrapper = (TalendProcessWrapper) obj;

        if (Validator.equals(_talendProcess, talendProcessWrapper._talendProcess)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public TalendProcess getWrappedTalendProcess() {
        return _talendProcess;
    }

    @Override
    public TalendProcess getWrappedModel() {
        return _talendProcess;
    }

    @Override
    public void resetOriginalValues() {
        _talendProcess.resetOriginalValues();
    }
}
