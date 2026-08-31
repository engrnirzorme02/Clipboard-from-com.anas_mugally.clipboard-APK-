package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwr extends zzas {
    public final zzgjz zzc;

    public zzwr(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzgjz.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzas, java.lang.Throwable
    public final String getMessage() {
        zzgjz zzgjzVar = this.zzc;
        String message = super.getMessage();
        if (zzgjzVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgjzVar);
        StringBuilder sb = new StringBuilder(length + 17 + strValueOf.length());
        sb.append(message);
        sb.append("\nsniff failures: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
