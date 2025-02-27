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
 * Container for access control policy points.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessControlPolicyPoints.class)
})
public interface AccessControlPolicyPoints {

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
     *
     * @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
    PolicyAdministrationPoint getPolicyAdministrationPoint();

    /**
     * The access control administration policy point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
     *
     * @param policyAdministrationPoint desired value for the property policyAdministrationPoint.
     */
    void setPolicyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint);

    /**
     * The access control policy decision point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
     *
     * @return Returns the PolicyDecisionPoint for the property policyDecisionPoint.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
    PolicyDecisionPoint getPolicyDecisionPoint();

    /**
     * The access control policy decision point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
     *
     * @param policyDecisionPoint desired value for the property policyDecisionPoint.
     */
    void setPolicyDecisionPoint(PolicyDecisionPoint policyDecisionPoint);

    /**
     * The access control policy enforcement point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint
     *
     * @return Returns the PolicyEnforcementPoints for the property policyEnforcementPoint.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
    PolicyEnforcementPoints getPolicyEnforcementPoint();

    /**
     * The access control policy enforcement point of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint
     *
     * @param policyEnforcementPoint desired value for the property policyEnforcementPoint.
     */
    void setPolicyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint);

    /**
     * The access control policy information points of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
     *
     * @return Returns the PolicyInformationPoints for the property policyInformationPoints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
    PolicyInformationPoints getPolicyInformationPoints();

    /**
     * The access control policy information points of the AAS.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
     *
     * @param policyInformationPoints desired value for the property policyInformationPoints.
     */
    void setPolicyInformationPoints(PolicyInformationPoints policyInformationPoints);

}
