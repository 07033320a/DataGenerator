package com.genpact.service.persistence;

import com.genpact.model.QbPortlet;

import com.genpact.service.QbPortletLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author 710008328
 * @generated
 */
public abstract class QbPortletActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public QbPortletActionableDynamicQuery() throws SystemException {
        setBaseLocalService(QbPortletLocalServiceUtil.getService());
        setClass(QbPortlet.class);

        setClassLoader(com.genpact.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("portlet_id");
    }
}
