package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.dynamic.BinderC3773b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdug implements zzdtv {
    private final long zza;
    private final zzelq zzb;

    zzdug(long j7, Context context, zzdtz zzdtzVar, zzcgv zzcgvVar, String str) {
        this.zza = j7;
        zzfap zzfapVarZzl = zzcgvVar.zzl();
        zzfapVarZzl.zzd(context);
        zzfapVarZzl.zzb(new C3369m2());
        zzfapVarZzl.zzc(str);
        zzelq zzelqVarZza = zzfapVarZzl.zza().zza();
        this.zzb = zzelqVarZza;
        zzelqVarZza.zzdW(new zzduf(this, zzdtzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zza(C3349h2 c3349h2) {
        this.zzb.zze(c3349h2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzb() {
        this.zzb.zzR(BinderC3773b.m18221N0(null));
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzc() {
        this.zzb.zzc();
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }
}
