package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadm {
    private final zzef zza = new zzef(10);

    private final boolean zzb(zzacv zzacvVar, int i7) {
        int i8;
        int i9 = 0;
        do {
            int i10 = i9 % 10;
            if (i10 == 0) {
                if (i9 != 0) {
                    zzef zzefVar = this.zza;
                    System.arraycopy(zzefVar.zzi(), 10, zzefVar.zzi(), 0, 9);
                }
                i8 = 0;
            } else {
                i8 = i10;
            }
            int i11 = i9 != 0 ? 1 : 10;
            try {
                zzef zzefVar2 = this.zza;
                int i12 = i10 + 10;
                zzacvVar.zzi(zzefVar2.zzi(), i12 - i11, i11);
                zzefVar2.zzh(i8);
                zzefVar2.zzf(i12);
                if (zzefVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzadp.zza(zzefVar2.zzr()) != -1) {
                    return false;
                }
                if (i9 == 0) {
                    zzefVar2.zzc(20);
                }
                i9++;
            } catch (EOFException unused) {
            }
        } while (i9 <= i7);
        return false;
    }

    public final zzao zza(zzacv zzacvVar, zzagd zzagdVar, int i7) {
        zzao zzaoVarZza = null;
        int i8 = 0;
        while (zzb(zzacvVar, i7)) {
            zzef zzefVar = this.zza;
            int iZzg = zzefVar.zzg();
            zzefVar.zzk(6);
            int iZzG = zzefVar.zzG();
            int i9 = iZzG + 10;
            if (zzaoVarZza == null) {
                byte[] bArr = new byte[i9];
                System.arraycopy(zzefVar.zzi(), iZzg, bArr, 0, 10);
                zzacvVar.zzi(bArr, 10, iZzG);
                zzaoVarZza = zzagg.zza(bArr, i9, zzagdVar, new zzafr());
            } else {
                zzacvVar.zzk(iZzG);
            }
            i8 += i9;
        }
        zzacvVar.zzl();
        zzacvVar.zzk(i8);
        return zzaoVarZza;
    }
}
