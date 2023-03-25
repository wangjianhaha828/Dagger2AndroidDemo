package com.wangjian.annotation_sample.data

import javax.inject.Inject

class Scope2Data  @Inject constructor(): BaseData {
    override fun getData(): String {
        return "scope2 data"
    }
}