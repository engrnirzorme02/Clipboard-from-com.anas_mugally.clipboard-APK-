package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdie implements zzayi {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdip zzb;

    zzdie(zzdip zzdipVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdipVar);
        this.zzb = zzdipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbW)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zzayhVar.zzj) {
                        zzdip zzdipVar = this.zzb;
                        if (zzdipVar.zzaa() != null) {
                            zzdipVar.zzab().put(this.zza, Boolean.TRUE);
                            if (zzdipVar.zzaa() == null) {
                                return;
                            } else {
                                zzdipVar.zzu(zzdipVar.zzaa().zzdJ(), zzdipVar.zzaa().zzj(), zzdipVar.zzaa().zzk(), true);
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzayhVar.zzj) {
            zzdip zzdipVar2 = this.zzb;
            if (zzdipVar2.zzaa() != null) {
                zzdipVar2.zzab().put(this.zza, Boolean.TRUE);
                if (zzdipVar2.zzaa() == null) {
                    return;
                }
                zzdipVar2.zzu(zzdipVar2.zzaa().zzdJ(), zzdipVar2.zzaa().zzj(), zzdipVar2.zzaa().zzk(), true);
            }
        }
    }
}
