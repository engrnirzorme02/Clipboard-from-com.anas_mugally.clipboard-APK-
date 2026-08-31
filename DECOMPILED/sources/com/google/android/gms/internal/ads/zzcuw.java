package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcuw {
    private final zzfhh zza;
    private final C7584a zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhpr zzg;
    private final String zzh;
    private final zzeus zzi;
    private final InterfaceC3494q0 zzj;
    private final zzfdc zzk;
    private final int zzl;
    private final zzdbl zzm;

    zzcuw(zzfhh zzfhhVar, C7584a c7584a, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhpr zzhprVar, InterfaceC3494q0 interfaceC3494q0, String str2, zzeus zzeusVar, zzfdc zzfdcVar, zzdbl zzdblVar, int i7) {
        this.zza = zzfhhVar;
        this.zzb = c7584a;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhprVar;
        this.zzh = str2;
        this.zzi = zzeusVar;
        this.zzj = interfaceC3494q0;
        this.zzk = zzfdcVar;
        this.zzm = zzdblVar;
        this.zzl = i7;
    }

    public final InterfaceFutureC1673e zza(Bundle bundle) {
        this.zzm.zza();
        zzfhb zzfhbVar = zzfhb.SIGNALS;
        zzfhh zzfhhVar = this.zza;
        Objects.requireNonNull(zzfhhVar);
        return zzfgs.zza(this.zzi.zza(new zzcuu(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfhbVar, zzfhhVar).zzi();
    }

    public final InterfaceFutureC1673e zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final InterfaceFutureC1673e interfaceFutureC1673eZza = zza(bundle);
        return this.zza.zzb(zzfhb.REQUEST_PARCEL, interfaceFutureC1673eZza, (InterfaceFutureC1673e) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcuv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(interfaceFutureC1673eZza, bundle);
            }
        }).zzi();
    }

    final /* synthetic */ zzbuv zzc(InterfaceFutureC1673e interfaceFutureC1673e, Bundle bundle) {
        zzcuu zzcuuVar = (zzcuu) interfaceFutureC1673e.get();
        Bundle bundle2 = zzcuuVar.zza;
        String str = (String) ((InterfaceFutureC1673e) this.zzg.zzb()).get();
        boolean z7 = false;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhu)).booleanValue() && this.zzj.zzx()) {
            z7 = true;
        }
        boolean z8 = z7;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzbuv(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z8, this.zzk.zza(), bundle, zzcuuVar.zzb, this.zzl);
    }
}
