package com.google.android.gms.internal.p411firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C3710o;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafc {
    private final int zza;

    private zzafc(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> listZza = zzt.zza("[.-]").zza((CharSequence) str);
            if (listZza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (listZza.size() >= 3) {
                return (Integer.parseInt(listZza.get(0)) * 1000000) + (Integer.parseInt(listZza.get(1)) * zzbbn.zzq.zzf) + Integer.parseInt(listZza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e7) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e7));
            return -1;
        }
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }

    public static zzafc zza() throws Throwable {
        String strM18050b = C3710o.m18049a().m18050b("firebase-auth");
        if (TextUtils.isEmpty(strM18050b) || strM18050b.equals("UNKNOWN")) {
            strM18050b = "-1";
        }
        return new zzafc(strM18050b);
    }
}
