package com.genpact.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DataGenerator}.
 * </p>
 *
 * @author 710008328
 * @see DataGenerator
 * @generated
 */
public class DataGeneratorWrapper implements DataGenerator,
    ModelWrapper<DataGenerator> {
    private DataGenerator _dataGenerator;

    public DataGeneratorWrapper(DataGenerator dataGenerator) {
        _dataGenerator = dataGenerator;
    }

    @Override
    public Class<?> getModelClass() {
        return DataGenerator.class;
    }

    @Override
    public String getModelClassName() {
        return DataGenerator.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("data", getData());
        attributes.put("type", getType());
        attributes.put("createDate", getCreateDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String data = (String) attributes.get("data");

        if (data != null) {
            setData(data);
        }

        String type = (String) attributes.get("type");

        if (type != null) {
            setType(type);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }
    }

    /**
    * Returns the primary key of this data generator.
    *
    * @return the primary key of this data generator
    */
    @Override
    public long getPrimaryKey() {
        return _dataGenerator.getPrimaryKey();
    }

    /**
    * Sets the primary key of this data generator.
    *
    * @param primaryKey the primary key of this data generator
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _dataGenerator.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this data generator.
    *
    * @return the ID of this data generator
    */
    @Override
    public long getId() {
        return _dataGenerator.getId();
    }

    /**
    * Sets the ID of this data generator.
    *
    * @param id the ID of this data generator
    */
    @Override
    public void setId(long id) {
        _dataGenerator.setId(id);
    }

    /**
    * Returns the data of this data generator.
    *
    * @return the data of this data generator
    */
    @Override
    public java.lang.String getData() {
        return _dataGenerator.getData();
    }

    /**
    * Sets the data of this data generator.
    *
    * @param data the data of this data generator
    */
    @Override
    public void setData(java.lang.String data) {
        _dataGenerator.setData(data);
    }

    /**
    * Returns the type of this data generator.
    *
    * @return the type of this data generator
    */
    @Override
    public java.lang.String getType() {
        return _dataGenerator.getType();
    }

    /**
    * Sets the type of this data generator.
    *
    * @param type the type of this data generator
    */
    @Override
    public void setType(java.lang.String type) {
        _dataGenerator.setType(type);
    }

    /**
    * Returns the create date of this data generator.
    *
    * @return the create date of this data generator
    */
    @Override
    public java.util.Date getCreateDate() {
        return _dataGenerator.getCreateDate();
    }

    /**
    * Sets the create date of this data generator.
    *
    * @param createDate the create date of this data generator
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _dataGenerator.setCreateDate(createDate);
    }

    @Override
    public boolean isNew() {
        return _dataGenerator.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _dataGenerator.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _dataGenerator.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _dataGenerator.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _dataGenerator.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _dataGenerator.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _dataGenerator.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _dataGenerator.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _dataGenerator.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _dataGenerator.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _dataGenerator.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DataGeneratorWrapper((DataGenerator) _dataGenerator.clone());
    }

    @Override
    public int compareTo(DataGenerator dataGenerator) {
        return _dataGenerator.compareTo(dataGenerator);
    }

    @Override
    public int hashCode() {
        return _dataGenerator.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<DataGenerator> toCacheModel() {
        return _dataGenerator.toCacheModel();
    }

    @Override
    public DataGenerator toEscapedModel() {
        return new DataGeneratorWrapper(_dataGenerator.toEscapedModel());
    }

    @Override
    public DataGenerator toUnescapedModel() {
        return new DataGeneratorWrapper(_dataGenerator.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _dataGenerator.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _dataGenerator.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _dataGenerator.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DataGeneratorWrapper)) {
            return false;
        }

        DataGeneratorWrapper dataGeneratorWrapper = (DataGeneratorWrapper) obj;

        if (Validator.equals(_dataGenerator, dataGeneratorWrapper._dataGenerator)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DataGenerator getWrappedDataGenerator() {
        return _dataGenerator;
    }

    @Override
    public DataGenerator getWrappedModel() {
        return _dataGenerator;
    }

    @Override
    public void resetOriginalValues() {
        _dataGenerator.resetOriginalValues();
    }
}
