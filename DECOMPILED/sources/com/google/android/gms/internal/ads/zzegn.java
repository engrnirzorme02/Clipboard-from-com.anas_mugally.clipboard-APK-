package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.AbstractC3453S;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegn implements zzeef {
    private final Context zza;
    private final zzdhd zzb;
    private final Executor zzc;

    public zzegn(Context context, zzdhd zzdhdVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdhdVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfcu zzfcuVar, int i7) {
        return zzfcuVar.zza.zza.zzh.contains(Integer.toString(i7));
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        String string = zzfcjVar.zzv.toString();
        String strM17486m = AbstractC3453S.m17486m(zzfcjVar.zzs);
        zzfeaVar.zzo(this.zza, zzfdcVar.zzd, string, strM17486m, (zzbpd) zzeecVar.zzc, zzfdcVar.zzj, zzfdcVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzdiu zzdiuVarZzag;
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzbpi zzbpiVarZzD = zzfeaVar.zzD();
        zzbpj zzbpjVarZzE = zzfeaVar.zzE();
        zzbpm zzbpmVarZzu = zzfeaVar.zzu();
        if (zzbpmVarZzu != null && zzc(zzfcuVar, 6)) {
            zzdiuVarZzag = zzdiu.zzaf(zzbpmVarZzu);
        } else if (zzbpiVarZzD != null && zzc(zzfcuVar, 6)) {
            zzdiuVarZzag = zzdiu.zzai(zzbpiVarZzD);
        } else if (zzbpiVarZzD != null && zzc(zzfcuVar, 2)) {
            zzdiuVarZzag = zzdiu.zzah(zzbpiVarZzD);
        } else if (zzbpjVarZzE != null && zzc(zzfcuVar, 6)) {
            zzdiuVarZzag = zzdiu.zzaj(zzbpjVarZzE);
        } else {
            if (zzbpjVarZzE == null || !zzc(zzfcuVar, 1)) {
                throw new zzeho(1, "No native ad mappers");
            }
            zzdiuVarZzag = zzdiu.zzag(zzbpjVarZzE);
        }
        if (zzdiuVarZzag != null) {
            zzfdc zzfdcVar = zzfcuVar.zza.zza;
            if (zzfdcVar.zzh.contains(Integer.toString(zzdiuVarZzag.zzx()))) {
                zzdiw zzdiwVarZze = this.zzb.zze(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdjf(zzdiuVarZzag), new zzdky(zzbpjVarZzE, zzbpiVarZzD, zzbpmVarZzu));
                ((zzefo) zzeecVar.zzc).zzc(zzdiwVarZze.zzf());
                zzdiwVarZze.zza().zzq(new zzcly(zzfeaVar), this.zzc);
                return zzdiwVarZze.zzh();
            }
        }
        throw new zzeho(1, "No corresponding native ad listener");
    }
}
