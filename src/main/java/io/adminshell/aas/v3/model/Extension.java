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
 * Single extension of an element. Constraint AASd-077: The name of an extension within
 * HasExtensions needs to be unique.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultExtension.class)
})
public interface Extension extends HasSemantics {

    /**
     * An extension of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/name
     *
     * @return Returns the String for the property name.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    String getName();

    /**
     * An extension of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/name
     *
     * @param name desired value for the property name.
     */
    void setName(String name);

    /**
     * Type of the value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/valueType
     *
     * @return Returns the String for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    String getValueType();

    /**
     * Type of the value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    void setValueType(String valueType);

    /**
     * Value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    String getValue();

    /**
     * Value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/value
     *
     * @param value desired value for the property value.
     */
    void setValue(String value);

    /**
     * Reference to an element the extension refers to.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
     *
     * @return Returns the Reference for the property refersTo.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    Reference getRefersTo();

    /**
     * Reference to an element the extension refers to.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
     *
     * @param refersTo desired value for the property refersTo.
     */
    void setRefersTo(Reference refersTo);

}
