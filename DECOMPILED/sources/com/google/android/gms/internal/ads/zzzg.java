package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzg extends IOException {
    public zzzg(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        StringBuilder sb = new StringBuilder(simpleName.length() + 11 + strConcat.length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(strConcat);
        super(sb.toString(), th);
    }
}
