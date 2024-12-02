package com.medisage.smart_mr.domain.usecases.app_entry

import com.medisage.smart_mr.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
     operator fun invoke() : Flow<Boolean>{
       return localUserManager.readAppEntry()
    }
}