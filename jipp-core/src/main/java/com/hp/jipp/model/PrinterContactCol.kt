// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "printer-contact-col" collection as defined in:
 * [PWG5100.22](https://ftp.pwg.org/pub/pwg/candidates/cs-ippsystem10-20191122-5100.22.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class PrinterContactCol
constructor(
    var contactName: String? = null,
    var contactUri: java.net.URI? = null,
    var contactVcard: List<String>? = null
) : AttributeCollection {

    /** Construct an empty [PrinterContactCol]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            contactName?.let { Types.contactName.of(it) },
            contactUri?.let { Types.contactUri.of(it) },
            contactVcard?.let { Types.contactVcard.of(it.map { v -> Text(v) }) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val contactName = NameType("contact-name")
        @JvmField val contactUri = UriType("contact-uri")
        @JvmField val contactVcard = TextType.Set("contact-vcard")
    }

    /** Defines types for each member of [PrinterContactCol]. */
    companion object : AttributeCollection.Converter<PrinterContactCol> {
        override fun convert(attributes: List<Attribute<*>>): PrinterContactCol =
            PrinterContactCol(
                extractOne(attributes, Types.contactName)?.value,
                extractOne(attributes, Types.contactUri),
                extractAll(attributes, Types.contactVcard)?.map { it.value }
            )
    }
    override fun toString() = "PrinterContactCol(${attributes.joinToString()})"
}
