package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzuf implements zzga {
    private final zzga zza;
    private final int zzb;
    private final zzue zzc;
    private final byte[] zzd;
    private int zze;

    public zzuf(zzga zzgaVar, int i7, zzue zzueVar) {
        zzghc.zza(i7 > 0);
        this.zza = zzgaVar;
        this.zzb = i7;
        this.zzc = zzueVar;
        this.zzd = new byte[1];
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) {
        int i9 = this.zze;
        if (i9 == 0) {
            zzga zzgaVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i10 = 0;
            if (zzgaVar.zza(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & 255) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int iZza = zzgaVar.zza(bArr3, i10, i12);
                        if (iZza != -1) {
                            i10 += iZza;
                            i12 -= iZza;
                        }
                    }
                    while (i11 > 0) {
                        int i13 = i11 - 1;
                        if (bArr3[i13] != 0) {
                            break;
                        }
                        i11 = i13;
                    }
                    if (i11 > 0) {
                        this.zzc.zza(new zzef(bArr3, i11));
                    }
                }
                i9 = this.zzb;
                this.zze = i9;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i7, Math.min(i9, i8));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
        zzgyVar.getClass();
        this.zza.zze(zzgyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        return this.zza.zzj();
    }
}
