package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqa extends Exception {
    public zzqa(long j7, long j8) {
        StringBuilder sb = new StringBuilder(String.valueOf(j8).length() + 63 + String.valueOf(j7).length());
        sb.append("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(j8);
        sb.append(", got ");
        sb.append(j7);
        super(sb.toString());
    }
}
