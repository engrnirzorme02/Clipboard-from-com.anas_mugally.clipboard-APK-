package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.browser.customtabs.AbstractC2379b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbde extends AbstractC2379b {
    final /* synthetic */ zzbdh zza;

    zzbde(zzbdh zzbdhVar) {
        Objects.requireNonNull(zzbdhVar);
        this.zza = zzbdhVar;
    }

    @Override // androidx.browser.customtabs.AbstractC2379b
    public final void onNavigationEvent(int i7, Bundle bundle) {
        this.zza.zzc(i7);
    }
}
