package com.genpact.service.persistence;

import com.genpact.NoSuchQbPortletException;

import com.genpact.model.QbPortlet;
import com.genpact.model.impl.QbPortletImpl;
import com.genpact.model.impl.QbPortletModelImpl;

import com.genpact.service.persistence.QbPortletPersistence;

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
 * The persistence implementation for the qb portlet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see QbPortletPersistence
 * @see QbPortletUtil
 * @generated
 */
public class QbPortletPersistenceImpl extends BasePersistenceImpl<QbPortlet>
    implements QbPortletPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link QbPortletUtil} to access the qb portlet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = QbPortletImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletModelImpl.FINDER_CACHE_ENABLED, QbPortletImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletModelImpl.FINDER_CACHE_ENABLED, QbPortletImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_QBPORTLET = "SELECT qbPortlet FROM QbPortlet qbPortlet";
    private static final String _SQL_COUNT_QBPORTLET = "SELECT COUNT(qbPortlet) FROM QbPortlet qbPortlet";
    private static final String _ORDER_BY_ENTITY_ALIAS = "qbPortlet.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QbPortlet exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(QbPortletPersistenceImpl.class);
    private static QbPortlet _nullQbPortlet = new QbPortletImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<QbPortlet> toCacheModel() {
                return _nullQbPortletCacheModel;
            }
        };

    private static CacheModel<QbPortlet> _nullQbPortletCacheModel = new CacheModel<QbPortlet>() {
            @Override
            public QbPortlet toEntityModel() {
                return _nullQbPortlet;
            }
        };

    public QbPortletPersistenceImpl() {
        setModelClass(QbPortlet.class);
    }

    /**
     * Caches the qb portlet in the entity cache if it is enabled.
     *
     * @param qbPortlet the qb portlet
     */
    @Override
    public void cacheResult(QbPortlet qbPortlet) {
        EntityCacheUtil.putResult(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletImpl.class, qbPortlet.getPrimaryKey(), qbPortlet);

        qbPortlet.resetOriginalValues();
    }

    /**
     * Caches the qb portlets in the entity cache if it is enabled.
     *
     * @param qbPortlets the qb portlets
     */
    @Override
    public void cacheResult(List<QbPortlet> qbPortlets) {
        for (QbPortlet qbPortlet : qbPortlets) {
            if (EntityCacheUtil.getResult(
                        QbPortletModelImpl.ENTITY_CACHE_ENABLED,
                        QbPortletImpl.class, qbPortlet.getPrimaryKey()) == null) {
                cacheResult(qbPortlet);
            } else {
                qbPortlet.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all qb portlets.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(QbPortletImpl.class.getName());
        }

        EntityCacheUtil.clearCache(QbPortletImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the qb portlet.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(QbPortlet qbPortlet) {
        EntityCacheUtil.removeResult(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletImpl.class, qbPortlet.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<QbPortlet> qbPortlets) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (QbPortlet qbPortlet : qbPortlets) {
            EntityCacheUtil.removeResult(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
                QbPortletImpl.class, qbPortlet.getPrimaryKey());
        }
    }

    /**
     * Creates a new qb portlet with the primary key. Does not add the qb portlet to the database.
     *
     * @param portlet_id the primary key for the new qb portlet
     * @return the new qb portlet
     */
    @Override
    public QbPortlet create(long portlet_id) {
        QbPortlet qbPortlet = new QbPortletImpl();

        qbPortlet.setNew(true);
        qbPortlet.setPrimaryKey(portlet_id);

        return qbPortlet;
    }

    /**
     * Removes the qb portlet with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param portlet_id the primary key of the qb portlet
     * @return the qb portlet that was removed
     * @throws com.genpact.NoSuchQbPortletException if a qb portlet with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortlet remove(long portlet_id)
        throws NoSuchQbPortletException, SystemException {
        return remove((Serializable) portlet_id);
    }

    /**
     * Removes the qb portlet with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the qb portlet
     * @return the qb portlet that was removed
     * @throws com.genpact.NoSuchQbPortletException if a qb portlet with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortlet remove(Serializable primaryKey)
        throws NoSuchQbPortletException, SystemException {
        Session session = null;

        try {
            session = openSession();

            QbPortlet qbPortlet = (QbPortlet) session.get(QbPortletImpl.class,
                    primaryKey);

            if (qbPortlet == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchQbPortletException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(qbPortlet);
        } catch (NoSuchQbPortletException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected QbPortlet removeImpl(QbPortlet qbPortlet)
        throws SystemException {
        qbPortlet = toUnwrappedModel(qbPortlet);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(qbPortlet)) {
                qbPortlet = (QbPortlet) session.get(QbPortletImpl.class,
                        qbPortlet.getPrimaryKeyObj());
            }

            if (qbPortlet != null) {
                session.delete(qbPortlet);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (qbPortlet != null) {
            clearCache(qbPortlet);
        }

        return qbPortlet;
    }

    @Override
    public QbPortlet updateImpl(com.genpact.model.QbPortlet qbPortlet)
        throws SystemException {
        qbPortlet = toUnwrappedModel(qbPortlet);

        boolean isNew = qbPortlet.isNew();

        Session session = null;

        try {
            session = openSession();

            if (qbPortlet.isNew()) {
                session.save(qbPortlet);

                qbPortlet.setNew(false);
            } else {
                session.merge(qbPortlet);
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

        EntityCacheUtil.putResult(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletImpl.class, qbPortlet.getPrimaryKey(), qbPortlet);

        return qbPortlet;
    }

    protected QbPortlet toUnwrappedModel(QbPortlet qbPortlet) {
        if (qbPortlet instanceof QbPortletImpl) {
            return qbPortlet;
        }

        QbPortletImpl qbPortletImpl = new QbPortletImpl();

        qbPortletImpl.setNew(qbPortlet.isNew());
        qbPortletImpl.setPrimaryKey(qbPortlet.getPrimaryKey());

        qbPortletImpl.setPortlet_id(qbPortlet.getPortlet_id());
        qbPortletImpl.setPortlet_name(qbPortlet.getPortlet_name());
        qbPortletImpl.setPortlet_label_name(qbPortlet.getPortlet_label_name());
        qbPortletImpl.setProject_id(qbPortlet.getProject_id());

        return qbPortletImpl;
    }

    /**
     * Returns the qb portlet with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the qb portlet
     * @return the qb portlet
     * @throws com.genpact.NoSuchQbPortletException if a qb portlet with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortlet findByPrimaryKey(Serializable primaryKey)
        throws NoSuchQbPortletException, SystemException {
        QbPortlet qbPortlet = fetchByPrimaryKey(primaryKey);

        if (qbPortlet == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchQbPortletException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return qbPortlet;
    }

    /**
     * Returns the qb portlet with the primary key or throws a {@link com.genpact.NoSuchQbPortletException} if it could not be found.
     *
     * @param portlet_id the primary key of the qb portlet
     * @return the qb portlet
     * @throws com.genpact.NoSuchQbPortletException if a qb portlet with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortlet findByPrimaryKey(long portlet_id)
        throws NoSuchQbPortletException, SystemException {
        return findByPrimaryKey((Serializable) portlet_id);
    }

    /**
     * Returns the qb portlet with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the qb portlet
     * @return the qb portlet, or <code>null</code> if a qb portlet with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortlet fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        QbPortlet qbPortlet = (QbPortlet) EntityCacheUtil.getResult(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
                QbPortletImpl.class, primaryKey);

        if (qbPortlet == _nullQbPortlet) {
            return null;
        }

        if (qbPortlet == null) {
            Session session = null;

            try {
                session = openSession();

                qbPortlet = (QbPortlet) session.get(QbPortletImpl.class,
                        primaryKey);

                if (qbPortlet != null) {
                    cacheResult(qbPortlet);
                } else {
                    EntityCacheUtil.putResult(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
                        QbPortletImpl.class, primaryKey, _nullQbPortlet);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(QbPortletModelImpl.ENTITY_CACHE_ENABLED,
                    QbPortletImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return qbPortlet;
    }

    /**
     * Returns the qb portlet with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param portlet_id the primary key of the qb portlet
     * @return the qb portlet, or <code>null</code> if a qb portlet with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortlet fetchByPrimaryKey(long portlet_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) portlet_id);
    }

    /**
     * Returns all the qb portlets.
     *
     * @return the qb portlets
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<QbPortlet> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<QbPortlet> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<QbPortlet> findAll(int start, int end,
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

        List<QbPortlet> list = (List<QbPortlet>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_QBPORTLET);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_QBPORTLET;

                if (pagination) {
                    sql = sql.concat(QbPortletModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<QbPortlet>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<QbPortlet>(list);
                } else {
                    list = (List<QbPortlet>) QueryUtil.list(q, getDialect(),
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
     * Removes all the qb portlets from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (QbPortlet qbPortlet : findAll()) {
            remove(qbPortlet);
        }
    }

    /**
     * Returns the number of qb portlets.
     *
     * @return the number of qb portlets
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

                Query q = session.createQuery(_SQL_COUNT_QBPORTLET);

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
     * Initializes the qb portlet persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.genpact.model.QbPortlet")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<QbPortlet>> listenersList = new ArrayList<ModelListener<QbPortlet>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<QbPortlet>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(QbPortletImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
