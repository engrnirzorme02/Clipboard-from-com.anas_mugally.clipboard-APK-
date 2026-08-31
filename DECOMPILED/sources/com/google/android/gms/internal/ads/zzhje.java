package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzhje {
    zzhje() {
    }

    public static final List zza(Object obj, long j7) {
        zzhit zzhitVar = (zzhit) zzhlc.zzn(obj, j7);
        if (zzhitVar.zza()) {
            return zzhitVar;
        }
        int size = zzhitVar.size();
        zzhit zzhitVarZzh = zzhitVar.zzh(size == 0 ? 10 : size + size);
        zzhlc.zzo(obj, j7, zzhitVarZzh);
        return zzhitVarZzh;
    }
}
