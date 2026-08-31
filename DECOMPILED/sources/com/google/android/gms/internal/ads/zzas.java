package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzas extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzas(String str, Throwable th, boolean z7, int i7) {
        super(str, th);
        this.zza = z7;
        this.zzb = i7;
    }

    public static zzas zza(String str, Throwable th) {
        return new zzas(str, th, true, 0);
    }

    public static zzas zzb(String str, Throwable th) {
        return new zzas(str, th, true, 1);
    }

    public static zzas zzc(String str) {
        return new zzas(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        boolean z7 = this.zza;
        int i7 = this.zzb;
        StringBuilder sb = new StringBuilder(strConcat.length() + 20 + String.valueOf(z7).length() + 11 + String.valueOf(i7).length() + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z7);
        sb.append(", dataType=");
        sb.append(i7);
        sb.append("}");
        return sb.toString();
    }
}
