package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
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
    public String getName();

    /**
     * An extension of the element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/name
     *
     * @param name desired value for the property name.
     */
    public void setName(String name);

    /**
     * Type of the value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/valueType
     *
     * @return Returns the String for the property valueType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    public String getValueType();

    /**
     * Type of the value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/valueType
     *
     * @param valueType desired value for the property valueType.
     */
    public void setValueType(String valueType);

    /**
     * Value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/value
     *
     * @return Returns the String for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    public String getValue();

    /**
     * Value of the extension.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/value
     *
     * @param value desired value for the property value.
     */
    public void setValue(String value);

    /**
     * Reference to an element the extension refers to.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
     *
     * @return Returns the Reference for the property refersTo.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    public Reference getRefersTo();

    /**
     * Reference to an element the extension refers to.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
     *
     * @param refersTo desired value for the property refersTo.
     */
    public void setRefersTo(Reference refersTo);

}
