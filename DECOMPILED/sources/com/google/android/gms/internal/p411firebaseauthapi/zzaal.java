package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaal {
    private final zzaaj zza;

    private zzaal(zzaaj zzaajVar) {
        this.zza = zzaajVar;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzaal zza(byte[] bArr, zzch zzchVar) {
        if (zzchVar != null) {
            return new zzaal(zzaaj.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzaal zza(int i7) {
        return new zzaal(zzaaj.zza(zzqd.zza(i7)));
    }

    public final byte[] zza(zzch zzchVar) {
        if (zzchVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
