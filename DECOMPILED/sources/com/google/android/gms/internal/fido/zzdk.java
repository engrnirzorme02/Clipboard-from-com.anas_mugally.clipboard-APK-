package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes2.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    protected zzdk(String str, Class cls, boolean z7) {
        this(str, cls, z7, true);
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        return getClass().getName() + "/" + this.zza + "[" + cls.getName() + "]";
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzdk(String str, Class cls, boolean z7, boolean z8) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z7;
        System.identityHashCode(this);
        for (int i7 = 0; i7 < 5; i7++) {
        }
    }
}
