package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public interface zzln {
    static boolean zzZ(int i7, boolean z7) {
        int i8 = i7 & 7;
        if (i8 != 4) {
            return z7 && i8 == 3;
        }
        return true;
    }

    String zzS();

    int zza();

    int zzaa(zzu zzuVar);

    int zzu();

    default void zzv(zzlm zzlmVar) {
    }

    default void zzw() {
    }
}
