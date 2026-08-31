package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwr {
    private final zzhpr zza;
    private final zzhpr zzb;
    private final zzhpr zzc;
    private final zzgea zzd;

    zzfwr(zzhpr zzhprVar, zzhpr zzhprVar2, zzhpr zzhprVar3, zzgea zzgeaVar) {
        this.zza = zzhprVar;
        this.zzb = zzhprVar2;
        this.zzc = zzhprVar3;
        this.zzd = zzgeaVar;
    }

    private final InterfaceFutureC1673e zzd(int i7) {
        zzfwn zzfwnVar;
        int i8 = i7 - 1;
        if (i8 == 1) {
            zzfwnVar = (zzfwn) this.zza.zzb();
        } else if (i8 == 2) {
            zzfwnVar = (zzfwn) this.zzb.zzb();
        } else {
            if (i8 != 3) {
                throw new IllegalArgumentException();
            }
            zzfwnVar = (zzfwn) this.zzc.zzb();
        }
        return zzgot.zzk(zzfwnVar.zzb(), zzggt.zza(zzfwnVar), zzgpk.zza());
    }

    final /* synthetic */ zzgea zza() {
        return this.zzd;
    }

    final InterfaceFutureC1673e zzb(int i7, boolean z7) {
        InterfaceFutureC1673e interfaceFutureC1673eZzd = zzd(i7);
        return (!z7 || i7 == 2) ? interfaceFutureC1673eZzd : (zzgol) zzgot.zzj((zzgol) zzgot.zzg(zzgol.zzw(interfaceFutureC1673eZzd), Throwable.class, zzfwq.zza, zzgpk.zza()), new zzfwp(this), zzgpk.zza());
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(int i7) {
        return zzd(2);
    }
}
