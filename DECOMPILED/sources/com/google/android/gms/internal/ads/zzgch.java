package com.google.android.gms.internal.ads;

import java.io.File;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgch implements zzgcg {
    private final zzfvl zza;
    private final zzfvl zzb;
    private final zzhpr zzc;
    private final zzgea zzd;

    zzgch(zzfvl zzfvlVar, zzfvl zzfvlVar2, zzhpr zzhprVar, zzgea zzgeaVar) {
        this.zza = zzfvlVar;
        this.zzb = zzfvlVar2;
        this.zzc = zzhprVar;
        this.zzd = zzgeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final InterfaceFutureC1673e zza() {
        InterfaceFutureC1673e interfaceFutureC1673eZzb = this.zza.zzb();
        this.zzd.zze(15302, interfaceFutureC1673eZzb);
        return interfaceFutureC1673eZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final InterfaceFutureC1673e zzb(zzfwm zzfwmVar) {
        InterfaceFutureC1673e interfaceFutureC1673eZzc = this.zza.zzc(zzfwmVar);
        this.zzd.zze(15303, interfaceFutureC1673eZzc);
        return interfaceFutureC1673eZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final InterfaceFutureC1673e zzc(byte[] bArr) {
        InterfaceFutureC1673e interfaceFutureC1673eZzc = this.zzb.zzc(bArr);
        this.zzd.zze(15305, interfaceFutureC1673eZzc);
        return interfaceFutureC1673eZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final File zzd() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final InterfaceFutureC1673e zze(byte[] bArr) {
        InterfaceFutureC1673e interfaceFutureC1673eZzc = ((zzfvl) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(15307, interfaceFutureC1673eZzc);
        return interfaceFutureC1673eZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final File zzf() {
        return ((zzfvl) this.zzc.zzb()).zza();
    }
}
