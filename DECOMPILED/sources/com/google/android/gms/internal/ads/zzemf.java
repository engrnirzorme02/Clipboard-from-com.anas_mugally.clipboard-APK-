package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.InterfaceC3375o0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.concurrent.ScheduledExecutorService;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemf implements zzely {
    private final zzfdb zza;
    private final zzcgv zzb;
    private final Context zzc;
    private final zzelv zzd;
    private final zzfie zze;
    private zzcrh zzf;

    public zzemf(zzcgv zzcgvVar, Context context, zzelv zzelvVar, zzfdb zzfdbVar) {
        this.zzb = zzcgvVar;
        this.zzc = context;
        this.zzd = zzelvVar;
        this.zza = zzfdbVar;
        this.zze = zzcgvVar.zzv();
        zzfdbVar.zzt(zzelvVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(C3349h2 c3349h2, String str, zzelw zzelwVar, zzelx zzelxVar) {
        C7351t.m32349g();
        Context context = this.zzc;
        if (C3431F0.m17421l(context) && c3349h2.f13939D == null) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeme
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        boolean z7 = c3349h2.f13954f;
        zzfdz.zzb(context, z7);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue() && z7) {
            this.zzb.zzu().zzc(true);
        }
        int i9 = ((zzelz) zzelwVar).zza;
        long jMo18159a = C7351t.m32357o().mo18159a();
        String strZza = zzdru.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jMo18159a);
        Bundle bundleZza = zzdrw.zza(new Pair(strZza, lValueOf), new Pair(zzdru.DYNAMITE_ENTER.zza(), lValueOf));
        zzfdb zzfdbVar = this.zza;
        zzfdbVar.zza(c3349h2);
        zzfdbVar.zzv(bundleZza);
        zzfdbVar.zzl(i9);
        zzfdc zzfdcVarZzz = zzfdbVar.zzz();
        zzfhr zzfhrVarZzo = zzfhr.zzo(context, zzfia.zzg(zzfdcVarZzz), 8, c3349h2);
        InterfaceC3375o0 interfaceC3375o0 = zzfdcVarZzz.zzo;
        if (interfaceC3375o0 != null) {
            this.zzd.zzc().zzn(interfaceC3375o0);
        }
        zzcgv zzcgvVar = this.zzb;
        zzdhc zzdhcVarZzm = zzcgvVar.zzm();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zza(context);
        zzcvaVar.zzb(zzfdcVarZzz);
        zzdhcVarZzm.zzf(zzcvaVar.zze());
        zzdbr zzdbrVar = new zzdbr();
        zzelv zzelvVar = this.zzd;
        zzdbrVar.zze(zzelvVar.zzc(), zzcgvVar.zzb());
        zzdhcVarZzm.zzg(zzdbrVar.zzn());
        zzdhcVarZzm.zze(zzelvVar.zzb());
        zzfib zzfibVarZzc = null;
        zzdhcVarZzm.zzd(new zzcoh(null));
        zzdhd zzdhdVarZzh = zzdhcVarZzm.zzh();
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzfibVarZzc = zzdhdVarZzh.zzc();
            zzfibVarZzc.zzi(8);
            zzfibVarZzc.zzc(c3349h2.f13936A);
            zzfibVarZzc.zzd(c3349h2.f13961x);
        }
        zzfib zzfibVar = zzfibVarZzc;
        zzcgvVar.zzt().zza(1);
        zzgpd zzgpdVarZzc = zzfgc.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzc = zzcgvVar.zzc();
        zzcrw zzcrwVarZza = zzdhdVarZzh.zza();
        zzcrh zzcrhVar = new zzcrh(zzgpdVarZzc, scheduledExecutorServiceZzc, zzcrwVarZza.zzc(zzcrwVarZza.zzb()));
        this.zzf = zzcrhVar;
        zzcrhVar.zza(new zzemc(this, zzelxVar, zzfibVar, zzfhrVarZzo, zzdhdVarZzh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        zzcrh zzcrhVar = this.zzf;
        return zzcrhVar != null && zzcrhVar.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.zze().zzdN(zzfee.zzd(4, null, null));
    }

    final /* synthetic */ void zzd() {
        this.zzd.zze().zzdN(zzfee.zzd(6, null, null));
    }

    final /* synthetic */ zzcgv zze() {
        return this.zzb;
    }

    final /* synthetic */ zzelv zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfie zzg() {
        return this.zze;
    }
}
