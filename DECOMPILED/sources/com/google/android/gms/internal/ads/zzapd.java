package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapd {
    public final int zza;
    public final byte[] zzb;
    public final Map zzc;
    public final List zzd;
    public final boolean zze;

    private zzapd(int i7, byte[] bArr, Map map, List list, boolean z7, long j7) {
        this.zza = i7;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : Collections.unmodifiableList(list);
        this.zze = z7;
    }

    private static List zza(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzaoz((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzapd(int i7, byte[] bArr, Map map, boolean z7, long j7) {
        this(i7, bArr, map, zza(map), z7, j7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzapd(int i7, byte[] bArr, boolean z7, long j7, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzaoz zzaozVar = (zzaoz) it.next();
                treeMap.put(zzaozVar.zza(), zzaozVar.zzb());
            }
        }
        this(i7, bArr, treeMap, list, z7, j7);
    }

    @Deprecated
    public zzapd(byte[] bArr, Map map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
