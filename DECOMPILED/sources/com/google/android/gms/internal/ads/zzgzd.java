package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgzd {
    private final Map zza;
    private final Map zzb;

    private zzgzd() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgzd zza(zzgzc zzgzcVar) throws GeneralSecurityException {
        if (zzgzcVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzgze zzgzeVar = new zzgze(zzgzcVar.zzb(), zzgzcVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzgzeVar)) {
            map.put(zzgzeVar, zzgzcVar);
            return this;
        }
        zzgzc zzgzcVar2 = (zzgzc) map.get(zzgzeVar);
        if (zzgzcVar2.equals(zzgzcVar) && zzgzcVar.equals(zzgzcVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgzeVar.toString()));
    }

    public final zzgzd zzb(zzgzi zzgziVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZza = zzgziVar.zza();
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, zzgziVar);
            return this;
        }
        zzgzi zzgziVar2 = (zzgzi) map.get(clsZza);
        if (zzgziVar2.equals(zzgziVar) && zzgziVar.equals(zzgziVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
    }

    public final zzgzg zzc() {
        return new zzgzg(this, null);
    }

    final /* synthetic */ Map zzd() {
        return this.zza;
    }

    final /* synthetic */ Map zze() {
        return this.zzb;
    }

    /* synthetic */ zzgzd(zzgzg zzgzgVar, byte[] bArr) {
        this.zza = new HashMap(zzgzgVar.zzd());
        this.zzb = new HashMap(zzgzgVar.zze());
    }

    /* synthetic */ zzgzd(byte[] bArr) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
