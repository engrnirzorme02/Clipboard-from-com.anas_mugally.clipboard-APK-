package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzakx {
    public static zzaky zza(zzaky zzakyVar, String[] strArr, Map map) {
        int length;
        int i7 = 0;
        if (zzakyVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzaky) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzaky zzakyVar2 = new zzaky();
                while (i7 < length2) {
                    zzakyVar2.zzr((zzaky) map.get(strArr[i7]));
                    i7++;
                }
                return zzakyVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzakyVar.zzr((zzaky) map.get(strArr[0]));
                return zzakyVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i7 < length) {
                    zzakyVar.zzr((zzaky) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return zzakyVar;
    }
}
