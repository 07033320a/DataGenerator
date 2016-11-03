package com.genpact.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TalendProcessLocalService}.
 *
 * @author 710008328
 * @see TalendProcessLocalService
 * @generated
 */
public class TalendProcessLocalServiceWrapper
    implements TalendProcessLocalService,
        ServiceWrapper<TalendProcessLocalService> {
    private TalendProcessLocalService _talendProcessLocalService;

    public TalendProcessLocalServiceWrapper(
        TalendProcessLocalService talendProcessLocalService) {
        _talendProcessLocalService = talendProcessLocalService;
    }

    /**
    * Adds the talend process to the database. Also notifies the appropriate model listeners.
    *
    * @param talendProcess the talend process
    * @return the talend process that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.TalendProcess addTalendProcess(
        com.genpact.model.TalendProcess talendProcess)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.addTalendProcess(talendProcess);
    }

    /**
    * Creates a new talend process with the primary key. Does not add the talend process to the database.
    *
    * @param processId the primary key for the new talend process
    * @return the new talend process
    */
    @Override
    public com.genpact.model.TalendProcess createTalendProcess(long processId) {
        return _talendProcessLocalService.createTalendProcess(processId);
    }

    /**
    * Deletes the talend process with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param processId the primary key of the talend process
    * @return the talend process that was removed
    * @throws PortalException if a talend process with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.TalendProcess deleteTalendProcess(long processId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.deleteTalendProcess(processId);
    }

    /**
    * Deletes the talend process from the database. Also notifies the appropriate model listeners.
    *
    * @param talendProcess the talend process
    * @return the talend process that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.TalendProcess deleteTalendProcess(
        com.genpact.model.TalendProcess talendProcess)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.deleteTalendProcess(talendProcess);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _talendProcessLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.TalendProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.TalendProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.genpact.model.TalendProcess fetchTalendProcess(long processId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.fetchTalendProcess(processId);
    }

    /**
    * Returns the talend process with the primary key.
    *
    * @param processId the primary key of the talend process
    * @return the talend process
    * @throws PortalException if a talend process with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.TalendProcess getTalendProcess(long processId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.getTalendProcess(processId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the talend processes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.TalendProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of talend processes
    * @param end the upper bound of the range of talend processes (not inclusive)
    * @return the range of talend processes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.genpact.model.TalendProcess> getTalendProcesses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.getTalendProcesses(start, end);
    }

    /**
    * Returns the number of talend processes.
    *
    * @return the number of talend processes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTalendProcessesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.getTalendProcessesCount();
    }

    /**
    * Updates the talend process in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param talendProcess the talend process
    * @return the talend process that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.TalendProcess updateTalendProcess(
        com.genpact.model.TalendProcess talendProcess)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _talendProcessLocalService.updateTalendProcess(talendProcess);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _talendProcessLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _talendProcessLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _talendProcessLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TalendProcessLocalService getWrappedTalendProcessLocalService() {
        return _talendProcessLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTalendProcessLocalService(
        TalendProcessLocalService talendProcessLocalService) {
        _talendProcessLocalService = talendProcessLocalService;
    }

    @Override
    public TalendProcessLocalService getWrappedService() {
        return _talendProcessLocalService;
    }

    @Override
    public void setWrappedService(
        TalendProcessLocalService talendProcessLocalService) {
        _talendProcessLocalService = talendProcessLocalService;
    }
}
