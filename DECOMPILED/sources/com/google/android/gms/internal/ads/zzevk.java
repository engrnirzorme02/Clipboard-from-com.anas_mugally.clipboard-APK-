package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevk implements zzeun {
    final String zza;
    final int zzb;

    /* synthetic */ zzevk(String str, int i7, byte[] bArr) {
        this.zza = str;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcuu zzcuuVar = (zzcuu) obj;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlj)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                zzcuuVar.zza.putString("topics", str);
            }
            int i7 = this.zzb;
            if (i7 != -1) {
                zzcuuVar.zza.putInt("atps", i7);
            }
        }
    }
}
