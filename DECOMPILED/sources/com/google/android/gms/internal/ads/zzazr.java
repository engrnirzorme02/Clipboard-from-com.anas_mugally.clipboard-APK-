package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.PriorityQueue;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazr {
    public static void zza(String[] strArr, int i7, int i8, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i7, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzb(i7, jZze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i9 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i9 >= length2 - 5) {
                return;
            }
            long jZza = zzazo.zza(strArr[i9 - 1]);
            long jZza2 = zzazo.zza(strArr[i9 + 5]);
            String strZzc = zzc(strArr, i9, 6);
            jZze = ((((((jZze + 1073807359) - ((zzd(16785407L, 5) * ((jZza + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jZza2 + 2147483647L) % 1073807359)) % 1073807359;
            zzb(i7, jZze, strZzc, length2, priorityQueue);
            i9++;
        }
    }

    static void zzb(int i7, long j7, String str, int i8, PriorityQueue priorityQueue) {
        zzazq zzazqVar = new zzazq(j7, str, i8);
        if ((priorityQueue.size() != i7 || (((zzazq) priorityQueue.peek()).zzc <= zzazqVar.zzc && ((zzazq) priorityQueue.peek()).zza <= zzazqVar.zza)) && !priorityQueue.contains(zzazqVar)) {
            priorityQueue.add(zzazqVar);
            if (priorityQueue.size() > i7) {
                priorityQueue.poll();
            }
        }
    }

    static String zzc(String[] strArr, int i7, int i8) {
        int i9 = i8 + i7;
        if (strArr.length < i9) {
            int i10 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i11 = i9 - 1;
            if (i7 >= i11) {
                sb.append(strArr[i11]);
                return sb.toString();
            }
            sb.append(strArr[i7]);
            sb.append(' ');
            i7++;
        }
    }

    static long zzd(long j7, int i7) {
        if (i7 == 1) {
            return j7;
        }
        int i8 = i7 >> 1;
        long j8 = (j7 * j7) % 1073807359;
        return ((i7 & 1) == 0 ? zzd(j8, i8) : j7 * (zzd(j8, i8) % 1073807359)) % 1073807359;
    }

    private static long zze(String[] strArr, int i7, int i8) {
        long jZza = (((long) zzazo.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i9 = 1; i9 < i8; i9++) {
            jZza = (((jZza * 16785407) % 1073807359) + ((((long) zzazo.zza(strArr[i9])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
