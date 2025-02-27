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

import java.util.List;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Table that defines access permissions per authenticated subject for a set of objects (referable
 * elements).
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultAccessPermissionRule.class)
})
public interface AccessPermissionRule extends Referable, Qualifiable {

    /**
     * Set of object-permission pairs that define the permissions per object within the access
     * permission rule.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject
     *
     * @return Returns the List of PermissionsPerObjects for the property permissionsPerObjects.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
    List<PermissionsPerObject> getPermissionsPerObjects();

    /**
     * Set of object-permission pairs that define the permissions per object within the access
     * permission rule.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject
     *
     * @param permissionsPerObjects desired value for the property permissionsPerObjects.
     */
    void setPermissionsPerObjects(List<PermissionsPerObject> permissionsPerObjects);

    /**
     * Target subject attributes that need to be fulfilled by the accessing subject to get the
     * permissions defined by this rule.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes
     *
     * @return Returns the SubjectAttributes for the property targetSubjectAttributes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
    SubjectAttributes getTargetSubjectAttributes();

    /**
     * Target subject attributes that need to be fulfilled by the accessing subject to get the
     * permissions defined by this rule.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes
     *
     * @param targetSubjectAttributes desired value for the property targetSubjectAttributes.
     */
    void setTargetSubjectAttributes(SubjectAttributes targetSubjectAttributes);

}
