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

package de.gematik.ti.fdv.epa.service.localization.spi;

import java.net.URL;
import java.util.function.Consumer;

import de.gematik.ti.fdv.epa.service.localization.api.LookupStatus;
import de.gematik.ti.fdv.epa.service.localization.api.ServiceInterfaceName;

/**
 * include::{userguide}/ESLAPI_Structure.adoc[tag=IServiceLocalizer]
 *
 */
public interface IServiceLocalizer {

    /**
     start a new DNS lookup, e.g. if previous one ended erroneously
     */
    void lookup(String fqdn, Consumer<LookupStatus> callback);

    /**
     * After successful lookup, it returns endpointURL for a given interface name
     *
     * @param serviceInterfaceName name of the gateway interface where to get the URL for
     * @return URL of given interface name
     */
    URL endpointURLForInterface(ServiceInterfaceName serviceInterfaceName);

    /**
     *  Returns the status of service lookup in DNS
     * @return status of service lookup in DNS
     */
    LookupStatus getLookupStatus();
}
