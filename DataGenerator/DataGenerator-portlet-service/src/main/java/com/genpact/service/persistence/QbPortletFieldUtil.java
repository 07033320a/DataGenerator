package com.genpact.service.persistence;

import com.genpact.model.QbPortletField;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the qb portlet field service. This utility wraps {@link QbPortletFieldPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see QbPortletFieldPersistence
 * @see QbPortletFieldPersistenceImpl
 * @generated
 */
public class QbPortletFieldUtil {
    private static QbPortletFieldPersistence _persistence;

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
    public static void clearCache(QbPortletField qbPortletField) {
        getPersistence().clearCache(qbPortletField);
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
    public static List<QbPortletField> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<QbPortletField> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<QbPortletField> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static QbPortletField update(QbPortletField qbPortletField)
        throws SystemException {
        return getPersistence().update(qbPortletField);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static QbPortletField update(QbPortletField qbPortletField,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(qbPortletField, serviceContext);
    }

    /**
    * Caches the qb portlet field in the entity cache if it is enabled.
    *
    * @param qbPortletField the qb portlet field
    */
    public static void cacheResult(
        com.genpact.model.QbPortletField qbPortletField) {
        getPersistence().cacheResult(qbPortletField);
    }

    /**
    * Caches the qb portlet fields in the entity cache if it is enabled.
    *
    * @param qbPortletFields the qb portlet fields
    */
    public static void cacheResult(
        java.util.List<com.genpact.model.QbPortletField> qbPortletFields) {
        getPersistence().cacheResult(qbPortletFields);
    }

    /**
    * Creates a new qb portlet field with the primary key. Does not add the qb portlet field to the database.
    *
    * @param field_id the primary key for the new qb portlet field
    * @return the new qb portlet field
    */
    public static com.genpact.model.QbPortletField create(long field_id) {
        return getPersistence().create(field_id);
    }

    /**
    * Removes the qb portlet field with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param field_id the primary key of the qb portlet field
    * @return the qb portlet field that was removed
    * @throws com.genpact.NoSuchQbPortletFieldException if a qb portlet field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortletField remove(long field_id)
        throws com.genpact.NoSuchQbPortletFieldException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(field_id);
    }

    public static com.genpact.model.QbPortletField updateImpl(
        com.genpact.model.QbPortletField qbPortletField)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(qbPortletField);
    }

    /**
    * Returns the qb portlet field with the primary key or throws a {@link com.genpact.NoSuchQbPortletFieldException} if it could not be found.
    *
    * @param field_id the primary key of the qb portlet field
    * @return the qb portlet field
    * @throws com.genpact.NoSuchQbPortletFieldException if a qb portlet field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortletField findByPrimaryKey(
        long field_id)
        throws com.genpact.NoSuchQbPortletFieldException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(field_id);
    }

    /**
    * Returns the qb portlet field with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param field_id the primary key of the qb portlet field
    * @return the qb portlet field, or <code>null</code> if a qb portlet field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.genpact.model.QbPortletField fetchByPrimaryKey(
        long field_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(field_id);
    }

    /**
    * Returns all the qb portlet fields.
    *
    * @return the qb portlet fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.QbPortletField> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.genpact.model.QbPortletField> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the qb portlet fields.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.genpact.model.impl.QbPortletFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of qb portlet fields
    * @param end the upper bound of the range of qb portlet fields (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of qb portlet fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.genpact.model.QbPortletField> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the qb portlet fields from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of qb portlet fields.
    *
    * @return the number of qb portlet fields
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static QbPortletFieldPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (QbPortletFieldPersistence) PortletBeanLocatorUtil.locate(com.genpact.service.ClpSerializer.getServletContextName(),
                    QbPortletFieldPersistence.class.getName());

            ReferenceRegistry.registerReference(QbPortletFieldUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(QbPortletFieldPersistence persistence) {
    }
}
