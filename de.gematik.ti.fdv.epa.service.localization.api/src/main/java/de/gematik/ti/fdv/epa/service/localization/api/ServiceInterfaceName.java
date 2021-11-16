/*
 * Copyright (c) 2021 gematik GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.gematik.ti.fdv.epa.service.localization.api;

/**
 * include::{userguide}/ESLAPI_Structure.adoc[tag=IServiceLocalizer]
 *
 */
public enum ServiceInterfaceName {
    IAuthenticationInsurant("I_Authentication_Insurant", "authn"),
    IAuthorizationInsurant("I_Authorization_Insurant", "authz"),
    IAuthorizationManagementInsurant("I_Authorization_Management_Insurant", "authz"),
    IAccountManagementInsurant("I_Account_Management_Insurant", "docv"),
    IDocumentManagementConnect("I_Document_Management_Connect", "docv"),
    IDocumentManagementInsurant("I_Document_Management_Insurant", "docv"),
    IOCSPStatusInformation("I_OCSP_Status_Information", "ocspf"),
    IProxyDirectoryQuery("I_Proxy_Directory_Query", "avzd"),
    IGetKeySgd1("", "sgd1"),
    IGetKeySgd2("", "sgd2");

    private final String serviceLocatorName;
    private final String moduleName;

    ServiceInterfaceName(final String serviceLocatorName, final String moduleName) {
        this.serviceLocatorName = serviceLocatorName;
        this.moduleName = moduleName;
    }

    /**
     * Getter for service interface name
     * @return service interface name
     */
    public String getServiceLocatorName() {
        return serviceLocatorName;
    }

    /**
     * Getter for module name
     * @return module name
     */
    public String getModuleName() {
        return moduleName;
    }
}
