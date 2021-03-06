package com.genpact.model.impl;

import com.genpact.model.TalendProcess;

import com.genpact.service.TalendProcessLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the TalendProcess service. Represents a row in the &quot;talend_TalendProcess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TalendProcessImpl}.
 * </p>
 *
 * @author 710008328
 * @see TalendProcessImpl
 * @see com.genpact.model.TalendProcess
 * @generated
 */
public abstract class TalendProcessBaseImpl extends TalendProcessModelImpl
    implements TalendProcess {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a talend process model instance should use the {@link TalendProcess} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TalendProcessLocalServiceUtil.addTalendProcess(this);
        } else {
            TalendProcessLocalServiceUtil.updateTalendProcess(this);
        }
    }
}
