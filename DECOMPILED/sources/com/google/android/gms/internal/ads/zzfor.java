package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfor {
    private final Context zza;
    private final Looper zzb;

    public zzfor(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfpb zzfpbVarZza = zzfpd.zza();
        Context context = this.zza;
        zzfpbVarZza.zza(context.getPackageName());
        zzfpbVarZza.zzc(2);
        zzfoz zzfozVarZza = zzfpa.zza();
        zzfozVarZza.zza(str);
        zzfozVarZza.zzb(2);
        zzfpbVarZza.zzb(zzfozVarZza);
        new zzfos(context, this.zzb, (zzfpd) zzfpbVarZza.zzbu()).zza();
    }
}
