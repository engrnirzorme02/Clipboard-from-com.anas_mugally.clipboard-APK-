package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfqy implements Closeable {
    public static zzfrk zza() {
        return new zzfrk();
    }

    public static zzfrk zzb(zzght<Integer> zzghtVar, zzght<Integer> zzghtVar2, zzfra zzfraVar) {
        return new zzfrk(zzghtVar, zzghtVar2, zzfraVar);
    }

    public static zzfrk zzc(final int i7, zzfra zzfraVar) {
        return new zzfrk(new zzght() { // from class: com.google.android.gms.internal.ads.zzfqx
            @Override // com.google.android.gms.internal.ads.zzght
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i7);
            }
        }, zzfqw.zza, zzfraVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }
}
