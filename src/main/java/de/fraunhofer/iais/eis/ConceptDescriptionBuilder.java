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

public class ConceptDescriptionBuilder {

	private DefaultConceptDescription defaultConceptDescription;

	public ConceptDescriptionBuilder() {
		defaultConceptDescription = new DefaultConceptDescription();
	}

	public ConceptDescriptionBuilder(URI id) {
		this();
		defaultConceptDescription.id = id;
	}

	/**
	* This function allows setting a value for content
	* @param content desired value to be set
	* @return Builder object with new value for content
	*/
	final public ConceptDescriptionBuilder content(List<DataSpecificationContent> content) {
		this.defaultConceptDescription.content = content;
		return this;
	}


	/**
	* This function allows setting a value for isCaseOf
	* @param isCaseOf desired value to be set
	* @return Builder object with new value for isCaseOf
	*/
	final public ConceptDescriptionBuilder isCaseOf(List<Reference> isCaseOf) {
		this.defaultConceptDescription.isCaseOf = isCaseOf;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecification
	* @param dataSpecification desired value to be set
	* @return Builder object with new value for dataSpecification
	*/
	final public ConceptDescriptionBuilder dataSpecification(List<Reference> dataSpecification) {
		this.defaultConceptDescription.dataSpecification = dataSpecification;
		return this;
	}


	/**
	* This function allows setting a value for administration
	* @param administration desired value to be set
	* @return Builder object with new value for administration
	*/
	final public ConceptDescriptionBuilder administration(AdministrativeInformation administration) {
		this.defaultConceptDescription.administration = administration;
		return this;
	}


	/**
	* This function allows setting a value for identification
	* @param identification desired value to be set
	* @return Builder object with new value for identification
	*/
	final public ConceptDescriptionBuilder identification(Identifier identification) {
		this.defaultConceptDescription.identification = identification;
		return this;
	}


	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public ConceptDescriptionBuilder referableCategory(List<String> referableCategory) {
		this.defaultConceptDescription.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public ConceptDescriptionBuilder description(List<TypedLiteral> description) {
		this.defaultConceptDescription.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public ConceptDescriptionBuilder displayName(TypedLiteral displayName) {
		this.defaultConceptDescription.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public ConceptDescriptionBuilder idShort(String idShort) {
		this.defaultConceptDescription.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for parent
	* @param parent desired value to be set
	* @return Builder object with new value for parent
	*/
	final public ConceptDescriptionBuilder parent(URI parent) {
		this.defaultConceptDescription.parent = parent;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ConceptDescription build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultConceptDescription);
		return defaultConceptDescription;
	}
}
