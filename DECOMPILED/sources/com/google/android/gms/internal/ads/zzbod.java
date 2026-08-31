package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.InterfaceC3428E;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbod {
    static final InterfaceC3428E zza = new zzbob();
    static final InterfaceC3428E zzb = new zzboc();
    private final zzbnp zzc;

    public zzbod(Context context, C7584a c7584a, String str, zzfie zzfieVar) {
        this.zzc = new zzbnp(context, c7584a, str, zza, zzb, zzfieVar);
    }

    public final zzbnt zza(String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        return new zzboh(this.zzc, str, zzbnwVar, zzbnvVar);
    }

    public final zzbom zzb() {
        return new zzbom(this.zzc);
    }
}
