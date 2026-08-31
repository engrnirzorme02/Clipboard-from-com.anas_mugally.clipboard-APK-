package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3422B;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbyr extends AbstractC3422B {
    final /* synthetic */ zzbyv zza;

    zzbyr(zzbyv zzbyvVar) {
        Objects.requireNonNull(zzbyvVar);
        this.zza = zzbyvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.AbstractC3422B
    public final void zza() {
        zzbyv zzbyvVar = this.zza;
        zzbcl zzbclVar = new zzbcl(zzbyvVar.zzy(), zzbyvVar.zzz().f30226a);
        synchronized (zzbyvVar.zzx()) {
            try {
                C7351t.m32359q();
                zzbco.zza(zzbyvVar.zzA(), zzbclVar);
            } catch (IllegalArgumentException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Cannot config CSI reporter.", e7);
            }
        }
    }
}
