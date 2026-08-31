package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhhr {
    static final zzhhr zza = new zzhhr(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzhhr zzd;
    private final Map zze;

    zzhhr() {
        this.zze = new HashMap();
    }

    public static zzhhr zza() {
        int i7 = zzhgo.zza;
        return zza;
    }

    public static zzhhr zzb() {
        zzhhr zzhhrVar = zzd;
        if (zzhhrVar != null) {
            return zzhhrVar;
        }
        synchronized (zzhhr.class) {
            try {
                zzhhr zzhhrVar2 = zzd;
                if (zzhhrVar2 != null) {
                    return zzhhrVar2;
                }
                int i7 = zzhgo.zza;
                zzhhr zzhhrVarZzb = zzhhz.zzb(zzhhr.class);
                zzd = zzhhrVarZzb;
                return zzhhrVarZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzhif zzc(zzhjs zzhjsVar, int i7) {
        return (zzhif) this.zze.get(new zzhhq(zzhjsVar, i7));
    }

    zzhhr(boolean z7) {
        this.zze = Collections.EMPTY_MAP;
    }
}
