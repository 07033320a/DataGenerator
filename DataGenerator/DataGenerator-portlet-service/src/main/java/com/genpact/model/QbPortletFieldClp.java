package com.genpact.model;

import com.genpact.service.ClpSerializer;
import com.genpact.service.QbPortletFieldLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class QbPortletFieldClp extends BaseModelImpl<QbPortletField>
    implements QbPortletField {
    private long _field_id;
    private String _field_name;
    private String _field_label_name;
    private long _portlet_id;
    private long _reference_portlet_id;
    private BaseModel<?> _qbPortletFieldRemoteModel;

    public QbPortletFieldClp() {
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
    public long getPrimaryKey() {
        return _field_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setField_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _field_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getField_id() {
        return _field_id;
    }

    @Override
    public void setField_id(long field_id) {
        _field_id = field_id;

        if (_qbPortletFieldRemoteModel != null) {
            try {
                Class<?> clazz = _qbPortletFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setField_id", long.class);

                method.invoke(_qbPortletFieldRemoteModel, field_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getField_name() {
        return _field_name;
    }

    @Override
    public void setField_name(String field_name) {
        _field_name = field_name;

        if (_qbPortletFieldRemoteModel != null) {
            try {
                Class<?> clazz = _qbPortletFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setField_name", String.class);

                method.invoke(_qbPortletFieldRemoteModel, field_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getField_label_name() {
        return _field_label_name;
    }

    @Override
    public void setField_label_name(String field_label_name) {
        _field_label_name = field_label_name;

        if (_qbPortletFieldRemoteModel != null) {
            try {
                Class<?> clazz = _qbPortletFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setField_label_name",
                        String.class);

                method.invoke(_qbPortletFieldRemoteModel, field_label_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPortlet_id() {
        return _portlet_id;
    }

    @Override
    public void setPortlet_id(long portlet_id) {
        _portlet_id = portlet_id;

        if (_qbPortletFieldRemoteModel != null) {
            try {
                Class<?> clazz = _qbPortletFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setPortlet_id", long.class);

                method.invoke(_qbPortletFieldRemoteModel, portlet_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getReference_portlet_id() {
        return _reference_portlet_id;
    }

    @Override
    public void setReference_portlet_id(long reference_portlet_id) {
        _reference_portlet_id = reference_portlet_id;

        if (_qbPortletFieldRemoteModel != null) {
            try {
                Class<?> clazz = _qbPortletFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setReference_portlet_id",
                        long.class);

                method.invoke(_qbPortletFieldRemoteModel, reference_portlet_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getQbPortletFieldRemoteModel() {
        return _qbPortletFieldRemoteModel;
    }

    public void setQbPortletFieldRemoteModel(
        BaseModel<?> qbPortletFieldRemoteModel) {
        _qbPortletFieldRemoteModel = qbPortletFieldRemoteModel;
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

        Class<?> remoteModelClass = _qbPortletFieldRemoteModel.getClass();

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

        Object returnValue = method.invoke(_qbPortletFieldRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            QbPortletFieldLocalServiceUtil.addQbPortletField(this);
        } else {
            QbPortletFieldLocalServiceUtil.updateQbPortletField(this);
        }
    }

    @Override
    public QbPortletField toEscapedModel() {
        return (QbPortletField) ProxyUtil.newProxyInstance(QbPortletField.class.getClassLoader(),
            new Class[] { QbPortletField.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        QbPortletFieldClp clone = new QbPortletFieldClp();

        clone.setField_id(getField_id());
        clone.setField_name(getField_name());
        clone.setField_label_name(getField_label_name());
        clone.setPortlet_id(getPortlet_id());
        clone.setReference_portlet_id(getReference_portlet_id());

        return clone;
    }

    @Override
    public int compareTo(QbPortletField qbPortletField) {
        long primaryKey = qbPortletField.getPrimaryKey();

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

        if (!(obj instanceof QbPortletFieldClp)) {
            return false;
        }

        QbPortletFieldClp qbPortletField = (QbPortletFieldClp) obj;

        long primaryKey = qbPortletField.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{field_id=");
        sb.append(getField_id());
        sb.append(", field_name=");
        sb.append(getField_name());
        sb.append(", field_label_name=");
        sb.append(getField_label_name());
        sb.append(", portlet_id=");
        sb.append(getPortlet_id());
        sb.append(", reference_portlet_id=");
        sb.append(getReference_portlet_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.genpact.model.QbPortletField");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>field_id</column-name><column-value><![CDATA[");
        sb.append(getField_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>field_name</column-name><column-value><![CDATA[");
        sb.append(getField_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>field_label_name</column-name><column-value><![CDATA[");
        sb.append(getField_label_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>portlet_id</column-name><column-value><![CDATA[");
        sb.append(getPortlet_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>reference_portlet_id</column-name><column-value><![CDATA[");
        sb.append(getReference_portlet_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
