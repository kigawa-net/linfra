package net.kigawa.linfra.model.dsl

import net.kigawa.linfra.model.define.LinfraDefine
import net.kigawa.linfra.model.define.NormalDefine

class NormalDsl: LinfraDsl<NormalDefine> {
    var define: NormalDefine = NormalDefine(emptyList())
        private set

    override fun <T: LinfraDefine> T.unaryPlus(): T {
        define = define.copy(children = define.children + this)
        return this
    }
}