package com.medisage.smart_mr.domain.usecases

import com.medisage.smart_mr.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke() : Flow<Boolean>{
       return localUserManager.readAppEntry()
    }
}