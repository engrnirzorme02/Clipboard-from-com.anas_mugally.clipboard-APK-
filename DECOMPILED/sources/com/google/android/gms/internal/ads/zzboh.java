package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.UUID;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzboh implements zzbnt {
    private final zzbnv zza;
    private final zzbnw zzb;
    private final zzbnp zzc;
    private final String zzd;

    zzboh(zzbnp zzbnpVar, String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        this.zzc = zzbnpVar;
        this.zzd = str;
        this.zzb = zzbnwVar;
        this.zza = zzbnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final InterfaceFutureC1673e zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final InterfaceFutureC1673e zzb(Object obj) {
        zzbzm zzbzmVar = new zzbzm();
        zzbnj zzbnjVarZzb = this.zzc.zzb(null);
        AbstractC3490o0.m17545k("callJs > getEngine: Promise created");
        zzbnjVarZzb.zze(new zzboe(this, zzbnjVarZzb, obj, zzbzmVar), new zzbof(this, zzbzmVar, zzbnjVarZzb));
        return zzbzmVar;
    }

    final /* synthetic */ void zzc(zzbnj zzbnjVar, zzbnq zzbnqVar, Object obj, zzbzm zzbzmVar) {
        try {
            C7351t.m32349g();
            String string = UUID.randomUUID().toString();
            zzbjk.zzo.zzb(string, new zzbog(this, zzbnjVar, zzbzmVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbnqVar.zzb(this.zzd, jSONObject);
        } catch (Exception e7) {
            try {
                zzbzmVar.zzd(e7);
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Unable to invokeJavascript", e7);
            } finally {
                zzbnjVar.zza();
            }
        }
    }

    final /* synthetic */ zzbnv zzd() {
        return this.zza;
    }
}
