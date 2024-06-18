/*
 * WearableSpoof
 * Copyright (C) 2023 Simon1511
 * HuskySpoof
 * Copyright (C) 2023 RisenID
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.risenid.huskyspoof;

import android.os.Build;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("HuskySpoof: Hooking into: " + lpparam.packageName);

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "samsung");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "samsung");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "qssi");

        // ro.build.tags
        XposedHelpers.setStaticObjectField(Build.class, "TAGS", "release-keys");

        // ro.build.type
        XposedHelpers.setStaticObjectField(Build.class, "TYPE", "user");

        // ro.product.product
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", "qssi");

        // ro.product.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "dm3qxxx");

        // ro.system_ext.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM_EXT.MODEL", "SM-S918B");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "SM-S918B");

        // ro.vendor.model
        XposedHelpers.setStaticObjectField(Build.class, "VENDOR.MODEL", "SM-S918B");

        // ro.odm.model
        XposedHelpers.setStaticObjectField(Build.class, "ODM.MODEL", "SM-S918B");

        // ro.system.model
        XposedHelpers.setStaticObjectField(Build.class, "SYSTEM.MODEL", "SM-S918B");

        // ro.product.flavor
        XposedHelpers.setStaticObjectField(Build.class, "FLAVOUR", "qssi-user");

        // ro.soc.model
        // XposedHelpers.setStaticObjectField(Build.class, "SOC.MODEL", "Tensor G3");

        // ro.product.board
        // XposedHelpers.setStaticObjectField(Build.class, "BOARD", "husky");

        // ro.build.id
        XposedHelpers.setStaticObjectField(Build.class, "ID", "TP1A.220624.014");

        // ro.build.fingerprint
        XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT",
                "samsung/dm3qxxx/qssi:13/TP1A.220624.014/S918BXXU3AWGJ:user/release-keys");
    }
}
