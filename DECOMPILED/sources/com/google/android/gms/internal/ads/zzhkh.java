package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkh {
    static final /* synthetic */ zzhhb zza(zzhhb zzhhbVar, zzhhb zzhhbVar2, ArrayDeque arrayDeque) {
        zzb(zzhhbVar, arrayDeque);
        zzb(zzhhbVar2, arrayDeque);
        zzhhb zzhkjVar = (zzhhb) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzhkjVar = new zzhkj((zzhhb) arrayDeque.pop(), zzhkjVar, null);
        }
        return zzhkjVar;
    }

    private static final void zzb(zzhhb zzhhbVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzhhbVar.zzg()) {
            if (!(zzhhbVar instanceof zzhkj)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzhhbVar.getClass())));
            }
            zzhkj zzhkjVar = (zzhkj) zzhhbVar;
            zzb(zzhkjVar.zzB(), arrayDeque);
            zzb(zzhkjVar.zzC(), arrayDeque);
            return;
        }
        int iZzc = zzc(zzhhbVar.zzc(), arrayDeque);
        int iZzh = zzhkj.zzh(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzhhb) arrayDeque.peek()).zzc() >= iZzh) {
            arrayDeque.push(zzhhbVar);
            return;
        }
        int iZzh2 = zzhkj.zzh(iZzc);
        zzhhb zzhkjVar2 = (zzhhb) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zzhhb) arrayDeque.peek()).zzc() >= iZzh2) {
                break;
            } else {
                zzhkjVar2 = new zzhkj((zzhhb) arrayDeque.pop(), zzhkjVar2, bArr);
            }
        }
        zzhkj zzhkjVar3 = new zzhkj(zzhkjVar2, zzhhbVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zzhhb) arrayDeque.peek()).zzc() >= zzhkj.zzh(zzc(zzhkjVar3.zzc(), arrayDeque) + 1)) {
                break;
            } else {
                zzhkjVar3 = new zzhkj((zzhhb) arrayDeque.pop(), zzhkjVar3, bArr);
            }
        }
        arrayDeque.push(zzhkjVar3);
    }

    private static final int zzc(int i7, ArrayDeque arrayDeque) {
        int iBinarySearch = Arrays.binarySearch(zzhkj.zza, i7);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
