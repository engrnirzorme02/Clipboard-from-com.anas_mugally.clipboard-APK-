package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
class zzeg extends zzef {
    protected final byte[] zza;

    zzeg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzei) || zzd() != ((zzei) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzeg)) {
            return obj.equals(this);
        }
        zzeg zzegVar = (zzeg) obj;
        int iZzi = zzi();
        int iZzi2 = zzegVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzegVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzegVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zzegVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzegVar.zza;
        zzegVar.zzc();
        int i7 = 0;
        int i8 = 0;
        while (i7 < iZzd) {
            if (bArr[i7] != bArr2[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    byte zzb(int i7) {
        return this.zza[i7];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    protected final int zze(int i7, int i8, int i9) {
        return zzfo.zzb(i7, this.zza, 0, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    public final zzei zzf(int i7, int i8) {
        int iZzh = zzei.zzh(0, i8, zzd());
        return iZzh == 0 ? zzei.zzb : new zzec(this.zza, 0, iZzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzei
    final void zzg(zzdz zzdzVar) {
        ((zzem) zzdzVar).zzc(this.zza, 0, zzd());
    }
}
