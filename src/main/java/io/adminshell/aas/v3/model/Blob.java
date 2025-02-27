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
 * A BLOB is a data element that represents a file that is contained with its source code in the
 * value attribute. Constraint AASd-057: The semanticId of a File or Blob submodel element shall
 * only reference a ConceptDescription with the category DOCUMENT.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultBlob.class)
})
public interface Blob extends DataElement {

    /**
     * Mime type of the content of the BLOB. The mime type states which file extension the file has.
     * Valid values are e.g. 'application/json', 'application/xls', 'image/jpg' The allowed values are
     * defined as in RFC2046.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Blob/mimeType
     *
     * @return Returns the String for the property mimeType.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Blob/mimeType")
    String getMimeType();

    /**
     * Mime type of the content of the BLOB. The mime type states which file extension the file has.
     * Valid values are e.g. 'application/json', 'application/xls', 'image/jpg' The allowed values are
     * defined as in RFC2046.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Blob/mimeType
     *
     * @param mimeType desired value for the property mimeType.
     */
    void setMimeType(String mimeType);

    /**
     * The value of the BLOB instance of a blob data element.
     *
     * In contrast to the file property the file content is stored directly as value in the Blob data
     * element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Blob/value
     *
     * @return Returns the byte[] for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Blob/value")
    byte[] getValue();

    /**
     * The value of the BLOB instance of a blob data element.
     *
     * In contrast to the file property the file content is stored directly as value in the Blob data
     * element.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Blob/value
     *
     * @param value desired value for the property value.
     */
    void setValue(byte[] value);

}
