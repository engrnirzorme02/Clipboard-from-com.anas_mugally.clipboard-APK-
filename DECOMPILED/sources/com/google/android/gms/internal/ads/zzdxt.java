package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3323b0;
import com.google.android.gms.common.api.C3553a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxt implements zzhpx {
    private final zzhqg zza;

    private zzdxt(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdxt zza(zzhqg zzhqgVar) {
        return new zzdxt(zzhqgVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strValueOf;
        C3323b0 c3323b0;
        zzfdc zzfdcVarZza = ((zzcvj) this.zza).zza();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhI)).booleanValue()) {
            String str = zzfdcVarZza.zzd.f13944I;
            if (TextUtils.isEmpty(str)) {
                c3323b0 = zzfdcVarZza.zzd.f13939D;
                if (c3323b0 != null) {
                    strValueOf = new JSONObject(c3323b0.f13916a).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        strValueOf = String.valueOf(C3244B.m17194e().nextInt() & C3553a.e.API_PRIORITY_OTHER);
                    }
                } else {
                    strValueOf = String.valueOf(C3244B.m17194e().nextInt() & C3553a.e.API_PRIORITY_OTHER);
                }
            } else {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        c3323b0 = zzfdcVarZza.zzd.f13939D;
                        if (c3323b0 != null) {
                            try {
                                strValueOf = new JSONObject(c3323b0.f13916a).getString("request_id");
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(C3244B.m17194e().nextInt() & C3553a.e.API_PRIORITY_OTHER);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(C3244B.m17194e().nextInt() & C3553a.e.API_PRIORITY_OTHER);
                        }
                    }
                } catch (JSONException unused2) {
                }
            }
        } else {
            strValueOf = String.valueOf(C3244B.m17194e().nextInt() & C3553a.e.API_PRIORITY_OTHER);
        }
        zzhqf.zzb(strValueOf);
        return strValueOf;
    }
}
