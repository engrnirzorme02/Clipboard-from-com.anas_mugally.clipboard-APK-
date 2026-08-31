package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdo {
    public static zzdj zza(zzdj zzdjVar) {
        if ((zzdjVar instanceof zzdm) || (zzdjVar instanceof zzdk)) {
            return zzdjVar;
        }
        return zzdjVar instanceof Serializable ? new zzdk(zzdjVar) : new zzdm(zzdjVar);
    }

    public static zzdj zzb(Object obj) {
        return new zzdn(obj);
    }
}
