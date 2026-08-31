package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p036E2.AbstractC0335c;
import p380w2.C7351t;
import p380w2.RunnableC7342k;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsg {
    private final ConcurrentHashMap zza;
    private final zzbyz zzb;
    private final zzfdc zzc;
    private final String zzd;
    private final String zze;
    private final zzauu zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdsg(Context context, zzdsr zzdsrVar, zzbyz zzbyzVar, zzfdc zzfdcVar, String str, String str2, zzauu zzauuVar) {
        ActivityManager.MemoryInfo memoryInfoM33284n;
        ConcurrentHashMap concurrentHashMapZzd = zzdsrVar.zzd();
        this.zza = concurrentHashMapZzd;
        this.zzb = zzbyzVar;
        this.zzc = zzfdcVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzauuVar;
        this.zzh = context;
        concurrentHashMapZzd.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkp)).booleanValue()) {
            zzaup zzaupVarZzb = zzauuVar.zzb();
            if (zzaupVarZzb instanceof RunnableC7342k) {
                concurrentHashMapZzd.put("asv", ((RunnableC7342k) zzaupVarZzb).m32321c());
            } else if (zzaupVarZzb instanceof zzcgu) {
                concurrentHashMapZzd.put("asv", ((zzcgu) zzaupVarZzb).zza());
            } else {
                concurrentHashMapZzd.put("asv", "NA");
            }
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(C7351t.m32354l().zzl()));
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcz)).booleanValue() && (memoryInfoM33284n = C7590g.m33284n(context)) != null) {
                zzd("mem_avl", String.valueOf(memoryInfoM33284n.availMem));
                zzd("mem_tt", String.valueOf(memoryInfoM33284n.totalMem));
                zzd("low_m", true != memoryInfoM33284n.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcB)).booleanValue()) {
            zzd("ad_unit_id", zzfdcVar.zzg);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhq)).booleanValue()) {
            int iM1525g = AbstractC0335c.m1525g(zzfdcVar) - 1;
            if (iM1525g == 0) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("scar", "false");
                return;
            }
            if (iM1525g == 1) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("se", "query_g");
            } else if (iM1525g == 2) {
                concurrentHashMapZzd.put("se", "r_adinfo");
            } else if (iM1525g != 3) {
                concurrentHashMapZzd.put("se", "r_both");
            } else {
                concurrentHashMapZzd.put("se", "r_adstring");
            }
            concurrentHashMapZzd.put("scar", "true");
            zzd("ragent", zzfdcVar.zzd.f13936A);
            zzd("rtype", AbstractC0335c.m1520b(AbstractC0335c.m1521c(zzfdcVar.zzd)));
        }
    }

    public final void zza(zzfcu zzfcuVar) {
        zzfct zzfctVar = zzfcuVar.zzb;
        List list = zzfctVar.zza;
        if (!list.isEmpty()) {
            int i7 = ((zzfcj) list.get(0)).zzb;
            zzd("ad_format", zzfcj.zza(i7));
            if (i7 == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzct)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfctVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map zzc() {
        return this.zza;
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Bundle zze() {
        return this.zzg;
    }

    public final void zzf() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzod)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }
}
