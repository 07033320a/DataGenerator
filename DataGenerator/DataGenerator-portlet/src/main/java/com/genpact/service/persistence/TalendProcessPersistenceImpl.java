package com.genpact.service.persistence;

import com.genpact.NoSuchTalendProcessException;

import com.genpact.model.TalendProcess;
import com.genpact.model.impl.TalendProcessImpl;
import com.genpact.model.impl.TalendProcessModelImpl;

import com.genpact.service.persistence.TalendProcessPersistence;

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

/**
 * The persistence implementation for the talend process service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see TalendProcessPersistence
 * @see TalendProcessUtil
 * @generated
 */
public class TalendProcessPersistenceImpl extends BasePersistenceImpl<TalendProcess>
    implements TalendProcessPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TalendProcessUtil} to access the talend process persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TalendProcessImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
            TalendProcessModelImpl.FINDER_CACHE_ENABLED,
            TalendProcessImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
            TalendProcessModelImpl.FINDER_CACHE_ENABLED,
            TalendProcessImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
            TalendProcessModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TALENDPROCESS = "SELECT talendProcess FROM TalendProcess talendProcess";
    private static final String _SQL_COUNT_TALENDPROCESS = "SELECT COUNT(talendProcess) FROM TalendProcess talendProcess";
    private static final String _ORDER_BY_ENTITY_ALIAS = "talendProcess.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TalendProcess exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TalendProcessPersistenceImpl.class);
    private static TalendProcess _nullTalendProcess = new TalendProcessImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<TalendProcess> toCacheModel() {
                return _nullTalendProcessCacheModel;
            }
        };

    private static CacheModel<TalendProcess> _nullTalendProcessCacheModel = new CacheModel<TalendProcess>() {
            @Override
            public TalendProcess toEntityModel() {
                return _nullTalendProcess;
            }
        };

    public TalendProcessPersistenceImpl() {
        setModelClass(TalendProcess.class);
    }

    /**
     * Caches the talend process in the entity cache if it is enabled.
     *
     * @param talendProcess the talend process
     */
    @Override
    public void cacheResult(TalendProcess talendProcess) {
        EntityCacheUtil.putResult(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
            TalendProcessImpl.class, talendProcess.getPrimaryKey(),
            talendProcess);

        talendProcess.resetOriginalValues();
    }

    /**
     * Caches the talend processes in the entity cache if it is enabled.
     *
     * @param talendProcesses the talend processes
     */
    @Override
    public void cacheResult(List<TalendProcess> talendProcesses) {
        for (TalendProcess talendProcess : talendProcesses) {
            if (EntityCacheUtil.getResult(
                        TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
                        TalendProcessImpl.class, talendProcess.getPrimaryKey()) == null) {
                cacheResult(talendProcess);
            } else {
                talendProcess.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all talend processes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TalendProcessImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TalendProcessImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the talend process.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(TalendProcess talendProcess) {
        EntityCacheUtil.removeResult(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
            TalendProcessImpl.class, talendProcess.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<TalendProcess> talendProcesses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (TalendProcess talendProcess : talendProcesses) {
            EntityCacheUtil.removeResult(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
                TalendProcessImpl.class, talendProcess.getPrimaryKey());
        }
    }

    /**
     * Creates a new talend process with the primary key. Does not add the talend process to the database.
     *
     * @param processId the primary key for the new talend process
     * @return the new talend process
     */
    @Override
    public TalendProcess create(long processId) {
        TalendProcess talendProcess = new TalendProcessImpl();

        talendProcess.setNew(true);
        talendProcess.setPrimaryKey(processId);

        return talendProcess;
    }

    /**
     * Removes the talend process with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param processId the primary key of the talend process
     * @return the talend process that was removed
     * @throws com.genpact.NoSuchTalendProcessException if a talend process with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TalendProcess remove(long processId)
        throws NoSuchTalendProcessException, SystemException {
        return remove((Serializable) processId);
    }

    /**
     * Removes the talend process with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the talend process
     * @return the talend process that was removed
     * @throws com.genpact.NoSuchTalendProcessException if a talend process with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TalendProcess remove(Serializable primaryKey)
        throws NoSuchTalendProcessException, SystemException {
        Session session = null;

        try {
            session = openSession();

            TalendProcess talendProcess = (TalendProcess) session.get(TalendProcessImpl.class,
                    primaryKey);

            if (talendProcess == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTalendProcessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(talendProcess);
        } catch (NoSuchTalendProcessException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected TalendProcess removeImpl(TalendProcess talendProcess)
        throws SystemException {
        talendProcess = toUnwrappedModel(talendProcess);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(talendProcess)) {
                talendProcess = (TalendProcess) session.get(TalendProcessImpl.class,
                        talendProcess.getPrimaryKeyObj());
            }

            if (talendProcess != null) {
                session.delete(talendProcess);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (talendProcess != null) {
            clearCache(talendProcess);
        }

        return talendProcess;
    }

    @Override
    public TalendProcess updateImpl(
        com.genpact.model.TalendProcess talendProcess)
        throws SystemException {
        talendProcess = toUnwrappedModel(talendProcess);

        boolean isNew = talendProcess.isNew();

        Session session = null;

        try {
            session = openSession();

            if (talendProcess.isNew()) {
                session.save(talendProcess);

                talendProcess.setNew(false);
            } else {
                session.merge(talendProcess);
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

        EntityCacheUtil.putResult(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
            TalendProcessImpl.class, talendProcess.getPrimaryKey(),
            talendProcess);

        return talendProcess;
    }

    protected TalendProcess toUnwrappedModel(TalendProcess talendProcess) {
        if (talendProcess instanceof TalendProcessImpl) {
            return talendProcess;
        }

        TalendProcessImpl talendProcessImpl = new TalendProcessImpl();

        talendProcessImpl.setNew(talendProcess.isNew());
        talendProcessImpl.setPrimaryKey(talendProcess.getPrimaryKey());

        talendProcessImpl.setProcessId(talendProcess.getProcessId());
        talendProcessImpl.setCreateDate(talendProcess.getCreateDate());
        talendProcessImpl.setModifiedDate(talendProcess.getModifiedDate());
        talendProcessImpl.setName(talendProcess.getName());
        talendProcessImpl.setVersion(talendProcess.getVersion());
        talendProcessImpl.setClassName(talendProcess.getClassName());
        talendProcessImpl.setFileEntryId(talendProcess.getFileEntryId());
        talendProcessImpl.setDescription(talendProcess.getDescription());
        talendProcessImpl.setContext(talendProcess.getContext());

        return talendProcessImpl;
    }

    /**
     * Returns the talend process with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the talend process
     * @return the talend process
     * @throws com.genpact.NoSuchTalendProcessException if a talend process with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TalendProcess findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTalendProcessException, SystemException {
        TalendProcess talendProcess = fetchByPrimaryKey(primaryKey);

        if (talendProcess == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTalendProcessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return talendProcess;
    }

    /**
     * Returns the talend process with the primary key or throws a {@link com.genpact.NoSuchTalendProcessException} if it could not be found.
     *
     * @param processId the primary key of the talend process
     * @return the talend process
     * @throws com.genpact.NoSuchTalendProcessException if a talend process with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TalendProcess findByPrimaryKey(long processId)
        throws NoSuchTalendProcessException, SystemException {
        return findByPrimaryKey((Serializable) processId);
    }

    /**
     * Returns the talend process with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the talend process
     * @return the talend process, or <code>null</code> if a talend process with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TalendProcess fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        TalendProcess talendProcess = (TalendProcess) EntityCacheUtil.getResult(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
                TalendProcessImpl.class, primaryKey);

        if (talendProcess == _nullTalendProcess) {
            return null;
        }

        if (talendProcess == null) {
            Session session = null;

            try {
                session = openSession();

                talendProcess = (TalendProcess) session.get(TalendProcessImpl.class,
                        primaryKey);

                if (talendProcess != null) {
                    cacheResult(talendProcess);
                } else {
                    EntityCacheUtil.putResult(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
                        TalendProcessImpl.class, primaryKey, _nullTalendProcess);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TalendProcessModelImpl.ENTITY_CACHE_ENABLED,
                    TalendProcessImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return talendProcess;
    }

    /**
     * Returns the talend process with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param processId the primary key of the talend process
     * @return the talend process, or <code>null</code> if a talend process with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TalendProcess fetchByPrimaryKey(long processId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) processId);
    }

    /**
     * Returns all the talend processes.
     *
     * @return the talend processes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<TalendProcess> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<TalendProcess> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<TalendProcess> findAll(int start, int end,
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

        List<TalendProcess> list = (List<TalendProcess>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TALENDPROCESS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TALENDPROCESS;

                if (pagination) {
                    sql = sql.concat(TalendProcessModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<TalendProcess>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<TalendProcess>(list);
                } else {
                    list = (List<TalendProcess>) QueryUtil.list(q,
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
     * Removes all the talend processes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (TalendProcess talendProcess : findAll()) {
            remove(talendProcess);
        }
    }

    /**
     * Returns the number of talend processes.
     *
     * @return the number of talend processes
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

                Query q = session.createQuery(_SQL_COUNT_TALENDPROCESS);

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

    /**
     * Initializes the talend process persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.genpact.model.TalendProcess")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<TalendProcess>> listenersList = new ArrayList<ModelListener<TalendProcess>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<TalendProcess>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TalendProcessImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
