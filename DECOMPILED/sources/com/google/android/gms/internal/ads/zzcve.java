package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcve implements zzhpx {
    private final zzcvb zza;

    private zzcve(zzcvb zzcvbVar) {
        this.zza = zzcvbVar;
    }

    public static zzcve zzc(zzcvb zzcvbVar) {
        return new zzcve(zzcvbVar);
    }

    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
