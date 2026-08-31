package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemh implements zzeun {
    private final boolean zza;

    public zzemh(boolean z7) {
        this.zza = z7;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcuu) obj).zza.putString("adid_p", true != this.zza ? "0" : "1");
    }
}
