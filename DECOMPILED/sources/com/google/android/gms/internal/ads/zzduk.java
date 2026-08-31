package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduk implements zzdtv {
    private final long zza;
    private final zzdtz zzb;
    private final zzfca zzc;

    zzduk(long j7, Context context, zzdtz zzdtzVar, zzcgv zzcgvVar, String str) {
        this.zza = j7;
        this.zzb = zzdtzVar;
        zzfcc zzfccVarZzo = zzcgvVar.zzo();
        zzfccVarZzo.zzc(context);
        zzfccVarZzo.zzb(str);
        this.zzc = zzfccVarZzo.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zza(C3349h2 c3349h2) {
        try {
            this.zzc.zzc(c3349h2, new zzdui(this));
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzb() {
        try {
            zzfca zzfcaVar = this.zzc;
            zzfcaVar.zze(new zzduj(this));
            zzfcaVar.zzb(BinderC3773b.m18221N0(null));
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtv
    public final void zzc() {
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }

    final /* synthetic */ zzdtz zze() {
        return this.zzb;
    }
}
