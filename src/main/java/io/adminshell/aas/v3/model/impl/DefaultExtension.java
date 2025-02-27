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
 * Default implementation of package io.adminshell.aas.v3.model.Extension
 * 
 * Single extension of an element. Constraint AASd-077: The name of an extension within
 * HasExtensions needs to be unique.
 */

public class DefaultExtension implements Extension {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    protected String name;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    protected Reference refersTo;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    protected String value;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    protected String valueType;

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    public DefaultExtension() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.name,
            this.valueType,
            this.value,
            this.refersTo,
            this.semanticId);
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
            DefaultExtension other = (DefaultExtension) obj;
            return Objects.equals(this.name, other.name) &&
                Objects.equals(this.valueType, other.valueType) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.refersTo, other.refersTo) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getValueType() {
        return valueType;
    }

    @Override
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Reference getRefersTo() {
        return refersTo;
    }

    @Override
    public void setRefersTo(Reference refersTo) {
        this.refersTo = refersTo;
    }

    @Override
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    /**
     * This builder class can be used to construct a DefaultExtension bean.
     */
    public static class Builder extends ExtensionBuilder<DefaultExtension, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultExtension newBuildingInstance() {
            return new DefaultExtension();
        }
    }
}
