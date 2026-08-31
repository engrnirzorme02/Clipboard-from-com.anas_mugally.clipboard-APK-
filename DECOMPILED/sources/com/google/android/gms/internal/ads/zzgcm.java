package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgcm implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzgcm(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzgcm zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzgcm(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzfvu zzfvuVar = (zzfvu) this.zzb.zzb();
        final zzgea zzgeaVar = (zzgea) this.zzc.zzb();
        return zzfvuVar.zza(file, zzfwm.zzd(), new Function() { // from class: com.google.android.gms.internal.ads.zzgcl
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                zzgeaVar.zzd(15308, (Throwable) obj);
                return zzfwm.zzd();
            }
        });
    }
}
