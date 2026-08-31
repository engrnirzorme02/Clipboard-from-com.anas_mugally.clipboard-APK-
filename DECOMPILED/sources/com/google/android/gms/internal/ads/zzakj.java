package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakj implements zzajv {
    private final zzef zza = new zzef();
    private final zzef zzb = new zzef();
    private final zzaki zzc = new zzaki();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i7, int i8, zzaju zzajuVar, zzdf zzdfVar) {
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i8 + i7);
        zzefVar.zzh(i7);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzef zzefVar2 = this.zzb;
        if (zzeo.zzM(zzefVar, zzefVar2, this.zzd)) {
            zzefVar.zzb(zzefVar2.zzi(), zzefVar2.zze());
        }
        zzaki zzakiVar = this.zzc;
        zzakiVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzefVar.zzd() >= 3) {
            int iZze = zzefVar.zze();
            int iZzs = zzefVar.zzs();
            int iZzt = zzefVar.zzt();
            int iZzg = zzefVar.zzg() + iZzt;
            zzcl zzclVarZza = null;
            if (iZzg > iZze) {
                zzefVar.zzh(iZze);
            } else {
                if (iZzs != 128) {
                    switch (iZzs) {
                        case 20:
                            zzakiVar.zzc(zzefVar, iZzt);
                            break;
                        case zzbbn.zzt.zzm /* 21 */:
                            zzakiVar.zzd(zzefVar, iZzt);
                            break;
                        case 22:
                            zzakiVar.zze(zzefVar, iZzt);
                            break;
                    }
                } else {
                    zzclVarZza = zzakiVar.zza();
                    zzakiVar.zzb();
                }
                zzefVar.zzh(iZzg);
            }
            if (zzclVarZza != null) {
                arrayList.add(zzclVarZza);
            }
        }
        zzdfVar.zza(new zzajn(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
