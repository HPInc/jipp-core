// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
//
// (Note: Uses Java, not Kotlin, to define public static values in the most efficient manner.)

package com.hp.jipp.model;

/**
 * Values applicable for "compression" keywords.
 *
 * Also used by: "compression-accepted", "compression-supported".
 *
 * @see <a href="http://www.iana.org/go/rfc8011">RFC8011</a>
 */
public class Compression {
    public static final String compress = "compress";
    public static final String deflate = "deflate";
    public static final String gzip = "gzip";
    public static final String none = "none";
}