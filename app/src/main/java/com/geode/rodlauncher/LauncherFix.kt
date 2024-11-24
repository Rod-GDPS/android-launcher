package com.geode.rodlauncher

import androidx.annotation.Keep
import com.geode.rodlauncher.utils.Constants

@Keep
object LauncherFix {
    fun loadLibrary() {
        System.loadLibrary(Constants.LAUNCHER_FIX_LIB_NAME)
    }

    external fun setDataPath(dataPath: String)

    external fun setOriginalDataPath(dataPath: String)

    external fun performExceptionsRenaming()

    external fun enableCustomSymbolList(symbolsPath: String)
}