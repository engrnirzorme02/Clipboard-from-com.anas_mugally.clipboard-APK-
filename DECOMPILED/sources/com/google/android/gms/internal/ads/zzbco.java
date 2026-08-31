package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzbco {
    public static final void zza(zzbcn zzbcnVar, zzbcl zzbclVar) {
        if (zzbclVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbclVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbcnVar.zza(zzbclVar.zzb(), zzbclVar.zzc(), zzbclVar.zza(), zzbclVar.zzd());
    }
}
