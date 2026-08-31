package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdu extends zzgp {
    public zzcdu(int i7, Map map, zzge zzgeVar, int i8) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 15);
        sb.append("Response code: ");
        sb.append(i7);
        super(sb.toString(), zzgeVar, 2000, i8);
    }
}
