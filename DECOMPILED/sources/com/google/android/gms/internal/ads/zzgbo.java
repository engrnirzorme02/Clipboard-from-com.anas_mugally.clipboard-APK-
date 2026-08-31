package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbo extends RuntimeException {
    public zzgbo() {
        this(0);
    }

    public zzgbo(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 3);
        sb.append("r: ");
        sb.append(i7);
        super(sb.toString());
    }
}
