package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdtp {
    private final Map zza = new ConcurrentHashMap();

    zzdtp() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    public final synchronized void zza(long j7, int i7, long j8) {
        int iIntValue;
        ArrayDeque arrayDeque;
        Long l7;
        try {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzio)).booleanValue()) {
                zzdtn zzdtnVar = new zzdtn();
                zzdtnVar.zza(j7);
                zzdtnVar.zzb(i7);
                zzdts zzdtsVarZzc = zzdtnVar.zzc();
                int iZzb = zzdtsVarZzc.zzb();
                if (iZzb == 0) {
                    iIntValue = 0;
                } else if (iZzb == 1) {
                    iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zziu)).intValue();
                } else if (iZzb == 2) {
                    iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zziv)).intValue();
                } else if (iZzb != 3) {
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zziw)).intValue();
                }
                if (iIntValue > 0) {
                    Map map = this.zza;
                    ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzdtsVarZzc);
                    if (arrayDeque2 == null) {
                        arrayDeque2 = new ArrayDeque();
                        map.put(zzdtsVarZzc, arrayDeque2);
                    }
                    arrayDeque2.addLast(Long.valueOf(j8));
                    while (arrayDeque2.size() > iIntValue) {
                        arrayDeque2.removeFirst();
                    }
                    zzc();
                    int iIntValue2 = ((Integer) C3250D.m17200c().zzd(zzbci.zzix)).intValue();
                    if (iIntValue2 <= 0) {
                        map.clear();
                        return;
                    }
                    while (true) {
                        Iterator it = map.values().iterator();
                        int size = 0;
                        while (it.hasNext()) {
                            size += ((ArrayDeque) it.next()).size();
                        }
                        if (size <= iIntValue2) {
                            break;
                        }
                        if (!map.isEmpty()) {
                            Long l8 = Long.MAX_VALUE;
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : map.entrySet()) {
                                ArrayDeque arrayDeque3 = (ArrayDeque) entry2.getValue();
                                if (!arrayDeque3.isEmpty() && (l7 = (Long) arrayDeque3.peekFirst()) != null && l7.longValue() < l8.longValue()) {
                                    entry = entry2;
                                    l8 = l7;
                                }
                            }
                            if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    map.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzb() {
        HashMap map;
        map = new HashMap();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzio)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                map.put((zzdts) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    final void zzc() {
        long jLongValue;
        long jMo18159a = C7351t.m32357o().mo18159a();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzdts zzdtsVar = (zzdts) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int iZzb = zzdtsVar.zzb();
            if (iZzb == 0) {
                jLongValue = 0;
            } else if (iZzb == 1) {
                jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzir)).longValue();
            } else if (iZzb == 2) {
                jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzis)).longValue();
            } else if (iZzb != 3) {
                jLongValue = 0;
            } else {
                jLongValue = ((Long) C3250D.m17200c().zzd(zzbci.zzit)).longValue();
            }
            if (jLongValue == 0) {
                it.remove();
                jLongValue = 0;
            }
            if (jLongValue > 0) {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext() && jMo18159a - ((Long) it2.next()).longValue() > jLongValue) {
                    it2.remove();
                }
                if (arrayDeque.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
