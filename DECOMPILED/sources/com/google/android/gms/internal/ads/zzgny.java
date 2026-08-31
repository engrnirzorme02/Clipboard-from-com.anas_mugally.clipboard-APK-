package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzgny extends zzgnw {
    private zzgny() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    final void zza(zzgnz zzgnzVar, Set set, Set set2) {
        synchronized (zzgnzVar) {
            try {
                if (zzgnzVar.seenExceptionsField == null) {
                    zzgnzVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    final int zzb(zzgnz zzgnzVar) {
        int i7;
        synchronized (zzgnzVar) {
            i7 = zzgnzVar.remainingField - 1;
            zzgnzVar.remainingField = i7;
        }
        return i7;
    }

    /* synthetic */ zzgny(byte[] bArr) {
        super(null);
    }
}
