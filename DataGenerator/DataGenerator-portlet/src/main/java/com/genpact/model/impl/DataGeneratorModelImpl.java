package com.genpact.model.impl;

import com.genpact.model.DataGenerator;
import com.genpact.model.DataGeneratorModel;
import com.genpact.model.DataGeneratorSoap;

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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DataGenerator service. Represents a row in the &quot;t_data_generator&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.genpact.model.DataGeneratorModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DataGeneratorImpl}.
 * </p>
 *
 * @author 710008328
 * @see DataGeneratorImpl
 * @see com.genpact.model.DataGenerator
 * @see com.genpact.model.DataGeneratorModel
 * @generated
 */
@JSON(strict = true)
public class DataGeneratorModelImpl extends BaseModelImpl<DataGenerator>
    implements DataGeneratorModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a data generator model instance should use the {@link com.genpact.model.DataGenerator} interface instead.
     */
    public static final String TABLE_NAME = "t_data_generator";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "data_", Types.VARCHAR },
            { "type_", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table t_data_generator (id_ LONG not null primary key,data_ VARCHAR(75) null,type_ VARCHAR(75) null,createDate DATE null)";
    public static final String TABLE_SQL_DROP = "drop table t_data_generator";
    public static final String ORDER_BY_JPQL = " ORDER BY dataGenerator.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY t_data_generator.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.genpact.model.DataGenerator"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.genpact.model.DataGenerator"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.genpact.model.DataGenerator"));
    private static ClassLoader _classLoader = DataGenerator.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            DataGenerator.class
        };
    private long _id;
    private String _data;
    private String _type;
    private Date _createDate;
    private DataGenerator _escapedModel;

    public DataGeneratorModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static DataGenerator toModel(DataGeneratorSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        DataGenerator model = new DataGeneratorImpl();

        model.setId(soapModel.getId());
        model.setData(soapModel.getData());
        model.setType(soapModel.getType());
        model.setCreateDate(soapModel.getCreateDate());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<DataGenerator> toModels(DataGeneratorSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<DataGenerator> models = new ArrayList<DataGenerator>(soapModels.length);

        for (DataGeneratorSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return DataGenerator.class;
    }

    @Override
    public String getModelClassName() {
        return DataGenerator.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("data", getData());
        attributes.put("type", getType());
        attributes.put("createDate", getCreateDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String data = (String) attributes.get("data");

        if (data != null) {
            setData(data);
        }

        String type = (String) attributes.get("type");

        if (type != null) {
            setType(type);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }
    }

    @JSON
    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @JSON
    @Override
    public String getData() {
        if (_data == null) {
            return StringPool.BLANK;
        } else {
            return _data;
        }
    }

    @Override
    public void setData(String data) {
        _data = data;
    }

    @JSON
    @Override
    public String getType() {
        if (_type == null) {
            return StringPool.BLANK;
        } else {
            return _type;
        }
    }

    @Override
    public void setType(String type) {
        _type = type;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            DataGenerator.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public DataGenerator toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (DataGenerator) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        DataGeneratorImpl dataGeneratorImpl = new DataGeneratorImpl();

        dataGeneratorImpl.setId(getId());
        dataGeneratorImpl.setData(getData());
        dataGeneratorImpl.setType(getType());
        dataGeneratorImpl.setCreateDate(getCreateDate());

        dataGeneratorImpl.resetOriginalValues();

        return dataGeneratorImpl;
    }

    @Override
    public int compareTo(DataGenerator dataGenerator) {
        long primaryKey = dataGenerator.getPrimaryKey();

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

        if (!(obj instanceof DataGenerator)) {
            return false;
        }

        DataGenerator dataGenerator = (DataGenerator) obj;

        long primaryKey = dataGenerator.getPrimaryKey();

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
    public CacheModel<DataGenerator> toCacheModel() {
        DataGeneratorCacheModel dataGeneratorCacheModel = new DataGeneratorCacheModel();

        dataGeneratorCacheModel.id = getId();

        dataGeneratorCacheModel.data = getData();

        String data = dataGeneratorCacheModel.data;

        if ((data != null) && (data.length() == 0)) {
            dataGeneratorCacheModel.data = null;
        }

        dataGeneratorCacheModel.type = getType();

        String type = dataGeneratorCacheModel.type;

        if ((type != null) && (type.length() == 0)) {
            dataGeneratorCacheModel.type = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            dataGeneratorCacheModel.createDate = createDate.getTime();
        } else {
            dataGeneratorCacheModel.createDate = Long.MIN_VALUE;
        }

        return dataGeneratorCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", data=");
        sb.append(getData());
        sb.append(", type=");
        sb.append(getType());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.genpact.model.DataGenerator");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>data</column-name><column-value><![CDATA[");
        sb.append(getData());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
