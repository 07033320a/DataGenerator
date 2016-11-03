package com.genpact.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QbProjectService}.
 *
 * @author 710008328
 * @see QbProjectService
 * @generated
 */
public class QbProjectServiceWrapper implements QbProjectService,
    ServiceWrapper<QbProjectService> {
    private QbProjectService _qbProjectService;

    public QbProjectServiceWrapper(QbProjectService qbProjectService) {
        _qbProjectService = qbProjectService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _qbProjectService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _qbProjectService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _qbProjectService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public QbProjectService getWrappedQbProjectService() {
        return _qbProjectService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedQbProjectService(QbProjectService qbProjectService) {
        _qbProjectService = qbProjectService;
    }

    @Override
    public QbProjectService getWrappedService() {
        return _qbProjectService;
    }

    @Override
    public void setWrappedService(QbProjectService qbProjectService) {
        _qbProjectService = qbProjectService;
    }
}
