package com.genpact.model;

import com.genpact.service.ClpSerializer;
import com.genpact.service.QbProjectLocalServiceUtil;

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


public class QbProjectClp extends BaseModelImpl<QbProject> implements QbProject {
    private long _project_id;
    private String _project_name;
    private BaseModel<?> _qbProjectRemoteModel;

    public QbProjectClp() {
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
    public long getPrimaryKey() {
        return _project_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setProject_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _project_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getProject_id() {
        return _project_id;
    }

    @Override
    public void setProject_id(long project_id) {
        _project_id = project_id;

        if (_qbProjectRemoteModel != null) {
            try {
                Class<?> clazz = _qbProjectRemoteModel.getClass();

                Method method = clazz.getMethod("setProject_id", long.class);

                method.invoke(_qbProjectRemoteModel, project_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProject_name() {
        return _project_name;
    }

    @Override
    public void setProject_name(String project_name) {
        _project_name = project_name;

        if (_qbProjectRemoteModel != null) {
            try {
                Class<?> clazz = _qbProjectRemoteModel.getClass();

                Method method = clazz.getMethod("setProject_name", String.class);

                method.invoke(_qbProjectRemoteModel, project_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getQbProjectRemoteModel() {
        return _qbProjectRemoteModel;
    }

    public void setQbProjectRemoteModel(BaseModel<?> qbProjectRemoteModel) {
        _qbProjectRemoteModel = qbProjectRemoteModel;
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

        Class<?> remoteModelClass = _qbProjectRemoteModel.getClass();

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

        Object returnValue = method.invoke(_qbProjectRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            QbProjectLocalServiceUtil.addQbProject(this);
        } else {
            QbProjectLocalServiceUtil.updateQbProject(this);
        }
    }

    @Override
    public QbProject toEscapedModel() {
        return (QbProject) ProxyUtil.newProxyInstance(QbProject.class.getClassLoader(),
            new Class[] { QbProject.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        QbProjectClp clone = new QbProjectClp();

        clone.setProject_id(getProject_id());
        clone.setProject_name(getProject_name());

        return clone;
    }

    @Override
    public int compareTo(QbProject qbProject) {
        long primaryKey = qbProject.getPrimaryKey();

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

        if (!(obj instanceof QbProjectClp)) {
            return false;
        }

        QbProjectClp qbProject = (QbProjectClp) obj;

        long primaryKey = qbProject.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{project_id=");
        sb.append(getProject_id());
        sb.append(", project_name=");
        sb.append(getProject_name());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.genpact.model.QbProject");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>project_id</column-name><column-value><![CDATA[");
        sb.append(getProject_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>project_name</column-name><column-value><![CDATA[");
        sb.append(getProject_name());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
