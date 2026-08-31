package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcly implements zzcwn {
    private final zzfea zza;

    public zzcly(zzfea zzfeaVar) {
        this.zza = zzfeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzfdj e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Cannot invoke onPause for the mediation adapter.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzb(Context context) {
        try {
            zzfea zzfeaVar = this.zza;
            zzfeaVar.zzj();
            if (context != null) {
                zzfeaVar.zzp(context);
            }
        } catch (zzfdj e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Cannot invoke onResume for the mediation adapter.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzc(Context context) {
        try {
            this.zza.zzf();
        } catch (zzfdj e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Cannot invoke onDestroy for the mediation adapter.", e7);
        }
    }
}
