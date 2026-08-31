package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
class zzgio extends zzgih implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzgiu zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgio(zzgiu zzgiuVar, SortedMap sortedMap) {
        super(zzgiuVar, sortedMap);
        Objects.requireNonNull(zzgiuVar);
        this.zze = zzgiuVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzg().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzg().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzgio(this.zze, zzg().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzg().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzgio(this.zze, zzg().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzgio(this.zze, zzg().tailMap(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgkv
    /* JADX INFO: renamed from: zze */
    public SortedSet zzh() {
        return new zzgip(this.zze, zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgih, com.google.android.gms.internal.ads.zzgkv, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetZzh = zzh();
        this.zzd = sortedSetZzh;
        return sortedSetZzh;
    }

    SortedMap zzg() {
        return (SortedMap) ((zzgih) this).zza;
    }
}
