package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzauk implements zzfpx {
    final /* synthetic */ zzfoc zza;

    zzauk(zzaum zzaumVar, zzfoc zzfocVar) {
        this.zza = zzfocVar;
        Objects.requireNonNull(zzaumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfpx
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
