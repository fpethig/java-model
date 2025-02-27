/*
Copyright (c) 2021 Fraunhofer IOSB-INA Lemgo,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IOSB-ILT Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IAIS,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IESE,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

Copyright (c) 2021 Fraunhofer IWU Karlsruhe,
    eine rechtlich nicht selbstaendige Einrichtung der Fraunhofer-Gesellschaft
    zur Foerderung der angewandten Forschung e.V.

This source code is licensed under the Apache License 2.0 (see LICENSE.txt).

This source code may use other Open Source software components (see LICENSE.txt).
*/

package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Definition of a security administration point (PDP).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultPolicyAdministrationPoint.class)
})
public interface PolicyAdministrationPoint {

    /**
     * The policy administration point of access control as realized by the AAS itself.
     *
     * Constraint AASd-009: Either there is an external policy administration point endpoint defined or
     * the AAS has its own access control.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
     *
     * @return Returns the AccessControl for the property localAccessControl.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
    AccessControl getLocalAccessControl();

    /**
     * The policy administration point of access control as realized by the AAS itself.
     *
     * Constraint AASd-009: Either there is an external policy administration point endpoint defined or
     * the AAS has its own access control.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
     *
     * @param localAccessControl desired value for the property localAccessControl.
     */
    void setLocalAccessControl(AccessControl localAccessControl);

    /**
     * Endpoint to an external access control defining a policy administration point to be used by the
     * AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
     *
     * @return Returns the boolean for the property externalAccessControl.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
    boolean getExternalAccessControl();

    /**
     * Endpoint to an external access control defining a policy administration point to be used by the
     * AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
     *
     * @param externalAccessControl desired value for the property externalAccessControl.
     */
    void setExternalAccessControl(boolean externalAccessControl);

}
