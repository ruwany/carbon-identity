/*
*
*   Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*   WSO2 Inc. licenses this file to you under the Apache License,
*   Version 2.0 (the "License"); you may not use this file except
*   in compliance with the License.
*   You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*
*/

package org.wso2.carbon.identity.notification.mgt.email;


import org.wso2.carbon.identity.notification.mgt.NotificationMgtConstants;

/**
 * Constants for Email message sending module
 */
public class EmailModuleConstants {

    public static final String MODULE_NAME = "email";
    public static final String SUBJECT_PROPERTY_LABLE = "subject";
    public static final String MAILTO_LABEL = "mailto:";

    /**
     * Configuration constants for email sending module
     */
    public static class Config {
        public static final String MAIL_TEMPLATE_QNAME = "template";
        public static final String ENDPOINT_QNAME = "endpoint";
        public static final String ADDRESS_QNAME = "address";
        public static final String SUBSCRIPTION_NS = MODULE_NAME + "." + NotificationMgtConstants.Configs.SUBSCRIPTION;
    }


}

