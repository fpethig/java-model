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

public abstract class DataSpecificationIEC61360Builder<T extends DataSpecificationIEC61360, B extends DataSpecificationIEC61360Builder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for dataType
     * 
     * @param dataType desired value to be set
     * @return Builder object with new value for dataType
     */
    public B dataType(DataTypeIEC61360 dataType) {
        getBuildingInstance().setDataType(dataType);
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
     * This function allows setting a value for levelTypes
     * 
     * @param levelTypes desired value to be set
     * @return Builder object with new value for levelTypes
     */
    public B levelTypes(List<LevelType> levelTypes) {
        getBuildingInstance().setLevelTypes(levelTypes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List levelTypes
     * 
     * @param levelType desired value to be added
     * @return Builder object with new value for levelTypes
     */
    public B levelType(LevelType levelType) {
        getBuildingInstance().getLevelTypes().add(levelType);
        return getSelf();
    }

    /**
     * This function allows setting a value for preferredNames
     * 
     * @param preferredNames desired value to be set
     * @return Builder object with new value for preferredNames
     */
    public B preferredNames(List<LangString> preferredNames) {
        getBuildingInstance().setPreferredNames(preferredNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List preferredNames
     * 
     * @param preferredName desired value to be added
     * @return Builder object with new value for preferredNames
     */
    public B preferredName(LangString preferredName) {
        getBuildingInstance().getPreferredNames().add(preferredName);
        return getSelf();
    }

    /**
     * This function allows setting a value for shortNames
     * 
     * @param shortNames desired value to be set
     * @return Builder object with new value for shortNames
     */
    public B shortNames(List<LangString> shortNames) {
        getBuildingInstance().setShortNames(shortNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List shortNames
     * 
     * @param shortName desired value to be added
     * @return Builder object with new value for shortNames
     */
    public B shortName(LangString shortName) {
        getBuildingInstance().getShortNames().add(shortName);
        return getSelf();
    }

    /**
     * This function allows setting a value for sourceOfDefinition
     * 
     * @param sourceOfDefinition desired value to be set
     * @return Builder object with new value for sourceOfDefinition
     */
    public B sourceOfDefinition(String sourceOfDefinition) {
        getBuildingInstance().setSourceOfDefinition(sourceOfDefinition);
        return getSelf();
    }

    /**
     * This function allows setting a value for symbol
     * 
     * @param symbol desired value to be set
     * @return Builder object with new value for symbol
     */
    public B symbol(String symbol) {
        getBuildingInstance().setSymbol(symbol);
        return getSelf();
    }

    /**
     * This function allows setting a value for unit
     * 
     * @param unit desired value to be set
     * @return Builder object with new value for unit
     */
    public B unit(String unit) {
        getBuildingInstance().setUnit(unit);
        return getSelf();
    }

    /**
     * This function allows setting a value for unitId
     * 
     * @param unitId desired value to be set
     * @return Builder object with new value for unitId
     */
    public B unitId(Reference unitId) {
        getBuildingInstance().setUnitId(unitId);
        return getSelf();
    }

    /**
     * This function allows setting a value for valueFormat
     * 
     * @param valueFormat desired value to be set
     * @return Builder object with new value for valueFormat
     */
    public B valueFormat(String valueFormat) {
        getBuildingInstance().setValueFormat(valueFormat);
        return getSelf();
    }

    /**
     * This function allows setting a value for value
     * 
     * @param value desired value to be set
     * @return Builder object with new value for value
     */
    public B value(String value) {
        getBuildingInstance().setValue(value);
        return getSelf();
    }

    /**
     * This function allows setting a value for valueList
     * 
     * @param valueList desired value to be set
     * @return Builder object with new value for valueList
     */
    public B valueList(ValueList valueList) {
        getBuildingInstance().setValueList(valueList);
        return getSelf();
    }

    /**
     * This function allows setting a value for valueId
     * 
     * @param valueId desired value to be set
     * @return Builder object with new value for valueId
     */
    public B valueId(Reference valueId) {
        getBuildingInstance().setValueId(valueId);
        return getSelf();
    }

}
