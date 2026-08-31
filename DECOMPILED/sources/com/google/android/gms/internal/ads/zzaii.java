package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaii {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z7 = false;
        while (it.hasNext()) {
            String str2 = ((zzaiv) it.next()).zza.zzg.zzo;
            if (zzar.zzb(str2)) {
                return "video/mp4";
            }
            if (zzar.zza(str2)) {
                z7 = true;
            } else if (zzar.zzc(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z7) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
