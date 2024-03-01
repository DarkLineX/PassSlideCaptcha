package com.eeextend.passslidecaptcha

import android.util.Log
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.callbacks.XC_LoadPackage

class HookEntry: IXposedHookLoadPackage {
    private val tag:String = "HookEntry"
    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam?) {
        Log.e(tag,"handleLoadPackage "+lpparam!!.packageName)
        //提取页面的滑块图片
        //com.eeextend.slidecaptcha.MainActivity 的 webview控件保存为view图片
        //处理图片 发给Python程序计算一下缺口位置

        //拿到缺口位置开始处理滑动事件
    }
}