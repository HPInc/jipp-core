// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "job-error-action" keywords.
 *
 * Also used by: "job-error-action-default", "job-error-action-supported".
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf">PWG5100.13</a>
 */
public class JobErrorAction {
    public static final String abortJob = "abort-job";
    public static final String cancelJob = "cancel-job";
    public static final String continueJob = "continue-job";
    public static final String suspendJob = "suspend-job";
}