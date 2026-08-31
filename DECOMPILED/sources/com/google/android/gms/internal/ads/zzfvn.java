package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvn implements zzfvs {
    private final byte[] zza;

    public zzfvn(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzgmo.zza(inputStream);
        } catch (IOException e7) {
            throw new zzfvo("Cannot read bytes.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
