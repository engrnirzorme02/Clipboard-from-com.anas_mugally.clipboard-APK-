package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzej implements zzdl {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzej(Handler handler) {
        this.zzb = handler;
    }

    static /* synthetic */ void zzn(zzei zzeiVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzeiVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzei zzo() {
        zzei zzeiVar;
        List list = zza;
        synchronized (list) {
            try {
                zzeiVar = list.isEmpty() ? new zzei(null) : (zzei) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzb(int i7) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zzc(int i7) {
        Handler handler = this.zzb;
        zzei zzeiVarZzo = zzo();
        zzeiVarZzo.zzb(handler.obtainMessage(i7), this);
        return zzeiVarZzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zzd(int i7, Object obj) {
        Handler handler = this.zzb;
        zzei zzeiVarZzo = zzo();
        zzeiVarZzo.zzb(handler.obtainMessage(i7, obj), this);
        return zzeiVarZzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zze(int i7, int i8, int i9) {
        Handler handler = this.zzb;
        zzei zzeiVarZzo = zzo();
        zzeiVarZzo.zzb(handler.obtainMessage(i7, i8, i9), this);
        return zzeiVarZzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final zzdk zzf(int i7, int i8, int i9, Object obj) {
        Handler handler = this.zzb;
        zzei zzeiVarZzo = zzo();
        zzeiVarZzo.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzeiVarZzo;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzg(zzdk zzdkVar) {
        return ((zzei) zzdkVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzh(int i7) {
        return this.zzb.sendEmptyMessage(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzi(int i7, int i8) {
        return this.zzb.sendEmptyMessageDelayed(1, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzj(int i7, long j7) {
        return this.zzb.sendEmptyMessageAtTime(2, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final void zzk(int i7) {
        this.zzb.removeMessages(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final void zzl(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean zzm(Runnable runnable) {
        return this.zzb.post(runnable);
    }
}
