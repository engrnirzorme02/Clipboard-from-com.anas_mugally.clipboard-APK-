package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgzo {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgzo() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgzo zza(zzgxq zzgxqVar) throws GeneralSecurityException {
        zzgzq zzgzqVar = new zzgzq(zzgxqVar.zzb(), zzgxqVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzgzqVar)) {
            map.put(zzgzqVar, zzgxqVar);
            return this;
        }
        zzgxq zzgxqVar2 = (zzgxq) map.get(zzgzqVar);
        if (zzgxqVar2.equals(zzgxqVar) && zzgxqVar.equals(zzgxqVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgzqVar.toString()));
    }

    public final zzgzo zzb(zzgxn zzgxnVar) throws GeneralSecurityException {
        zzgzp zzgzpVar = new zzgzp(zzgxnVar.zzc(), zzgxnVar.zzb(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzgzpVar)) {
            map.put(zzgzpVar, zzgxnVar);
            return this;
        }
        zzgxn zzgxnVar2 = (zzgxn) map.get(zzgzpVar);
        if (zzgxnVar2.equals(zzgxnVar) && zzgxnVar.equals(zzgxnVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgzpVar.toString()));
    }

    public final zzgzo zzc(zzgyv zzgyvVar) throws GeneralSecurityException {
        zzgzq zzgzqVar = new zzgzq(zzgyvVar.zzb(), zzgyvVar.zzc(), null);
        Map map = this.zzc;
        if (!map.containsKey(zzgzqVar)) {
            map.put(zzgzqVar, zzgyvVar);
            return this;
        }
        zzgyv zzgyvVar2 = (zzgyv) map.get(zzgzqVar);
        if (zzgyvVar2.equals(zzgyvVar) && zzgyvVar.equals(zzgyvVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgzqVar.toString()));
    }

    public final zzgzo zzd(zzgys zzgysVar) throws GeneralSecurityException {
        zzgzp zzgzpVar = new zzgzp(zzgysVar.zzc(), zzgysVar.zzb(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzgzpVar)) {
            map.put(zzgzpVar, zzgysVar);
            return this;
        }
        zzgys zzgysVar2 = (zzgys) map.get(zzgzpVar);
        if (zzgysVar2.equals(zzgysVar) && zzgysVar.equals(zzgysVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgzpVar.toString()));
    }

    final /* synthetic */ Map zze() {
        return this.zza;
    }

    final /* synthetic */ Map zzf() {
        return this.zzb;
    }

    final /* synthetic */ Map zzg() {
        return this.zzc;
    }

    final /* synthetic */ Map zzh() {
        return this.zzd;
    }

    public zzgzo(zzgzr zzgzrVar) {
        this.zza = new HashMap(zzgzrVar.zzg());
        this.zzb = new HashMap(zzgzrVar.zzh());
        this.zzc = new HashMap(zzgzrVar.zzi());
        this.zzd = new HashMap(zzgzrVar.zzj());
    }
}
