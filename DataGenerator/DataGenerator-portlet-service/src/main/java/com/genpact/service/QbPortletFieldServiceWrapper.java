package com.genpact.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QbPortletFieldService}.
 *
 * @author 710008328
 * @see QbPortletFieldService
 * @generated
 */
public class QbPortletFieldServiceWrapper implements QbPortletFieldService,
    ServiceWrapper<QbPortletFieldService> {
    private QbPortletFieldService _qbPortletFieldService;

    public QbPortletFieldServiceWrapper(
        QbPortletFieldService qbPortletFieldService) {
        _qbPortletFieldService = qbPortletFieldService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _qbPortletFieldService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _qbPortletFieldService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _qbPortletFieldService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public QbPortletFieldService getWrappedQbPortletFieldService() {
        return _qbPortletFieldService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedQbPortletFieldService(
        QbPortletFieldService qbPortletFieldService) {
        _qbPortletFieldService = qbPortletFieldService;
    }

    @Override
    public QbPortletFieldService getWrappedService() {
        return _qbPortletFieldService;
    }

    @Override
    public void setWrappedService(QbPortletFieldService qbPortletFieldService) {
        _qbPortletFieldService = qbPortletFieldService;
    }
}
