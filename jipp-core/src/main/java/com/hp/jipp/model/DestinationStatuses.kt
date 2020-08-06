// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-06-10
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * Data object corresponding to a "destination-statuses" collection as defined in:
 * [PWG5100.15](https://ftp.pwg.org/pub/pwg/candidates/cs-ippfaxout10-20131115-5100.15.pdf).
 */
@Suppress("RedundantCompanionReference", "unused")
data class DestinationStatuses
constructor(
    var destinationUri: java.net.URI? = null,
    var imagesCompleted: Int? = null,
    var transmissionStatus: TransmissionStatus? = null
) : AttributeCollection {

    /** Construct an empty [DestinationStatuses]. */
    constructor() : this(null, null, null)

    /** Produce an attribute list from members. */
    override val attributes: List<Attribute<*>> by lazy {
        listOfNotNull(
            destinationUri?.let { Types.destinationUri.of(it) },
            imagesCompleted?.let { Types.imagesCompleted.of(it) },
            transmissionStatus?.let { Types.transmissionStatus.of(it) }
        )
    }

    /** Types for each member attribute. */
    object Types {
        @JvmField val destinationUri = UriType("destination-uri")
        @JvmField val imagesCompleted = IntType("images-completed")
        /**
         * "transmission-status" member type.
         */
        @JvmField val transmissionStatus = TransmissionStatus.Type("transmission-status")
    }

    /** Defines types for each member of [DestinationStatuses]. */
    companion object : AttributeCollection.Converter<DestinationStatuses> {
        override fun convert(attributes: List<Attribute<*>>): DestinationStatuses =
            DestinationStatuses(
                extractOne(attributes, Types.destinationUri),
                extractOne(attributes, Types.imagesCompleted),
                extractOne(attributes, Types.transmissionStatus)
            )
    }
    override fun toString() = "DestinationStatuses(${attributes.joinToString()})"
}
