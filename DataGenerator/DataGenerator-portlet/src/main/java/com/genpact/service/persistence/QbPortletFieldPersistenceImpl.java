package com.genpact.service.persistence;

import com.genpact.NoSuchQbPortletFieldException;

import com.genpact.model.QbPortletField;
import com.genpact.model.impl.QbPortletFieldImpl;
import com.genpact.model.impl.QbPortletFieldModelImpl;

import com.genpact.service.persistence.QbPortletFieldPersistence;

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
 * The persistence implementation for the qb portlet field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author 710008328
 * @see QbPortletFieldPersistence
 * @see QbPortletFieldUtil
 * @generated
 */
public class QbPortletFieldPersistenceImpl extends BasePersistenceImpl<QbPortletField>
    implements QbPortletFieldPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link QbPortletFieldUtil} to access the qb portlet field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = QbPortletFieldImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletFieldModelImpl.FINDER_CACHE_ENABLED,
            QbPortletFieldImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletFieldModelImpl.FINDER_CACHE_ENABLED,
            QbPortletFieldImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_QBPORTLETFIELD = "SELECT qbPortletField FROM QbPortletField qbPortletField";
    private static final String _SQL_COUNT_QBPORTLETFIELD = "SELECT COUNT(qbPortletField) FROM QbPortletField qbPortletField";
    private static final String _ORDER_BY_ENTITY_ALIAS = "qbPortletField.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No QbPortletField exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(QbPortletFieldPersistenceImpl.class);
    private static QbPortletField _nullQbPortletField = new QbPortletFieldImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<QbPortletField> toCacheModel() {
                return _nullQbPortletFieldCacheModel;
            }
        };

    private static CacheModel<QbPortletField> _nullQbPortletFieldCacheModel = new CacheModel<QbPortletField>() {
            @Override
            public QbPortletField toEntityModel() {
                return _nullQbPortletField;
            }
        };

    public QbPortletFieldPersistenceImpl() {
        setModelClass(QbPortletField.class);
    }

    /**
     * Caches the qb portlet field in the entity cache if it is enabled.
     *
     * @param qbPortletField the qb portlet field
     */
    @Override
    public void cacheResult(QbPortletField qbPortletField) {
        EntityCacheUtil.putResult(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletFieldImpl.class, qbPortletField.getPrimaryKey(),
            qbPortletField);

        qbPortletField.resetOriginalValues();
    }

    /**
     * Caches the qb portlet fields in the entity cache if it is enabled.
     *
     * @param qbPortletFields the qb portlet fields
     */
    @Override
    public void cacheResult(List<QbPortletField> qbPortletFields) {
        for (QbPortletField qbPortletField : qbPortletFields) {
            if (EntityCacheUtil.getResult(
                        QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
                        QbPortletFieldImpl.class, qbPortletField.getPrimaryKey()) == null) {
                cacheResult(qbPortletField);
            } else {
                qbPortletField.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all qb portlet fields.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(QbPortletFieldImpl.class.getName());
        }

        EntityCacheUtil.clearCache(QbPortletFieldImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the qb portlet field.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(QbPortletField qbPortletField) {
        EntityCacheUtil.removeResult(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletFieldImpl.class, qbPortletField.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<QbPortletField> qbPortletFields) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (QbPortletField qbPortletField : qbPortletFields) {
            EntityCacheUtil.removeResult(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
                QbPortletFieldImpl.class, qbPortletField.getPrimaryKey());
        }
    }

    /**
     * Creates a new qb portlet field with the primary key. Does not add the qb portlet field to the database.
     *
     * @param field_id the primary key for the new qb portlet field
     * @return the new qb portlet field
     */
    @Override
    public QbPortletField create(long field_id) {
        QbPortletField qbPortletField = new QbPortletFieldImpl();

        qbPortletField.setNew(true);
        qbPortletField.setPrimaryKey(field_id);

        return qbPortletField;
    }

    /**
     * Removes the qb portlet field with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param field_id the primary key of the qb portlet field
     * @return the qb portlet field that was removed
     * @throws com.genpact.NoSuchQbPortletFieldException if a qb portlet field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortletField remove(long field_id)
        throws NoSuchQbPortletFieldException, SystemException {
        return remove((Serializable) field_id);
    }

    /**
     * Removes the qb portlet field with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the qb portlet field
     * @return the qb portlet field that was removed
     * @throws com.genpact.NoSuchQbPortletFieldException if a qb portlet field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortletField remove(Serializable primaryKey)
        throws NoSuchQbPortletFieldException, SystemException {
        Session session = null;

        try {
            session = openSession();

            QbPortletField qbPortletField = (QbPortletField) session.get(QbPortletFieldImpl.class,
                    primaryKey);

            if (qbPortletField == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchQbPortletFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(qbPortletField);
        } catch (NoSuchQbPortletFieldException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected QbPortletField removeImpl(QbPortletField qbPortletField)
        throws SystemException {
        qbPortletField = toUnwrappedModel(qbPortletField);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(qbPortletField)) {
                qbPortletField = (QbPortletField) session.get(QbPortletFieldImpl.class,
                        qbPortletField.getPrimaryKeyObj());
            }

            if (qbPortletField != null) {
                session.delete(qbPortletField);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (qbPortletField != null) {
            clearCache(qbPortletField);
        }

        return qbPortletField;
    }

    @Override
    public QbPortletField updateImpl(
        com.genpact.model.QbPortletField qbPortletField)
        throws SystemException {
        qbPortletField = toUnwrappedModel(qbPortletField);

        boolean isNew = qbPortletField.isNew();

        Session session = null;

        try {
            session = openSession();

            if (qbPortletField.isNew()) {
                session.save(qbPortletField);

                qbPortletField.setNew(false);
            } else {
                session.merge(qbPortletField);
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

        EntityCacheUtil.putResult(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
            QbPortletFieldImpl.class, qbPortletField.getPrimaryKey(),
            qbPortletField);

        return qbPortletField;
    }

    protected QbPortletField toUnwrappedModel(QbPortletField qbPortletField) {
        if (qbPortletField instanceof QbPortletFieldImpl) {
            return qbPortletField;
        }

        QbPortletFieldImpl qbPortletFieldImpl = new QbPortletFieldImpl();

        qbPortletFieldImpl.setNew(qbPortletField.isNew());
        qbPortletFieldImpl.setPrimaryKey(qbPortletField.getPrimaryKey());

        qbPortletFieldImpl.setField_id(qbPortletField.getField_id());
        qbPortletFieldImpl.setField_name(qbPortletField.getField_name());
        qbPortletFieldImpl.setField_label_name(qbPortletField.getField_label_name());
        qbPortletFieldImpl.setPortlet_id(qbPortletField.getPortlet_id());
        qbPortletFieldImpl.setReference_portlet_id(qbPortletField.getReference_portlet_id());

        return qbPortletFieldImpl;
    }

    /**
     * Returns the qb portlet field with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the qb portlet field
     * @return the qb portlet field
     * @throws com.genpact.NoSuchQbPortletFieldException if a qb portlet field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortletField findByPrimaryKey(Serializable primaryKey)
        throws NoSuchQbPortletFieldException, SystemException {
        QbPortletField qbPortletField = fetchByPrimaryKey(primaryKey);

        if (qbPortletField == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchQbPortletFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return qbPortletField;
    }

    /**
     * Returns the qb portlet field with the primary key or throws a {@link com.genpact.NoSuchQbPortletFieldException} if it could not be found.
     *
     * @param field_id the primary key of the qb portlet field
     * @return the qb portlet field
     * @throws com.genpact.NoSuchQbPortletFieldException if a qb portlet field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortletField findByPrimaryKey(long field_id)
        throws NoSuchQbPortletFieldException, SystemException {
        return findByPrimaryKey((Serializable) field_id);
    }

    /**
     * Returns the qb portlet field with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the qb portlet field
     * @return the qb portlet field, or <code>null</code> if a qb portlet field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortletField fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        QbPortletField qbPortletField = (QbPortletField) EntityCacheUtil.getResult(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
                QbPortletFieldImpl.class, primaryKey);

        if (qbPortletField == _nullQbPortletField) {
            return null;
        }

        if (qbPortletField == null) {
            Session session = null;

            try {
                session = openSession();

                qbPortletField = (QbPortletField) session.get(QbPortletFieldImpl.class,
                        primaryKey);

                if (qbPortletField != null) {
                    cacheResult(qbPortletField);
                } else {
                    EntityCacheUtil.putResult(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
                        QbPortletFieldImpl.class, primaryKey,
                        _nullQbPortletField);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(QbPortletFieldModelImpl.ENTITY_CACHE_ENABLED,
                    QbPortletFieldImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return qbPortletField;
    }

    /**
     * Returns the qb portlet field with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param field_id the primary key of the qb portlet field
     * @return the qb portlet field, or <code>null</code> if a qb portlet field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public QbPortletField fetchByPrimaryKey(long field_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) field_id);
    }

    /**
     * Returns all the qb portlet fields.
     *
     * @return the qb portlet fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<QbPortletField> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<QbPortletField> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<QbPortletField> findAll(int start, int end,
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

        List<QbPortletField> list = (List<QbPortletField>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_QBPORTLETFIELD);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_QBPORTLETFIELD;

                if (pagination) {
                    sql = sql.concat(QbPortletFieldModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<QbPortletField>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<QbPortletField>(list);
                } else {
                    list = (List<QbPortletField>) QueryUtil.list(q,
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
     * Removes all the qb portlet fields from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (QbPortletField qbPortletField : findAll()) {
            remove(qbPortletField);
        }
    }

    /**
     * Returns the number of qb portlet fields.
     *
     * @return the number of qb portlet fields
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

                Query q = session.createQuery(_SQL_COUNT_QBPORTLETFIELD);

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
     * Initializes the qb portlet field persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.genpact.model.QbPortletField")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<QbPortletField>> listenersList = new ArrayList<ModelListener<QbPortletField>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<QbPortletField>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(QbPortletFieldImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
