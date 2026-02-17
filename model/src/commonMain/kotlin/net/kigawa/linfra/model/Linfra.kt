package net.kigawa.linfra.model

import net.kigawa.linfra.model.define.RootDefine
import net.kigawa.linfra.model.dsl.RootDsl

object Linfra {
    fun dsl(dsl: RootDsl.() -> Unit): RootDefine = RootDsl().apply(dsl).define()
}