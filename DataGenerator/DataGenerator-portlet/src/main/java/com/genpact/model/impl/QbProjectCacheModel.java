package com.genpact.model.impl;

import com.genpact.model.QbProject;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QbProject in entity cache.
 *
 * @author 710008328
 * @see QbProject
 * @generated
 */
public class QbProjectCacheModel implements CacheModel<QbProject>,
    Externalizable {
    public long project_id;
    public String project_name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{project_id=");
        sb.append(project_id);
        sb.append(", project_name=");
        sb.append(project_name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public QbProject toEntityModel() {
        QbProjectImpl qbProjectImpl = new QbProjectImpl();

        qbProjectImpl.setProject_id(project_id);

        if (project_name == null) {
            qbProjectImpl.setProject_name(StringPool.BLANK);
        } else {
            qbProjectImpl.setProject_name(project_name);
        }

        qbProjectImpl.resetOriginalValues();

        return qbProjectImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        project_id = objectInput.readLong();
        project_name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(project_id);

        if (project_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(project_name);
        }
    }
}
