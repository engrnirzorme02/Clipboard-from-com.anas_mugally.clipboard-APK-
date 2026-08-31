package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfzq implements zzfzp {
    private final String zza;
    private final String zzb;
    private final zzfym zzc;
    private final zzarw zzd;
    private final zzgdy zze;

    public zzfzq(String str, String str2, zzarw zzarwVar, zzfym zzfymVar, zzgdy zzgdyVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzarwVar;
        this.zzc = zzfymVar;
        this.zze = zzgdyVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th) {
            try {
                this.zze.zzb(th);
                throw th;
            } catch (Throwable th2) {
                this.zze.zzc();
                throw th2;
            }
        }
    }

    protected abstract void zza(Method method, zzarw zzarwVar);
}
