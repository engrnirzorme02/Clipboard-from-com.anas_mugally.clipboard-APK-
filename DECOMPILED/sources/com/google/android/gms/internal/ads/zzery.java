package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzery implements zzeun {
    private final Boolean zza;

    public zzery(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Boolean bool = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (bool != null) {
            zzcuuVar.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
