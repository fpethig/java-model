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

public abstract class AssetInformationBuilder<T extends AssetInformation, B extends AssetInformationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetKind
     * 
     * @param assetKind desired value to be set
     * @return Builder object with new value for assetKind
     */
    public B assetKind(AssetKind assetKind) {
        getBuildingInstance().setAssetKind(assetKind);
        return getSelf();
    }

    /**
     * This function allows setting a value for globalAssetId
     * 
     * @param globalAssetId desired value to be set
     * @return Builder object with new value for globalAssetId
     */
    public B globalAssetId(Reference globalAssetId) {
        getBuildingInstance().setGlobalAssetId(globalAssetId);
        return getSelf();
    }

    /**
     * This function allows setting a value for specificAssetIds
     * 
     * @param specificAssetIds desired value to be set
     * @return Builder object with new value for specificAssetIds
     */
    public B specificAssetIds(List<IdentifierKeyValuePair> specificAssetIds) {
        getBuildingInstance().setSpecificAssetIds(specificAssetIds);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List specificAssetIds
     * 
     * @param specificAssetId desired value to be added
     * @return Builder object with new value for specificAssetIds
     */
    public B specificAssetId(IdentifierKeyValuePair specificAssetId) {
        getBuildingInstance().getSpecificAssetIds().add(specificAssetId);
        return getSelf();
    }

    /**
     * This function allows setting a value for billOfMaterials
     * 
     * @param billOfMaterials desired value to be set
     * @return Builder object with new value for billOfMaterials
     */
    public B billOfMaterials(List<Reference> billOfMaterials) {
        getBuildingInstance().setBillOfMaterials(billOfMaterials);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List billOfMaterials
     * 
     * @param billOfMaterial desired value to be added
     * @return Builder object with new value for billOfMaterials
     */
    public B billOfMaterial(Reference billOfMaterial) {
        getBuildingInstance().getBillOfMaterials().add(billOfMaterial);
        return getSelf();
    }

    /**
     * This function allows setting a value for defaultThumbnail
     * 
     * @param defaultThumbnail desired value to be set
     * @return Builder object with new value for defaultThumbnail
     */
    public B defaultThumbnail(File defaultThumbnail) {
        getBuildingInstance().setDefaultThumbnail(defaultThumbnail);
        return getSelf();
    }
}
