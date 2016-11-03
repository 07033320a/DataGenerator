package com.genpact.service.persistence;

import com.genpact.model.QbPortlet;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the qb portlet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see QbPortletPersistenceImpl
 * @see QbPortletUtil
 * @generated
 */
public interface QbPortletPersistence extends BasePersistence<QbPortlet> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link QbPortletUtil} to access the qb portlet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the qb portlet in the entity cache if it is enabled.
    *
    * @param qbPortlet the qb portlet
    */
    public void cacheResult(com.genpact.model.QbPortlet qbPortlet);

    /**
    * Caches the qb portlets in the entity cache if it is enabled.
    *
    * @param qbPortlets the qb portlets
    */
    public void cacheResult(
        java.util.List<com.genpact.model.QbPortlet> qbPortlets);

    /**
    * Creates a new qb portlet with the primary key. Does not add the qb portlet to the database.
    *
    * @param portlet_id the primary key for the new qb portlet
    * @return the new qb portlet
    */
    public com.genpact.model.QbPortlet create(long portlet_id);

    /**
    * Removes the qb portlet with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet that was removed
    * @throws com.genpact.NoSuchQbPortletException if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.QbPortlet remove(long portlet_id)
        throws com.genpact.NoSuchQbPortletException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.genpact.model.QbPortlet updateImpl(
        com.genpact.model.QbPortlet qbPortlet)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the qb portlet with the primary key or throws a {@link com.genpact.NoSuchQbPortletException} if it could not be found.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet
    * @throws com.genpact.NoSuchQbPortletException if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.QbPortlet findByPrimaryKey(long portlet_id)
        throws com.genpact.NoSuchQbPortletException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the qb portlet with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param portlet_id the primary key of the qb portlet
    * @return the qb portlet, or <code>null</code> if a qb portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.QbPortlet fetchByPrimaryKey(long portlet_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the qb portlets.
    *
    * @return the qb portlets
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.genpact.model.QbPortlet> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.QbPortlet> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.QbPortlet> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the qb portlets from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of qb portlets.
    *
    * @return the number of qb portlets
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
