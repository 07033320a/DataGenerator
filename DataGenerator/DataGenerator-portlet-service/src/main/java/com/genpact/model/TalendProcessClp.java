package com.genpact.model;

import com.genpact.service.ClpSerializer;
import com.genpact.service.TalendProcessLocalServiceUtil;

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


public class TalendProcessClp extends BaseModelImpl<TalendProcess>
    implements TalendProcess {
    private long _processId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _version;
    private String _className;
    private long _fileEntryId;
    private String _description;
    private String _context;
    private BaseModel<?> _talendProcessRemoteModel;

    public TalendProcessClp() {
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
    public long getPrimaryKey() {
        return _processId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setProcessId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _processId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getProcessId() {
        return _processId;
    }

    @Override
    public void setProcessId(long processId) {
        _processId = processId;

        if (_talendProcessRemoteModel != null) {
            try {
                Class<?> clazz = _talendProcessRemoteModel.getClass();

                Method method = clazz.getMethod("setProcessId", long.class);

                method.invoke(_talendProcessRemoteModel, processId);
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

        if (_talendProcessRemoteModel != null) {
            try {
                Class<?> clazz = _talendProcessRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_talendProcessRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_talendProcessRemoteModel != null) {
            try {
                Class<?> clazz = _talendProcessRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_talendProcessRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_talendProcessRemoteModel != null) {
            try {
                Class<?> clazz = _talendProcessRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_talendProcessRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVersion() {
        return _version;
    }

    @Override
    public void setVersion(String version) {
        _version = version;

        if (_talendProcessRemoteModel != null) {
            try {
                Class<?> clazz = _talendProcessRemoteModel.getClass();

                Method method = clazz.getMethod("setVersion", String.class);

                method.invoke(_talendProcessRemoteModel, version);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getClassName() {
        return _className;
    }

    @Override
    public void setClassName(String className) {
        _className = className;

        if (_talendProcessRemoteModel != null) {
            try {
                Class<?> clazz = _talendProcessRemoteModel.getClass();

                Method method = clazz.getMethod("setClassName", String.class);

                method.invoke(_talendProcessRemoteModel, className);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFileEntryId() {
        return _fileEntryId;
    }

    @Override
    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;

        if (_talendProcessRemoteModel != null) {
            try {
                Class<?> clazz = _talendProcessRemoteModel.getClass();

                Method method = clazz.getMethod("setFileEntryId", long.class);

                method.invoke(_talendProcessRemoteModel, fileEntryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_talendProcessRemoteModel != null) {
            try {
                Class<?> clazz = _talendProcessRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_talendProcessRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getContext() {
        return _context;
    }

    @Override
    public void setContext(String context) {
        _context = context;

        if (_talendProcessRemoteModel != null) {
            try {
                Class<?> clazz = _talendProcessRemoteModel.getClass();

                Method method = clazz.getMethod("setContext", String.class);

                method.invoke(_talendProcessRemoteModel, context);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getTalendProcessRemoteModel() {
        return _talendProcessRemoteModel;
    }

    public void setTalendProcessRemoteModel(
        BaseModel<?> talendProcessRemoteModel) {
        _talendProcessRemoteModel = talendProcessRemoteModel;
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

        Class<?> remoteModelClass = _talendProcessRemoteModel.getClass();

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

        Object returnValue = method.invoke(_talendProcessRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TalendProcessLocalServiceUtil.addTalendProcess(this);
        } else {
            TalendProcessLocalServiceUtil.updateTalendProcess(this);
        }
    }

    @Override
    public TalendProcess toEscapedModel() {
        return (TalendProcess) ProxyUtil.newProxyInstance(TalendProcess.class.getClassLoader(),
            new Class[] { TalendProcess.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        TalendProcessClp clone = new TalendProcessClp();

        clone.setProcessId(getProcessId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setName(getName());
        clone.setVersion(getVersion());
        clone.setClassName(getClassName());
        clone.setFileEntryId(getFileEntryId());
        clone.setDescription(getDescription());
        clone.setContext(getContext());

        return clone;
    }

    @Override
    public int compareTo(TalendProcess talendProcess) {
        long primaryKey = talendProcess.getPrimaryKey();

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

        if (!(obj instanceof TalendProcessClp)) {
            return false;
        }

        TalendProcessClp talendProcess = (TalendProcessClp) obj;

        long primaryKey = talendProcess.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{processId=");
        sb.append(getProcessId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", version=");
        sb.append(getVersion());
        sb.append(", className=");
        sb.append(getClassName());
        sb.append(", fileEntryId=");
        sb.append(getFileEntryId());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", context=");
        sb.append(getContext());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.genpact.model.TalendProcess");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>processId</column-name><column-value><![CDATA[");
        sb.append(getProcessId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>version</column-name><column-value><![CDATA[");
        sb.append(getVersion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>className</column-name><column-value><![CDATA[");
        sb.append(getClassName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
        sb.append(getFileEntryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>context</column-name><column-value><![CDATA[");
        sb.append(getContext());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
