package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjf extends AbstractSet {
    final /* synthetic */ zzgjk zza;

    /* synthetic */ zzgjf(zzgjk zzgjkVar, byte[] bArr) {
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgjk zzgjkVar = this.zza;
        Map mapZzc = zzgjkVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzi = zzgjkVar.zzi(entry.getKey());
            if (iZzi != -1 && Objects.equals(zzgjkVar.zzp(iZzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgjk zzgjkVar = this.zza;
        Map mapZzc = zzgjkVar.zzc();
        return mapZzc != null ? mapZzc.entrySet().iterator() : new zzgjd(zzgjkVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iZzh;
        int iZze;
        zzgjk zzgjkVar = this.zza;
        Map mapZzc = zzgjkVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgjkVar.zzb() || (iZze = zzgjl.zze(entry.getKey(), entry.getValue(), (iZzh = zzgjkVar.zzh()), zzgjkVar.zzk(), zzgjkVar.zzl(), zzgjkVar.zzm(), zzgjkVar.zzn())) == -1) {
            return false;
        }
        zzgjkVar.zze(iZze, iZzh);
        zzgjkVar.zzu(zzgjkVar.zzt() - 1);
        zzgjkVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
