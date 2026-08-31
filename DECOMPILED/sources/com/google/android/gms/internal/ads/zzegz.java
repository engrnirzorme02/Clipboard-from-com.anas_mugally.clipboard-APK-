package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.C3349h2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzegz implements zzedz {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        return !TextUtils.isEmpty(zzfcjVar.zzv.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final InterfaceFutureC1673e zzb(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        JSONObject jSONObject = zzfcjVar.zzv;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        zzfdb zzfdbVar = new zzfdb();
        zzfdbVar.zzy(zzfdcVar);
        zzfdbVar.zzg(strOptString);
        C3349h2 c3349h2 = zzfdcVar.zzd;
        Bundle bundleZzd = zzd(c3349h2.f13961x);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = zzfcjVar.zzD;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        zzfdbVar.zza(new C3349h2(c3349h2.f13949a, c3349h2.f13950b, bundleZzd2, c3349h2.f13952d, c3349h2.f13953e, c3349h2.f13954f, c3349h2.f13955r, c3349h2.f13956s, c3349h2.f13957t, c3349h2.f13958u, c3349h2.f13959v, c3349h2.f13960w, bundleZzd, c3349h2.f13962y, c3349h2.f13963z, c3349h2.f13936A, c3349h2.f13937B, c3349h2.f13938C, c3349h2.f13939D, c3349h2.f13940E, c3349h2.f13941F, c3349h2.f13942G, c3349h2.f13943H, c3349h2.f13944I, c3349h2.f13945J, c3349h2.f13946K, c3349h2.f13947L));
        zzfdc zzfdcVarZzz = zzfdbVar.zzz();
        Bundle bundle = new Bundle();
        zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfcmVar.zza));
        bundle2.putInt("refresh_interval", zzfcmVar.zzc);
        bundle2.putString("gws_query_id", zzfcmVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzfdcVar.zzg;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzfcjVar.zzw);
        bundle3.putString("ad_source_name", zzfcjVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfcjVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfcjVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfcjVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfcjVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfcjVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfcjVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfcjVar.zzi));
        bundle3.putString("transaction_id", zzfcjVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfcjVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfcjVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfcjVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfcjVar.zzW);
        zzbvt zzbvtVar = zzfcjVar.zzl;
        if (zzbvtVar != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzbvtVar.zzb);
            bundle4.putString("rb_type", zzbvtVar.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfdcVarZzz, bundle, zzfcjVar, zzfcuVar);
    }

    protected abstract InterfaceFutureC1673e zzc(zzfdc zzfdcVar, Bundle bundle, zzfcj zzfcjVar, zzfcu zzfcuVar);
}
