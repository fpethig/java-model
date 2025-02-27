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
 * Default implementation of package io.adminshell.aas.v3.model.Formula
 * 
 */

public class DefaultFormula implements Formula {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn")
    protected List<Reference> dependsOns = new ArrayList<>();

    public DefaultFormula() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.dependsOns);
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
            DefaultFormula other = (DefaultFormula) obj;
            return Objects.equals(this.dependsOns, other.dependsOns);
        }
    }

    @Override
    public List<Reference> getDependsOns() {
        return dependsOns;
    }

    @Override
    public void setDependsOns(List<Reference> dependsOns) {
        this.dependsOns = dependsOns;
    }

    /**
     * This builder class can be used to construct a DefaultFormula bean.
     */
    public static class Builder extends FormulaBuilder<DefaultFormula, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultFormula newBuildingInstance() {
            return new DefaultFormula();
        }
    }
}
