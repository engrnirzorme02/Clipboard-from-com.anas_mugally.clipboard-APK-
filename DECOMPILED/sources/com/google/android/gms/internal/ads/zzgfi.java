package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgfi extends zzgeg {
    final /* synthetic */ zzgfk zza;
    private final zzgfp zzb;

    zzgfi(zzgfk zzgfkVar, zzgfp zzgfpVar) {
        Objects.requireNonNull(zzgfkVar);
        this.zza = zzgfkVar;
        this.zzb = zzgfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final void zzb(Bundle bundle) {
        int i7 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i8 = bundle.getInt("uiMode", 0);
        zzgfn zzgfnVarZzd = zzgfo.zzd();
        zzgfnVarZzd.zza(i7);
        if (string != null) {
            zzgfnVarZzd.zzb(string);
        }
        zzgfnVarZzd.zzc(i8);
        this.zzb.zza(zzgfnVarZzd.zzd());
        if (i7 == 8157) {
            this.zza.zzd();
        }
    }
}
