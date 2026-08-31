package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p380w2.InterfaceC7338g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcy extends zzbcz {
    private final InterfaceC7338g zza;
    private final String zzb;
    private final String zzc;

    public zzbcy(InterfaceC7338g interfaceC7338g, String str, String str2) {
        this.zza = interfaceC7338g;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzd(InterfaceC3772a interfaceC3772a) {
        if (interfaceC3772a == null) {
            return;
        }
        this.zza.zza((View) BinderC3773b.m18220M0(interfaceC3772a));
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zze() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbda
    public final void zzf() {
        this.zza.zzc();
    }
}
