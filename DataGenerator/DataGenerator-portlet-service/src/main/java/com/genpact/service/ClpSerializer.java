package com.genpact.service;

import com.genpact.model.DataGeneratorClp;
import com.genpact.model.QbPortletClp;
import com.genpact.model.QbPortletFieldClp;
import com.genpact.model.QbProjectClp;
import com.genpact.model.TalendProcessClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "DataGenerator-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "DataGenerator-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "DataGenerator-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(DataGeneratorClp.class.getName())) {
            return translateInputDataGenerator(oldModel);
        }

        if (oldModelClassName.equals(QbPortletClp.class.getName())) {
            return translateInputQbPortlet(oldModel);
        }

        if (oldModelClassName.equals(QbPortletFieldClp.class.getName())) {
            return translateInputQbPortletField(oldModel);
        }

        if (oldModelClassName.equals(QbProjectClp.class.getName())) {
            return translateInputQbProject(oldModel);
        }

        if (oldModelClassName.equals(TalendProcessClp.class.getName())) {
            return translateInputTalendProcess(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputDataGenerator(BaseModel<?> oldModel) {
        DataGeneratorClp oldClpModel = (DataGeneratorClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getDataGeneratorRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputQbPortlet(BaseModel<?> oldModel) {
        QbPortletClp oldClpModel = (QbPortletClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getQbPortletRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputQbPortletField(BaseModel<?> oldModel) {
        QbPortletFieldClp oldClpModel = (QbPortletFieldClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getQbPortletFieldRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputQbProject(BaseModel<?> oldModel) {
        QbProjectClp oldClpModel = (QbProjectClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getQbProjectRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputTalendProcess(BaseModel<?> oldModel) {
        TalendProcessClp oldClpModel = (TalendProcessClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getTalendProcessRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals("com.genpact.model.impl.DataGeneratorImpl")) {
            return translateOutputDataGenerator(oldModel);
        }

        if (oldModelClassName.equals("com.genpact.model.impl.QbPortletImpl")) {
            return translateOutputQbPortlet(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.genpact.model.impl.QbPortletFieldImpl")) {
            return translateOutputQbPortletField(oldModel);
        }

        if (oldModelClassName.equals("com.genpact.model.impl.QbProjectImpl")) {
            return translateOutputQbProject(oldModel);
        }

        if (oldModelClassName.equals("com.genpact.model.impl.TalendProcessImpl")) {
            return translateOutputTalendProcess(oldModel);
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("com.genpact.NoSuchDataGeneratorException")) {
            return new com.genpact.NoSuchDataGeneratorException();
        }

        if (className.equals("com.genpact.NoSuchQbPortletException")) {
            return new com.genpact.NoSuchQbPortletException();
        }

        if (className.equals("com.genpact.NoSuchQbPortletFieldException")) {
            return new com.genpact.NoSuchQbPortletFieldException();
        }

        if (className.equals("com.genpact.NoSuchQbProjectException")) {
            return new com.genpact.NoSuchQbProjectException();
        }

        if (className.equals("com.genpact.NoSuchTalendProcessException")) {
            return new com.genpact.NoSuchTalendProcessException();
        }

        return throwable;
    }

    public static Object translateOutputDataGenerator(BaseModel<?> oldModel) {
        DataGeneratorClp newModel = new DataGeneratorClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setDataGeneratorRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputQbPortlet(BaseModel<?> oldModel) {
        QbPortletClp newModel = new QbPortletClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setQbPortletRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputQbPortletField(BaseModel<?> oldModel) {
        QbPortletFieldClp newModel = new QbPortletFieldClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setQbPortletFieldRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputQbProject(BaseModel<?> oldModel) {
        QbProjectClp newModel = new QbProjectClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setQbProjectRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputTalendProcess(BaseModel<?> oldModel) {
        TalendProcessClp newModel = new TalendProcessClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setTalendProcessRemoteModel(oldModel);

        return newModel;
    }
}
