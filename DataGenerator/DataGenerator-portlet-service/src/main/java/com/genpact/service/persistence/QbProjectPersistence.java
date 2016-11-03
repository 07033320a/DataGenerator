package com.genpact.service.persistence;

import com.genpact.model.QbProject;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the qb project service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see QbProjectPersistenceImpl
 * @see QbProjectUtil
 * @generated
 */
public interface QbProjectPersistence extends BasePersistence<QbProject> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link QbProjectUtil} to access the qb project persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the qb project in the entity cache if it is enabled.
    *
    * @param qbProject the qb project
    */
    public void cacheResult(com.genpact.model.QbProject qbProject);

    /**
    * Caches the qb projects in the entity cache if it is enabled.
    *
    * @param qbProjects the qb projects
    */
    public void cacheResult(
        java.util.List<com.genpact.model.QbProject> qbProjects);

    /**
    * Creates a new qb project with the primary key. Does not add the qb project to the database.
    *
    * @param project_id the primary key for the new qb project
    * @return the new qb project
    */
    public com.genpact.model.QbProject create(long project_id);

    /**
    * Removes the qb project with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param project_id the primary key of the qb project
    * @return the qb project that was removed
    * @throws com.genpact.NoSuchQbProjectException if a qb project with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.QbProject remove(long project_id)
        throws com.genpact.NoSuchQbProjectException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.genpact.model.QbProject updateImpl(
        com.genpact.model.QbProject qbProject)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the qb project with the primary key or throws a {@link com.genpact.NoSuchQbProjectException} if it could not be found.
    *
    * @param project_id the primary key of the qb project
    * @return the qb project
    * @throws com.genpact.NoSuchQbProjectException if a qb project with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.QbProject findByPrimaryKey(long project_id)
        throws com.genpact.NoSuchQbProjectException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the qb project with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param project_id the primary key of the qb project
    * @return the qb project, or <code>null</code> if a qb project with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.QbProject fetchByPrimaryKey(long project_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the qb projects.
    *
    * @return the qb projects
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.genpact.model.QbProject> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.QbProject> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.QbProject> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the qb projects from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of qb projects.
    *
    * @return the number of qb projects
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
