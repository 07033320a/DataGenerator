package com.genpact.model.impl;

import com.genpact.model.DataGenerator;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DataGenerator in entity cache.
 *
 * @author 710008328
 * @see DataGenerator
 * @generated
 */
public class DataGeneratorCacheModel implements CacheModel<DataGenerator>,
    Externalizable {
    public long id;
    public String data;
    public String type;
    public long createDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(id);
        sb.append(", data=");
        sb.append(data);
        sb.append(", type=");
        sb.append(type);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public DataGenerator toEntityModel() {
        DataGeneratorImpl dataGeneratorImpl = new DataGeneratorImpl();

        dataGeneratorImpl.setId(id);

        if (data == null) {
            dataGeneratorImpl.setData(StringPool.BLANK);
        } else {
            dataGeneratorImpl.setData(data);
        }

        if (type == null) {
            dataGeneratorImpl.setType(StringPool.BLANK);
        } else {
            dataGeneratorImpl.setType(type);
        }

        if (createDate == Long.MIN_VALUE) {
            dataGeneratorImpl.setCreateDate(null);
        } else {
            dataGeneratorImpl.setCreateDate(new Date(createDate));
        }

        dataGeneratorImpl.resetOriginalValues();

        return dataGeneratorImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        data = objectInput.readUTF();
        type = objectInput.readUTF();
        createDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (data == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(data);
        }

        if (type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(type);
        }

        objectOutput.writeLong(createDate);
    }
}
