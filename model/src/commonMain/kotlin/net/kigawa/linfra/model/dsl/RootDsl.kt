package net.kigawa.linfra.model.dsl

import net.kigawa.linfra.model.define.RootDefine

class RootDsl: LinfraDsl {
    override fun define(): RootDefine = RootDefine()
}