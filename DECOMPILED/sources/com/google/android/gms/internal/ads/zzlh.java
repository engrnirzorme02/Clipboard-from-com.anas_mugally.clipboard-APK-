package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlh {
    private final zzlg zza;
    private final zzlf zzb;
    private final zzbe zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzlh(zzlf zzlfVar, zzlg zzlgVar, zzbe zzbeVar, int i7, zzdb zzdbVar, Looper looper) {
        this.zzb = zzlfVar;
        this.zza = zzlgVar;
        this.zzc = zzbeVar;
        this.zzf = looper;
        this.zzg = i7;
    }

    public final zzlg zza() {
        return this.zza;
    }

    public final zzlh zzb(int i7) {
        zzghc.zzh(!this.zzh);
        this.zzd = i7;
        return this;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzlh zzd(Object obj) {
        zzghc.zzh(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final Object zze() {
        return this.zze;
    }

    public final Looper zzf() {
        return this.zzf;
    }

    public final zzlh zzg() {
        zzghc.zzh(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z7) {
        this.zzi = z7 | this.zzi;
        notifyAll();
    }
}
