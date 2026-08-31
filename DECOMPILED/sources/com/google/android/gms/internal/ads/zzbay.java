package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbay extends PushbackInputStream {
    final /* synthetic */ zzbbb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbay(zzbbb zzbbbVar, InputStream inputStream, int i7) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbbbVar);
        this.zza = zzbbbVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.zza.zzc.zzb();
        super.close();
    }
}
