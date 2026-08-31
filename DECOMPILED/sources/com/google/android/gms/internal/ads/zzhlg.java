package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhlg extends IllegalArgumentException {
    zzhlg(int i7, int i8) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 32 + String.valueOf(i8).length());
        sb.append("Unpaired surrogate at index ");
        sb.append(i7);
        sb.append(" of ");
        sb.append(i8);
        super(sb.toString());
    }
}
