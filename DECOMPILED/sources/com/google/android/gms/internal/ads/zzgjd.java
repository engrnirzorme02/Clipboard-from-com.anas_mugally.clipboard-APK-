package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjd extends zzgjg {
    final /* synthetic */ zzgjk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgjd(zzgjk zzgjkVar) {
        super(zzgjkVar, null);
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    final /* bridge */ /* synthetic */ Object zza(int i7) {
        return new zzgji(this.zza, i7);
    }
}
