package com.genpact.model;

import com.genpact.service.ClpSerializer;
import com.genpact.service.DataGeneratorLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class DataGeneratorClp extends BaseModelImpl<DataGenerator>
    implements DataGenerator {
    private long _id;
    private String _data;
    private String _type;
    private Date _createDate;
    private BaseModel<?> _dataGeneratorRemoteModel;

    public DataGeneratorClp() {
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
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_dataGeneratorRemoteModel != null) {
            try {
                Class<?> clazz = _dataGeneratorRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_dataGeneratorRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getData() {
        return _data;
    }

    @Override
    public void setData(String data) {
        _data = data;

        if (_dataGeneratorRemoteModel != null) {
            try {
                Class<?> clazz = _dataGeneratorRemoteModel.getClass();

                Method method = clazz.getMethod("setData", String.class);

                method.invoke(_dataGeneratorRemoteModel, data);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getType() {
        return _type;
    }

    @Override
    public void setType(String type) {
        _type = type;

        if (_dataGeneratorRemoteModel != null) {
            try {
                Class<?> clazz = _dataGeneratorRemoteModel.getClass();

                Method method = clazz.getMethod("setType", String.class);

                method.invoke(_dataGeneratorRemoteModel, type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_dataGeneratorRemoteModel != null) {
            try {
                Class<?> clazz = _dataGeneratorRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_dataGeneratorRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDataGeneratorRemoteModel() {
        return _dataGeneratorRemoteModel;
    }

    public void setDataGeneratorRemoteModel(
        BaseModel<?> dataGeneratorRemoteModel) {
        _dataGeneratorRemoteModel = dataGeneratorRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _dataGeneratorRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_dataGeneratorRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DataGeneratorLocalServiceUtil.addDataGenerator(this);
        } else {
            DataGeneratorLocalServiceUtil.updateDataGenerator(this);
        }
    }

    @Override
    public DataGenerator toEscapedModel() {
        return (DataGenerator) ProxyUtil.newProxyInstance(DataGenerator.class.getClassLoader(),
            new Class[] { DataGenerator.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DataGeneratorClp clone = new DataGeneratorClp();

        clone.setId(getId());
        clone.setData(getData());
        clone.setType(getType());
        clone.setCreateDate(getCreateDate());

        return clone;
    }

    @Override
    public int compareTo(DataGenerator dataGenerator) {
        long primaryKey = dataGenerator.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DataGeneratorClp)) {
            return false;
        }

        DataGeneratorClp dataGenerator = (DataGeneratorClp) obj;

        long primaryKey = dataGenerator.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", data=");
        sb.append(getData());
        sb.append(", type=");
        sb.append(getType());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.genpact.model.DataGenerator");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>data</column-name><column-value><![CDATA[");
        sb.append(getData());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
