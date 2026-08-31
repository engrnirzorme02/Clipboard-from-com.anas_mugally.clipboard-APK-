package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzka extends zzjr {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    /* synthetic */ zzka(MessageDigest messageDigest, int i7, zzkb zzkbVar) {
        this.zza = messageDigest;
        this.zzb = i7;
    }

    private final void zzc() {
        zzjf.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzjr
    protected final void zza(byte[] bArr, int i7, int i8) {
        zzc();
        this.zza.update(bArr, 0, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzjx
    public final zzjv zzb() {
        zzc();
        this.zzc = true;
        int i7 = this.zzb;
        if (i7 == this.zza.getDigestLength()) {
            byte[] bArrDigest = this.zza.digest();
            int i8 = zzjv.zzb;
            return new zzju(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.zza.digest(), i7);
        int i9 = zzjv.zzb;
        return new zzju(bArrCopyOf);
    }
}
