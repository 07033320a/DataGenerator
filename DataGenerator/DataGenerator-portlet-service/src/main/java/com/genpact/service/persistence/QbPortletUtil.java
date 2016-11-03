package com.genpact.service.persistence;

import com.genpact.model.QbPortlet;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the qb portlet service. This utility wraps {@link QbPortletPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see QbPortletPersistence
 * @see QbPortletPersistenceImpl
 * @generated
 */
public class QbPortletUtil {
    private static QbPortletPersistence _persistence;

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
    public static void clearCache(QbPortlet qbPortlet) {
        getPersistence().clearCache(qbPortlet);
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
    public static List<QbPortlet> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<QbPortlet> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<QbPortlet> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static QbPortlet update(QbPortlet qbPortlet)
        throws SystemException {
        return getPersistence().update(qbPortlet);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static QbPortlet update(QbPortlet qbPortlet,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(qbPortlet, serviceContext);
    }

    /**
    * Caches the qb portlet in the entity cache if it is enabled.
    *
    * @param qbPortlet the qb portlet
    */
    public static void cacheResult(com.genpact.model.QbPortlet qbPortlet) {
        getPersistence().cacheResult(qbPortlet);
    }

    /**
    * Caches the qb portlets in the entity cache if it is enabled.
    *
    * @param qbPortlets the qb portlets
    */
    public static void cacheResult(
        java.util.List<com.genpact.model.QbPortlet> qbPortlets) {
        getPersistence().cacheResult(qbPortlets);
    }

    /**
    * Creates a new qb portlet with the primary key. Does not add the qb portlet to the database.
    *
    * @param portlet_id the primary key for the new qb portlet
    * @return the new qb portlet
    */
    public static com.genpact.model.QbPortlet create(long portlet_id) {
        return getPersistence().create(portlet_id);
    }

    /**
    * Removes the qb portlet with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet that was removed
    * @throws com.genpact.NoSuchQbPortletException if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortlet remove(long portlet_id)
        throws com.genpact.NoSuchQbPortletException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(portlet_id);
    }

    public static com.genpact.model.QbPortlet updateImpl(
        com.genpact.model.QbPortlet qbPortlet)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(qbPortlet);
    }

    /**
    * Returns the qb portlet with the primary key or throws a {@link com.genpact.NoSuchQbPortletException} if it could not be found.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet
    * @throws com.genpact.NoSuchQbPortletException if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortlet findByPrimaryKey(long portlet_id)
        throws com.genpact.NoSuchQbPortletException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(portlet_id);
    }

    /**
    * Returns the qb portlet with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet, or <code>null</code> if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortlet fetchByPrimaryKey(long portlet_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(portlet_id);
    }

    /**
    * Returns all the qb portlets.
    *
    * @return the qb portlets
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.QbPortlet> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.genpact.model.QbPortlet> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the qb portlets.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbPortletModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of qb portlets
    * @param end the upper bound of the range of qb portlets (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of qb portlets
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.QbPortlet> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the qb portlets from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of qb portlets.
    *
    * @return the number of qb portlets
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static QbPortletPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (QbPortletPersistence) PortletBeanLocatorUtil.locate(com.genpact.service.ClpSerializer.getServletContextName(),
                    QbPortletPersistence.class.getName());

            ReferenceRegistry.registerReference(QbPortletUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(QbPortletPersistence persistence) {
    }
}
