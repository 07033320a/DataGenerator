package com.genpact.service.persistence;

import com.genpact.model.QbProject;

import com.genpact.service.QbProjectLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author 710008328
 * @generated
 */
public abstract class QbProjectActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public QbProjectActionableDynamicQuery() throws SystemException {
        setBaseLocalService(QbProjectLocalServiceUtil.getService());
        setClass(QbProject.class);

        setClassLoader(com.genpact.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("project_id");
    }
}
