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
 * Enumeration of all referable elements within an asset administration shell. Contains
 * IdentifiableElements
 */
public enum ReferableElements {

    /** 
    */
    ASSET,

    /** 
    */
    ASSET_ADMINISTRATION_SHELL,

    /** 
    */
    CONCEPT_DESCRIPTION,

    /** 
    */
    SUBMODEL,

    /** 
    */
    ACCESS_PERMISSION_RULE,

    /** 
    */
    ANNOTATED_RELATIONSHIP_ELEMENT,

    /** 
    */
    BASIC_EVENT,

    /** 
    */
    BLOB,

    /** 
    */
    CAPABILITY,

    /** 
    */
    CONCEPT_DICTIONARY,

    /**
     * Data Element is abstract, i.e. if a key uses 'DataElement' the reference may be a Property, a
     * File etc.
     */
    DATA_ELEMENT,

    /** 
    */
    ENTITY,

    /**
     * Event is abstract
     */
    EVENT,

    /**
     * Property with a value that can be provided in multiple languages.
     */
    MULTI_LANGUAGE_PROPERTY,

    /** 
    */
    OPERATION,

    /** 
    */
    PROPERTY,

    /** 
    */
    RANGE,

    /** 
    */
    REFERENCE_ELEMENT,

    /** 
    */
    RELATIONSHIP_ELEMENT,

    /**
     * Submodel Element is abstract, i.e. if a key uses 'SubmodelElement' the reference may be a
     * Property, a SubmodelElementCollection, an Operation etc.
     */
    SUBMODEL_ELEMENT,

    /**
     * Collection of Submodel Elements
     */
    SUBMODEL_ELEMENT_COLLECTION,

    /** 
    */
    VIEW;

}
