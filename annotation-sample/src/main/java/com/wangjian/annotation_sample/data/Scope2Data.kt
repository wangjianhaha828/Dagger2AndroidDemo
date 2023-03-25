package com.wangjian.annotation_sample.data

import javax.inject.Inject

class Scope2Data  @Inject constructor(): BaseData2 {
    override fun getData(): String {
        return "scope2 data"
    }
}