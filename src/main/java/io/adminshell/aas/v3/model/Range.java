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
 * An element that is referable by its idShort. This id is not globally unique. This id is unique
 * within the name space of the element. Constraint AASd-053: The semanticId of a Range submodel
 * element shall only reference a ConceptDescription with the category PROPERTY. Constraint
 * AASd-068: If the semanticId of a Range references a ConceptDescription then
 * DataSpecificationIEC61360/dataType shall be a numerical one, i.e. REAL_* or RATIONAL_*.
 * Constraint AASd-069: If the semanticId of a Range references a ConceptDescription then
 * DataSpecificationIEC61360/levelType shall be identical to the set {Min,Max}.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRange.class)
})
public interface Range extends DataElement {

    /**
     * Data type of the min and max.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/valueType
     *
     * @return Returns the String for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/valueType")
    String getValueType();

    /**
     * Data type of the min and max.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(String valueType);

    /**
     * The maximum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/max
     *
     * @return Returns the String for the property max.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/max")
    String getMax();

    /**
     * The maximum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/max
     *
     * @param max desired value for the property max.
     */
    void setMax(String max);

    /**
     * The minimum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/min
     *
     * @return Returns the String for the property min.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/min")
    String getMin();

    /**
     * The minimum value of the range.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Range/min
     *
     * @param min desired value for the property min.
     */
    void setMin(String min);

}
