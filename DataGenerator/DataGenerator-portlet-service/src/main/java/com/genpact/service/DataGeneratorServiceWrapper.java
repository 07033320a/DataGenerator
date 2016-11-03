package com.genpact.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DataGeneratorService}.
 *
 * @author 710008328
 * @see DataGeneratorService
 * @generated
 */
public class DataGeneratorServiceWrapper implements DataGeneratorService,
    ServiceWrapper<DataGeneratorService> {
    private DataGeneratorService _dataGeneratorService;

    public DataGeneratorServiceWrapper(
        DataGeneratorService dataGeneratorService) {
        _dataGeneratorService = dataGeneratorService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _dataGeneratorService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _dataGeneratorService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _dataGeneratorService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DataGeneratorService getWrappedDataGeneratorService() {
        return _dataGeneratorService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDataGeneratorService(
        DataGeneratorService dataGeneratorService) {
        _dataGeneratorService = dataGeneratorService;
    }

    @Override
    public DataGeneratorService getWrappedService() {
        return _dataGeneratorService;
    }

    @Override
    public void setWrappedService(DataGeneratorService dataGeneratorService) {
        _dataGeneratorService = dataGeneratorService;
    }
}
