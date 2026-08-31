package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaag extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaaf zzd;
    private boolean zze;

    /* synthetic */ zzaag(zzaaf zzaafVar, SurfaceTexture surfaceTexture, boolean z7, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzaafVar;
        this.zza = z7;
    }

    public static synchronized boolean zza(Context context) {
        int i7;
        if (!zzc) {
            try {
                if (zzdj.zza(context)) {
                    i7 = zzdj.zzb() ? 1 : 2;
                } else {
                    i7 = 0;
                }
            } catch (zzdi e7) {
                zzds.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e7.getMessage())));
            }
            zzb = i7;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzaag zzb(Context context, boolean z7) {
        boolean z8 = true;
        if (z7 && !zza(context)) {
            z8 = false;
        }
        zzghc.zzh(z8);
        return new zzaaf().zza(z7 ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzaaf zzaafVar = this.zzd;
        synchronized (zzaafVar) {
            try {
                if (!this.zze) {
                    zzaafVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
