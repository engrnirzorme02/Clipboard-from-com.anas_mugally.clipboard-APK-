package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzank implements zzand {
    final /* synthetic */ zzann zza;
    private final zzee zzb;

    public zzank(zzann zzannVar) {
        Objects.requireNonNull(zzannVar);
        this.zza = zzannVar;
        this.zzb = new zzee(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zzb(zzef zzefVar) {
        if (zzefVar.zzs() == 0 && (zzefVar.zzs() & 128) != 0) {
            zzefVar.zzk(6);
            int iZzd = zzefVar.zzd() / 4;
            for (int i7 = 0; i7 < iZzd; i7++) {
                zzee zzeeVar = this.zzb;
                zzefVar.zzl(zzeeVar, 4);
                int iZzj = zzeeVar.zzj(16);
                zzeeVar.zzh(3);
                if (iZzj == 0) {
                    zzeeVar.zzh(13);
                } else {
                    int iZzj2 = zzeeVar.zzj(13);
                    zzann zzannVar = this.zza;
                    if (zzannVar.zzc().get(iZzj2) == null) {
                        zzannVar.zzc().put(iZzj2, new zzane(new zzanl(zzannVar, iZzj2)));
                        zzannVar.zzn(zzannVar.zzm() + 1);
                    }
                }
            }
            this.zza.zzc().remove(0);
        }
    }
}
