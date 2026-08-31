package com.google.android.gms.internal.fido;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzfz extends zzfp {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    /* synthetic */ zzfz(MessageDigest messageDigest, int i7, zzfy zzfyVar) {
        this.zza = messageDigest;
        this.zzb = i7;
    }

    private final void zzd() {
        zzbm.zzf(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.gms.internal.fido.zzfp
    protected final void zzb(byte[] bArr, int i7, int i8) {
        zzd();
        this.zza.update(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.fido.zzfv
    public final zzft zzc() {
        zzd();
        this.zzc = true;
        int i7 = this.zzb;
        if (i7 == this.zza.getDigestLength()) {
            byte[] bArrDigest = this.zza.digest();
            int i8 = zzft.zzb;
            return new zzfs(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.zza.digest(), i7);
        int i9 = zzft.zzb;
        return new zzfs(bArrCopyOf);
    }
}
