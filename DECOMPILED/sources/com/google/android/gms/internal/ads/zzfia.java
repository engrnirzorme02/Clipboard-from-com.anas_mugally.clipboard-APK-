package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.regex.Pattern;
import p036E2.AbstractC0335c;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfia {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) C3250D.m17200c().zzd(zzbci.zzjB), str);
    }

    public static void zzb(InterfaceFutureC1673e interfaceFutureC1673e, zzfhr zzfhrVar) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzgot.zzq(zzgol.zzw(interfaceFutureC1673e), new zzfhw(zzfhrVar), zzbzh.zzg);
        }
    }

    public static zzfgm zzc(final zzfhr zzfhrVar) {
        return new zzfgm() { // from class: com.google.android.gms.internal.ads.zzfhz
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
                    zzfhrVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(InterfaceFutureC1673e interfaceFutureC1673e, zzfib zzfibVar, zzfhr zzfhrVar) {
        zzh(interfaceFutureC1673e, zzfibVar, zzfhrVar, false);
    }

    public static void zze(InterfaceFutureC1673e interfaceFutureC1673e, zzfib zzfibVar, zzfhr zzfhrVar) {
        zzh(interfaceFutureC1673e, zzfibVar, zzfhrVar, true);
    }

    public static void zzf(InterfaceFutureC1673e interfaceFutureC1673e, zzfib zzfibVar, zzfhr zzfhrVar) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzgot.zzq(zzgol.zzw(interfaceFutureC1673e), new zzfhy(zzfibVar, zzfhrVar), zzbzh.zzg);
        }
    }

    public static int zzg(zzfdc zzfdcVar) {
        int iM1525g = AbstractC0335c.m1525g(zzfdcVar) - 1;
        return (iM1525g == 0 || iM1525g == 1) ? 7 : 23;
    }

    private static void zzh(InterfaceFutureC1673e interfaceFutureC1673e, zzfib zzfibVar, zzfhr zzfhrVar, boolean z7) {
        if (((Boolean) zzbeb.zzc.zze()).booleanValue()) {
            zzgot.zzq(zzgol.zzw(interfaceFutureC1673e), new zzfhx(zzfibVar, zzfhrVar, z7), zzbzh.zzg);
        }
    }
}
