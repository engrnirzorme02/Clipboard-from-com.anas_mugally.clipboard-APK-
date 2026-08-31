package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxo implements zzayi {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbxo(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final void zza(boolean z7) {
        zzbxr zzbxrVarM32346d = C7351t.m32346d();
        Context context = this.zza;
        if (zzbxrVarM32346d.zza(context)) {
            synchronized (this.zzb) {
                try {
                    if (this.zzd == z7) {
                        return;
                    }
                    this.zzd = z7;
                    String str = this.zzc;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.zzd) {
                        C7351t.m32346d().zzd(context, str);
                    } else {
                        C7351t.m32346d().zze(context, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        zza(zzayhVar.zzj);
    }
}
