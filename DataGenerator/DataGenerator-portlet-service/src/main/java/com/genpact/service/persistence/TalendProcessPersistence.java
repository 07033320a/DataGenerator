package com.genpact.service.persistence;

import com.genpact.model.TalendProcess;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the talend process service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see TalendProcessPersistenceImpl
 * @see TalendProcessUtil
 * @generated
 */
public interface TalendProcessPersistence extends BasePersistence<TalendProcess> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TalendProcessUtil} to access the talend process persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the talend process in the entity cache if it is enabled.
    *
    * @param talendProcess the talend process
    */
    public void cacheResult(com.genpact.model.TalendProcess talendProcess);

    /**
    * Caches the talend processes in the entity cache if it is enabled.
    *
    * @param talendProcesses the talend processes
    */
    public void cacheResult(
        java.util.List<com.genpact.model.TalendProcess> talendProcesses);

    /**
    * Creates a new talend process with the primary key. Does not add the talend process to the database.
    *
    * @param processId the primary key for the new talend process
    * @return the new talend process
    */
    public com.genpact.model.TalendProcess create(long processId);

    /**
    * Removes the talend process with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param processId the primary key of the talend process
    * @return the talend process that was removed
    * @throws com.genpact.NoSuchTalendProcessException if a talend process with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.TalendProcess remove(long processId)
        throws com.genpact.NoSuchTalendProcessException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.genpact.model.TalendProcess updateImpl(
        com.genpact.model.TalendProcess talendProcess)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the talend process with the primary key or throws a {@link com.genpact.NoSuchTalendProcessException} if it could not be found.
    *
    * @param processId the primary key of the talend process
    * @return the talend process
    * @throws com.genpact.NoSuchTalendProcessException if a talend process with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.TalendProcess findByPrimaryKey(long processId)
        throws com.genpact.NoSuchTalendProcessException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the talend process with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param processId the primary key of the talend process
    * @return the talend process, or <code>null</code> if a talend process with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.TalendProcess fetchByPrimaryKey(long processId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the talend processes.
    *
    * @return the talend processes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.genpact.model.TalendProcess> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.TalendProcess> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.TalendProcess> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the talend processes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of talend processes.
    *
    * @return the number of talend processes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
