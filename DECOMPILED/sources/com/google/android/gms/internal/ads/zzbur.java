package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbur extends zzbup {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbnt zzd;
    private final C7584a zze;

    public zzbur(Context context, zzbnt zzbntVar, C7584a c7584a) {
        this.zzb = context.getApplicationContext();
        this.zze = c7584a;
        this.zzd = zzbntVar;
    }

    public static JSONObject zzb(Context context, C7584a c7584a) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbei.zzd.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", c7584a.f30226a);
            jSONObject.put("mf", zzbei.zze.zze());
            jSONObject.put("cl", "798351165");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m18223c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final InterfaceFutureC1673e zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (C7351t.m32357o().mo18159a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzbei.zzf.zze()).longValue()) {
            return zzgot.zza(null);
        }
        return zzgot.zzk(this.zzd.zzb(zzb(this.zzb, this.zze)), new zzggr() { // from class: com.google.android.gms.internal.ads.zzbuq
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzc((JSONObject) obj);
                return null;
            }
        }, zzbzh.zzg);
    }

    final /* synthetic */ Void zzc(JSONObject jSONObject) {
        zzbbz zzbbzVar = zzbci.zza;
        C3250D.m17198a();
        Context context = this.zzb;
        SharedPreferences sharedPreferencesZzb = zzbcb.zzb(context);
        if (sharedPreferencesZzb == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZzb.edit();
        Objects.requireNonNull(C3250D.m17199b());
        int i7 = zzbdy.zza;
        C3250D.m17199b().zzd(editorEdit, 1, jSONObject);
        C3250D.m17198a();
        editorEdit.commit();
        if (((Boolean) zzbei.zzc.zze()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
            C3250D.m17198a();
            SharedPreferences sharedPreferencesZza = zzbcb.zza(context);
            if (sharedPreferencesZza != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferencesZza.edit();
                C3250D.m17199b();
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next.startsWith("adapter:")) {
                        try {
                            jSONObject2.put(next, jSONObject.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
                editorEdit2.putString("flag_configuration", jSONObject2.toString());
                editorEdit2.commit();
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", C7351t.m32357o().mo18159a()).apply();
        return null;
    }
}
