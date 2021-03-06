package com.genpact.model.impl;

import com.genpact.model.QbPortlet;
import com.genpact.model.QbPortletModel;
import com.genpact.model.QbPortletSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the QbPortlet service. Represents a row in the &quot;t_qb_portlet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.genpact.model.QbPortletModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QbPortletImpl}.
 * </p>
 *
 * @author 710008328
 * @see QbPortletImpl
 * @see com.genpact.model.QbPortlet
 * @see com.genpact.model.QbPortletModel
 * @generated
 */
@JSON(strict = true)
public class QbPortletModelImpl extends BaseModelImpl<QbPortlet>
    implements QbPortletModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a qb portlet model instance should use the {@link com.genpact.model.QbPortlet} interface instead.
     */
    public static final String TABLE_NAME = "t_qb_portlet";
    public static final Object[][] TABLE_COLUMNS = {
            { "portlet_id", Types.BIGINT },
            { "portlet_name", Types.VARCHAR },
            { "portlet_label_name", Types.VARCHAR },
            { "project_id", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table t_qb_portlet (portlet_id LONG not null primary key,portlet_name VARCHAR(75) null,portlet_label_name VARCHAR(75) null,project_id LONG)";
    public static final String TABLE_SQL_DROP = "drop table t_qb_portlet";
    public static final String ORDER_BY_JPQL = " ORDER BY qbPortlet.portlet_id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY t_qb_portlet.portlet_id ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.genpact.model.QbPortlet"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.genpact.model.QbPortlet"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.genpact.model.QbPortlet"));
    private static ClassLoader _classLoader = QbPortlet.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            QbPortlet.class
        };
    private long _portlet_id;
    private String _portlet_name;
    private String _portlet_label_name;
    private long _project_id;
    private QbPortlet _escapedModel;

    public QbPortletModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static QbPortlet toModel(QbPortletSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        QbPortlet model = new QbPortletImpl();

        model.setPortlet_id(soapModel.getPortlet_id());
        model.setPortlet_name(soapModel.getPortlet_name());
        model.setPortlet_label_name(soapModel.getPortlet_label_name());
        model.setProject_id(soapModel.getProject_id());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<QbPortlet> toModels(QbPortletSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<QbPortlet> models = new ArrayList<QbPortlet>(soapModels.length);

        for (QbPortletSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _portlet_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPortlet_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _portlet_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return QbPortlet.class;
    }

    @Override
    public String getModelClassName() {
        return QbPortlet.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("portlet_id", getPortlet_id());
        attributes.put("portlet_name", getPortlet_name());
        attributes.put("portlet_label_name", getPortlet_label_name());
        attributes.put("project_id", getProject_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long portlet_id = (Long) attributes.get("portlet_id");

        if (portlet_id != null) {
            setPortlet_id(portlet_id);
        }

        String portlet_name = (String) attributes.get("portlet_name");

        if (portlet_name != null) {
            setPortlet_name(portlet_name);
        }

        String portlet_label_name = (String) attributes.get(
                "portlet_label_name");

        if (portlet_label_name != null) {
            setPortlet_label_name(portlet_label_name);
        }

        Long project_id = (Long) attributes.get("project_id");

        if (project_id != null) {
            setProject_id(project_id);
        }
    }

    @JSON
    @Override
    public long getPortlet_id() {
        return _portlet_id;
    }

    @Override
    public void setPortlet_id(long portlet_id) {
        _portlet_id = portlet_id;
    }

    @JSON
    @Override
    public String getPortlet_name() {
        if (_portlet_name == null) {
            return StringPool.BLANK;
        } else {
            return _portlet_name;
        }
    }

    @Override
    public void setPortlet_name(String portlet_name) {
        _portlet_name = portlet_name;
    }

    @JSON
    @Override
    public String getPortlet_label_name() {
        if (_portlet_label_name == null) {
            return StringPool.BLANK;
        } else {
            return _portlet_label_name;
        }
    }

    @Override
    public void setPortlet_label_name(String portlet_label_name) {
        _portlet_label_name = portlet_label_name;
    }

    @JSON
    @Override
    public long getProject_id() {
        return _project_id;
    }

    @Override
    public void setProject_id(long project_id) {
        _project_id = project_id;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            QbPortlet.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public QbPortlet toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (QbPortlet) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        QbPortletImpl qbPortletImpl = new QbPortletImpl();

        qbPortletImpl.setPortlet_id(getPortlet_id());
        qbPortletImpl.setPortlet_name(getPortlet_name());
        qbPortletImpl.setPortlet_label_name(getPortlet_label_name());
        qbPortletImpl.setProject_id(getProject_id());

        qbPortletImpl.resetOriginalValues();

        return qbPortletImpl;
    }

    @Override
    public int compareTo(QbPortlet qbPortlet) {
        long primaryKey = qbPortlet.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof QbPortlet)) {
            return false;
        }

        QbPortlet qbPortlet = (QbPortlet) obj;

        long primaryKey = qbPortlet.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<QbPortlet> toCacheModel() {
        QbPortletCacheModel qbPortletCacheModel = new QbPortletCacheModel();

        qbPortletCacheModel.portlet_id = getPortlet_id();

        qbPortletCacheModel.portlet_name = getPortlet_name();

        String portlet_name = qbPortletCacheModel.portlet_name;

        if ((portlet_name != null) && (portlet_name.length() == 0)) {
            qbPortletCacheModel.portlet_name = null;
        }

        qbPortletCacheModel.portlet_label_name = getPortlet_label_name();

        String portlet_label_name = qbPortletCacheModel.portlet_label_name;

        if ((portlet_label_name != null) && (portlet_label_name.length() == 0)) {
            qbPortletCacheModel.portlet_label_name = null;
        }

        qbPortletCacheModel.project_id = getProject_id();

        return qbPortletCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{portlet_id=");
        sb.append(getPortlet_id());
        sb.append(", portlet_name=");
        sb.append(getPortlet_name());
        sb.append(", portlet_label_name=");
        sb.append(getPortlet_label_name());
        sb.append(", project_id=");
        sb.append(getProject_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.genpact.model.QbPortlet");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>portlet_id</column-name><column-value><![CDATA[");
        sb.append(getPortlet_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>portlet_name</column-name><column-value><![CDATA[");
        sb.append(getPortlet_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>portlet_label_name</column-name><column-value><![CDATA[");
        sb.append(getPortlet_label_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>project_id</column-name><column-value><![CDATA[");
        sb.append(getProject_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
