package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduz implements zzdda {
    private final Bundle zza = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdda
    public final synchronized void zza(String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final synchronized void zzb(String str) {
        this.zza.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final synchronized void zzc(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzf() {
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }
}
