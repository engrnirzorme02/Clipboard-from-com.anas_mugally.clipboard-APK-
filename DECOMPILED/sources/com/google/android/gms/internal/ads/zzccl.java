package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.HashMap;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzccl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzccq zzk;

    zzccl(zzccq zzccqVar, String str, String str2, long j7, long j8, long j9, long j10, long j11, boolean z7, int i7, int i8) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j7;
        this.zzd = j8;
        this.zze = j9;
        this.zzf = j10;
        this.zzg = j11;
        this.zzh = z7;
        this.zzi = i7;
        this.zzj = i8;
        Objects.requireNonNull(zzccqVar);
        this.zzk = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bufferedDuration", Long.toString(this.zzc));
        map.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.zze));
            map.put("qoeCachedBytes", Long.toString(this.zzf));
            map.put("totalBytes", Long.toString(this.zzg));
            map.put("reportTime", Long.toString(C7351t.m32357o().mo18159a()));
        }
        map.put("cacheReady", true != this.zzh ? "0" : "1");
        map.put("playerCount", Integer.toString(this.zzi));
        map.put("playerPreparedCount", Integer.toString(this.zzj));
        this.zzk.zzw("onPrecacheEvent", map);
    }
}
