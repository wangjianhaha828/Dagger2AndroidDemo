package com.wangjian.annotation_sample.data

import javax.inject.Inject

class Scope1Data @Inject constructor(): BaseData {
    override fun getData(): String {
        return "scope1 data"
    }
}