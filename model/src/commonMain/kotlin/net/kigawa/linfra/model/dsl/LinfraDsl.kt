package net.kigawa.linfra.model.dsl

import net.kigawa.linfra.model.define.LinfraDefine

@LinfraDslMarker
interface LinfraDsl<D: LinfraDefine> {
    operator fun <T: LinfraDefine> T.unaryPlus(): T
}