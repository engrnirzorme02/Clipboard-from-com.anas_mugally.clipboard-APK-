package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkc implements zzbjl {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbkb zzbkbVar = (zzbkb) this.zzb.remove(str);
                if (zzbkbVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                    sb.append("Received result for unexpected method invocation: ");
                    sb.append(str);
                    String string = sb.toString();
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f(string);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                    sb2.append(str3);
                    sb2.append(strConcat);
                    zzbkbVar.zzb(sb2.toString());
                    return;
                }
                if (str5 == null) {
                    zzbkbVar.zza(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (AbstractC3490o0.m17547m()) {
                        String string2 = jSONObject.toString(2);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 13);
                        sb3.append("Result GMSG: ");
                        sb3.append(string2);
                        AbstractC3490o0.m17545k(sb3.toString());
                    }
                    zzbkbVar.zza(jSONObject);
                } catch (JSONException e7) {
                    zzbkbVar.zzb(e7.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(String str, zzbkb zzbkbVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbkbVar);
        }
    }

    public final InterfaceFutureC1673e zzc(zzbmt zzbmtVar, String str, JSONObject jSONObject) {
        zzbzm zzbzmVar = new zzbzm();
        C7351t.m32349g();
        String string = UUID.randomUUID().toString();
        zzb(string, new zzbka(this, zzbzmVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbmtVar.zzb(str, jSONObject2);
            return zzbzmVar;
        } catch (Exception e7) {
            zzbzmVar.zzd(e7);
            return zzbzmVar;
        }
    }
}
