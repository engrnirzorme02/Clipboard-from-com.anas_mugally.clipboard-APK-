package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfv extends zzfs {
    private final zzfu zza;
    private Uri zzb;
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzfv(final byte[] bArr) {
        zzfu zzfuVar = new zzfu() { // from class: com.google.android.gms.internal.ads.zzft
            @Override // com.google.android.gms.internal.ads.zzfu
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        super(false);
        this.zza = zzfuVar;
        zzghc.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.zze;
        if (i9 == 0) {
            return -1;
        }
        int iMin = Math.min(i8, i9);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i7, iMin);
        this.zzd += iMin;
        this.zze -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzgb {
        zzf(zzgeVar);
        Uri uri = zzgeVar.zza;
        this.zzb = uri;
        byte[] bArrZza = this.zza.zza(uri);
        this.zzc = bArrZza;
        long j7 = zzgeVar.zze;
        int length = bArrZza.length;
        if (j7 > length) {
            throw new zzgb(2008);
        }
        int i7 = (int) j7;
        this.zzd = i7;
        int i8 = length - i7;
        this.zze = i8;
        long j8 = zzgeVar.zzf;
        if (j8 != -1) {
            this.zze = (int) Math.min(i8, j8);
        }
        this.zzf = true;
        zzg(zzgeVar);
        return j8 != -1 ? j8 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
