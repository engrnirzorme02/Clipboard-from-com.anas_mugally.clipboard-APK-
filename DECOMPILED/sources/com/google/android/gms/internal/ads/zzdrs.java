package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p036E2.C0318M;
import p098M0.AbstractC0881k;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrs implements zzcyy, zzcxg, zzcvv, zzdel {
    private final zzdsg zza;
    private final zzdsr zzb;
    private final int zzc;

    zzdrs(zzdsg zzdsgVar, zzdsr zzdsrVar, int i7) {
        this.zza = zzdsgVar;
        this.zzb = zzdsrVar;
        this.zzc = i7;
    }

    private final void zzc(Bundle bundle, zzgjz zzgjzVar) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdru.PUBLIC_API_CALLBACK.zza(), C7351t.m32357o().mo18159a());
        zzdsg zzdsgVar = this.zza;
        zzdsgVar.zzf();
        if (bundle.containsKey("ls")) {
            zzdsgVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgjzVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            zzdrv zzdrvVar = (zzdrv) zzgjzVar.get(i7);
            long j7 = bundle.getLong(zzdrvVar.zzb().zza(), -1L);
            long j8 = bundle.getLong(zzdrvVar.zzc().zza(), -1L);
            if (j7 > 0 && j8 > 0) {
                zzdsgVar.zzd(zzdrvVar.zza(), String.valueOf(j8 - j7));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhX)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdsgVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdsgVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j7 = bundle.getLong(str);
            if (j7 >= 0) {
                this.zza.zzd(str, String.valueOf(j7));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(C0318M c0318m) {
        String str;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhq)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhX)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            if (c0318m == null) {
                zzdsg zzdsgVar = this.zza;
                zzdsgVar.zzc().put("action", "sgs");
                zzdsgVar.zzc().put("request_id", "-1");
                this.zzb.zzb(zzdsgVar.zzc());
                return;
            }
            zzbuv zzbuvVar = c0318m.f1317d;
            Bundle bundle = c0318m.f1318e;
            if (zzbuvVar != null) {
                zzc(zzbuvVar.zzm, zzdrv.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzc(bundle, zzdrv.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(c0318m.f1316c) ? c0318m.f1315b : c0318m.f1316c);
                zzdsg zzdsgVar2 = this.zza;
                zzdsgVar2.zzc().put("action", "sgs");
                Map mapZzc = zzdsgVar2.zzc();
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkw)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e7) {
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Error retrieving JSONObject from the requestJson, ", e7);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                zzbuv zzbuvVar2 = c0318m.f1317d;
                if (zzbuvVar2 != null) {
                    this.zza.zzb(zzbuvVar2.zza);
                }
                this.zzb.zzb(this.zza.zzc());
            } catch (JSONException unused) {
                zzdsg zzdsgVar3 = this.zza;
                zzdsgVar3.zzc().put("action", "sgf");
                zzdsgVar3.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdsgVar3.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(C3324b1 c3324b1) {
        zzdsg zzdsgVar = this.zza;
        zzdsgVar.zzc().put("action", "ftl");
        zzdsgVar.zzd("ftl", String.valueOf(c3324b1.f13918a));
        zzdsgVar.zzd("ed", c3324b1.f13920c);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhF)).booleanValue()) {
            zzdsgVar.zzd("emsg", c3324b1.f13919b);
        }
        this.zzb.zzb(zzdsgVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        this.zza.zzb(zzbuvVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
        this.zza.zza(zzfcuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(String str) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhq)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhX)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            zzdsg zzdsgVar = this.zza;
            zzdsgVar.zzc().put("action", "sgf");
            zzdsgVar.zzd("sgf_reason", str);
            this.zzb.zzb(zzdsgVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzdsg zzdsgVar = this.zza;
        zzdsgVar.zzc().put("action", "loaded");
        zzc(zzdsgVar.zze(), zzdrv.zzb);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznu)).booleanValue()) {
            zzdsgVar.zzc().put("mafe", true != AbstractC0881k.m4035a("MUTE_AUDIO") ? "0" : "1");
        }
        this.zzb.zzb(zzdsgVar.zzc());
    }
}
