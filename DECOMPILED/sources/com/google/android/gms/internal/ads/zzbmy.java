package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbmy implements zzbzq {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzbnp zzc;

    zzbmy(zzbnp zzbnpVar, zzbno zzbnoVar, zzfhr zzfhrVar) {
        this.zza = zzbnoVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzc = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AbstractC3490o0.m17545k("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbnp zzbnpVar = this.zzc;
        synchronized (zzbnpVar.zzf()) {
            try {
                AbstractC3490o0.m17545k("loadNewJavascriptEngine (success): Lock acquired");
                zzbnpVar.zzk(0);
                if (zzbnpVar.zzh() != null && this.zza != zzbnpVar.zzh()) {
                    AbstractC3490o0.m17545k("New JS engine is loaded, marking previous one as destroyable.");
                    zzbnpVar.zzh().zzc();
                }
                zzbnpVar.zzi(this.zza);
                if (((Boolean) zzbeb.zzd.zze()).booleanValue() && zzbnpVar.zzg() != null) {
                    zzfie zzfieVarZzg = zzbnpVar.zzg();
                    zzfhr zzfhrVar = this.zzb;
                    zzfhrVar.zzd(true);
                    zzfieVarZzg.zzb(zzfhrVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC3490o0.m17545k("loadNewJavascriptEngine (success): Lock released");
    }
}
