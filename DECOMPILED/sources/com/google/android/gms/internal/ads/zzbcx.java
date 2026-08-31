package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzbcx {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbcx(boolean z7, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbcu zzf() {
        return new zzbcu(C7351t.m32357o().mo18161c(), null, null);
    }

    public final void zza(zzbcx zzbcxVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbcu zzbcuVar, long j7, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbcu(j7, strArr[0], zzbcuVar));
        }
        return true;
    }

    public final zzbcw zzc() {
        zzbcw zzbcwVar;
        boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbcu> list = this.zza;
                for (zzbcu zzbcuVar : list) {
                    long jZza = zzbcuVar.zza();
                    String strZzb = zzbcuVar.zzb();
                    zzbcu zzbcuVarZzc = zzbcuVar.zzc();
                    if (zzbcuVarZzc != null && jZza > 0) {
                        long jZza2 = jZza - zzbcuVarZzc.zza();
                        sb.append(strZzb);
                        sb.append('.');
                        sb.append(jZza2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbcuVarZzc.zza()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbcuVarZzc.zza()));
                                sb2.append('+');
                                sb2.append(strZzb);
                            } else {
                                map.put(Long.valueOf(zzbcuVarZzc.zza()), new StringBuilder(strZzb));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(C7351t.m32357o().mo18159a() + (((Long) entry.getKey()).longValue() - C7351t.m32357o().mo18161c()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                zzbcwVar = new zzbcw(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbcwVar;
    }

    public final void zzd(String str, String str2) {
        zzbcn zzbcnVarZza;
        if (TextUtils.isEmpty(str2) || (zzbcnVarZza = C7351t.m32354l().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbct zzbctVarZzd = zzbcnVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbctVarZzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            C7351t.m32354l().zza();
            map = this.zzb;
        }
        return map;
    }
}
