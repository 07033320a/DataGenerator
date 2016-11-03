package com.genpact.service.persistence;

import com.genpact.model.QbPortletField;

import com.genpact.service.QbPortletFieldLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author 710008328
 * @generated
 */
public abstract class QbPortletFieldActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public QbPortletFieldActionableDynamicQuery() throws SystemException {
        setBaseLocalService(QbPortletFieldLocalServiceUtil.getService());
        setClass(QbPortletField.class);

        setClassLoader(com.genpact.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("field_id");
    }
}
