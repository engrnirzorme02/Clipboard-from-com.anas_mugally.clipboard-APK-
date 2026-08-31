package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgzt extends RuntimeException {
    public zzgzt(String str) {
        super(str);
    }

    public static Object zza(zzgzs zzgzsVar) {
        try {
            return zzgzsVar.zza();
        } catch (Exception e7) {
            throw new zzgzt(e7);
        }
    }

    public zzgzt(String str, Throwable th) {
        super(str, th);
    }

    public zzgzt(Throwable th) {
        super(th);
    }
}
