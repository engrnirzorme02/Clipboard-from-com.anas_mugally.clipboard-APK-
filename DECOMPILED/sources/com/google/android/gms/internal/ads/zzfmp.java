package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmp implements zzfmi {
    private static zzfmp zza;
    private float zzb = 0.0f;
    private zzfmd zzc;
    private zzfmh zzd;

    public zzfmp(zzfme zzfmeVar, zzfma zzfmaVar) {
    }

    public static zzfmp zza() {
        if (zza == null) {
            zza = new zzfmp(new zzfme(), new zzfma());
        }
        return zza;
    }

    public final void zzb(Context context) {
        this.zzc = new zzfmd(new Handler(), context, new zzflz(), this);
    }

    public final void zzc() {
        zzfmg.zza().zzg(this);
        zzfmg.zza().zze();
        zzfnr.zzb().zzc();
        this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfmi
    public final void zzd(boolean z7) {
        if (z7) {
            zzfnr.zzb().zzc();
        } else {
            zzfnr.zzb().zze();
        }
    }

    public final void zze() {
        zzfnr.zzb().zzd();
        zzfmg.zza().zzf();
        this.zzc.zzb();
    }

    public final void zzf(float f7) {
        this.zzb = f7;
        if (this.zzd == null) {
            this.zzd = zzfmh.zza();
        }
        Iterator it = this.zzd.zzf().iterator();
        while (it.hasNext()) {
            ((zzfln) it.next()).zzg().zzo(f7);
        }
    }

    public final float zzg() {
        return this.zzb;
    }
}
