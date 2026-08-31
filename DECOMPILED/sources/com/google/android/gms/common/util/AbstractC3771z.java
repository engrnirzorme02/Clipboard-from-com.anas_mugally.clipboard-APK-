package com.google.android.gms.common.util;

import android.os.StrictMode;

/* JADX INFO: renamed from: com.google.android.gms.common.util.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3771z {
    /* JADX INFO: renamed from: a */
    public static StrictMode.VmPolicy m18218a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (AbstractC3760o.m18203k()) {
            StrictMode.setVmPolicy(AbstractC3770y.m18217a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
