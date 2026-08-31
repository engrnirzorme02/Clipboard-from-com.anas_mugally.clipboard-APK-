package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzgmq extends zzgml {
    private final File zza;
    private final zzgke zzb;

    /* synthetic */ zzgmq(File file, zzgmp[] zzgmpVarArr, byte[] bArr) {
        file.getClass();
        this.zza = file;
        this.zzb = zzgke.zzp(zzgmpVarArr);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 19 + strValueOf.length() + 1);
        sb.append("Files.asByteSink(");
        sb.append(string);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgml
    public final /* bridge */ /* synthetic */ OutputStream zza() {
        return new FileOutputStream(this.zza, this.zzb.contains(zzgmp.APPEND));
    }
}
