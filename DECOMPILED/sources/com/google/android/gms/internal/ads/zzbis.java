package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p396y2.AbstractBinderC7534v;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbis implements zzbjl {
    zzbis() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (zzcekVar.zzaz() != null) {
            zzcekVar.zzaz().zza();
        }
        AbstractBinderC7534v abstractBinderC7534vZzL = zzcekVar.zzL();
        if (abstractBinderC7534vZzL != null) {
            abstractBinderC7534vZzL.zzb();
            return;
        }
        AbstractBinderC7534v abstractBinderC7534vZzM = zzcekVar.zzM();
        if (abstractBinderC7534vZzM != null) {
            abstractBinderC7534vZzM.zzb();
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
