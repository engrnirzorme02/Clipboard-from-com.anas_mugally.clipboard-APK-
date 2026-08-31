package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzbxx {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbxk zzd;

    zzbxx(Context context, zzbxk zzbxkVar) {
        this.zzc = context;
        this.zzd = zzbxkVar;
    }

    final synchronized void zza(zzbxv zzbxvVar) {
        this.zzb.add(zzbxvVar);
    }

    final synchronized void zzb(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzbxu zzbxuVar = new zzbxu(this, str);
            map.put(str, zzbxuVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbxuVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }

    final /* synthetic */ List zzd() {
        return this.zzb;
    }
}
