package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqh {
    private final Map<zzqj, zznx<?, ?>> zza;
    private final Map<zzqk, zznt<?>> zzb;
    private final Map<zzqj, zzph<?, ?>> zzc;
    private final Map<zzqk, zzpd<?>> zzd;

    public zzqh() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final <SerializationT extends zzqf> zzqh zza(zznt<SerializationT> zzntVar) throws GeneralSecurityException {
        zzqk zzqkVar = new zzqk(zzntVar.zzb(), zzntVar.zza());
        if (!this.zzb.containsKey(zzqkVar)) {
            this.zzb.put(zzqkVar, zzntVar);
            return this;
        }
        zznt<?> zzntVar2 = this.zzb.get(zzqkVar);
        if (zzntVar2.equals(zzntVar) && zzntVar.equals(zzntVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + String.valueOf(zzqkVar));
    }

    public zzqh(zzqi zzqiVar) {
        this.zza = new HashMap(zzqiVar.zza);
        this.zzb = new HashMap(zzqiVar.zzb);
        this.zzc = new HashMap(zzqiVar.zzc);
        this.zzd = new HashMap(zzqiVar.zzd);
    }

    public final <KeyT extends zzbi, SerializationT extends zzqf> zzqh zza(zznx<KeyT, SerializationT> zznxVar) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(zznxVar.zza(), zznxVar.zzb());
        if (this.zza.containsKey(zzqjVar)) {
            zznx<?, ?> zznxVar2 = this.zza.get(zzqjVar);
            if (zznxVar2.equals(zznxVar) && zznxVar.equals(zznxVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + String.valueOf(zzqjVar));
        }
        this.zza.put(zzqjVar, zznxVar);
        return this;
    }

    public final <SerializationT extends zzqf> zzqh zza(zzpd<SerializationT> zzpdVar) throws GeneralSecurityException {
        zzqk zzqkVar = new zzqk(zzpdVar.zzb(), zzpdVar.zza());
        if (this.zzd.containsKey(zzqkVar)) {
            zzpd<?> zzpdVar2 = this.zzd.get(zzqkVar);
            if (zzpdVar2.equals(zzpdVar) && zzpdVar.equals(zzpdVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + String.valueOf(zzqkVar));
        }
        this.zzd.put(zzqkVar, zzpdVar);
        return this;
    }

    public final <ParametersT extends zzcb, SerializationT extends zzqf> zzqh zza(zzph<ParametersT, SerializationT> zzphVar) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(zzphVar.zza(), zzphVar.zzb());
        if (this.zzc.containsKey(zzqjVar)) {
            zzph<?, ?> zzphVar2 = this.zzc.get(zzqjVar);
            if (zzphVar2.equals(zzphVar) && zzphVar.equals(zzphVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + String.valueOf(zzqjVar));
        }
        this.zzc.put(zzqjVar, zzphVar);
        return this;
    }

    public final zzqi zza() {
        return new zzqi(this);
    }
}
