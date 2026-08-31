package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqq extends zzhpi implements Closeable {
    static {
        zzhpp.zzb(zzaqq.class);
    }

    public zzaqq(zzhpj zzhpjVar, zzaqp zzaqpVar) {
        zzd(zzhpjVar, zzhpjVar.zzb(), zzaqpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhpi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzhpi
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
