package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghx {
    public static zzght zza(zzght zzghtVar) {
        if ((zzghtVar instanceof zzghw) || (zzghtVar instanceof zzghu)) {
            return zzghtVar;
        }
        return zzghtVar instanceof Serializable ? new zzghu(zzghtVar) : new zzghw(zzghtVar);
    }
}
