package com.genpact.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QbPortletService}.
 *
 * @author 710008328
 * @see QbPortletService
 * @generated
 */
public class QbPortletServiceWrapper implements QbPortletService,
    ServiceWrapper<QbPortletService> {
    private QbPortletService _qbPortletService;

    public QbPortletServiceWrapper(QbPortletService qbPortletService) {
        _qbPortletService = qbPortletService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _qbPortletService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _qbPortletService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _qbPortletService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public QbPortletService getWrappedQbPortletService() {
        return _qbPortletService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedQbPortletService(QbPortletService qbPortletService) {
        _qbPortletService = qbPortletService;
    }

    @Override
    public QbPortletService getWrappedService() {
        return _qbPortletService;
    }

    @Override
    public void setWrappedService(QbPortletService qbPortletService) {
        _qbPortletService = qbPortletService;
    }
}
