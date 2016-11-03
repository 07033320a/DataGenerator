package com.genpact.model.impl;

import com.genpact.model.QbPortlet;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QbPortlet in entity cache.
 *
 * @author 710008328
 * @see QbPortlet
 * @generated
 */
public class QbPortletCacheModel implements CacheModel<QbPortlet>,
    Externalizable {
    public long portlet_id;
    public String portlet_name;
    public String portlet_label_name;
    public long project_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{portlet_id=");
        sb.append(portlet_id);
        sb.append(", portlet_name=");
        sb.append(portlet_name);
        sb.append(", portlet_label_name=");
        sb.append(portlet_label_name);
        sb.append(", project_id=");
        sb.append(project_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public QbPortlet toEntityModel() {
        QbPortletImpl qbPortletImpl = new QbPortletImpl();

        qbPortletImpl.setPortlet_id(portlet_id);

        if (portlet_name == null) {
            qbPortletImpl.setPortlet_name(StringPool.BLANK);
        } else {
            qbPortletImpl.setPortlet_name(portlet_name);
        }

        if (portlet_label_name == null) {
            qbPortletImpl.setPortlet_label_name(StringPool.BLANK);
        } else {
            qbPortletImpl.setPortlet_label_name(portlet_label_name);
        }

        qbPortletImpl.setProject_id(project_id);

        qbPortletImpl.resetOriginalValues();

        return qbPortletImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        portlet_id = objectInput.readLong();
        portlet_name = objectInput.readUTF();
        portlet_label_name = objectInput.readUTF();
        project_id = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(portlet_id);

        if (portlet_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(portlet_name);
        }

        if (portlet_label_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(portlet_label_name);
        }

        objectOutput.writeLong(project_id);
    }
}
