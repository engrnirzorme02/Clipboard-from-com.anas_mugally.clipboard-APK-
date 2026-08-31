package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p404z2.EnumC7604u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsl {
    final /* synthetic */ zzdsm zza;
    private final Map zzb;

    zzdsl(zzdsm zzdsmVar) {
        Objects.requireNonNull(zzdsmVar);
        this.zza = zzdsmVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdsl zza(zzfcm zzfcmVar) {
        zzc("gqi", zzfcmVar.zzb);
        return this;
    }

    public final zzdsl zzb(zzfcj zzfcjVar) {
        zzc("aai", zzfcjVar.zzw);
        zzc("request_id", zzfcjVar.zzan);
        zzc("ad_format", zzfcj.zza(zzfcjVar.zzb));
        return this;
    }

    public final zzdsl zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        });
    }

    public final EnumC7604u zze() {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzoL)).booleanValue()) {
            zzd();
            return EnumC7604u.SUCCESS;
        }
        zzdsm zzdsmVar = this.zza;
        return zzdsmVar.zzc().zzf(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzj();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    public final void zzh() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
    }

    final /* synthetic */ void zzi() {
        this.zza.zzc().zzb(this.zzb);
    }

    final /* synthetic */ void zzj() {
        this.zza.zzc().zzg(this.zzb);
    }

    final /* synthetic */ void zzk() {
        this.zza.zzc().zze(this.zzb);
    }

    final /* synthetic */ zzdsl zzl() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
