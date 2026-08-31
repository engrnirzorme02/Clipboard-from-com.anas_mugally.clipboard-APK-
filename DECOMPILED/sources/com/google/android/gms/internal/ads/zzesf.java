package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesf implements zzeun {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzesf(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.zza = str;
        this.zzb = z7;
        this.zzc = z8;
        this.zzd = z9;
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z7 = this.zzb;
        bundle.putInt("test_mode", z7 ? 1 : 0);
        boolean z8 = this.zzc;
        bundle.putInt("linked_device", z8 ? 1 : 0);
        if (z7 || z8) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjY)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkc)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z7 = this.zzb;
        bundle.putInt("test_mode", z7 ? 1 : 0);
        boolean z8 = this.zzc;
        bundle.putInt("linked_device", z8 ? 1 : 0);
        if (z7 || z8) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkc)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
