package org.ga4gh.methods;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * {@link SearchReferencesRequest} specific assertions - Generated by CustomAssertionGenerator.
 */
public class SearchReferencesRequestAssert extends AbstractAssert<SearchReferencesRequestAssert, SearchReferencesRequest> {

  /**
   * Creates a new <code>{@link SearchReferencesRequestAssert}</code> to make assertions on actual SearchReferencesRequest.
   * @param actual the SearchReferencesRequest we want to make assertions on.
   */
  public SearchReferencesRequestAssert(SearchReferencesRequest actual) {
    super(actual, SearchReferencesRequestAssert.class);
  }

  /**
   * An entry point for SearchReferencesRequestAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(mySearchReferencesRequest)</code> and get specific assertion with code completion.
   * @param actual the SearchReferencesRequest we want to make assertions on.
   * @return a new <code>{@link SearchReferencesRequestAssert}</code>
   */
  public static SearchReferencesRequestAssert assertThat(SearchReferencesRequest actual) {
    return new SearchReferencesRequestAssert(actual);
  }

  /**
   * Verifies that the actual SearchReferencesRequest's accessions contains the given String elements.
   * @param accessions the given elements that should be contained in actual SearchReferencesRequest's accessions.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchReferencesRequest's accessions does not contain all given String elements.
   */
  public SearchReferencesRequestAssert hasAccessions(String... accessions) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (accessions == null) failWithMessage("Expecting accessions parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getAccessions(), accessions);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest's accessions contains <b>only<b> the given String elements and nothing else in whatever order.
   * @param accessions the given elements that should be contained in actual SearchReferencesRequest's accessions.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchReferencesRequest's accessions does not contain all given String elements.
   */
  public SearchReferencesRequestAssert hasOnlyAccessions(String... accessions) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (accessions == null) failWithMessage("Expecting accessions parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getAccessions(), accessions);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest's accessions does not contain the given String elements.
   *
   * @param accessions the given elements that should not be in actual SearchReferencesRequest's accessions.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchReferencesRequest's accessions contains any given String elements.
   */
  public SearchReferencesRequestAssert doesNotHaveAccessions(String... accessions) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (accessions == null) failWithMessage("Expecting accessions parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getAccessions(), accessions);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest has no accessions.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchReferencesRequest's accessions is not empty.
   */
  public SearchReferencesRequestAssert hasNoAccessions() {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have accessions but had :\n  <%s>";
    
    // check
    if (actual.getAccessions().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getAccessions());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual SearchReferencesRequest's classSchema is equal to the given one.
   * @param classSchema the given classSchema to compare the actual SearchReferencesRequest's classSchema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchReferencesRequest's classSchema is not equal to the given one.
   */
  public SearchReferencesRequestAssert hasClassSchema(org.apache.avro.Schema classSchema) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting classSchema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualClassSchema = actual.getClassSchema();
    if (!Objects.areEqual(actualClassSchema, classSchema)) {
      failWithMessage(assertjErrorMessage, actual, classSchema, actualClassSchema);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest's md5checksums contains the given String elements.
   * @param md5checksums the given elements that should be contained in actual SearchReferencesRequest's md5checksums.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchReferencesRequest's md5checksums does not contain all given String elements.
   */
  public SearchReferencesRequestAssert hasMd5checksums(String... md5checksums) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (md5checksums == null) failWithMessage("Expecting md5checksums parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getMd5checksums(), md5checksums);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest's md5checksums contains <b>only<b> the given String elements and nothing else in whatever order.
   * @param md5checksums the given elements that should be contained in actual SearchReferencesRequest's md5checksums.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchReferencesRequest's md5checksums does not contain all given String elements.
   */
  public SearchReferencesRequestAssert hasOnlyMd5checksums(String... md5checksums) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (md5checksums == null) failWithMessage("Expecting md5checksums parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getMd5checksums(), md5checksums);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest's md5checksums does not contain the given String elements.
   *
   * @param md5checksums the given elements that should not be in actual SearchReferencesRequest's md5checksums.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchReferencesRequest's md5checksums contains any given String elements.
   */
  public SearchReferencesRequestAssert doesNotHaveMd5checksums(String... md5checksums) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (md5checksums == null) failWithMessage("Expecting md5checksums parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getMd5checksums(), md5checksums);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest has no md5checksums.
   * @return this assertion object.
   * @throws AssertionError if the actual SearchReferencesRequest's md5checksums is not empty.
   */
  public SearchReferencesRequestAssert hasNoMd5checksums() {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have md5checksums but had :\n  <%s>";
    
    // check
    if (actual.getMd5checksums().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getMd5checksums());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual SearchReferencesRequest's pageSize is equal to the given one.
   * @param pageSize the given pageSize to compare the actual SearchReferencesRequest's pageSize to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchReferencesRequest's pageSize is not equal to the given one.
   */
  public SearchReferencesRequestAssert hasPageSize(Integer pageSize) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting pageSize of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Integer actualPageSize = actual.getPageSize();
    if (!Objects.areEqual(actualPageSize, pageSize)) {
      failWithMessage(assertjErrorMessage, actual, pageSize, actualPageSize);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest's pageToken is equal to the given one.
   * @param pageToken the given pageToken to compare the actual SearchReferencesRequest's pageToken to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchReferencesRequest's pageToken is not equal to the given one.
   */
  public SearchReferencesRequestAssert hasPageToken(String pageToken) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting pageToken of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualPageToken = actual.getPageToken();
    if (!Objects.areEqual(actualPageToken, pageToken)) {
      failWithMessage(assertjErrorMessage, actual, pageToken, actualPageToken);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest's referenceSetId is equal to the given one.
   * @param referenceSetId the given referenceSetId to compare the actual SearchReferencesRequest's referenceSetId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchReferencesRequest's referenceSetId is not equal to the given one.
   */
  public SearchReferencesRequestAssert hasReferenceSetId(String referenceSetId) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting referenceSetId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualReferenceSetId = actual.getReferenceSetId();
    if (!Objects.areEqual(actualReferenceSetId, referenceSetId)) {
      failWithMessage(assertjErrorMessage, actual, referenceSetId, actualReferenceSetId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SearchReferencesRequest's schema is equal to the given one.
   * @param schema the given schema to compare the actual SearchReferencesRequest's schema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SearchReferencesRequest's schema is not equal to the given one.
   */
  public SearchReferencesRequestAssert hasSchema(org.apache.avro.Schema schema) {
    // check that actual SearchReferencesRequest we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting schema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualSchema = actual.getSchema();
    if (!Objects.areEqual(actualSchema, schema)) {
      failWithMessage(assertjErrorMessage, actual, schema, actualSchema);
    }

    // return the current assertion for method chaining
    return this;
  }






}