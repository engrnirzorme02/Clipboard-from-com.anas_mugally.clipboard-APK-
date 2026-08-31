package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
final class zzamz implements zzamk {
    private final zzamm zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzamz(zzamm zzammVar, String str, Object[] objArr) {
        this.zza = zzammVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i7 = cCharAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.zzd = i7 | (cCharAt2 << i8);
                return;
            } else {
                i7 |= (cCharAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamk
    public final zzamm zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamk
    public final zzamy zzb() {
        int i7 = this.zzd;
        if ((i7 & 1) != 0) {
            return zzamy.PROTO2;
        }
        return (i7 & 4) == 4 ? zzamy.EDITIONS : zzamy.PROTO3;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzamk
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
