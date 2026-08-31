package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.AbstractC2380c;
import androidx.browser.customtabs.AbstractServiceConnectionC2382e;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqo extends AbstractServiceConnectionC2382e {
    private final WeakReference zza;

    public zzhqo(zzbdj zzbdjVar) {
        this.zza = new WeakReference(zzbdjVar);
    }

    @Override // androidx.browser.customtabs.AbstractServiceConnectionC2382e
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2380c abstractC2380c) {
        zzbdj zzbdjVar = (zzbdj) this.zza.get();
        if (zzbdjVar != null) {
            zzbdjVar.zzf(abstractC2380c);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdj zzbdjVar = (zzbdj) this.zza.get();
        if (zzbdjVar != null) {
            zzbdjVar.zzg();
        }
    }
}
