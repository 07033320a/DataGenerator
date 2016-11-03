package com.genpact.service.persistence;

import com.genpact.model.TalendProcess;

import com.genpact.service.TalendProcessLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author 710008328
 * @generated
 */
public abstract class TalendProcessActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TalendProcessActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TalendProcessLocalServiceUtil.getService());
        setClass(TalendProcess.class);

        setClassLoader(com.genpact.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("processId");
    }
}
