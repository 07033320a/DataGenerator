package com.genpact.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QbPortletLocalService}.
 *
 * @author 710008328
 * @see QbPortletLocalService
 * @generated
 */
public class QbPortletLocalServiceWrapper implements QbPortletLocalService,
    ServiceWrapper<QbPortletLocalService> {
    private QbPortletLocalService _qbPortletLocalService;

    public QbPortletLocalServiceWrapper(
        QbPortletLocalService qbPortletLocalService) {
        _qbPortletLocalService = qbPortletLocalService;
    }

    /**
    * Adds the qb portlet to the database. Also notifies the appropriate model listeners.
    *
    * @param qbPortlet the qb portlet
    * @return the qb portlet that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.QbPortlet addQbPortlet(
        com.genpact.model.QbPortlet qbPortlet)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _qbPortletLocalService.addQbPortlet(qbPortlet);
    }

    /**
    * Creates a new qb portlet with the primary key. Does not add the qb portlet to the database.
    *
    * @param portlet_id the primary key for the new qb portlet
    * @return the new qb portlet
    */
    @Override
    public com.genpact.model.QbPortlet createQbPortlet(long portlet_id) {
        return _qbPortletLocalService.createQbPortlet(portlet_id);
    }

    /**
    * Deletes the qb portlet with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet that was removed
    * @throws PortalException if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.QbPortlet deleteQbPortlet(long portlet_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _qbPortletLocalService.deleteQbPortlet(portlet_id);
    }

    /**
    * Deletes the qb portlet from the database. Also notifies the appropriate model listeners.
    *
    * @param qbPortlet the qb portlet
    * @return the qb portlet that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.QbPortlet deleteQbPortlet(
        com.genpact.model.QbPortlet qbPortlet)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _qbPortletLocalService.deleteQbPortlet(qbPortlet);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _qbPortletLocalService.dynamicQuery();
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
        return _qbPortletLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbPortletModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _qbPortletLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbPortletModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _qbPortletLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _qbPortletLocalService.dynamicQueryCount(dynamicQuery);
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
        return _qbPortletLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.genpact.model.QbPortlet fetchQbPortlet(long portlet_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _qbPortletLocalService.fetchQbPortlet(portlet_id);
    }

    /**
    * Returns the qb portlet with the primary key.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet
    * @throws PortalException if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.QbPortlet getQbPortlet(long portlet_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _qbPortletLocalService.getQbPortlet(portlet_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _qbPortletLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the qb portlets.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbPortletModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of qb portlets
    * @param end the upper bound of the range of qb portlets (not inclusive)
    * @return the range of qb portlets
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.genpact.model.QbPortlet> getQbPortlets(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _qbPortletLocalService.getQbPortlets(start, end);
    }

    /**
    * Returns the number of qb portlets.
    *
    * @return the number of qb portlets
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getQbPortletsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _qbPortletLocalService.getQbPortletsCount();
    }

    /**
    * Updates the qb portlet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param qbPortlet the qb portlet
    * @return the qb portlet that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.genpact.model.QbPortlet updateQbPortlet(
        com.genpact.model.QbPortlet qbPortlet)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _qbPortletLocalService.updateQbPortlet(qbPortlet);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _qbPortletLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _qbPortletLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _qbPortletLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public QbPortletLocalService getWrappedQbPortletLocalService() {
        return _qbPortletLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedQbPortletLocalService(
        QbPortletLocalService qbPortletLocalService) {
        _qbPortletLocalService = qbPortletLocalService;
    }

    @Override
    public QbPortletLocalService getWrappedService() {
        return _qbPortletLocalService;
    }

    @Override
    public void setWrappedService(QbPortletLocalService qbPortletLocalService) {
        _qbPortletLocalService = qbPortletLocalService;
    }
}
