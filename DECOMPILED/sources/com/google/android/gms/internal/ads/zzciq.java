package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3369m2;

/* JADX INFO: loaded from: classes2.dex */
final class zzciq implements zzeyz {
    private final zzcih zza;
    private Context zzb;
    private String zzc;
    private C3369m2 zzd;

    /* synthetic */ zzciq(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final zzeza zza() {
        zzhqf.zzc(this.zzb, Context.class);
        zzhqf.zzc(this.zzc, String.class);
        zzhqf.zzc(this.zzd, C3369m2.class);
        return new zzcir(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final /* bridge */ /* synthetic */ zzeyz zzb(C3369m2 c3369m2) {
        c3369m2.getClass();
        this.zzd = c3369m2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final /* bridge */ /* synthetic */ zzeyz zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final /* bridge */ /* synthetic */ zzeyz zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
