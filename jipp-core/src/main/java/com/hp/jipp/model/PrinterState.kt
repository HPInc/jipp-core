// Copyright 2018 HP Development Company, L.P.
// SPDX-License-Identifier: MIT
//
// DO NOT MODIFY. Code is auto-generated by genTypes.py. Content taken from registry at
// https://www.iana.org/assignments/ipp-registrations/ipp-registrations.xml, updated on 2020-02-20
@file:Suppress("MaxLineLength", "WildcardImport")

package com.hp.jipp.model

import com.hp.jipp.encoding.* // ktlint-disable
import com.hp.jipp.encoding.Enum // Override java Enum

/**
 * "printer-state" enum as defined in:
 * [RFC8011](http://www.iana.org/go/rfc8011).
 */
data class PrinterState(override val code: Int, override val name: String) : Enum() {

    override fun toString() = super.toString()

    /** An attribute type for [PrinterState] attributes */
    class Type(name: String) : EnumType<PrinterState>(name, { get(it) })

    object Code {
        const val idle = 3
        const val processing = 4
        const val stopped = 5
    }

    companion object {
        @JvmField val idle = PrinterState(Code.idle, "idle")
        @JvmField val processing = PrinterState(Code.processing, "processing")
        @JvmField val stopped = PrinterState(Code.stopped, "stopped")

        @JvmField val all = listOf(
            idle,
            processing,
            stopped
        ).map { it.code to it }.toMap()

        operator fun get(value: Int): PrinterState =
            all[value] ?: PrinterState(value, "???")
    }
}
