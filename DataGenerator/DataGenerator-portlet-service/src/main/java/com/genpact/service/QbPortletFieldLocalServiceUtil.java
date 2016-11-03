package com.genpact.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for QbPortletField. This utility wraps
 * {@link com.genpact.service.impl.QbPortletFieldLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author 710008328
 * @see QbPortletFieldLocalService
 * @see com.genpact.service.base.QbPortletFieldLocalServiceBaseImpl
 * @see com.genpact.service.impl.QbPortletFieldLocalServiceImpl
 * @generated
 */
public class QbPortletFieldLocalServiceUtil {
    private static QbPortletFieldLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.genpact.service.impl.QbPortletFieldLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the qb portlet field to the database. Also notifies the appropriate model listeners.
    *
    * @param qbPortletField the qb portlet field
    * @return the qb portlet field that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortletField addQbPortletField(
        com.genpact.model.QbPortletField qbPortletField)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addQbPortletField(qbPortletField);
    }

    /**
    * Creates a new qb portlet field with the primary key. Does not add the qb portlet field to the database.
    *
    * @param field_id the primary key for the new qb portlet field
    * @return the new qb portlet field
    */
    public static com.genpact.model.QbPortletField createQbPortletField(
        long field_id) {
        return getService().createQbPortletField(field_id);
    }

    /**
    * Deletes the qb portlet field with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param field_id the primary key of the qb portlet field
    * @return the qb portlet field that was removed
    * @throws PortalException if a qb portlet field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortletField deleteQbPortletField(
        long field_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteQbPortletField(field_id);
    }

    /**
    * Deletes the qb portlet field from the database. Also notifies the appropriate model listeners.
    *
    * @param qbPortletField the qb portlet field
    * @return the qb portlet field that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortletField deleteQbPortletField(
        com.genpact.model.QbPortletField qbPortletField)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteQbPortletField(qbPortletField);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbPortletFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbPortletFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.genpact.model.QbPortletField fetchQbPortletField(
        long field_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchQbPortletField(field_id);
    }

    /**
    * Returns the qb portlet field with the primary key.
    *
    * @param field_id the primary key of the qb portlet field
    * @return the qb portlet field
    * @throws PortalException if a qb portlet field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortletField getQbPortletField(
        long field_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getQbPortletField(field_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the qb portlet fields.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbPortletFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of qb portlet fields
    * @param end the upper bound of the range of qb portlet fields (not inclusive)
    * @return the range of qb portlet fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.QbPortletField> getQbPortletFields(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getQbPortletFields(start, end);
    }

    /**
    * Returns the number of qb portlet fields.
    *
    * @return the number of qb portlet fields
    * @throws SystemException if a system exception occurred
    */
    public static int getQbPortletFieldsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getQbPortletFieldsCount();
    }

    /**
    * Updates the qb portlet field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param qbPortletField the qb portlet field
    * @return the qb portlet field that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortletField updateQbPortletField(
        com.genpact.model.QbPortletField qbPortletField)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateQbPortletField(qbPortletField);
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

    public static QbPortletFieldLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    QbPortletFieldLocalService.class.getName());

            if (invokableLocalService instanceof QbPortletFieldLocalService) {
                _service = (QbPortletFieldLocalService) invokableLocalService;
            } else {
                _service = new QbPortletFieldLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(QbPortletFieldLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(QbPortletFieldLocalService service) {
    }
}
