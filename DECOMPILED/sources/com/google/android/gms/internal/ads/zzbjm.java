package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjm implements zzbjl {
    private final zzdvs zza;

    public zzbjm(zzdvs zzdvsVar) {
        AbstractC3718s.m18084m(zzdvsVar, "The Inspector Manager must not be null");
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.zza.zzj((String) map.get("persistentData"));
    }
}
