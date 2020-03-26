// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "job-state-reasons" keywords.
 *
 * Also used by: "resource-state-reasons".
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext10-20101030-5100.11.pdf">PWG5100.11</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf">PWG5100.13</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf">PWG5100.15</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ipptrans10-20131108-5100.16.pdf">PWG5100.16</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippscan10-20140918-5100.17.pdf">PWG5100.17</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippinfra10-20150619-5100.18.pdf">PWG5100.18</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippprodprint10-20010212-5100.3.pdf">PWG5100.3</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobext20-20190816-5100.7.pdf">PWG5100.7</a>
 * @see <a href="http://www.iana.org/go/rfc3998">RFC3998</a>
 * @see <a href="http://www.iana.org/go/rfc8011">RFC8011</a>
 */
public class JobStateReason {
    public static final String abortedBySystem = "aborted-by-system";
    public static final String accountAuthorizationFailed = "account-authorization-failed";
    public static final String accountClosed = "account-closed";
    public static final String accountInfoNeeded = "account-info-needed";
    public static final String accountLimitReached = "account-limit-reached";
    public static final String compressionError = "compression-error";
    public static final String conflictingAttributes = "conflicting-attributes";
    public static final String connectedToDestination = "connected-to-destination";
    public static final String connectingToDestination = "connecting-to-destination";
    public static final String destinationUriFailed = "destination-uri-failed";
    public static final String digitalSignatureDidNotVerify = "digital-signature-did-not-verify";
    public static final String digitalSignatureTypeNotSupported = "digital-signature-type-not-supported";
    public static final String documentAccessError = "document-access-error";
    public static final String documentFormatError = "document-format-error";
    public static final String documentPasswordError = "document-password-error";
    public static final String documentPermissionError = "document-permission-error";
    public static final String documentSecurityError = "document-security-error";
    public static final String documentUnprintableError = "document-unprintable-error";
    public static final String errorsDetected = "errors-detected";
    public static final String jobCanceledAtDevice = "job-canceled-at-device";
    public static final String jobCanceledByOperator = "job-canceled-by-operator";
    public static final String jobCanceledByUser = "job-canceled-by-user";
    public static final String jobCompletedSuccessfully = "job-completed-successfully";
    public static final String jobCompletedWithErrors = "job-completed-with-errors";
    public static final String jobCompletedWithWarnings = "job-completed-with-warnings";
    public static final String jobDataInsufficient = "job-data-insufficient";
    public static final String jobDelayOutputUntilSpecified = "job-delay-output-until-specified";
    public static final String jobDigitalSignatureWait = "job-digital-signature-wait";
    public static final String jobFetchable = "job-fetchable";
    public static final String jobHeldForReview = "job-held-for-review";
    public static final String jobHoldUntilSpecified = "job-hold-until-specified";
    public static final String jobIncoming = "job-incoming";
    public static final String jobInterpreting = "job-interpreting";
    public static final String jobOutgoing = "job-outgoing";
    public static final String jobPasswordWait = "job-password-wait";
    public static final String jobPrintedSuccessfully = "job-printed-successfully";
    public static final String jobPrintedWithErrors = "job-printed-with-errors";
    public static final String jobPrintedWithWarnings = "job-printed-with-warnings";
    public static final String jobPrinting = "job-printing";
    public static final String jobQueued = "job-queued";
    public static final String jobQueuedForMarker = "job-queued-for-marker";
    public static final String jobReleaseWait = "job-release-wait";
    public static final String jobRestartable = "job-restartable";
    public static final String jobResuming = "job-resuming";
    public static final String jobSavedSuccessfully = "job-saved-successfully";
    public static final String jobSavedWithErrors = "job-saved-with-errors";
    public static final String jobSavedWithWarnings = "job-saved-with-warnings";
    public static final String jobSaving = "job-saving";
    public static final String jobSpooling = "job-spooling";
    public static final String jobStreaming = "job-streaming";
    public static final String jobSuspended = "job-suspended";
    public static final String jobSuspendedByOperator = "job-suspended-by-operator";
    public static final String jobSuspendedBySystem = "job-suspended-by-system";
    public static final String jobSuspendedByUser = "job-suspended-by-user";
    public static final String jobSuspending = "job-suspending";
    public static final String jobTransferring = "job-transferring";
    public static final String jobTransforming = "job-transforming";
    public static final String none = "none";
    public static final String printerStopped = "printer-stopped";
    public static final String printerStoppedPartly = "printer-stopped-partly";
    public static final String processingToStopPoint = "processing-to-stop-point";
    public static final String queuedInDevice = "queued-in-device";
    public static final String resourcesAreNotReady = "resources-are-not-ready";
    public static final String resourcesAreNotSupported = "resources-are-not-supported";
    public static final String serviceOffLine = "service-off-line";
    public static final String submissionInterrupted = "submission-interrupted";
    public static final String unsupportedAttributesOrValues = "unsupported-attributes-or-values";
    public static final String unsupportedCompression = "unsupported-compression";
    public static final String unsupportedDocumentFormat = "unsupported-document-format";
    public static final String waitingForUserAction = "waiting-for-user-action";
    public static final String warningsDetected = "warnings-detected";
}