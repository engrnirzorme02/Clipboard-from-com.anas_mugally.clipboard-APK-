package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.ArrayList;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegq implements zzeef {
    private final Context zza;
    private final zzdhd zzb;
    private zzbpm zzc;
    private final C7584a zzd;

    public zzegq(Context context, zzdhd zzdhdVar, C7584a c7584a) {
        this.zza = context;
        this.zzb = zzdhdVar;
        this.zzd = c7584a;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        try {
            zzbqw zzbqwVar = (zzbqw) zzeecVar.zzb;
            zzbqwVar.zzo(zzfcjVar.zzZ);
            if (this.zzd.f30228c < ((Integer) C3250D.m17200c().zzd(zzbci.zzbU)).intValue()) {
                zzbqwVar.zzn(zzfcjVar.zzU, zzfcjVar.zzv.toString(), zzfcuVar.zza.zza.zzd, BinderC3773b.m18221N0(this.zza), new zzegp(this, zzeecVar, null), (zzbpd) zzeecVar.zzc);
                return;
            }
            String str = zzfcjVar.zzU;
            String string = zzfcjVar.zzv.toString();
            zzfdc zzfdcVar = zzfcuVar.zza.zza;
            zzbqwVar.zzr(str, string, zzfdcVar.zzd, BinderC3773b.m18221N0(this.zza), new zzegp(this, zzeecVar, null), (zzbpd) zzeecVar.zzc, zzfdcVar.zzj);
        } catch (RemoteException e7) {
            throw new zzfdj(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzeho {
        ArrayList arrayList = zzfcuVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzeho(2, "Unified must be used for RTB.");
        }
        zzdiu zzdiuVarZzaf = zzdiu.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdiuVarZzaf.zzx()))) {
            throw new zzeho(1, "No corresponding native ad listener");
        }
        zzdiw zzdiwVarZze = this.zzb.zze(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdjf(zzdiuVarZzaf), new zzdky(null, null, this.zzc));
        ((zzefo) zzeecVar.zzc).zzc(zzdiwVarZze.zzg());
        return zzdiwVarZze.zzh();
    }

    final /* synthetic */ void zzc(zzbpm zzbpmVar) {
        this.zzc = zzbpmVar;
    }
}
