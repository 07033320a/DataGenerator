package com.genpact.service.persistence;

import com.genpact.NoSuchDataGeneratorException;

import com.genpact.model.DataGenerator;
import com.genpact.model.impl.DataGeneratorImpl;
import com.genpact.model.impl.DataGeneratorModelImpl;

import com.genpact.service.persistence.DataGeneratorPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the data generator service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see DataGeneratorPersistence
 * @see DataGeneratorUtil
 * @generated
 */
public class DataGeneratorPersistenceImpl extends BasePersistenceImpl<DataGenerator>
    implements DataGeneratorPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DataGeneratorUtil} to access the data generator persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DataGeneratorImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
            DataGeneratorModelImpl.FINDER_CACHE_ENABLED,
            DataGeneratorImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
            DataGeneratorModelImpl.FINDER_CACHE_ENABLED,
            DataGeneratorImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
            DataGeneratorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_DATAGENERATOR = "SELECT dataGenerator FROM DataGenerator dataGenerator";
    private static final String _SQL_COUNT_DATAGENERATOR = "SELECT COUNT(dataGenerator) FROM DataGenerator dataGenerator";
    private static final String _ORDER_BY_ENTITY_ALIAS = "dataGenerator.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DataGenerator exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DataGeneratorPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "data", "type"
            });
    private static DataGenerator _nullDataGenerator = new DataGeneratorImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DataGenerator> toCacheModel() {
                return _nullDataGeneratorCacheModel;
            }
        };

    private static CacheModel<DataGenerator> _nullDataGeneratorCacheModel = new CacheModel<DataGenerator>() {
            @Override
            public DataGenerator toEntityModel() {
                return _nullDataGenerator;
            }
        };

    public DataGeneratorPersistenceImpl() {
        setModelClass(DataGenerator.class);
    }

    /**
     * Caches the data generator in the entity cache if it is enabled.
     *
     * @param dataGenerator the data generator
     */
    @Override
    public void cacheResult(DataGenerator dataGenerator) {
        EntityCacheUtil.putResult(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
            DataGeneratorImpl.class, dataGenerator.getPrimaryKey(),
            dataGenerator);

        dataGenerator.resetOriginalValues();
    }

    /**
     * Caches the data generators in the entity cache if it is enabled.
     *
     * @param dataGenerators the data generators
     */
    @Override
    public void cacheResult(List<DataGenerator> dataGenerators) {
        for (DataGenerator dataGenerator : dataGenerators) {
            if (EntityCacheUtil.getResult(
                        DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
                        DataGeneratorImpl.class, dataGenerator.getPrimaryKey()) == null) {
                cacheResult(dataGenerator);
            } else {
                dataGenerator.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all data generators.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DataGeneratorImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DataGeneratorImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the data generator.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DataGenerator dataGenerator) {
        EntityCacheUtil.removeResult(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
            DataGeneratorImpl.class, dataGenerator.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<DataGenerator> dataGenerators) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DataGenerator dataGenerator : dataGenerators) {
            EntityCacheUtil.removeResult(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
                DataGeneratorImpl.class, dataGenerator.getPrimaryKey());
        }
    }

    /**
     * Creates a new data generator with the primary key. Does not add the data generator to the database.
     *
     * @param id the primary key for the new data generator
     * @return the new data generator
     */
    @Override
    public DataGenerator create(long id) {
        DataGenerator dataGenerator = new DataGeneratorImpl();

        dataGenerator.setNew(true);
        dataGenerator.setPrimaryKey(id);

        return dataGenerator;
    }

    /**
     * Removes the data generator with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the data generator
     * @return the data generator that was removed
     * @throws com.genpact.NoSuchDataGeneratorException if a data generator with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DataGenerator remove(long id)
        throws NoSuchDataGeneratorException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the data generator with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the data generator
     * @return the data generator that was removed
     * @throws com.genpact.NoSuchDataGeneratorException if a data generator with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DataGenerator remove(Serializable primaryKey)
        throws NoSuchDataGeneratorException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DataGenerator dataGenerator = (DataGenerator) session.get(DataGeneratorImpl.class,
                    primaryKey);

            if (dataGenerator == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDataGeneratorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(dataGenerator);
        } catch (NoSuchDataGeneratorException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DataGenerator removeImpl(DataGenerator dataGenerator)
        throws SystemException {
        dataGenerator = toUnwrappedModel(dataGenerator);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(dataGenerator)) {
                dataGenerator = (DataGenerator) session.get(DataGeneratorImpl.class,
                        dataGenerator.getPrimaryKeyObj());
            }

            if (dataGenerator != null) {
                session.delete(dataGenerator);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (dataGenerator != null) {
            clearCache(dataGenerator);
        }

        return dataGenerator;
    }

    @Override
    public DataGenerator updateImpl(
        com.genpact.model.DataGenerator dataGenerator)
        throws SystemException {
        dataGenerator = toUnwrappedModel(dataGenerator);

        boolean isNew = dataGenerator.isNew();

        Session session = null;

        try {
            session = openSession();

            if (dataGenerator.isNew()) {
                session.save(dataGenerator);

                dataGenerator.setNew(false);
            } else {
                session.merge(dataGenerator);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
            DataGeneratorImpl.class, dataGenerator.getPrimaryKey(),
            dataGenerator);

        return dataGenerator;
    }

    protected DataGenerator toUnwrappedModel(DataGenerator dataGenerator) {
        if (dataGenerator instanceof DataGeneratorImpl) {
            return dataGenerator;
        }

        DataGeneratorImpl dataGeneratorImpl = new DataGeneratorImpl();

        dataGeneratorImpl.setNew(dataGenerator.isNew());
        dataGeneratorImpl.setPrimaryKey(dataGenerator.getPrimaryKey());

        dataGeneratorImpl.setId(dataGenerator.getId());
        dataGeneratorImpl.setData(dataGenerator.getData());
        dataGeneratorImpl.setType(dataGenerator.getType());
        dataGeneratorImpl.setCreateDate(dataGenerator.getCreateDate());

        return dataGeneratorImpl;
    }

    /**
     * Returns the data generator with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the data generator
     * @return the data generator
     * @throws com.genpact.NoSuchDataGeneratorException if a data generator with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DataGenerator findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDataGeneratorException, SystemException {
        DataGenerator dataGenerator = fetchByPrimaryKey(primaryKey);

        if (dataGenerator == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDataGeneratorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return dataGenerator;
    }

    /**
     * Returns the data generator with the primary key or throws a {@link com.genpact.NoSuchDataGeneratorException} if it could not be found.
     *
     * @param id the primary key of the data generator
     * @return the data generator
     * @throws com.genpact.NoSuchDataGeneratorException if a data generator with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DataGenerator findByPrimaryKey(long id)
        throws NoSuchDataGeneratorException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the data generator with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the data generator
     * @return the data generator, or <code>null</code> if a data generator with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DataGenerator fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DataGenerator dataGenerator = (DataGenerator) EntityCacheUtil.getResult(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
                DataGeneratorImpl.class, primaryKey);

        if (dataGenerator == _nullDataGenerator) {
            return null;
        }

        if (dataGenerator == null) {
            Session session = null;

            try {
                session = openSession();

                dataGenerator = (DataGenerator) session.get(DataGeneratorImpl.class,
                        primaryKey);

                if (dataGenerator != null) {
                    cacheResult(dataGenerator);
                } else {
                    EntityCacheUtil.putResult(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
                        DataGeneratorImpl.class, primaryKey, _nullDataGenerator);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DataGeneratorModelImpl.ENTITY_CACHE_ENABLED,
                    DataGeneratorImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return dataGenerator;
    }

    /**
     * Returns the data generator with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the data generator
     * @return the data generator, or <code>null</code> if a data generator with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DataGenerator fetchByPrimaryKey(long id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the data generators.
     *
     * @return the data generators
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DataGenerator> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<DataGenerator> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<DataGenerator> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<DataGenerator> list = (List<DataGenerator>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DATAGENERATOR);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DATAGENERATOR;

                if (pagination) {
                    sql = sql.concat(DataGeneratorModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DataGenerator>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DataGenerator>(list);
                } else {
                    list = (List<DataGenerator>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the data generators from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DataGenerator dataGenerator : findAll()) {
            remove(dataGenerator);
        }
    }

    /**
     * Returns the number of data generators.
     *
     * @return the number of data generators
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_DATAGENERATOR);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the data generator persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.genpact.model.DataGenerator")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DataGenerator>> listenersList = new ArrayList<ModelListener<DataGenerator>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DataGenerator>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DataGeneratorImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
