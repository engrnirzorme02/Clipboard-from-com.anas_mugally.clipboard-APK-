package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbmz implements zzbzo {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzbnp zzc;

    zzbmz(zzbnp zzbnpVar, zzbno zzbnoVar, zzfhr zzfhrVar) {
        this.zza = zzbnoVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzc = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zza() {
        AbstractC3490o0.m17545k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbnp zzbnpVar = this.zzc;
        synchronized (zzbnpVar.zzf()) {
            try {
                AbstractC3490o0.m17545k("loadNewJavascriptEngine (failure): Lock acquired");
                zzbnpVar.zzk(1);
                AbstractC3490o0.m17545k("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzc();
                if (((Boolean) zzbeb.zzd.zze()).booleanValue() && zzbnpVar.zzg() != null) {
                    zzfie zzfieVarZzg = zzbnpVar.zzg();
                    zzfhr zzfhrVar = this.zzb;
                    zzfhrVar.zzk("Failed loading new engine");
                    zzfhrVar.zzd(false);
                    zzfieVarZzg.zzb(zzfhrVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC3490o0.m17545k("loadNewJavascriptEngine (failure): Lock released");
    }
}
