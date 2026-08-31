package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbop implements zzgob {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final InterfaceFutureC1673e zzb;

    zzbop(InterfaceFutureC1673e interfaceFutureC1673e, String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        this.zzb = interfaceFutureC1673e;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final InterfaceFutureC1673e zza(Object obj) {
        return zzb(obj);
    }

    public final InterfaceFutureC1673e zzb(final Object obj) {
        return zzgot.zzj(this.zzb, new zzgob() { // from class: com.google.android.gms.internal.ads.zzboo
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj2) {
                return this.zza.zzc(obj, (zzbnq) obj2);
            }
        }, zzbzh.zzg);
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(Object obj, zzbnq zzbnqVar) throws JSONException {
        zzbzm zzbzmVar = new zzbzm();
        C7351t.m32349g();
        String string = UUID.randomUUID().toString();
        zzbjk.zzo.zzb(string, new zzbon(this, zzbzmVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbnqVar.zzb(this.zza, jSONObject);
        return zzbzmVar;
    }
}
