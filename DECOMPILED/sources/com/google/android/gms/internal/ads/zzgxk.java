package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxk {
    private static final Logger zza = Logger.getLogger(zzgxk.class.getName());
    private static final zzgxk zzd = new zzgxk();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzgxk zza() {
        return zzd;
    }

    private final synchronized zzgqe zzg(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzgqe) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzgqe zzgqeVar, boolean z7, boolean z8) {
        try {
            String str = ((zzgxs) zzgqeVar).zza;
            ConcurrentMap concurrentMap = this.zzc;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzgqe zzgqeVar2 = (zzgqe) concurrentMap2.get(str);
            if (zzgqeVar2 != null && !zzgqeVar2.getClass().equals(zzgqeVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzgqeVar2.getClass().getName(), zzgqeVar.getClass().getName()));
            }
            concurrentMap2.putIfAbsent(str, zzgqeVar);
            concurrentMap.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(zzgqe zzgqeVar, boolean z7) {
        zzf(zzgqeVar, 1, true);
    }

    public final zzgqe zzc(String str, Class cls) throws GeneralSecurityException {
        zzgqe zzgqeVarZzg = zzg(str);
        if (zzgqeVarZzg.zzb().equals(cls)) {
            return zzgqeVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzgqeVarZzg.getClass());
        String string = zzgqeVarZzg.zzb().toString();
        StringBuilder sb = new StringBuilder(name.length() + 53 + strValueOf.length() + 23 + string.length());
        sb.append("Primitive type ");
        sb.append(name);
        sb.append(" not supported by key manager of type ");
        sb.append(strValueOf);
        sb.append(", which only supports: ");
        sb.append(string);
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzgqe zzd(String str) {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgqe zzgqeVar, int i7, boolean z7) {
        if (!zzgxd.zza(i7)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgqeVar, false, true);
    }
}
