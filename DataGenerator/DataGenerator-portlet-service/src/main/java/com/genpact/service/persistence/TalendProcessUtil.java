package com.genpact.service.persistence;

import com.genpact.model.TalendProcess;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the talend process service. This utility wraps {@link TalendProcessPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see TalendProcessPersistence
 * @see TalendProcessPersistenceImpl
 * @generated
 */
public class TalendProcessUtil {
    private static TalendProcessPersistence _persistence;

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
    public static void clearCache(TalendProcess talendProcess) {
        getPersistence().clearCache(talendProcess);
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
    public static List<TalendProcess> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<TalendProcess> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<TalendProcess> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static TalendProcess update(TalendProcess talendProcess)
        throws SystemException {
        return getPersistence().update(talendProcess);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static TalendProcess update(TalendProcess talendProcess,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(talendProcess, serviceContext);
    }

    /**
    * Caches the talend process in the entity cache if it is enabled.
    *
    * @param talendProcess the talend process
    */
    public static void cacheResult(
        com.genpact.model.TalendProcess talendProcess) {
        getPersistence().cacheResult(talendProcess);
    }

    /**
    * Caches the talend processes in the entity cache if it is enabled.
    *
    * @param talendProcesses the talend processes
    */
    public static void cacheResult(
        java.util.List<com.genpact.model.TalendProcess> talendProcesses) {
        getPersistence().cacheResult(talendProcesses);
    }

    /**
    * Creates a new talend process with the primary key. Does not add the talend process to the database.
    *
    * @param processId the primary key for the new talend process
    * @return the new talend process
    */
    public static com.genpact.model.TalendProcess create(long processId) {
        return getPersistence().create(processId);
    }

    /**
    * Removes the talend process with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param processId the primary key of the talend process
    * @return the talend process that was removed
    * @throws com.genpact.NoSuchTalendProcessException if a talend process with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.TalendProcess remove(long processId)
        throws com.genpact.NoSuchTalendProcessException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(processId);
    }

    public static com.genpact.model.TalendProcess updateImpl(
        com.genpact.model.TalendProcess talendProcess)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(talendProcess);
    }

    /**
    * Returns the talend process with the primary key or throws a {@link com.genpact.NoSuchTalendProcessException} if it could not be found.
    *
    * @param processId the primary key of the talend process
    * @return the talend process
    * @throws com.genpact.NoSuchTalendProcessException if a talend process with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.TalendProcess findByPrimaryKey(
        long processId)
        throws com.genpact.NoSuchTalendProcessException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(processId);
    }

    /**
    * Returns the talend process with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param processId the primary key of the talend process
    * @return the talend process, or <code>null</code> if a talend process with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.TalendProcess fetchByPrimaryKey(
        long processId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(processId);
    }

    /**
    * Returns all the talend processes.
    *
    * @return the talend processes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.TalendProcess> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.genpact.model.TalendProcess> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the talend processes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.TalendProcessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of talend processes
    * @param end the upper bound of the range of talend processes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of talend processes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.TalendProcess> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the talend processes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of talend processes.
    *
    * @return the number of talend processes
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TalendProcessPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TalendProcessPersistence) PortletBeanLocatorUtil.locate(com.genpact.service.ClpSerializer.getServletContextName(),
                    TalendProcessPersistence.class.getName());

            ReferenceRegistry.registerReference(TalendProcessUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TalendProcessPersistence persistence) {
    }
}
