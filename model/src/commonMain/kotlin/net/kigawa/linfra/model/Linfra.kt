package net.kigawa.linfra.model

import net.kigawa.linfra.model.define.NormalDefine
import net.kigawa.linfra.model.dsl.NormalDsl

object Linfra {
    fun dsl(block: NormalDsl.() -> Unit): NormalDefine = NormalDsl().apply(block).define

}
