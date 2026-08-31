package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzazl implements Comparator {
    zzazl(zzazn zzaznVar) {
        Objects.requireNonNull(zzaznVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazq zzazqVar = (zzazq) obj;
        zzazq zzazqVar2 = (zzazq) obj2;
        int i7 = zzazqVar.zzc - zzazqVar2.zzc;
        return i7 != 0 ? i7 : Long.compare(zzazqVar.zza, zzazqVar2.zza);
    }
}
