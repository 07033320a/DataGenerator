package com.genpact.service.persistence;

import com.genpact.model.QbPortletField;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the qb portlet field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see QbPortletFieldPersistenceImpl
 * @see QbPortletFieldUtil
 * @generated
 */
public interface QbPortletFieldPersistence extends BasePersistence<QbPortletField> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link QbPortletFieldUtil} to access the qb portlet field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the qb portlet field in the entity cache if it is enabled.
    *
    * @param qbPortletField the qb portlet field
    */
    public void cacheResult(com.genpact.model.QbPortletField qbPortletField);

    /**
    * Caches the qb portlet fields in the entity cache if it is enabled.
    *
    * @param qbPortletFields the qb portlet fields
    */
    public void cacheResult(
        java.util.List<com.genpact.model.QbPortletField> qbPortletFields);

    /**
    * Creates a new qb portlet field with the primary key. Does not add the qb portlet field to the database.
    *
    * @param field_id the primary key for the new qb portlet field
    * @return the new qb portlet field
    */
    public com.genpact.model.QbPortletField create(long field_id);

    /**
    * Removes the qb portlet field with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param field_id the primary key of the qb portlet field
    * @return the qb portlet field that was removed
    * @throws com.genpact.NoSuchQbPortletFieldException if a qb portlet field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.QbPortletField remove(long field_id)
        throws com.genpact.NoSuchQbPortletFieldException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.genpact.model.QbPortletField updateImpl(
        com.genpact.model.QbPortletField qbPortletField)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the qb portlet field with the primary key or throws a {@link com.genpact.NoSuchQbPortletFieldException} if it could not be found.
    *
    * @param field_id the primary key of the qb portlet field
    * @return the qb portlet field
    * @throws com.genpact.NoSuchQbPortletFieldException if a qb portlet field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.QbPortletField findByPrimaryKey(long field_id)
        throws com.genpact.NoSuchQbPortletFieldException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the qb portlet field with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param field_id the primary key of the qb portlet field
    * @return the qb portlet field, or <code>null</code> if a qb portlet field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.QbPortletField fetchByPrimaryKey(long field_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the qb portlet fields.
    *
    * @return the qb portlet fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.genpact.model.QbPortletField> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.QbPortletField> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.QbPortletField> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the qb portlet fields from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of qb portlet fields.
    *
    * @return the number of qb portlet fields
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
