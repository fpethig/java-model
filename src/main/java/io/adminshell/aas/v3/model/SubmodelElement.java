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
 * A submodel element is an element suitable for the description and differentiation of assets. The
 * concept of type and instance applies to submodel elements. Properties are special submodel
 * elements. The property types are defined in dictionaries (like the IEC Common Data Dictionary or
 * eCl@ss), they do not have a value. The property type (kind=Type) is also called data element type
 * in some standards. The property instances (kind=Instance) typically have a value. A property
 * instance is also called property-value pair in certain standards.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = RelationshipElement.class),
    @KnownSubtypes.Type(value = DataElement.class),
    @KnownSubtypes.Type(value = File.class),
    @KnownSubtypes.Type(value = Event.class),
    @KnownSubtypes.Type(value = Capability.class),
    @KnownSubtypes.Type(value = Entity.class),
    @KnownSubtypes.Type(value = EventElement.class),
    @KnownSubtypes.Type(value = EventMessage.class),
    @KnownSubtypes.Type(value = Operation.class),
    @KnownSubtypes.Type(value = SubmodelElementCollection.class)
})
public interface SubmodelElement extends Referable, Qualifiable, HasDataSpecification, HasKind, HasSemantics {

}
