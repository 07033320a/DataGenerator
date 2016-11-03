package com.genpact.model.impl;

import com.genpact.model.QbPortletField;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing QbPortletField in entity cache.
 *
 * @author 710008328
 * @see QbPortletField
 * @generated
 */
public class QbPortletFieldCacheModel implements CacheModel<QbPortletField>,
    Externalizable {
    public long field_id;
    public String field_name;
    public String field_label_name;
    public long portlet_id;
    public long reference_portlet_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{field_id=");
        sb.append(field_id);
        sb.append(", field_name=");
        sb.append(field_name);
        sb.append(", field_label_name=");
        sb.append(field_label_name);
        sb.append(", portlet_id=");
        sb.append(portlet_id);
        sb.append(", reference_portlet_id=");
        sb.append(reference_portlet_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public QbPortletField toEntityModel() {
        QbPortletFieldImpl qbPortletFieldImpl = new QbPortletFieldImpl();

        qbPortletFieldImpl.setField_id(field_id);

        if (field_name == null) {
            qbPortletFieldImpl.setField_name(StringPool.BLANK);
        } else {
            qbPortletFieldImpl.setField_name(field_name);
        }

        if (field_label_name == null) {
            qbPortletFieldImpl.setField_label_name(StringPool.BLANK);
        } else {
            qbPortletFieldImpl.setField_label_name(field_label_name);
        }

        qbPortletFieldImpl.setPortlet_id(portlet_id);
        qbPortletFieldImpl.setReference_portlet_id(reference_portlet_id);

        qbPortletFieldImpl.resetOriginalValues();

        return qbPortletFieldImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        field_id = objectInput.readLong();
        field_name = objectInput.readUTF();
        field_label_name = objectInput.readUTF();
        portlet_id = objectInput.readLong();
        reference_portlet_id = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(field_id);

        if (field_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(field_name);
        }

        if (field_label_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(field_label_name);
        }

        objectOutput.writeLong(portlet_id);
        objectOutput.writeLong(reference_portlet_id);
    }
}
