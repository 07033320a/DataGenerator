package com.genpact.service.persistence;

import com.genpact.model.QbProject;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the qb project service. This utility wraps {@link QbProjectPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see QbProjectPersistence
 * @see QbProjectPersistenceImpl
 * @generated
 */
public class QbProjectUtil {
    private static QbProjectPersistence _persistence;

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
    public static void clearCache(QbProject qbProject) {
        getPersistence().clearCache(qbProject);
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
    public static List<QbProject> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<QbProject> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<QbProject> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static QbProject update(QbProject qbProject)
        throws SystemException {
        return getPersistence().update(qbProject);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static QbProject update(QbProject qbProject,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(qbProject, serviceContext);
    }

    /**
    * Caches the qb project in the entity cache if it is enabled.
    *
    * @param qbProject the qb project
    */
    public static void cacheResult(com.genpact.model.QbProject qbProject) {
        getPersistence().cacheResult(qbProject);
    }

    /**
    * Caches the qb projects in the entity cache if it is enabled.
    *
    * @param qbProjects the qb projects
    */
    public static void cacheResult(
        java.util.List<com.genpact.model.QbProject> qbProjects) {
        getPersistence().cacheResult(qbProjects);
    }

    /**
    * Creates a new qb project with the primary key. Does not add the qb project to the database.
    *
    * @param project_id the primary key for the new qb project
    * @return the new qb project
    */
    public static com.genpact.model.QbProject create(long project_id) {
        return getPersistence().create(project_id);
    }

    /**
    * Removes the qb project with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param project_id the primary key of the qb project
    * @return the qb project that was removed
    * @throws com.genpact.NoSuchQbProjectException if a qb project with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbProject remove(long project_id)
        throws com.genpact.NoSuchQbProjectException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(project_id);
    }

    public static com.genpact.model.QbProject updateImpl(
        com.genpact.model.QbProject qbProject)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(qbProject);
    }

    /**
    * Returns the qb project with the primary key or throws a {@link com.genpact.NoSuchQbProjectException} if it could not be found.
    *
    * @param project_id the primary key of the qb project
    * @return the qb project
    * @throws com.genpact.NoSuchQbProjectException if a qb project with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbProject findByPrimaryKey(long project_id)
        throws com.genpact.NoSuchQbProjectException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(project_id);
    }

    /**
    * Returns the qb project with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param project_id the primary key of the qb project
    * @return the qb project, or <code>null</code> if a qb project with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbProject fetchByPrimaryKey(long project_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(project_id);
    }

    /**
    * Returns all the qb projects.
    *
    * @return the qb projects
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.QbProject> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the qb projects.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of qb projects
    * @param end the upper bound of the range of qb projects (not inclusive)
    * @return the range of qb projects
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.QbProject> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the qb projects.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbProjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of qb projects
    * @param end the upper bound of the range of qb projects (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of qb projects
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.QbProject> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the qb projects from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of qb projects.
    *
    * @return the number of qb projects
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static QbProjectPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (QbProjectPersistence) PortletBeanLocatorUtil.locate(com.genpact.service.ClpSerializer.getServletContextName(),
                    QbProjectPersistence.class.getName());

            ReferenceRegistry.registerReference(QbProjectUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(QbProjectPersistence persistence) {
    }
}
