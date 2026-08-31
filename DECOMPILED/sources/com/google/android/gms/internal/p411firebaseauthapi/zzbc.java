package com.google.android.gms.internal.p411firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbc implements zzby {
    private final OutputStream zza;

    private zzbc(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzby zza(OutputStream outputStream) {
        return new zzbc(outputStream);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzby
    public final void zza(zzvv zzvvVar) throws IOException {
        try {
            ((zzvv) ((zzalf) zzvvVar.zzn().zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzby
    public final void zza(zzxh zzxhVar) throws IOException {
        try {
            zzxhVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
