package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.dynamic.BinderC3773b;
import p314o2.EnumC6551c;

/* JADX INFO: loaded from: classes2.dex */
final class zzefx implements zzdgp {
    private final zzfcj zza;
    private final zzbqw zzb;
    private final EnumC6551c zzc;
    private zzcwk zzd = null;

    zzefx(zzfcj zzfcjVar, zzbqw zzbqwVar, EnumC6551c enumC6551c) {
        this.zza = zzfcjVar;
        this.zzb = zzbqwVar;
        this.zzc = enumC6551c;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z7, Context context, zzcwf zzcwfVar) throws zzdgo {
        boolean zZzk;
        try {
            EnumC6551c enumC6551c = EnumC6551c.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzk = this.zzb.zzk(BinderC3773b.m18221N0(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzk = this.zzb.zzt(BinderC3773b.m18221N0(context));
                    }
                    throw new zzdgo("Adapter failed to show.");
                }
                zZzk = this.zzb.zzm(BinderC3773b.m18221N0(context));
            }
            if (zZzk) {
                zzcwk zzcwkVar = this.zzd;
                if (zzcwkVar == null) {
                    return;
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbJ)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzcwkVar.zza();
                return;
            }
            throw new zzdgo("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgo(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zza;
    }

    public final void zzc(zzcwk zzcwkVar) {
        this.zzd = zzcwkVar;
    }
}
