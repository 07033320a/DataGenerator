package com.genpact.service.persistence;

import com.genpact.model.DataGenerator;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the data generator service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see DataGeneratorPersistenceImpl
 * @see DataGeneratorUtil
 * @generated
 */
public interface DataGeneratorPersistence extends BasePersistence<DataGenerator> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DataGeneratorUtil} to access the data generator persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the data generator in the entity cache if it is enabled.
    *
    * @param dataGenerator the data generator
    */
    public void cacheResult(com.genpact.model.DataGenerator dataGenerator);

    /**
    * Caches the data generators in the entity cache if it is enabled.
    *
    * @param dataGenerators the data generators
    */
    public void cacheResult(
        java.util.List<com.genpact.model.DataGenerator> dataGenerators);

    /**
    * Creates a new data generator with the primary key. Does not add the data generator to the database.
    *
    * @param id the primary key for the new data generator
    * @return the new data generator
    */
    public com.genpact.model.DataGenerator create(long id);

    /**
    * Removes the data generator with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the data generator
    * @return the data generator that was removed
    * @throws com.genpact.NoSuchDataGeneratorException if a data generator with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.DataGenerator remove(long id)
        throws com.genpact.NoSuchDataGeneratorException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.genpact.model.DataGenerator updateImpl(
        com.genpact.model.DataGenerator dataGenerator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the data generator with the primary key or throws a {@link com.genpact.NoSuchDataGeneratorException} if it could not be found.
    *
    * @param id the primary key of the data generator
    * @return the data generator
    * @throws com.genpact.NoSuchDataGeneratorException if a data generator with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.DataGenerator findByPrimaryKey(long id)
        throws com.genpact.NoSuchDataGeneratorException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the data generator with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the data generator
    * @return the data generator, or <code>null</code> if a data generator with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.genpact.model.DataGenerator fetchByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the data generators.
    *
    * @return the data generators
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.genpact.model.DataGenerator> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.DataGenerator> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.genpact.model.DataGenerator> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the data generators from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of data generators.
    *
    * @return the number of data generators
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
