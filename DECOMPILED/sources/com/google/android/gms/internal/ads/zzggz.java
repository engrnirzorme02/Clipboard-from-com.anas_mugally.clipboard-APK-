package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggz {
    public static Object zza(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static zzggy zzb(Object obj) {
        return new zzggy(obj.getClass().getSimpleName(), null);
    }
}
