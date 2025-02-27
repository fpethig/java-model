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
 * An element that is referable by its idShort. This id is not globally unique. This id is unique
 * within the name space of the element.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = AccessPermissionRule.class),
    @KnownSubtypes.Type(value = Identifiable.class),
    @KnownSubtypes.Type(value = View.class),
    @KnownSubtypes.Type(value = SubmodelElement.class)
})
public interface Referable {

    /**
     * The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/category
     *
     * @return Returns the String for the property category.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    String getCategory();

    /**
     * The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/category
     *
     * @param category desired value for the property category.
     */
    void setCategory(String category);

    /**
     * Description or comments on the element. The description can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
     *
     * @return Returns the List of LangStrings for the property descriptions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    List<LangString> getDescriptions();

    /**
     * Description or comments on the element. The description can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
     *
     * @param descriptions desired value for the property descriptions.
     */
    void setDescriptions(List<LangString> descriptions);

    /**
     * Display name. Can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
     *
     * @return Returns the List of LangStrings for the property displayNames.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    List<LangString> getDisplayNames();

    /**
     * Display name. Can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
     *
     * @param displayNames desired value for the property displayNames.
     */
    void setDisplayNames(List<LangString> displayNames);

    /**
     * Identifying string of the element within its name space.
     *
     * Constraint AASd-002: idShort shall only feature letters, digits, underscore ('_'); starting with
     * a small letter. I.e. [a-z][a-zA-Z0-9_]+.
     *
     * Constraint AASd-003: idShort shall be matched case-insensitive.
     *
     * Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace.
     *
     * Note: In case the element is a property and the property has a semantic definition (HasSemantics)
     * the idShort is typically identical to the short name in English.
     *
     * Note: In case of an identifiable element idShort is optional but recommended to be defined. It
     * can be used for unique reference in its name space and thus allows better usability and a more
     * performant implementation. In this case it is similar to the 'BrowserPath' in OPC UA.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
     *
     * @return Returns the String for the property idShort.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    String getIdShort();

    /**
     * Identifying string of the element within its name space.
     *
     * Constraint AASd-002: idShort shall only feature letters, digits, underscore ('_'); starting with
     * a small letter. I.e. [a-z][a-zA-Z0-9_]+.
     *
     * Constraint AASd-003: idShort shall be matched case-insensitive.
     *
     * Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace.
     *
     * Note: In case the element is a property and the property has a semantic definition (HasSemantics)
     * the idShort is typically identical to the short name in English.
     *
     * Note: In case of an identifiable element idShort is optional but recommended to be defined. It
     * can be used for unique reference in its name space and thus allows better usability and a more
     * performant implementation. In this case it is similar to the 'BrowserPath' in OPC UA.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
     *
     * @param idShort desired value for the property idShort.
     */
    void setIdShort(String idShort);

}
