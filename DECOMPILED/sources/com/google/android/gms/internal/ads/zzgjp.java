package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgjp {
    private static final zzgjp zza = new zzgjn();
    private static final zzgjp zzb = new zzgjo(-1);
    private static final zzgjp zzc = new zzgjo(1);

    /* synthetic */ zzgjp(byte[] bArr) {
    }

    public static zzgjp zzg() {
        return zza;
    }

    public abstract zzgjp zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgjp zzb(int i7, int i8);

    public abstract zzgjp zzc(boolean z7, boolean z8);

    public abstract zzgjp zzd(boolean z7, boolean z8);

    public abstract int zze();
}
