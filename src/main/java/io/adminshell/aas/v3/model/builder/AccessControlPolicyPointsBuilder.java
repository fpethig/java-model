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

package io.adminshell.aas.v3.model.builder;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class AccessControlPolicyPointsBuilder<T extends AccessControlPolicyPoints, B extends AccessControlPolicyPointsBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for policyAdministrationPoint
     * 
     * @param policyAdministrationPoint desired value to be set
     * @return Builder object with new value for policyAdministrationPoint
     */
    public B policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
        getBuildingInstance().setPolicyAdministrationPoint(policyAdministrationPoint);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyDecisionPoint
     * 
     * @param policyDecisionPoint desired value to be set
     * @return Builder object with new value for policyDecisionPoint
     */
    public B policyDecisionPoint(PolicyDecisionPoint policyDecisionPoint) {
        getBuildingInstance().setPolicyDecisionPoint(policyDecisionPoint);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyEnforcementPoint
     * 
     * @param policyEnforcementPoint desired value to be set
     * @return Builder object with new value for policyEnforcementPoint
     */
    public B policyEnforcementPoint(PolicyEnforcementPoints policyEnforcementPoint) {
        getBuildingInstance().setPolicyEnforcementPoint(policyEnforcementPoint);
        return getSelf();
    }

    /**
     * This function allows setting a value for policyInformationPoints
     * 
     * @param policyInformationPoints desired value to be set
     * @return Builder object with new value for policyInformationPoints
     */
    public B policyInformationPoints(PolicyInformationPoints policyInformationPoints) {
        getBuildingInstance().setPolicyInformationPoints(policyInformationPoints);
        return getSelf();
    }
}
