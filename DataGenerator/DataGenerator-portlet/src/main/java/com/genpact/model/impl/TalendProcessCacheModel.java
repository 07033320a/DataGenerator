package com.genpact.model.impl;

import com.genpact.model.TalendProcess;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TalendProcess in entity cache.
 *
 * @author 710008328
 * @see TalendProcess
 * @generated
 */
public class TalendProcessCacheModel implements CacheModel<TalendProcess>,
    Externalizable {
    public long processId;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String version;
    public String className;
    public long fileEntryId;
    public String description;
    public String context;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{processId=");
        sb.append(processId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", name=");
        sb.append(name);
        sb.append(", version=");
        sb.append(version);
        sb.append(", className=");
        sb.append(className);
        sb.append(", fileEntryId=");
        sb.append(fileEntryId);
        sb.append(", description=");
        sb.append(description);
        sb.append(", context=");
        sb.append(context);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public TalendProcess toEntityModel() {
        TalendProcessImpl talendProcessImpl = new TalendProcessImpl();

        talendProcessImpl.setProcessId(processId);

        if (createDate == Long.MIN_VALUE) {
            talendProcessImpl.setCreateDate(null);
        } else {
            talendProcessImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            talendProcessImpl.setModifiedDate(null);
        } else {
            talendProcessImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            talendProcessImpl.setName(StringPool.BLANK);
        } else {
            talendProcessImpl.setName(name);
        }

        if (version == null) {
            talendProcessImpl.setVersion(StringPool.BLANK);
        } else {
            talendProcessImpl.setVersion(version);
        }

        if (className == null) {
            talendProcessImpl.setClassName(StringPool.BLANK);
        } else {
            talendProcessImpl.setClassName(className);
        }

        talendProcessImpl.setFileEntryId(fileEntryId);

        if (description == null) {
            talendProcessImpl.setDescription(StringPool.BLANK);
        } else {
            talendProcessImpl.setDescription(description);
        }

        if (context == null) {
            talendProcessImpl.setContext(StringPool.BLANK);
        } else {
            talendProcessImpl.setContext(context);
        }

        talendProcessImpl.resetOriginalValues();

        return talendProcessImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        processId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        version = objectInput.readUTF();
        className = objectInput.readUTF();
        fileEntryId = objectInput.readLong();
        description = objectInput.readUTF();
        context = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(processId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (version == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(version);
        }

        if (className == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(className);
        }

        objectOutput.writeLong(fileEntryId);

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        if (context == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(context);
        }
    }
}
