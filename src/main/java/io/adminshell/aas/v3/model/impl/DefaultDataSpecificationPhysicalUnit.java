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

package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.DataSpecificationPhysicalUnit
 * 
 * Data Specification Template for Physical Units.
 */

public class DefaultDataSpecificationPhysicalUnit implements DataSpecificationPhysicalUnit {

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/conversionFactor")
    protected String conversionFactor;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/definition")
    protected List<LangString> definitions = new ArrayList<>();

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/dinNotation")
    protected String dinNotation;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceCode")
    protected String eceCode;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/eceName")
    protected String eceName;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/nistName")
    protected String nistName;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/registrationAuthorityId")
    protected String registrationAuthorityId;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siName")
    protected String siName;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/siNotation")
    protected String siNotation;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/supplier")
    protected String supplier;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitName")
    protected String unitName;

    @IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/DataSpecificationPhysicalUnit/unitSymbol")
    protected String unitSymbol;

    public DefaultDataSpecificationPhysicalUnit() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.conversionFactor,
            this.definitions,
            this.dinNotation,
            this.eceCode,
            this.eceName,
            this.nistName,
            this.siName,
            this.siNotation,
            this.registrationAuthorityId,
            this.supplier,
            this.unitName,
            this.unitSymbol);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultDataSpecificationPhysicalUnit other = (DefaultDataSpecificationPhysicalUnit) obj;
            return Objects.equals(this.conversionFactor, other.conversionFactor) &&
                Objects.equals(this.definitions, other.definitions) &&
                Objects.equals(this.dinNotation, other.dinNotation) &&
                Objects.equals(this.eceCode, other.eceCode) &&
                Objects.equals(this.eceName, other.eceName) &&
                Objects.equals(this.nistName, other.nistName) &&
                Objects.equals(this.siName, other.siName) &&
                Objects.equals(this.siNotation, other.siNotation) &&
                Objects.equals(this.registrationAuthorityId, other.registrationAuthorityId) &&
                Objects.equals(this.supplier, other.supplier) &&
                Objects.equals(this.unitName, other.unitName) &&
                Objects.equals(this.unitSymbol, other.unitSymbol);
        }
    }

    @Override
    public String getConversionFactor() {
        return conversionFactor;
    }

    @Override
    public void setConversionFactor(String conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public List<LangString> getDefinitions() {
        return definitions;
    }

    @Override
    public void setDefinitions(List<LangString> definitions) {
        this.definitions = definitions;
    }

    @Override
    public String getDinNotation() {
        return dinNotation;
    }

    @Override
    public void setDinNotation(String dinNotation) {
        this.dinNotation = dinNotation;
    }

    @Override
    public String getEceCode() {
        return eceCode;
    }

    @Override
    public void setEceCode(String eceCode) {
        this.eceCode = eceCode;
    }

    @Override
    public String getEceName() {
        return eceName;
    }

    @Override
    public void setEceName(String eceName) {
        this.eceName = eceName;
    }

    @Override
    public String getNistName() {
        return nistName;
    }

    @Override
    public void setNistName(String nistName) {
        this.nistName = nistName;
    }

    @Override
    public String getSiName() {
        return siName;
    }

    @Override
    public void setSiName(String siName) {
        this.siName = siName;
    }

    @Override
    public String getSiNotation() {
        return siNotation;
    }

    @Override
    public void setSiNotation(String siNotation) {
        this.siNotation = siNotation;
    }

    @Override
    public String getRegistrationAuthorityId() {
        return registrationAuthorityId;
    }

    @Override
    public void setRegistrationAuthorityId(String registrationAuthorityId) {
        this.registrationAuthorityId = registrationAuthorityId;
    }

    @Override
    public String getSupplier() {
        return supplier;
    }

    @Override
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public String getUnitName() {
        return unitName;
    }

    @Override
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String getUnitSymbol() {
        return unitSymbol;
    }

    @Override
    public void setUnitSymbol(String unitSymbol) {
        this.unitSymbol = unitSymbol;
    }

    /**
     * This builder class can be used to construct a DefaultDataSpecificationPhysicalUnit bean.
     */
    public static class Builder extends DataSpecificationPhysicalUnitBuilder<DefaultDataSpecificationPhysicalUnit, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultDataSpecificationPhysicalUnit newBuildingInstance() {
            return new DefaultDataSpecificationPhysicalUnit();
        }
    }
}
