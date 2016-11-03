package com.genpact.service.persistence;

import com.genpact.model.DataGenerator;

import com.genpact.service.DataGeneratorLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author 710008328
 * @generated
 */
public abstract class DataGeneratorActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DataGeneratorActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DataGeneratorLocalServiceUtil.getService());
        setClass(DataGenerator.class);

        setClassLoader(com.genpact.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
