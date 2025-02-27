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
 * Used to uniquely identify an entity by using an identifier.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultIdentifier.class)
})
public interface Identifier {

    /**
     * A globally unique identifier which might not be a URI. Its type is defined in idType.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
     *
     * @return Returns the String for the property identifier.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    String getIdentifier();

    /**
     * A globally unique identifier which might not be a URI. Its type is defined in idType.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifier/identifier
     *
     * @param identifier desired value for the property identifier.
     */
    void setIdentifier(String identifier);

    /**
     * Type of the Identifier, e.g. Iri, Irdi etc. The supported Identifier types are defined in the
     * enumeration 'IdentifierType'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifier/idType
     *
     * @return Returns the IdentifierType for the property idType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    IdentifierType getIdType();

    /**
     * Type of the Identifier, e.g. Iri, Irdi etc. The supported Identifier types are defined in the
     * enumeration 'IdentifierType'.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Identifier/idType
     *
     * @param idType desired value for the property idType.
     */
    void setIdType(IdentifierType idType);

}
