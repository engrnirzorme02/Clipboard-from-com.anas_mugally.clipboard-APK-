package com.google.android.gms.internal.ads;

import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzduo extends zzbln {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfhr zzd;
    final /* synthetic */ zzbzm zze;
    final /* synthetic */ zzdux zzf;

    zzduo(zzdux zzduxVar, Object obj, String str, long j7, zzfhr zzfhrVar, zzbzm zzbzmVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j7;
        this.zzd = zzfhrVar;
        this.zze = zzbzmVar;
        Objects.requireNonNull(zzduxVar);
        this.zzf = zzduxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zze() {
        synchronized (this.zza) {
            zzdux zzduxVar = this.zzf;
            String str = this.zzb;
            zzduxVar.zzm(str, true, "", (int) (C7351t.m32357o().mo18161c() - this.zzc));
            zzduxVar.zzr().zzb(str);
            zzduxVar.zzs().zzb(str);
            zzfie zzfieVarZzt = zzduxVar.zzt();
            zzfhr zzfhrVar = this.zzd;
            zzfhrVar.zzd(true);
            zzfieVarZzt.zzb(zzfhrVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final void zzf(String str) {
        synchronized (this.zza) {
            zzdux zzduxVar = this.zzf;
            String str2 = this.zzb;
            zzduxVar.zzm(str2, false, str, (int) (C7351t.m32357o().mo18161c() - this.zzc));
            zzduxVar.zzr().zzc(str2, "error");
            zzduxVar.zzs().zzc(str2, "error");
            zzfie zzfieVarZzt = zzduxVar.zzt();
            zzfhr zzfhrVar = this.zzd;
            zzfhrVar.zzk(str);
            zzfhrVar.zzd(false);
            zzfieVarZzt.zzb(zzfhrVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }
}
