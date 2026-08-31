package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzlc extends zzlg {
    private final int zzc;

    zzlc(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzlh.zzj(0, i8, bArr.length);
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zza(int i7) {
        int i8 = this.zzc;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return ((zzlg) this).zza[i7];
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i7);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 18 + String.valueOf(i8).length());
        sb2.append("Index > length: ");
        sb2.append(i7);
        sb2.append(", ");
        sb2.append(i8);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    final byte zzb(int i7) {
        return ((zzlg) this).zza[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    protected final int zzd() {
        return 0;
    }
}
