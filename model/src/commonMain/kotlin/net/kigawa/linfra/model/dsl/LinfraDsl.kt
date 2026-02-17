package net.kigawa.linfra.model.dsl

import net.kigawa.linfra.model.define.LinfraDefine

@LinfraDslMarker
interface LinfraDsl {
    fun define(): LinfraDefine
}