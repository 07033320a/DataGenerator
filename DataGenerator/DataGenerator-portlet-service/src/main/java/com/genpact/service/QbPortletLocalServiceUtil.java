package com.genpact.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for QbPortlet. This utility wraps
 * {@link com.genpact.service.impl.QbPortletLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author 710008328
 * @see QbPortletLocalService
 * @see com.genpact.service.base.QbPortletLocalServiceBaseImpl
 * @see com.genpact.service.impl.QbPortletLocalServiceImpl
 * @generated
 */
public class QbPortletLocalServiceUtil {
    private static QbPortletLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.genpact.service.impl.QbPortletLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the qb portlet to the database. Also notifies the appropriate model listeners.
    *
    * @param qbPortlet the qb portlet
    * @return the qb portlet that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortlet addQbPortlet(
        com.genpact.model.QbPortlet qbPortlet)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addQbPortlet(qbPortlet);
    }

    /**
    * Creates a new qb portlet with the primary key. Does not add the qb portlet to the database.
    *
    * @param portlet_id the primary key for the new qb portlet
    * @return the new qb portlet
    */
    public static com.genpact.model.QbPortlet createQbPortlet(long portlet_id) {
        return getService().createQbPortlet(portlet_id);
    }

    /**
    * Deletes the qb portlet with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet that was removed
    * @throws PortalException if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortlet deleteQbPortlet(long portlet_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteQbPortlet(portlet_id);
    }

    /**
    * Deletes the qb portlet from the database. Also notifies the appropriate model listeners.
    *
    * @param qbPortlet the qb portlet
    * @return the qb portlet that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortlet deleteQbPortlet(
        com.genpact.model.QbPortlet qbPortlet)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteQbPortlet(qbPortlet);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.genpact.model.QbPortlet fetchQbPortlet(long portlet_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchQbPortlet(portlet_id);
    }

    /**
    * Returns the qb portlet with the primary key.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet
    * @throws PortalException if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortlet getQbPortlet(long portlet_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getQbPortlet(portlet_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.genpact.model.QbPortlet> getQbPortlets(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getQbPortlets(start, end);
    }

    /**
    * Returns the number of qb portlets.
    *
    * @return the number of qb portlets
    * @throws SystemException if a system exception occurred
    */
    public static int getQbPortletsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getQbPortletsCount();
    }

    /**
    * Updates the qb portlet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param qbPortlet the qb portlet
    * @return the qb portlet that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortlet updateQbPortlet(
        com.genpact.model.QbPortlet qbPortlet)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateQbPortlet(qbPortlet);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static QbPortletLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    QbPortletLocalService.class.getName());

            if (invokableLocalService instanceof QbPortletLocalService) {
                _service = (QbPortletLocalService) invokableLocalService;
            } else {
                _service = new QbPortletLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(QbPortletLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(QbPortletLocalService service) {
    }
}
