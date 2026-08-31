package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3385q2;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvg implements zzcvv, zzcyy, zzcxk {
    private final zzdvs zza;
    private final String zzb;
    private final String zzc;
    private zzcvl zzf;
    private C3324b1 zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdvf zze = zzdvf.AD_REQUESTED;

    zzdvg(zzdvs zzdvsVar, zzfdc zzfdcVar, String str) {
        this.zza = zzdvsVar;
        this.zzc = str;
        this.zzb = zzfdcVar.zzg;
    }

    private final JSONObject zzh(zzcvl zzcvlVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcvlVar.zze());
        jSONObject.put("responseSecsSinceEpoch", zzcvlVar.zzc());
        jSONObject.put("responseId", zzcvlVar.zzf());
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjZ)).booleanValue()) {
            String strZzd = zzcvlVar.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                String strValueOf = String.valueOf(strZzd);
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkc)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (C3385q2 c3385q2 : zzcvlVar.zzg()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", c3385q2.f14075a);
            jSONObject2.put("latencyMillis", c3385q2.f14076b);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzka)).booleanValue()) {
                jSONObject2.put("credentials", C3244B.m17190a().m33298u(c3385q2.f14078d));
            }
            C3324b1 c3324b1 = c3385q2.f14077c;
            jSONObject2.put("error", c3324b1 == null ? null : zzi(c3324b1));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject zzi(C3324b1 c3324b1) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c3324b1.f13920c);
        jSONObject.put("errorCode", c3324b1.f13918a);
        jSONObject.put("errorDescription", c3324b1.f13919b);
        C3324b1 c3324b2 = c3324b1.f13921d;
        jSONObject.put("underlyingError", c3324b2 == null ? null : zzi(c3324b2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zza(zzcqs zzcqsVar) {
        zzdvs zzdvsVar = this.zza;
        if (zzdvsVar.zzs()) {
            this.zzf = zzcqsVar.zzn();
            this.zze = zzdvf.AD_LOADED;
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkg)).booleanValue()) {
                zzdvsVar.zzk(this.zzb, this);
            }
        }
    }

    public final boolean zzc() {
        return this.zze != zzdvf.AD_REQUESTED;
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(C3324b1 c3324b1) {
        zzdvs zzdvsVar = this.zza;
        if (zzdvsVar.zzs()) {
            this.zze = zzdvf.AD_LOAD_FAILED;
            this.zzg = c3324b1;
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkg)).booleanValue()) {
                zzdvsVar.zzk(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkg)).booleanValue()) {
            return;
        }
        zzdvs zzdvsVar = this.zza;
        if (zzdvsVar.zzs()) {
            zzdvsVar.zzk(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
        zzdvs zzdvsVar = this.zza;
        if (zzdvsVar.zzs()) {
            zzfct zzfctVar = zzfcuVar.zzb;
            List list = zzfctVar.zza;
            if (!list.isEmpty()) {
                this.zzd = ((zzfcj) list.get(0)).zzb;
            }
            zzfcm zzfcmVar = zzfctVar.zzb;
            String str = zzfcmVar.zzl;
            if (!TextUtils.isEmpty(str)) {
                this.zzh = str;
            }
            String str2 = zzfcmVar.zzm;
            if (!TextUtils.isEmpty(str2)) {
                this.zzi = str2;
            }
            JSONObject jSONObject = zzfcmVar.zzp;
            if (jSONObject.length() > 0) {
                this.zzl = jSONObject;
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkc)).booleanValue()) {
                if (!zzdvsVar.zzm()) {
                    this.zzo = true;
                    return;
                }
                String str3 = zzfcmVar.zzn;
                if (!TextUtils.isEmpty(str3)) {
                    this.zzj = str3;
                }
                JSONObject jSONObject2 = zzfcmVar.zzo;
                if (jSONObject2.length() > 0) {
                    this.zzk = jSONObject2;
                }
                JSONObject jSONObject3 = this.zzk;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzdvsVar.zzl(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final JSONObject zzg() throws JSONException {
        JSONObject jSONObjectZzh;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzfcj.zza(this.zzd));
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkg)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzcvl zzcvlVar = this.zzf;
        if (zzcvlVar != null) {
            jSONObjectZzh = zzh(zzcvlVar);
        } else {
            C3324b1 c3324b1 = this.zzg;
            JSONObject jSONObjectZzh2 = null;
            if (c3324b1 != null && (iBinder = c3324b1.f13922e) != null) {
                zzcvl zzcvlVar2 = (zzcvl) iBinder;
                jSONObjectZzh2 = zzh(zzcvlVar2);
                if (zzcvlVar2.zzg().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzi(this.zzg));
                    jSONObjectZzh2.put("errors", jSONArray);
                }
            }
            jSONObjectZzh = jSONObjectZzh2;
        }
        jSONObject.put("responseInfo", jSONObjectZzh);
        return jSONObject;
    }
}
