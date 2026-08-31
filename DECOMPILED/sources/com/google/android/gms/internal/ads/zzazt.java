package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazt implements Comparator {
    public zzazt(zzazu zzazuVar) {
        Objects.requireNonNull(zzazuVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazj zzazjVar = (zzazj) obj;
        zzazj zzazjVar2 = (zzazj) obj2;
        if (zzazjVar.zzb() < zzazjVar2.zzb()) {
            return -1;
        }
        if (zzazjVar.zzb() > zzazjVar2.zzb()) {
            return 1;
        }
        if (zzazjVar.zza() < zzazjVar2.zza()) {
            return -1;
        }
        if (zzazjVar.zza() > zzazjVar2.zza()) {
            return 1;
        }
        float fZzd = (zzazjVar.zzd() - zzazjVar.zzb()) * (zzazjVar.zzc() - zzazjVar.zza());
        float fZzd2 = (zzazjVar2.zzd() - zzazjVar2.zzb()) * (zzazjVar2.zzc() - zzazjVar2.zza());
        if (fZzd > fZzd2) {
            return -1;
        }
        return fZzd < fZzd2 ? 1 : 0;
    }
}
