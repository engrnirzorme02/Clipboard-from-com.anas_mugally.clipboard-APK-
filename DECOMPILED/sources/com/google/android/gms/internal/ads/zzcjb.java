package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3369m2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjb implements zzfap {
    private final zzcih zza;
    private Context zzb;
    private String zzc;
    private C3369m2 zzd;

    /* synthetic */ zzcjb(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfap
    public final zzfaq zza() {
        zzhqf.zzc(this.zzb, Context.class);
        zzhqf.zzc(this.zzc, String.class);
        zzhqf.zzc(this.zzd, C3369m2.class);
        return new zzcjc(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfap
    public final /* bridge */ /* synthetic */ zzfap zzb(C3369m2 c3369m2) {
        c3369m2.getClass();
        this.zzd = c3369m2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfap
    public final /* bridge */ /* synthetic */ zzfap zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfap
    public final /* bridge */ /* synthetic */ zzfap zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
