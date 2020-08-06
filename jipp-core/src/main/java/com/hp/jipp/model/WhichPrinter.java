// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "which-printers" keywords.
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf">PWG5100.22</a>
 */
public class WhichPrinter {
    public static final String all = "all";
    public static final String idle = "idle";
    public static final String notAccepting = "not-accepting";
    public static final String processing = "processing";
    public static final String shutdown = "shutdown";
    public static final String stopped = "stopped";
    public static final String testing = "testing";
}