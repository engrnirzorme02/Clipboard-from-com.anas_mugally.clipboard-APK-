package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzabz(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f7, String str) {
        this.zza = list;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = i13;
        this.zzi = i14;
        this.zzj = i15;
        this.zzk = f7;
        this.zzl = str;
    }

    public static zzabz zza(zzef zzefVar) throws zzas {
        String strZzb;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        try {
            zzefVar.zzk(4);
            int iZzs = (zzefVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzefVar.zzs() & 31;
            for (int i15 = 0; i15 < iZzs2; i15++) {
                arrayList.add(zzb(zzefVar));
            }
            int iZzs3 = zzefVar.zzs();
            for (int i16 = 0; i16 < iZzs3; i16++) {
                arrayList.add(zzb(zzefVar));
            }
            if (iZzs2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = zzfl.zza;
                zzfk zzfkVarZzd = zzfl.zzd(bArr2, 5, bArr.length);
                int i17 = zzfkVarZzd.zze;
                int i18 = zzfkVarZzd.zzf;
                int i19 = zzfkVarZzd.zzh + 8;
                int i20 = zzfkVarZzd.zzi + 8;
                int i21 = zzfkVarZzd.zzj;
                int i22 = zzfkVarZzd.zzk;
                int i23 = zzfkVarZzd.zzl;
                int i24 = zzfkVarZzd.zzm;
                float f8 = zzfkVarZzd.zzg;
                strZzb = zzdc.zzb(zzfkVarZzd.zza, zzfkVarZzd.zzb, zzfkVarZzd.zzc);
                i11 = i23;
                i12 = i24;
                f7 = f8;
                i10 = i20;
                i13 = i21;
                i14 = i22;
                i7 = i17;
                i8 = i18;
                i9 = i19;
            } else {
                strZzb = null;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = 16;
                f7 = 1.0f;
                i13 = -1;
                i14 = -1;
            }
            return new zzabz(arrayList, iZzs, i7, i8, i9, i10, i13, i14, i11, i12, f7, strZzb);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw zzas.zzb("Error parsing AVC config", e7);
        }
    }

    private static byte[] zzb(zzef zzefVar) {
        int iZzt = zzefVar.zzt();
        int iZzg = zzefVar.zzg();
        zzefVar.zzk(iZzt);
        return zzdc.zzg(zzefVar.zzi(), iZzg, iZzt);
    }
}
