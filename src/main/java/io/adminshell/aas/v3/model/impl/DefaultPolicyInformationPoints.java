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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.PolicyInformationPoints
 * 
 * Defines the security policy information points (PIP). Serves as the retrieval source of
 * attributes, or the data required for policy evaluation to provide the information needed by the
 * policy decision point to make the decisions.
 */

public class DefaultPolicyInformationPoints implements PolicyInformationPoints {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
    protected boolean externalInformationPoints;

    @IRI("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
    protected List<Reference> internalInformationPoints = new ArrayList<>();

    public DefaultPolicyInformationPoints() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.externalInformationPoints,
            this.internalInformationPoints);
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
            DefaultPolicyInformationPoints other = (DefaultPolicyInformationPoints) obj;
            return Objects.equals(this.externalInformationPoints, other.externalInformationPoints) &&
                Objects.equals(this.internalInformationPoints, other.internalInformationPoints);
        }
    }

    @Override
    public boolean getExternalInformationPoints() {
        return externalInformationPoints;
    }

    @Override
    public void setExternalInformationPoints(boolean externalInformationPoints) {
        this.externalInformationPoints = externalInformationPoints;
    }

    @Override
    public List<Reference> getInternalInformationPoints() {
        return internalInformationPoints;
    }

    @Override
    public void setInternalInformationPoints(List<Reference> internalInformationPoints) {
        this.internalInformationPoints = internalInformationPoints;
    }

    /**
     * This builder class can be used to construct a DefaultPolicyInformationPoints bean.
     */
    public static class Builder extends PolicyInformationPointsBuilder<DefaultPolicyInformationPoints, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPolicyInformationPoints newBuildingInstance() {
            return new DefaultPolicyInformationPoints();
        }
    }
}
