package com.genpact.model;

import com.genpact.service.ClpSerializer;
import com.genpact.service.QbPortletLocalServiceUtil;

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


public class QbPortletClp extends BaseModelImpl<QbPortlet> implements QbPortlet {
    private long _portlet_id;
    private String _portlet_name;
    private String _portlet_label_name;
    private long _project_id;
    private BaseModel<?> _qbPortletRemoteModel;

    public QbPortletClp() {
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
    public long getPrimaryKey() {
        return _portlet_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPortlet_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _portlet_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getPortlet_id() {
        return _portlet_id;
    }

    @Override
    public void setPortlet_id(long portlet_id) {
        _portlet_id = portlet_id;

        if (_qbPortletRemoteModel != null) {
            try {
                Class<?> clazz = _qbPortletRemoteModel.getClass();

                Method method = clazz.getMethod("setPortlet_id", long.class);

                method.invoke(_qbPortletRemoteModel, portlet_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPortlet_name() {
        return _portlet_name;
    }

    @Override
    public void setPortlet_name(String portlet_name) {
        _portlet_name = portlet_name;

        if (_qbPortletRemoteModel != null) {
            try {
                Class<?> clazz = _qbPortletRemoteModel.getClass();

                Method method = clazz.getMethod("setPortlet_name", String.class);

                method.invoke(_qbPortletRemoteModel, portlet_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPortlet_label_name() {
        return _portlet_label_name;
    }

    @Override
    public void setPortlet_label_name(String portlet_label_name) {
        _portlet_label_name = portlet_label_name;

        if (_qbPortletRemoteModel != null) {
            try {
                Class<?> clazz = _qbPortletRemoteModel.getClass();

                Method method = clazz.getMethod("setPortlet_label_name",
                        String.class);

                method.invoke(_qbPortletRemoteModel, portlet_label_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getProject_id() {
        return _project_id;
    }

    @Override
    public void setProject_id(long project_id) {
        _project_id = project_id;

        if (_qbPortletRemoteModel != null) {
            try {
                Class<?> clazz = _qbPortletRemoteModel.getClass();

                Method method = clazz.getMethod("setProject_id", long.class);

                method.invoke(_qbPortletRemoteModel, project_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getQbPortletRemoteModel() {
        return _qbPortletRemoteModel;
    }

    public void setQbPortletRemoteModel(BaseModel<?> qbPortletRemoteModel) {
        _qbPortletRemoteModel = qbPortletRemoteModel;
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

        Class<?> remoteModelClass = _qbPortletRemoteModel.getClass();

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

        Object returnValue = method.invoke(_qbPortletRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            QbPortletLocalServiceUtil.addQbPortlet(this);
        } else {
            QbPortletLocalServiceUtil.updateQbPortlet(this);
        }
    }

    @Override
    public QbPortlet toEscapedModel() {
        return (QbPortlet) ProxyUtil.newProxyInstance(QbPortlet.class.getClassLoader(),
            new Class[] { QbPortlet.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        QbPortletClp clone = new QbPortletClp();

        clone.setPortlet_id(getPortlet_id());
        clone.setPortlet_name(getPortlet_name());
        clone.setPortlet_label_name(getPortlet_label_name());
        clone.setProject_id(getProject_id());

        return clone;
    }

    @Override
    public int compareTo(QbPortlet qbPortlet) {
        long primaryKey = qbPortlet.getPrimaryKey();

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

        if (!(obj instanceof QbPortletClp)) {
            return false;
        }

        QbPortletClp qbPortlet = (QbPortletClp) obj;

        long primaryKey = qbPortlet.getPrimaryKey();

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

        sb.append("{portlet_id=");
        sb.append(getPortlet_id());
        sb.append(", portlet_name=");
        sb.append(getPortlet_name());
        sb.append(", portlet_label_name=");
        sb.append(getPortlet_label_name());
        sb.append(", project_id=");
        sb.append(getProject_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.genpact.model.QbPortlet");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>portlet_id</column-name><column-value><![CDATA[");
        sb.append(getPortlet_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>portlet_name</column-name><column-value><![CDATA[");
        sb.append(getPortlet_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>portlet_label_name</column-name><column-value><![CDATA[");
        sb.append(getPortlet_label_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>project_id</column-name><column-value><![CDATA[");
        sb.append(getProject_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
