package com.genpact.service.persistence;

import com.genpact.NoSuchQbProjectException;

import com.genpact.model.QbProject;
import com.genpact.model.impl.QbProjectImpl;
import com.genpact.model.impl.QbProjectModelImpl;

import com.genpact.service.persistence.QbProjectPersistence;

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
 * The persistence implementation for the qb project service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see QbProjectPersistence
 * @see QbProjectUtil
 * @generated
 */
public class QbProjectPersistenceImpl extends BasePersistenceImpl<QbProject>
    implements QbProjectPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link QbProjectUtil} to access the qb project persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = QbProjectImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
            QbProjectModelImpl.FINDER_CACHE_ENABLED, QbProjectImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
            QbProjectModelImpl.FINDER_CACHE_ENABLED, QbProjectImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
            QbProjectModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_QBPROJECT = "SELECT qbProject FROM QbProject qbProject";
    private static final String _SQL_COUNT_QBPROJECT = "SELECT COUNT(qbProject) FROM QbProject qbProject";
    private static final String _ORDER_BY_ENTITY_ALIAS = "qbProject.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QbProject exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(QbProjectPersistenceImpl.class);
    private static QbProject _nullQbProject = new QbProjectImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<QbProject> toCacheModel() {
                return _nullQbProjectCacheModel;
            }
        };

    private static CacheModel<QbProject> _nullQbProjectCacheModel = new CacheModel<QbProject>() {
            @Override
            public QbProject toEntityModel() {
                return _nullQbProject;
            }
        };

    public QbProjectPersistenceImpl() {
        setModelClass(QbProject.class);
    }

    /**
     * Caches the qb project in the entity cache if it is enabled.
     *
     * @param qbProject the qb project
     */
    @Override
    public void cacheResult(QbProject qbProject) {
        EntityCacheUtil.putResult(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
            QbProjectImpl.class, qbProject.getPrimaryKey(), qbProject);

        qbProject.resetOriginalValues();
    }

    /**
     * Caches the qb projects in the entity cache if it is enabled.
     *
     * @param qbProjects the qb projects
     */
    @Override
    public void cacheResult(List<QbProject> qbProjects) {
        for (QbProject qbProject : qbProjects) {
            if (EntityCacheUtil.getResult(
                        QbProjectModelImpl.ENTITY_CACHE_ENABLED,
                        QbProjectImpl.class, qbProject.getPrimaryKey()) == null) {
                cacheResult(qbProject);
            } else {
                qbProject.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all qb projects.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(QbProjectImpl.class.getName());
        }

        EntityCacheUtil.clearCache(QbProjectImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the qb project.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(QbProject qbProject) {
        EntityCacheUtil.removeResult(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
            QbProjectImpl.class, qbProject.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<QbProject> qbProjects) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (QbProject qbProject : qbProjects) {
            EntityCacheUtil.removeResult(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
                QbProjectImpl.class, qbProject.getPrimaryKey());
        }
    }

    /**
     * Creates a new qb project with the primary key. Does not add the qb project to the database.
     *
     * @param project_id the primary key for the new qb project
     * @return the new qb project
     */
    @Override
    public QbProject create(long project_id) {
        QbProject qbProject = new QbProjectImpl();

        qbProject.setNew(true);
        qbProject.setPrimaryKey(project_id);

        return qbProject;
    }

    /**
     * Removes the qb project with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param project_id the primary key of the qb project
     * @return the qb project that was removed
     * @throws com.genpact.NoSuchQbProjectException if a qb project with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbProject remove(long project_id)
        throws NoSuchQbProjectException, SystemException {
        return remove((Serializable) project_id);
    }

    /**
     * Removes the qb project with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the qb project
     * @return the qb project that was removed
     * @throws com.genpact.NoSuchQbProjectException if a qb project with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbProject remove(Serializable primaryKey)
        throws NoSuchQbProjectException, SystemException {
        Session session = null;

        try {
            session = openSession();

            QbProject qbProject = (QbProject) session.get(QbProjectImpl.class,
                    primaryKey);

            if (qbProject == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchQbProjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(qbProject);
        } catch (NoSuchQbProjectException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected QbProject removeImpl(QbProject qbProject)
        throws SystemException {
        qbProject = toUnwrappedModel(qbProject);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(qbProject)) {
                qbProject = (QbProject) session.get(QbProjectImpl.class,
                        qbProject.getPrimaryKeyObj());
            }

            if (qbProject != null) {
                session.delete(qbProject);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (qbProject != null) {
            clearCache(qbProject);
        }

        return qbProject;
    }

    @Override
    public QbProject updateImpl(com.genpact.model.QbProject qbProject)
        throws SystemException {
        qbProject = toUnwrappedModel(qbProject);

        boolean isNew = qbProject.isNew();

        Session session = null;

        try {
            session = openSession();

            if (qbProject.isNew()) {
                session.save(qbProject);

                qbProject.setNew(false);
            } else {
                session.merge(qbProject);
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

        EntityCacheUtil.putResult(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
            QbProjectImpl.class, qbProject.getPrimaryKey(), qbProject);

        return qbProject;
    }

    protected QbProject toUnwrappedModel(QbProject qbProject) {
        if (qbProject instanceof QbProjectImpl) {
            return qbProject;
        }

        QbProjectImpl qbProjectImpl = new QbProjectImpl();

        qbProjectImpl.setNew(qbProject.isNew());
        qbProjectImpl.setPrimaryKey(qbProject.getPrimaryKey());

        qbProjectImpl.setProject_id(qbProject.getProject_id());
        qbProjectImpl.setProject_name(qbProject.getProject_name());

        return qbProjectImpl;
    }

    /**
     * Returns the qb project with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the qb project
     * @return the qb project
     * @throws com.genpact.NoSuchQbProjectException if a qb project with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbProject findByPrimaryKey(Serializable primaryKey)
        throws NoSuchQbProjectException, SystemException {
        QbProject qbProject = fetchByPrimaryKey(primaryKey);

        if (qbProject == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchQbProjectException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return qbProject;
    }

    /**
     * Returns the qb project with the primary key or throws a {@link com.genpact.NoSuchQbProjectException} if it could not be found.
     *
     * @param project_id the primary key of the qb project
     * @return the qb project
     * @throws com.genpact.NoSuchQbProjectException if a qb project with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbProject findByPrimaryKey(long project_id)
        throws NoSuchQbProjectException, SystemException {
        return findByPrimaryKey((Serializable) project_id);
    }

    /**
     * Returns the qb project with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the qb project
     * @return the qb project, or <code>null</code> if a qb project with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbProject fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        QbProject qbProject = (QbProject) EntityCacheUtil.getResult(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
                QbProjectImpl.class, primaryKey);

        if (qbProject == _nullQbProject) {
            return null;
        }

        if (qbProject == null) {
            Session session = null;

            try {
                session = openSession();

                qbProject = (QbProject) session.get(QbProjectImpl.class,
                        primaryKey);

                if (qbProject != null) {
                    cacheResult(qbProject);
                } else {
                    EntityCacheUtil.putResult(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
                        QbProjectImpl.class, primaryKey, _nullQbProject);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(QbProjectModelImpl.ENTITY_CACHE_ENABLED,
                    QbProjectImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return qbProject;
    }

    /**
     * Returns the qb project with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param project_id the primary key of the qb project
     * @return the qb project, or <code>null</code> if a qb project with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbProject fetchByPrimaryKey(long project_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) project_id);
    }

    /**
     * Returns all the qb projects.
     *
     * @return the qb projects
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<QbProject> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<QbProject> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<QbProject> findAll(int start, int end,
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

        List<QbProject> list = (List<QbProject>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_QBPROJECT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_QBPROJECT;

                if (pagination) {
                    sql = sql.concat(QbProjectModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<QbProject>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<QbProject>(list);
                } else {
                    list = (List<QbProject>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the qb projects from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (QbProject qbProject : findAll()) {
            remove(qbProject);
        }
    }

    /**
     * Returns the number of qb projects.
     *
     * @return the number of qb projects
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

                Query q = session.createQuery(_SQL_COUNT_QBPROJECT);

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
     * Initializes the qb project persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.genpact.model.QbProject")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<QbProject>> listenersList = new ArrayList<ModelListener<QbProject>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<QbProject>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(QbProjectImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
