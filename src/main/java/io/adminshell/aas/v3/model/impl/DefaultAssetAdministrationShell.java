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
 * Default implementation of package io.adminshell.aas.v3.model.AssetAdministrationShell
 * 
 * Describes the Administration Shell for Assets, Products, Components, e.g. Machines
 */

public class DefaultAssetAdministrationShell implements AssetAdministrationShell {

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    protected AssetInformation assetInformation;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
    protected Reference derivedFrom;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
    protected Security security;

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    protected List<Reference> submodels = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
    protected List<View> views = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/embeddedDataSpecification")
    protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    protected Identifier identification;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangString> displayNames = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected String idShort;

    public DefaultAssetAdministrationShell() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.assetInformation,
            this.derivedFrom,
            this.security,
            this.submodels,
            this.views,
            this.embeddedDataSpecifications,
            this.administration,
            this.identification,
            this.category,
            this.descriptions,
            this.displayNames,
            this.idShort);
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
            DefaultAssetAdministrationShell other = (DefaultAssetAdministrationShell) obj;
            return Objects.equals(this.assetInformation, other.assetInformation) &&
                Objects.equals(this.derivedFrom, other.derivedFrom) &&
                Objects.equals(this.security, other.security) &&
                Objects.equals(this.submodels, other.submodels) &&
                Objects.equals(this.views, other.views) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications) &&
                Objects.equals(this.administration, other.administration) &&
                Objects.equals(this.identification, other.identification) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShort, other.idShort);
        }
    }

    @Override
    public AssetInformation getAssetInformation() {
        return assetInformation;
    }

    @Override
    public void setAssetInformation(AssetInformation assetInformation) {
        this.assetInformation = assetInformation;
    }

    @Override
    public Reference getDerivedFrom() {
        return derivedFrom;
    }

    @Override
    public void setDerivedFrom(Reference derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    @Override
    public Security getSecurity() {
        return security;
    }

    @Override
    public void setSecurity(Security security) {
        this.security = security;
    }

    @Override
    public List<Reference> getSubmodels() {
        return submodels;
    }

    @Override
    public void setSubmodels(List<Reference> submodels) {
        this.submodels = submodels;
    }

    @Override
    public List<View> getViews() {
        return views;
    }

    @Override
    public void setViews(List<View> views) {
        this.views = views;
    }

    @Override
    public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    @Override
    public AdministrativeInformation getAdministration() {
        return administration;
    }

    @Override
    public void setAdministration(AdministrativeInformation administration) {
        this.administration = administration;
    }

    @Override
    public Identifier getIdentification() {
        return identification;
    }

    @Override
    public void setIdentification(Identifier identification) {
        this.identification = identification;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public List<LangString> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public List<LangString> getDisplayNames() {
        return displayNames;
    }

    @Override
    public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @Override
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    /**
     * This builder class can be used to construct a DefaultAssetAdministrationShell bean.
     */
    public static class Builder extends AssetAdministrationShellBuilder<DefaultAssetAdministrationShell, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetAdministrationShell newBuildingInstance() {
            return new DefaultAssetAdministrationShell();
        }
    }
}
