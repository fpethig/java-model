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

public abstract class SecurityBuilder<T extends Security, B extends SecurityBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for accessControlPolicyPoints
     * 
     * @param accessControlPolicyPoints desired value to be set
     * @return Builder object with new value for accessControlPolicyPoints
     */
    public B accessControlPolicyPoints(AccessControlPolicyPoints accessControlPolicyPoints) {
        getBuildingInstance().setAccessControlPolicyPoints(accessControlPolicyPoints);
        return getSelf();
    }

    /**
     * This function allows setting a value for certificates
     * 
     * @param certificates desired value to be set
     * @return Builder object with new value for certificates
     */
    public B certificates(List<Certificate> certificates) {
        getBuildingInstance().setCertificates(certificates);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List certificates
     * 
     * @param certificate desired value to be added
     * @return Builder object with new value for certificates
     */
    public B certificate(Certificate certificate) {
        getBuildingInstance().getCertificates().add(certificate);
        return getSelf();
    }

    /**
     * This function allows setting a value for requiredCertificateExtensions
     * 
     * @param requiredCertificateExtensions desired value to be set
     * @return Builder object with new value for requiredCertificateExtensions
     */
    public B requiredCertificateExtensions(List<Reference> requiredCertificateExtensions) {
        getBuildingInstance().setRequiredCertificateExtensions(requiredCertificateExtensions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List requiredCertificateExtensions
     * 
     * @param requiredCertificateExtension desired value to be added
     * @return Builder object with new value for requiredCertificateExtensions
     */
    public B requiredCertificateExtension(Reference requiredCertificateExtension) {
        getBuildingInstance().getRequiredCertificateExtensions().add(requiredCertificateExtension);
        return getSelf();
    }
}
