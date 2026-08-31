package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhf extends IllegalStateException {
    public zzhf(int i7, int i8) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 21 + String.valueOf(i8).length() + 1);
        sb.append("Buffer too small (");
        sb.append(i7);
        sb.append(" < ");
        sb.append(i8);
        sb.append(")");
        super(sb.toString());
    }
}
