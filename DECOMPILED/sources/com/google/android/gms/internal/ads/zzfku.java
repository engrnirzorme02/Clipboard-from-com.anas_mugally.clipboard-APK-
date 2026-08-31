package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfku implements Comparator {
    final /* synthetic */ zzflb zza;

    zzfku(zzflb zzflbVar) {
        Objects.requireNonNull(zzflbVar);
        this.zza = zzflbVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzfks zzfksVar = (zzfks) obj;
        zzfks zzfksVar2 = (zzfks) obj2;
        Object objZza = zzfksVar2.zza();
        zzflb zzflbVar = this.zza;
        int iCompare = Double.compare(zzflb.zzD(zzflbVar.zzb(objZza)), zzflb.zzD(zzflbVar.zzb(zzfksVar.zza())));
        return iCompare == 0 ? Long.compare(zzfksVar.zzd(), zzfksVar2.zzd()) : iCompare;
    }
}
