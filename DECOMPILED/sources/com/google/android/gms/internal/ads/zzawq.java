package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawq implements Callable {
    private final zzavx zza;
    private final zzarw zzb;

    public zzawq(zzavx zzavxVar, zzarw zzarwVar) {
        this.zza = zzavxVar;
        this.zzb = zzarwVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        zzavx zzavxVar = this.zza;
        if (zzavxVar.zzm() != null) {
            zzavxVar.zzm().get();
        }
        zzast zzastVarZzl = zzavxVar.zzl();
        if (zzastVarZzl == null) {
            return null;
        }
        try {
            zzarw zzarwVar = this.zzb;
            synchronized (zzarwVar) {
                try {
                    zzarwVar.zzaY(zzastVarZzl.zzaN(), zzhhr.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzhiw | NullPointerException unused) {
            return null;
        }
    }
}
