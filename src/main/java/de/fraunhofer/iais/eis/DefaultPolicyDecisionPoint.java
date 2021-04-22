package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** 
* "Policy Decision Point"
* "Defines a security policy decision point (PDP). "@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:PolicyDecisionPoint")
public class DefaultPolicyDecisionPoint implements Serializable, PolicyDecisionPoint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Policy Decision Point", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Defines a security policy decision point (PDP). ", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "is external policy decision point defined"
	* "If externalPolicyDecisionPoints True then Endpoints to external available decision points taking into consideration for access control for the AAS need to be configured."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints", "policyDecisionPointExternalPolicyDecisionPoints"})
	protected boolean policyDecisionPointExternalPolicyDecisionPoints;


	// no manual construction
	protected DefaultPolicyDecisionPoint() {
		id = VocabUtil.getInstance().createRandomUrl("policyDecisionPoint");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	public int hashCode() {
		return Objects.hash(new Object[]{this.policyDecisionPointExternalPolicyDecisionPoints});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPolicyDecisionPoint other = (DefaultPolicyDecisionPoint) obj;
			return Objects.equals(this.policyDecisionPointExternalPolicyDecisionPoints, other.policyDecisionPointExternalPolicyDecisionPoints);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
	final public boolean getPolicyDecisionPointExternalPolicyDecisionPoints() {
		return policyDecisionPointExternalPolicyDecisionPoints;
	}
	
	final public void setPolicyDecisionPointExternalPolicyDecisionPoints (boolean policyDecisionPointExternalPolicyDecisionPoints) {
		this.policyDecisionPointExternalPolicyDecisionPoints = policyDecisionPointExternalPolicyDecisionPoints;
	}
}
