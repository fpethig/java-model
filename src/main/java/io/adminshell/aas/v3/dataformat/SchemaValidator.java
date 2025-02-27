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

package io.adminshell.aas.v3.dataformat;

import java.util.Set;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Validator that can validate a serialized AASEnvironment according to a specific schema.
 */
public interface SchemaValidator {

    /**
     * Validate a serialized AASEnvironment according to a specific Schema. Does not contain any
     * additional validation, but is restricted to schema validation only.
     * 
     * @param serializedAASEnvironment A string-serialized AASEnvironment.
     * @return Set of validation errors. If validation succeeds, the Set is empty.
     */
    public Set<String> validateSchema(String serializedAASEnvironment);

}
