package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An operation is a submodel element with input and output variables. Constraint AASd-060: The
 * semanticId of a Operation submodel element shall only reference a ConceptDescription with the
 * category FUNCTION.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperation.class)
})
public interface Operation extends SubmodelElement {

    /**
     * Input parameter of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable
     *
     * @return Returns the List of OperationVariables for the property inputVariables.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable")
    public List<OperationVariable> getInputVariables();

    /**
     * Input parameter of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable
     *
     * @param inputVariables desired value for the property inputVariables.
     */
    public void setInputVariables(List<OperationVariable> inputVariables);

    /**
     * Parameter that is input and output of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable
     *
     * @return Returns the List of OperationVariables for the property inoutputVariables.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable")
    public List<OperationVariable> getInoutputVariables();

    /**
     * Parameter that is input and output of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable
     *
     * @param inoutputVariables desired value for the property inoutputVariables.
     */
    public void setInoutputVariables(List<OperationVariable> inoutputVariables);

    /**
     * Output parameter of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable
     *
     * @return Returns the List of OperationVariables for the property outputVariables.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable")
    public List<OperationVariable> getOutputVariables();

    /**
     * Output parameter of the operation.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable
     *
     * @param outputVariables desired value for the property outputVariables.
     */
    public void setOutputVariables(List<OperationVariable> outputVariables);

}
