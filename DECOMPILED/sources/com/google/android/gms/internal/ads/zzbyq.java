package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyq {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private final List zzi = new ArrayList();

    public zzbyq(String str, long j7) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j7;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zzg = new JSONObject(str);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmv)).booleanValue() && zzj()) {
                return;
            }
            if (this.zzg.optInt("status", -1) != 1) {
                this.zzh = false;
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("App settings could not be fetched successfully.");
                return;
            }
            this.zzh = true;
            this.zzd = this.zzg.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i8);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.zzb.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.zzc.put(strOptString2, new zzbor(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i9 = 0; i9 < jSONArrayOptJSONArray3.length(); i9++) {
                    this.zza.add(jSONArrayOptJSONArray3.optString(i9));
                }
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhm)).booleanValue() && (jSONObjectOptJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.zzi.add(jSONArrayOptJSONArray.get(i10).toString());
                }
            }
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzgI)).booleanValue() || (jSONObjectOptJSONObject = this.zzg.optJSONObject("common_settings")) == null) {
                return;
            }
            this.zzj = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e7) {
            int i11 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Exception occurred while processing app setting json", e7);
            C7351t.m32354l().zzg(e7, "AppSettings.parseAppSettingsJson");
        }
    }

    private final boolean zzl() {
        if (!TextUtils.isEmpty(this.zze) && this.zzg != null) {
            long jZzm = zzm();
            long jMo18159a = C7351t.m32357o().mo18159a();
            if (jZzm >= 0) {
                long j7 = this.zzf;
                if (j7 > jMo18159a || TimeUnit.MILLISECONDS.toSeconds(jMo18159a - j7) > jZzm) {
                    return false;
                }
            }
        }
        return true;
    }

    private final long zzm() {
        zzbbz zzbbzVar = zzbci.zzmy;
        return (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmx)).booleanValue() || TextUtils.isEmpty(this.zze)) ? ((Long) C3250D.m17200c().zzd(zzbbzVar)).longValue() : this.zzg.optLong("cache_ttl_sec", ((Long) C3250D.m17200c().zzd(zzbbzVar)).longValue());
    }

    public final void zza(long j7) {
        this.zzf = j7;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zze;
    }

    public final String zze() {
        return this.zzd;
    }

    public final Map zzf() {
        return this.zzc;
    }

    public final JSONObject zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final boolean zzj() {
        zzdsm zzdsmVarZzv;
        if (zzl()) {
            return false;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeF)).booleanValue() && (zzdsmVarZzv = C7351t.m32354l().zzv()) != null) {
            zzdsl zzdslVarZza = zzdsmVarZzv.zza();
            zzdslVarZza.zzc("action", "cld_reset");
            zzdslVarZza.zzc("cld_lut_ms", String.valueOf(this.zzf));
            zzdslVarZza.zzc("event_timestamp", String.valueOf(C7351t.m32357o().mo18159a()));
            zzdslVarZza.zzc("cld_ttl_sec", String.valueOf(zzm()));
            zzdslVarZza.zzd();
        }
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd = "";
        this.zze = "";
        this.zzg = null;
        this.zzh = false;
        this.zzi.clear();
        this.zzj = false;
        return true;
    }

    public final int zzk() {
        if (TextUtils.isEmpty(this.zze) || this.zzg == null) {
            return 3;
        }
        return zzl() ? 1 : 2;
    }
}
