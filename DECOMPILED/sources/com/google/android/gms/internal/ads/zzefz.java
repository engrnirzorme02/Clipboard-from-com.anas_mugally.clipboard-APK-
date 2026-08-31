package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import java.util.concurrent.Executor;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefz implements zzeef {
    private final Context zza;
    private final zzdgh zzb;
    private final C7584a zzc;
    private final Executor zzd;

    public zzefz(Context context, C7584a c7584a, zzdgh zzdghVar, Executor executor) {
        this.zza = context;
        this.zzc = c7584a;
        this.zzb = zzdghVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        String string = zzfcjVar.zzv.toString();
        String strM17486m = AbstractC3453S.m17486m(zzfcjVar.zzs);
        zzfeaVar.zzh(this.zza, zzfdcVar.zzd, string, strM17486m, (zzbpd) zzeecVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        zzdfb zzdfbVarZzd = this.zzb.zzd(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdfe(new zzefy(this, zzeecVar, zzfcjVar), null));
        zzdfbVarZzd.zza().zzq(new zzcly((zzfea) zzeecVar.zzb), this.zzd);
        ((zzefo) zzeecVar.zzc).zzc(zzdfbVarZzd.zzf());
        return zzdfbVarZzd.zzh();
    }

    final /* synthetic */ C7584a zzc() {
        return this.zzc;
    }
}
