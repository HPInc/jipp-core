// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "overrides" collection as defined in:
 * [PWG5100.6](https://ftp.pwg.org/pub/pwg/candidates/cs-ipppageoverride10-20031031-5100.6.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class Overrides
constructor(
    var documentCopies: List<IntRange>? = null,
    var documentNumbers: List<IntRange>? = null,
    var pages: List<IntRange>? = null
) : AttributeCollection {

    /** Construct an empty [Overrides]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            documentCopies?.let { Types.documentCopies.of(it) },
            documentNumbers?.let { Types.documentNumbers.of(it) },
            pages?.let { Types.pages.of(it) }
        )
    }

    /** Type for attributes of this collection */
    class Type(override val name: String) : AttributeCollection.Type<Overrides>(Overrides)

    /** All member names as strings. */
    object Name {
        /** "document-copies" member name */
        const val documentCopies = "document-copies"
        /** "document-numbers" member name */
        const val documentNumbers = "document-numbers"
        /** "pages" member name */
        const val pages = "pages"
    }

    /** Types for each member attribute. */
    object Types {
        val documentCopies = IntRangeType(Name.documentCopies)
        val documentNumbers = IntRangeType(Name.documentNumbers)
        val pages = IntRangeType(Name.pages)
    }

    /** Defines types for each member of [Overrides] */
    companion object : AttributeCollection.Converter<Overrides> {
        override fun convert(attributes: List<Attribute<*>>): Overrides =
            Overrides(
                extractAll(attributes, Types.documentCopies),
                extractAll(attributes, Types.documentNumbers),
                extractAll(attributes, Types.pages)
            )
    }
}
