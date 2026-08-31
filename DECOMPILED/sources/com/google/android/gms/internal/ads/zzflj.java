package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzflj {
    public static zzflj zze(zzflk zzflkVar, zzfll zzfllVar) {
        zzfnh.zza();
        return new zzfln(zzflkVar, zzfllVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzflq zzflqVar, String str);
}
