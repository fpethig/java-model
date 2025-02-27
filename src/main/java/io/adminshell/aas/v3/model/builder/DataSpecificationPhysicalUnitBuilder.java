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

package io.adminshell.aas.v3.model.builder;

import java.util.List;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DataSpecificationPhysicalUnitBuilder<T extends DataSpecificationPhysicalUnit, B extends DataSpecificationPhysicalUnitBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for conversionFactor
     * 
     * @param conversionFactor desired value to be set
     * @return Builder object with new value for conversionFactor
     */
    public B conversionFactor(String conversionFactor) {
        getBuildingInstance().setConversionFactor(conversionFactor);
        return getSelf();
    }

    /**
     * This function allows setting a value for definitions
     * 
     * @param definitions desired value to be set
     * @return Builder object with new value for definitions
     */
    public B definitions(List<LangString> definitions) {
        getBuildingInstance().setDefinitions(definitions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List definitions
     * 
     * @param definition desired value to be added
     * @return Builder object with new value for definitions
     */
    public B definition(LangString definition) {
        getBuildingInstance().getDefinitions().add(definition);
        return getSelf();
    }

    /**
     * This function allows setting a value for dinNotation
     * 
     * @param dinNotation desired value to be set
     * @return Builder object with new value for dinNotation
     */
    public B dinNotation(String dinNotation) {
        getBuildingInstance().setDinNotation(dinNotation);
        return getSelf();
    }

    /**
     * This function allows setting a value for eceCode
     * 
     * @param eceCode desired value to be set
     * @return Builder object with new value for eceCode
     */
    public B eceCode(String eceCode) {
        getBuildingInstance().setEceCode(eceCode);
        return getSelf();
    }

    /**
     * This function allows setting a value for eceName
     * 
     * @param eceName desired value to be set
     * @return Builder object with new value for eceName
     */
    public B eceName(String eceName) {
        getBuildingInstance().setEceName(eceName);
        return getSelf();
    }

    /**
     * This function allows setting a value for nistName
     * 
     * @param nistName desired value to be set
     * @return Builder object with new value for nistName
     */
    public B nistName(String nistName) {
        getBuildingInstance().setNistName(nistName);
        return getSelf();
    }

    /**
     * This function allows setting a value for siName
     * 
     * @param siName desired value to be set
     * @return Builder object with new value for siName
     */
    public B siName(String siName) {
        getBuildingInstance().setSiName(siName);
        return getSelf();
    }

    /**
     * This function allows setting a value for siNotation
     * 
     * @param siNotation desired value to be set
     * @return Builder object with new value for siNotation
     */
    public B siNotation(String siNotation) {
        getBuildingInstance().setSiNotation(siNotation);
        return getSelf();
    }

    /**
     * This function allows setting a value for registrationAuthorityId
     * 
     * @param registrationAuthorityId desired value to be set
     * @return Builder object with new value for registrationAuthorityId
     */
    public B registrationAuthorityId(String registrationAuthorityId) {
        getBuildingInstance().setRegistrationAuthorityId(registrationAuthorityId);
        return getSelf();
    }

    /**
     * This function allows setting a value for supplier
     * 
     * @param supplier desired value to be set
     * @return Builder object with new value for supplier
     */
    public B supplier(String supplier) {
        getBuildingInstance().setSupplier(supplier);
        return getSelf();
    }

    /**
     * This function allows setting a value for unitName
     * 
     * @param unitName desired value to be set
     * @return Builder object with new value for unitName
     */
    public B unitName(String unitName) {
        getBuildingInstance().setUnitName(unitName);
        return getSelf();
    }

    /**
     * This function allows setting a value for unitSymbol
     * 
     * @param unitSymbol desired value to be set
     * @return Builder object with new value for unitSymbol
     */
    public B unitSymbol(String unitSymbol) {
        getBuildingInstance().setUnitSymbol(unitSymbol);
        return getSelf();
    }

}
