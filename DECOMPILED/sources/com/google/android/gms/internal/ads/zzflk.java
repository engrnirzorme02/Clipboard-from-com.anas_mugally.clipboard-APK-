package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflk {
    private final zzflw zza;
    private final zzflw zzb;
    private final boolean zzc;
    private final zzflo zzd;
    private final zzflr zze;

    private zzflk(zzflo zzfloVar, zzflr zzflrVar, zzflw zzflwVar, zzflw zzflwVar2, boolean z7) {
        this.zzd = zzfloVar;
        this.zze = zzflrVar;
        this.zza = zzflwVar;
        if (zzflwVar2 == null) {
            this.zzb = zzflw.NONE;
        } else {
            this.zzb = zzflwVar2;
        }
        this.zzc = z7;
    }

    public static zzflk zza(zzflo zzfloVar, zzflr zzflrVar, zzflw zzflwVar, zzflw zzflwVar2, boolean z7) {
        zzfnh.zzb(zzfloVar, "CreativeType is null");
        zzfnh.zzb(zzflrVar, "ImpressionType is null");
        zzfnh.zzb(zzflwVar, "Impression owner is null");
        if (zzflwVar == zzflw.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfloVar == zzflo.DEFINED_BY_JAVASCRIPT && zzflwVar == zzflw.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzflrVar == zzflr.DEFINED_BY_JAVASCRIPT && zzflwVar == zzflw.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzflk(zzfloVar, zzflrVar, zzflwVar, zzflwVar2, z7);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfnd.zzc(jSONObject, "impressionOwner", this.zza);
        zzfnd.zzc(jSONObject, "mediaEventsOwner", this.zzb);
        zzfnd.zzc(jSONObject, "creativeType", this.zzd);
        zzfnd.zzc(jSONObject, "impressionType", this.zze);
        zzfnd.zzc(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
