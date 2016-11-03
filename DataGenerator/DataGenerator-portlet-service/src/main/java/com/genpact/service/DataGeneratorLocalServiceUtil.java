package com.genpact.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DataGenerator. This utility wraps
 * {@link com.genpact.service.impl.DataGeneratorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author 710008328
 * @see DataGeneratorLocalService
 * @see com.genpact.service.base.DataGeneratorLocalServiceBaseImpl
 * @see com.genpact.service.impl.DataGeneratorLocalServiceImpl
 * @generated
 */
public class DataGeneratorLocalServiceUtil {
    private static DataGeneratorLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.genpact.service.impl.DataGeneratorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the data generator to the database. Also notifies the appropriate model listeners.
    *
    * @param dataGenerator the data generator
    * @return the data generator that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.DataGenerator addDataGenerator(
        com.genpact.model.DataGenerator dataGenerator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addDataGenerator(dataGenerator);
    }

    /**
    * Creates a new data generator with the primary key. Does not add the data generator to the database.
    *
    * @param id the primary key for the new data generator
    * @return the new data generator
    */
    public static com.genpact.model.DataGenerator createDataGenerator(long id) {
        return getService().createDataGenerator(id);
    }

    /**
    * Deletes the data generator with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the data generator
    * @return the data generator that was removed
    * @throws PortalException if a data generator with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.DataGenerator deleteDataGenerator(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDataGenerator(id);
    }

    /**
    * Deletes the data generator from the database. Also notifies the appropriate model listeners.
    *
    * @param dataGenerator the data generator
    * @return the data generator that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.DataGenerator deleteDataGenerator(
        com.genpact.model.DataGenerator dataGenerator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDataGenerator(dataGenerator);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.DataGeneratorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.DataGeneratorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.genpact.model.DataGenerator fetchDataGenerator(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchDataGenerator(id);
    }

    /**
    * Returns the data generator with the primary key.
    *
    * @param id the primary key of the data generator
    * @return the data generator
    * @throws PortalException if a data generator with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.DataGenerator getDataGenerator(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getDataGenerator(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the data generators.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.DataGeneratorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of data generators
    * @param end the upper bound of the range of data generators (not inclusive)
    * @return the range of data generators
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.DataGenerator> getDataGenerators(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDataGenerators(start, end);
    }

    /**
    * Returns the number of data generators.
    *
    * @return the number of data generators
    * @throws SystemException if a system exception occurred
    */
    public static int getDataGeneratorsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDataGeneratorsCount();
    }

    /**
    * Updates the data generator in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param dataGenerator the data generator
    * @return the data generator that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.DataGenerator updateDataGenerator(
        com.genpact.model.DataGenerator dataGenerator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateDataGenerator(dataGenerator);
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

    public static DataGeneratorLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    DataGeneratorLocalService.class.getName());

            if (invokableLocalService instanceof DataGeneratorLocalService) {
                _service = (DataGeneratorLocalService) invokableLocalService;
            } else {
                _service = new DataGeneratorLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(DataGeneratorLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(DataGeneratorLocalService service) {
    }
}
