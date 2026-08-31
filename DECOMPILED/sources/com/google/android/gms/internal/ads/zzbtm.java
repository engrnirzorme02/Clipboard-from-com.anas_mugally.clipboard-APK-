package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3243A1;
import java.util.Objects;
import p060H2.AbstractC0497b;
import p060H2.C0496a;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtm extends zzbya {
    final /* synthetic */ AbstractC0497b zza;

    zzbtm(zzbtn zzbtnVar, AbstractC0497b abstractC0497b) {
        this.zza = abstractC0497b;
        Objects.requireNonNull(zzbtnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new C0496a(new C3243A1(str, bundle, str2)));
    }
}
