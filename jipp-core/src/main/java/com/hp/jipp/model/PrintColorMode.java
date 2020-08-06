// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "print-color-mode" keywords.
 *
 * Also used by: "print-color-mode-default", "print-color-mode-supported".
 *
 * @see <a href="https://ftp.pwg.org/pub/pwg/ipp/registrations/apple-auto-monochrome-20171101.txt">APPLE20171101</a>
 * @see <a href="https://ftp.pwg.org/pub/pwg/candidates/cs-ippjobprinterext3v10-20120727-5100.13.pdf">PWG5100.13</a>
 */
public class PrintColorMode {
    public static final String auto = "auto";
    public static final String autoMonochrome = "auto-monochrome";
    public static final String biLevel = "bi-level";
    public static final String color = "color";
    public static final String highlight = "highlight";
    public static final String monochrome = "monochrome";
    public static final String processBiLevel = "process-bi-level";
    public static final String processMonochrome = "process-monochrome";
}