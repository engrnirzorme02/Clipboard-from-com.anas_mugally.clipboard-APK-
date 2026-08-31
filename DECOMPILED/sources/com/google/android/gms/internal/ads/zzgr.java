package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgr extends zzgp {
    public final int zzc;

    public zzgr(int i7, String str, IOException iOException, Map map, zzge zzgeVar, byte[] bArr) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 15);
        sb.append("Response code: ");
        sb.append(i7);
        super(sb.toString(), iOException, zzgeVar, 2004, 1);
        this.zzc = i7;
    }
}
