/*
 *Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *WSO2 Inc. licenses this file to you under the Apache License,
 *Version 2.0 (the "License"); you may not use this file except
 *in compliance with the License.
 *You may obtain a copy of the License at
 *
 *http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing,
 *software distributed under the License is distributed on an
 *"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *KIND, either express or implied.  See the License for the
 *specific language governing permissions and limitations
 *under the License.
 */

package org.wso2.carbon.idp.mgt.internal;

import org.wso2.carbon.idp.mgt.listener.IdentityProviderMgtListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @scr.component name="org.wso2.carbon.idp.mgt.listener" immediate="true"
 * @scr.reference name="idp.mgt.event.listener.service"
 * interface="org.wso2.carbon.idp.mgt.listener.IdentityProviderMgtListener"
 * cardinality="0..n" policy="dynamic"
 * bind="setIdentityProviderMgtListerService"
 * unbind="unsetIdentityProviderMgtListerService"
 */
public class IdpMgtListenerServiceComponent {

    private static Map<Integer, IdentityProviderMgtListener> idpMgtListeners;
    private static Collection<IdentityProviderMgtListener> idpMgtListenerCollection;

    protected static synchronized void setApplicationMgtListenerService(
            IdentityProviderMgtListener applicationMgtListenerService) {
        idpMgtListenerCollection = null;
        if (idpMgtListeners == null) {
            idpMgtListeners = new TreeMap<>();
        }
        idpMgtListeners.put(applicationMgtListenerService.getExecutionOrderId(),
                applicationMgtListenerService);
    }

    protected static synchronized void unsetApplicationMgtListenerService(
            IdentityProviderMgtListener applicationMgtListenerService) {
        if (applicationMgtListenerService != null &&
                idpMgtListeners != null) {
            idpMgtListenerCollection = null;
        }
    }

    public static synchronized Collection<IdentityProviderMgtListener> getIdpMgtListeners() {
        if (idpMgtListeners == null) {
            idpMgtListeners = new TreeMap<>();
        }
        if (idpMgtListenerCollection == null) {
            idpMgtListenerCollection =
                    idpMgtListeners.values();
        }
        return idpMgtListenerCollection;
    }
}
