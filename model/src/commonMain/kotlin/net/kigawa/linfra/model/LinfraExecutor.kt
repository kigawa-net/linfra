package net.kigawa.linfra.model

import net.kigawa.linfra.model.define.LinfraDefine

interface LinfraExecutor {
    fun execute(define: LinfraDefine): LinfraInstance
}