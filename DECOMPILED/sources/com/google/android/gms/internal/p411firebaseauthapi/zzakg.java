package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
class zzakg extends zzakd {
    protected final byte[] zzb;

    zzakg(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajv
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajv) || zzb() != ((zzajv) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzakg)) {
            return obj.equals(this);
        }
        zzakg zzakgVar = (zzakg) obj;
        int iZza = zza();
        int iZza2 = zzakgVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzakgVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajv
    public byte zza(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajv
    byte zzb(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajv
    public final zzakh zzc() {
        return zzakh.zza(this.zzb, zze(), zzb(), true);
    }

    protected int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajv
    public final zzajv zza(int i7, int i8) {
        int iZza = zzajv.zza(0, i8, zzb());
        return iZza == 0 ? zzajv.zza : new zzajz(this.zzb, zze(), iZza);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajv
    protected final int zzb(int i7, int i8, int i9) {
        return zzalh.zza(i7, this.zzb, zze(), i9);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajv
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajv
    protected void zza(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zzb, 0, bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajv
    final void zza(zzajw zzajwVar) {
        zzajwVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakd
    final boolean zza(zzajv zzajvVar, int i7, int i8) {
        if (i8 <= zzajvVar.zzb()) {
            if (i8 <= zzajvVar.zzb()) {
                if (zzajvVar instanceof zzakg) {
                    zzakg zzakgVar = (zzakg) zzajvVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzakgVar.zzb;
                    int iZze = zze() + i8;
                    int iZze2 = zze();
                    int iZze3 = zzakgVar.zze();
                    while (iZze2 < iZze) {
                        if (bArr[iZze2] != bArr2[iZze3]) {
                            return false;
                        }
                        iZze2++;
                        iZze3++;
                    }
                    return true;
                }
                return zzajvVar.zza(0, i8).equals(zza(0, i8));
            }
            throw new IllegalArgumentException("Ran off end of other: 0, " + i8 + ", " + zzajvVar.zzb());
        }
        throw new IllegalArgumentException("Length too large: " + i8 + zzb());
    }
}
