package com.genpact.service.messaging;

import com.genpact.service.ClpSerializer;
import com.genpact.service.DataGeneratorLocalServiceUtil;
import com.genpact.service.DataGeneratorServiceUtil;
import com.genpact.service.QbPortletFieldLocalServiceUtil;
import com.genpact.service.QbPortletFieldServiceUtil;
import com.genpact.service.QbPortletLocalServiceUtil;
import com.genpact.service.QbPortletServiceUtil;
import com.genpact.service.QbProjectLocalServiceUtil;
import com.genpact.service.QbProjectServiceUtil;
import com.genpact.service.TalendProcessLocalServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            DataGeneratorLocalServiceUtil.clearService();

            DataGeneratorServiceUtil.clearService();
            QbPortletLocalServiceUtil.clearService();

            QbPortletServiceUtil.clearService();
            QbPortletFieldLocalServiceUtil.clearService();

            QbPortletFieldServiceUtil.clearService();
            QbProjectLocalServiceUtil.clearService();

            QbProjectServiceUtil.clearService();
            TalendProcessLocalServiceUtil.clearService();
        }
    }
}
