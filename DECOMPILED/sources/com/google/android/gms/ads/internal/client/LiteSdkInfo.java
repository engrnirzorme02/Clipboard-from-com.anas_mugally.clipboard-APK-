package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbox;

/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends AbstractBinderC3409x0 {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3412y0
    public zzbox getAdapterCreator() {
        return new zzbot();
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3412y0
    public C3249C1 getLiteSdkVersion() {
        return new C3249C1(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.6.0");
    }
}
