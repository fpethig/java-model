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

package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.PolicyDecisionPoint
 * 
 * Defines a security policy decision point (PDP).
 */

public class DefaultPolicyDecisionPoint implements PolicyDecisionPoint {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
    protected boolean externalPolicyDecisionPoints;

    public DefaultPolicyDecisionPoint() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.externalPolicyDecisionPoints);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultPolicyDecisionPoint other = (DefaultPolicyDecisionPoint) obj;
            return Objects.equals(this.externalPolicyDecisionPoints, other.externalPolicyDecisionPoints);
        }
    }

    @Override
    public boolean getExternalPolicyDecisionPoints() {
        return externalPolicyDecisionPoints;
    }

    @Override
    public void setExternalPolicyDecisionPoints(boolean externalPolicyDecisionPoints) {
        this.externalPolicyDecisionPoints = externalPolicyDecisionPoints;
    }

    /**
     * This builder class can be used to construct a DefaultPolicyDecisionPoint bean.
     */
    public static class Builder extends PolicyDecisionPointBuilder<DefaultPolicyDecisionPoint, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyDecisionPoint newBuildingInstance() {
            return new DefaultPolicyDecisionPoint();
        }
    }
}
