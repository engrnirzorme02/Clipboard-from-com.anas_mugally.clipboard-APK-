package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.concurrent.Executor;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeis implements zzeef {
    private final Context zza;
    private final Executor zzb;
    private final zzdor zzc;

    public zzeis(Context context, Executor executor, zzdor zzdorVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdorVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        try {
            ((zzfea) zzeecVar.zzb).zzl(zzfcuVar.zza.zza.zzd, zzfcjVar.zzv.toString());
        } catch (Exception e7) {
            String str = zzeecVar.zza;
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Fail to load ad from adapter ".concat(String.valueOf(str)), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        if (zzfeaVar.zzn()) {
            zze(zzfcuVar, zzfcjVar, zzeecVar);
            return;
        }
        zzeip zzeipVar = new zzeip(this, zzfcuVar, zzfcjVar, zzeecVar);
        zzcxc zzcxcVar = zzeecVar.zzc;
        ((zzefp) zzcxcVar).zzd(zzeipVar);
        Context context = this.zza;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        String string = zzfcjVar.zzv.toString();
        zzfeaVar.zzk(context, zzfdcVar.zzd, null, (zzbvs) zzcxcVar, string);
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        zzdon zzdonVarZzf = this.zzc.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdoo(new zzeiq(this, zzeecVar, zzfcjVar)));
        zzdonVarZzf.zza().zzq(new zzcly((zzfea) zzeecVar.zzb), this.zzb);
        zzcwz zzcwzVarZzb = zzdonVarZzf.zzb();
        zzcvq zzcvqVarZzc = zzdonVarZzf.zzc();
        ((zzefp) zzeecVar.zzc).zzc(new zzeir(this, zzdonVarZzf.zzi(), zzcvqVarZzc, zzcwzVarZzb, zzdonVarZzf.zzk()));
        return zzdonVarZzf.zzh();
    }

    final /* synthetic */ Executor zzc() {
        return this.zzb;
    }
}
