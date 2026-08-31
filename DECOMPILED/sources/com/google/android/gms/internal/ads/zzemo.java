package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemo implements zzeun {
    final zzfdc zza;
    private final long zzb;

    public zzemo(zzfdc zzfdcVar, long j7) {
        this.zza = zzfdcVar;
        this.zzb = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        zzfdc zzfdcVar = this.zza;
        C3349h2 c3349h2 = zzfdcVar.zzd;
        bundle.putInt("http_timeout_millis", c3349h2.f13943H);
        bundle.putString("slotname", zzfdcVar.zzg);
        int i7 = zzfdcVar.zzp.zza;
        if (i7 == 0) {
            throw null;
        }
        int i8 = i7 - 1;
        if (i8 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i8 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzfdr.zzd(bundle, "is_sdk_preload", true, c3349h2.zzc());
        zzfdr.zzb(bundle, "prefetch_type", "zenith_v2", c3349h2.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j7 = c3349h2.f13950b;
        zzfdr.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j7)), j7 != -1);
        zzfdr.zzf(bundle, "extras", c3349h2.f13951c);
        int i9 = c3349h2.f13952d;
        zzfdr.zzc(bundle, "cust_gender", i9, i9 != -1);
        zzfdr.zzg(bundle, "kw", c3349h2.f13953e);
        int i10 = c3349h2.f13955r;
        zzfdr.zzc(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (c3349h2.f13954f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", c3349h2.f13945J);
        int i11 = c3349h2.f13949a;
        zzfdr.zzc(bundle, "d_imp_hdr", 1, i11 >= 2 && c3349h2.f13956s);
        String str = c3349h2.f13957t;
        zzfdr.zzb(bundle, "ppid", str, i11 >= 2 && !TextUtils.isEmpty(str));
        Location location = c3349h2.f13959v;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfdr.zze(bundle, "url", c3349h2.f13960w);
        zzfdr.zzg(bundle, "neighboring_content_urls", c3349h2.f13942G);
        zzfdr.zzf(bundle, "custom_targeting", c3349h2.f13962y);
        zzfdr.zzg(bundle, "category_exclusions", c3349h2.f13963z);
        zzfdr.zze(bundle, "request_agent", c3349h2.f13936A);
        zzfdr.zze(bundle, "request_pkg", c3349h2.f13937B);
        zzfdr.zzd(bundle, "is_designed_for_families", c3349h2.f13938C, i11 >= 7);
        if (i11 >= 8) {
            int i12 = c3349h2.f13940E;
            zzfdr.zzc(bundle, "tag_for_under_age_of_consent", i12, i12 != -1);
            zzfdr.zze(bundle, "max_ad_content_rating", c3349h2.f13941F);
        }
        Bundle bundle3 = zzfdcVar.zze;
        zzfdr.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzfdr.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzfdr.zze(bundle, "plid", bundle3.getString("plid"));
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        zzfdc zzfdcVar = this.zza;
        bundle.putString("slotname", zzfdcVar.zzg);
        C3349h2 c3349h2 = zzfdcVar.zzd;
        if (c3349h2.f13954f) {
            bundle.putBoolean("test_request", true);
        }
        int i7 = c3349h2.f13955r;
        zzfdr.zzc(bundle, "tag_for_child_directed_treatment", i7, i7 != -1);
        if (c3349h2.f13949a >= 8) {
            int i8 = c3349h2.f13940E;
            zzfdr.zzc(bundle, "tag_for_under_age_of_consent", i8, i8 != -1);
        }
        zzfdr.zze(bundle, "url", c3349h2.f13960w);
        zzfdr.zzg(bundle, "neighboring_content_urls", c3349h2.f13942G);
        Bundle bundle2 = c3349h2.f13951c;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzhZ)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfdr.zzf(bundle, "extras", bundle3);
    }
}
