package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzhiw extends IOException {
    private boolean zza;

    public zzhiw(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }

    public zzhiw(String str) {
        super(str);
    }

    public zzhiw(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
