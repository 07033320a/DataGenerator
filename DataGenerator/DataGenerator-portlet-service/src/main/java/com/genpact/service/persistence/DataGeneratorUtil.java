package com.genpact.service.persistence;

import com.genpact.model.DataGenerator;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the data generator service. This utility wraps {@link DataGeneratorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see DataGeneratorPersistence
 * @see DataGeneratorPersistenceImpl
 * @generated
 */
public class DataGeneratorUtil {
    private static DataGeneratorPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(DataGenerator dataGenerator) {
        getPersistence().clearCache(dataGenerator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<DataGenerator> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<DataGenerator> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<DataGenerator> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static DataGenerator update(DataGenerator dataGenerator)
        throws SystemException {
        return getPersistence().update(dataGenerator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static DataGenerator update(DataGenerator dataGenerator,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(dataGenerator, serviceContext);
    }

    /**
    * Caches the data generator in the entity cache if it is enabled.
    *
    * @param dataGenerator the data generator
    */
    public static void cacheResult(
        com.genpact.model.DataGenerator dataGenerator) {
        getPersistence().cacheResult(dataGenerator);
    }

    /**
    * Caches the data generators in the entity cache if it is enabled.
    *
    * @param dataGenerators the data generators
    */
    public static void cacheResult(
        java.util.List<com.genpact.model.DataGenerator> dataGenerators) {
        getPersistence().cacheResult(dataGenerators);
    }

    /**
    * Creates a new data generator with the primary key. Does not add the data generator to the database.
    *
    * @param id the primary key for the new data generator
    * @return the new data generator
    */
    public static com.genpact.model.DataGenerator create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the data generator with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the data generator
    * @return the data generator that was removed
    * @throws com.genpact.NoSuchDataGeneratorException if a data generator with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.DataGenerator remove(long id)
        throws com.genpact.NoSuchDataGeneratorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.genpact.model.DataGenerator updateImpl(
        com.genpact.model.DataGenerator dataGenerator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(dataGenerator);
    }

    /**
    * Returns the data generator with the primary key or throws a {@link com.genpact.NoSuchDataGeneratorException} if it could not be found.
    *
    * @param id the primary key of the data generator
    * @return the data generator
    * @throws com.genpact.NoSuchDataGeneratorException if a data generator with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.DataGenerator findByPrimaryKey(long id)
        throws com.genpact.NoSuchDataGeneratorException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the data generator with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the data generator
    * @return the data generator, or <code>null</code> if a data generator with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.DataGenerator fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the data generators.
    *
    * @return the data generators
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.DataGenerator> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.genpact.model.DataGenerator> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the data generators.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.DataGeneratorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of data generators
    * @param end the upper bound of the range of data generators (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of data generators
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.DataGenerator> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the data generators from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of data generators.
    *
    * @return the number of data generators
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DataGeneratorPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DataGeneratorPersistence) PortletBeanLocatorUtil.locate(com.genpact.service.ClpSerializer.getServletContextName(),
                    DataGeneratorPersistence.class.getName());

            ReferenceRegistry.registerReference(DataGeneratorUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DataGeneratorPersistence persistence) {
    }
}
