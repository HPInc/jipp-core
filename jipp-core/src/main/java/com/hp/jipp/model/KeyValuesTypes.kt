// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable no-wildcard-imports

/**
 * All known [KeyValuesType] types, used for better decoding of [IppPacket] data.
 */
object KeyValuesTypes {
    @JvmField val all: Map<String, KeyValuesType> = listOf(
        Types.printerOutputTray,
        Types.documentMetadata,
        Types.printerFinisherSupplies,
        Types.printerAlert,
        Types.printerSupply,
        Types.printerFinisher,
        Types.printerInputTray
    ).map { it.name to it }.toMap()
}
