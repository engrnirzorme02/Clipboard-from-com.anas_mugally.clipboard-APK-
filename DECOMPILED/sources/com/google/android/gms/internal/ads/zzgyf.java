package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgyf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgyd zzc = zzgye.zza;
    private static final zzgyf zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzgyf zza() {
        return zzd;
    }

    private static zzgyf zzd() {
        zzgyf zzgyfVar = new zzgyf();
        try {
            zzgyfVar.zzb(zzc, zzgxw.class);
            return zzgyfVar;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException("unexpected error.", e7);
        }
    }

    private final synchronized zzgqd zze(zzgqs zzgqsVar, Integer num) {
        zzgyd zzgydVar;
        zzgydVar = (zzgyd) this.zzb.get(zzgqsVar.getClass());
        if (zzgydVar == null) {
            String string = zzgqsVar.toString();
            StringBuilder sb = new StringBuilder(string.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(string);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return zzgydVar.zza(zzgqsVar, num);
    }

    public final synchronized void zzb(zzgyd zzgydVar, Class cls) {
        try {
            Map map = this.zzb;
            zzgyd zzgydVar2 = (zzgyd) map.get(cls);
            if (zzgydVar2 != null && !zzgydVar2.equals(zzgydVar)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, zzgydVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzgqd zzc(zzgqs zzgqsVar, Integer num) {
        return zze(zzgqsVar, num);
    }
}
