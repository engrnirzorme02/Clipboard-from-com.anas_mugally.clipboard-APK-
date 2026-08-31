package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpu {
    public static List zza(int i7) {
        return i7 == 0 ? Collections.EMPTY_LIST : new ArrayList(i7);
    }

    static HashSet zzb(int i7) {
        return new HashSet(zzd(i7));
    }

    public static LinkedHashMap zzc(int i7) {
        return new LinkedHashMap(zzd(i7));
    }

    private static int zzd(int i7) {
        if (i7 < 3) {
            return i7 + 1;
        }
        return i7 < 1073741824 ? (int) ((i7 / 0.75f) + 1.0f) : C3553a.e.API_PRIORITY_OTHER;
    }
}
