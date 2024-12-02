package com.medisage.smart_mr.domain.usecases.app_entry

import com.medisage.smart_mr.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}