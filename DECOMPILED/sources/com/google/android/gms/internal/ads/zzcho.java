package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import p227d3.C5228d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcho implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcho(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcho zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcho(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return C5228d.m24155a(((zzchd) this.zza).zza()).m24152f(((ApplicationInfo) this.zzb.zzb()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
