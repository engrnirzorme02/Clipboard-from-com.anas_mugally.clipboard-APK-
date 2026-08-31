package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccu extends zzccq {
    public zzccu(zzcbd zzcbdVar) {
        super(zzcbdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final boolean zze(String str) {
        String strM33285o = C7590g.m33285o(str);
        zzcbd zzcbdVar = (zzcbd) this.zzc.get();
        if (zzcbdVar != null && strM33285o != null) {
            zzcbdVar.zzt(strM33285o, this);
        }
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("VideoStreamNoopCache is doing nothing.");
        zzq(str, strM33285o, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzccq
    public final void zzl() {
    }
}
