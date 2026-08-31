package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p036E2.AbstractC0335c;
import p314o2.EnumC6551c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfib implements Runnable {
    private final zzfie zzb;
    private String zzc;
    private String zze;
    private zzfct zzf;
    private C3324b1 zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfig zzd = zzfig.SCAR_REQUEST_TYPE_UNSPECIFIED;

    zzfib(zzfie zzfieVar) {
        this.zzb = zzfieVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfib zza(zzfhr zzfhrVar) {
        try {
            if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfhrVar.zzc();
                list.add(zzfhrVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzbzh.zzd.schedule(this, ((Integer) C3250D.m17200c().zzd(zzbci.zzjA)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfib zzb(ArrayList arrayList) {
        try {
            if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(EnumC6551c.BANNER.name())) {
                    this.zzi = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(EnumC6551c.INTERSTITIAL.name())) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains(EnumC6551c.NATIVE.name())) {
                    this.zzi = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(EnumC6551c.REWARDED.name())) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(EnumC6551c.REWARDED_INTERSTITIAL.name())) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfib zzc(String str) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue() && zzfia.zza(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfib zzd(Bundle bundle) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zzd = AbstractC0335c.m1522d(bundle);
        }
        return this;
    }

    public final synchronized zzfib zze(zzfct zzfctVar) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zzf = zzfctVar;
        }
        return this;
    }

    public final synchronized zzfib zzf(C3324b1 c3324b1) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zzg = c3324b1;
        }
        return this;
    }

    public final synchronized zzfib zzg(String str) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                List<zzfhr> list = this.zza;
                for (zzfhr zzfhrVar : list) {
                    int i7 = this.zzi;
                    if (i7 != 2) {
                        zzfhrVar.zzp(i7);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfhrVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfhrVar.zzl()) {
                        zzfhrVar.zzi(this.zze);
                    }
                    zzfct zzfctVar = this.zzf;
                    if (zzfctVar != null) {
                        zzfhrVar.zzg(zzfctVar);
                    } else {
                        C3324b1 c3324b1 = this.zzg;
                        if (c3324b1 != null) {
                            zzfhrVar.zzh(c3324b1);
                        }
                    }
                    zzfhrVar.zzf(this.zzd);
                    this.zzb.zzb(zzfhrVar.zzm());
                }
                list.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfib zzi(int i7) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            this.zzi = i7;
        }
        return this;
    }
}
