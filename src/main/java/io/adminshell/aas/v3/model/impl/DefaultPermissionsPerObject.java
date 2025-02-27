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
 * Default implementation of package io.adminshell.aas.v3.model.PermissionsPerObject
 * 
 * Table that defines access permissions for a specified object. The object is any referable element
 * in the AAS. Additionally object attributes can be defined that further specify the kind of object
 * the permissions apply to.
 */

public class DefaultPermissionsPerObject implements PermissionsPerObject {

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
    protected Referable object;

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
    protected List<Permission> permissions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
    protected ObjectAttributes targetObjectAttributes;

    public DefaultPermissionsPerObject() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.object,
            this.permissions,
            this.targetObjectAttributes);
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
            DefaultPermissionsPerObject other = (DefaultPermissionsPerObject) obj;
            return Objects.equals(this.object, other.object) &&
                Objects.equals(this.permissions, other.permissions) &&
                Objects.equals(this.targetObjectAttributes, other.targetObjectAttributes);
        }
    }

    @Override
    public Referable getObject() {
        return object;
    }

    @Override
    public void setObject(Referable object) {
        this.object = object;
    }

    @Override
    public List<Permission> getPermissions() {
        return permissions;
    }

    @Override
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public ObjectAttributes getTargetObjectAttributes() {
        return targetObjectAttributes;
    }

    @Override
    public void setTargetObjectAttributes(ObjectAttributes targetObjectAttributes) {
        this.targetObjectAttributes = targetObjectAttributes;
    }

    /**
     * This builder class can be used to construct a DefaultPermissionsPerObject bean.
     */
    public static class Builder extends PermissionsPerObjectBuilder<DefaultPermissionsPerObject, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultPermissionsPerObject newBuildingInstance() {
            return new DefaultPermissionsPerObject();
        }
    }
}
