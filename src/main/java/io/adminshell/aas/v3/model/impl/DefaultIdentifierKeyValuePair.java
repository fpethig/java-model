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
 * Default implementation of package io.adminshell.aas.v3.model.IdentifierKeyValuePair
 * 
 * An IdentifierKeyValuePair describes a generic identifier as key-value pair.
 */

public class DefaultIdentifierKeyValuePair implements IdentifierKeyValuePair {

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/externalSubjectId")
    protected Reference externalSubjectId;

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/key")
    protected String key;

    @IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierKeyValuePair/value")
    protected String value;

    public DefaultIdentifierKeyValuePair() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.key,
            this.value,
            this.externalSubjectId,
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
            DefaultIdentifierKeyValuePair other = (DefaultIdentifierKeyValuePair) obj;
            return Objects.equals(this.key, other.key) &&
                Objects.equals(this.value, other.value) &&
                Objects.equals(this.externalSubjectId, other.externalSubjectId) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
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
    public Reference getExternalSubjectId() {
        return externalSubjectId;
    }

    @Override
    public void setExternalSubjectId(Reference externalSubjectId) {
        this.externalSubjectId = externalSubjectId;
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
     * This builder class can be used to construct a DefaultIdentifierKeyValuePair bean.
     */
    public static class Builder extends IdentifierKeyValuePairBuilder<DefaultIdentifierKeyValuePair, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultIdentifierKeyValuePair newBuildingInstance() {
            return new DefaultIdentifierKeyValuePair();
        }
    }
}
