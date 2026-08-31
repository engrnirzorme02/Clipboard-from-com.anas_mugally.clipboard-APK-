package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.Locale;
import java.util.Map;
import p227d3.C5228d;
import p314o2.EnumC6551c;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkk {
    private final zzdsm zza;
    private final String zzb;

    zzfkk(zzdsm zzdsmVar, Context context) {
        CharSequence charSequenceM24150d;
        this.zza = zzdsmVar;
        zzfro zzfroVar = C3431F0.f14180l;
        try {
            charSequenceM24150d = C5228d.m24155a(context).m24150d(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Failed to get application name", e7);
            charSequenceM24150d = "";
        }
        this.zzb = charSequenceM24150d.toString();
    }

    private final void zzq(String str, long j7, String str2, String str3, EnumC6551c enumC6551c, int i7, int i8, int i9, String str4) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("action", str);
        zzdslVarZza.zzc("pat", Long.toString(j7));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("ad_format", enumC6551c.name().toLowerCase(Locale.ENGLISH));
        zzdslVarZza.zzc("max_ads", Integer.toString(i7));
        zzdslVarZza.zzc("cache_size", Integer.toString(i8));
        zzdslVarZza.zzc("pas", Integer.toString(i9));
        zzdslVarZza.zzc("pv", "2");
        zzdslVarZza.zzc("ad_unit_id", str3);
        zzdslVarZza.zzc("pid", str2);
        zzdslVarZza.zzd();
    }

    private final void zzr(String str, String str2, long j7, int i7, int i8, String str3, zzfkr zzfkrVar, String str4) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc(str2, Long.toString(j7));
        zzdslVarZza.zzc("app", this.zzb);
        if (zzfkrVar != null) {
            zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
            zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
            zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        }
        zzdslVarZza.zzc("action", str);
        if (str3 != null) {
            zzdslVarZza.zzc("gqi", str3);
        }
        if (i7 >= 0) {
            zzdslVarZza.zzc("max_ads", Integer.toString(i7));
        }
        if (i8 >= 0) {
            zzdslVarZza.zzc("cache_size", Integer.toString(i8));
        }
        zzdslVarZza.zzc("pv", str4);
        zzdslVarZza.zzd();
    }

    public final void zza(int i7, long j7, zzfkr zzfkrVar, String str) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("action", "start_preload");
        zzdslVarZza.zzc("sp_ts", Long.toString(j7));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
        zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        zzdslVarZza.zzc("max_ads", Integer.toString(i7));
        zzdslVarZza.zzc("pv", str);
        zzdslVarZza.zzd();
    }

    public final void zzb(Map map, long j7, String str) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("action", "start_preload");
        zzdslVarZza.zzc("sp_ts", Long.toString(j7));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("pv", "1");
        for (EnumC6551c enumC6551c : map.keySet()) {
            String strValueOf = String.valueOf(enumC6551c.name().toLowerCase(Locale.ENGLISH));
            zzdslVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(enumC6551c)).intValue()));
        }
        zzdslVarZza.zzd();
    }

    public final void zzc(int i7, int i8, long j7, zzfkr zzfkrVar) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("action", "cache_resize");
        zzdslVarZza.zzc("cs_ts", Long.toString(j7));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("orig_ma", Integer.toString(i7));
        zzdslVarZza.zzc("max_ads", Integer.toString(i8));
        zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
        zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        zzdslVarZza.zzc("pv", "1");
        zzdslVarZza.zzd();
    }

    public final void zzd(int i7, int i8, long j7, Long l7, String str, zzfkr zzfkrVar, String str2) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("plaac_ts", Long.toString(j7));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("max_ads", Integer.toString(i7));
        zzdslVarZza.zzc("cache_size", Integer.toString(i8));
        zzdslVarZza.zzc("action", "is_ad_available");
        if (zzfkrVar != null) {
            zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
            zzdslVarZza.zzc("pid", zzfkrVar.zzc());
            zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        }
        if (l7 != null) {
            zzdslVarZza.zzc("plaay_ts", Long.toString(l7.longValue()));
        }
        if (str != null) {
            zzdslVarZza.zzc("gqi", str);
        }
        zzdslVarZza.zzc("pv", str2);
        zzdslVarZza.zzd();
    }

    public final void zze(long j7, String str) {
        zzr("poll_ad", "ppacwe_ts", j7, -1, -1, null, null, "2");
    }

    public final void zzf(long j7, zzfkr zzfkrVar, int i7, int i8, String str) {
        zzr("poll_ad", "ppac_ts", j7, i7, i8, null, zzfkrVar, str);
    }

    public final void zzg(long j7, int i7, int i8, String str, zzfkr zzfkrVar, String str2) {
        zzr("poll_ad", "psvroc_ts", j7, i7, i8, str, zzfkrVar, str2);
    }

    public final void zzh(long j7, int i7, int i8, String str, zzfkr zzfkrVar, String str2) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("ppla_ts", Long.toString(j7));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
        zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        zzdslVarZza.zzc("max_ads", Integer.toString(i7));
        zzdslVarZza.zzc("cache_size", Integer.toString(i8));
        zzdslVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzdslVarZza.zzc("gqi", str);
        }
        zzdslVarZza.zzc("pv", str2);
        zzdslVarZza.zzd();
    }

    public final void zzi(long j7, String str, zzfkr zzfkrVar, int i7, int i8, String str2) {
        zzr("paa", "pano_ts", j7, i7, i8, str, zzfkrVar, str2);
    }

    public final void zzj(long j7, zzfkr zzfkrVar, int i7, String str) {
        zzr("pae", "paeo_ts", j7, i7, 0, null, zzfkrVar, str);
    }

    public final void zzk(long j7, zzfkr zzfkrVar, C3324b1 c3324b1, int i7, int i8, String str) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc("action", "pftla");
        zzdslVarZza.zzc("pftlat_ts", Long.toString(j7));
        zzdslVarZza.zzc("pftlaec", Integer.toString(c3324b1.f13918a));
        zzdslVarZza.zzc("app", this.zzb);
        zzdslVarZza.zzc("ad_format", zzfkrVar.zzb());
        zzdslVarZza.zzc("max_ads", Integer.toString(i7));
        zzdslVarZza.zzc("cache_size", Integer.toString(i8));
        zzdslVarZza.zzc("ad_unit_id", zzfkrVar.zza());
        zzdslVarZza.zzc("pid", zzfkrVar.zzc());
        zzdslVarZza.zzc("pv", str);
        zzdslVarZza.zzd();
    }

    public final void zzl(long j7, EnumC6551c enumC6551c, int i7) {
        zzq("pda", j7, null, null, enumC6551c, -1, -1, i7, "2");
    }

    public final void zzm(long j7, String str, String str2, EnumC6551c enumC6551c, int i7, int i8) {
        zzq("pd", j7, str, str2, enumC6551c, i7, i8, 1, "2");
    }

    public final void zzn(EnumC6551c enumC6551c, long j7, int i7) {
        zzq("pgcs", j7, null, null, enumC6551c, -1, -1, i7, "2");
    }

    public final void zzo(long j7, String str, String str2, EnumC6551c enumC6551c, int i7, int i8) {
        zzq("pgc", j7, str, str2, enumC6551c, i7, i8, 1, "2");
    }

    public final void zzp(int i7, long j7, String str, String str2, EnumC6551c enumC6551c, int i8) {
        zzq("pnav", j7, str, str2, enumC6551c, i8, i7, 1, "2");
    }
}
