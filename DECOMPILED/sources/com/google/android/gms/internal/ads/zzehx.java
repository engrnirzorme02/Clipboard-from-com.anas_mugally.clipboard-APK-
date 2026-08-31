package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.concurrent.Executor;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehx implements zzeef {
    private final Context zza;
    private final Executor zzb;
    private final zzdor zzc;

    public zzehx(Context context, Executor executor, zzdor zzdorVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        try {
            zzfdc zzfdcVar = zzfcuVar.zza.zza;
            if (zzfdcVar.zzp.zza == 3) {
                ((zzfea) zzeecVar.zzb).zzx(this.zza, zzfdcVar.zzd, zzfcjVar.zzv.toString(), (zzbpd) zzeecVar.zzc);
            } else {
                ((zzfea) zzeecVar.zzb).zzv(this.zza, zzfdcVar.zzd, zzfcjVar.zzv.toString(), (zzbpd) zzeecVar.zzc);
            }
        } catch (Exception e7) {
            String str = zzeecVar.zza;
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Fail to load ad from adapter ".concat(String.valueOf(str)), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        zzdon zzdonVarZzf = this.zzc.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdoo(new zzehw(this, zzeecVar, zzfcjVar)));
        zzdonVarZzf.zza().zzq(new zzcly((zzfea) zzeecVar.zzb), this.zzb);
        ((zzefo) zzeecVar.zzc).zzc(zzdonVarZzf.zzm());
        return zzdonVarZzf.zzh();
    }
}
