package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwx extends zzwz {
    protected zzwx(zzbf zzbfVar, int[] iArr, int i7, zzyu zzyuVar, long j7, long j8, long j9, int i8, int i9, float f7, float f8, List list, zzdb zzdbVar) {
        super(zzbfVar, iArr, 0);
        zzgjz.zzq(list);
    }

    static /* synthetic */ zzgjz zzd(zzye[] zzyeVarArr) {
        int i7;
        long[][] jArr;
        int i8 = 1;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            zzye zzyeVar = zzyeVarArr[i10];
            if (zzyeVar == null || zzyeVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i11 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                zzgjwVar.zzf(new zzwv(0L, 0L));
                arrayList.add(zzgjwVar);
            }
        }
        long[][] jArr2 = new long[2][];
        for (int i12 = 0; i12 < 2; i12++) {
            zzye zzyeVar2 = zzyeVarArr[i12];
            if (zzyeVar2 == null) {
                jArr2[i12] = new long[0];
            } else {
                int[] iArr = zzyeVar2.zzb;
                jArr2[i12] = new long[iArr.length];
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    long j7 = zzyeVar2.zza.zza(iArr[i13]).zzj;
                    long[] jArr3 = jArr2[i12];
                    if (j7 == -1) {
                        j7 = 0;
                    }
                    jArr3[i13] = j7;
                }
                Arrays.sort(jArr2[i12]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            long[] jArr5 = jArr2[i14];
            jArr4[i14] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgkk zzgkkVarZza = zzgle.zzc(zzglj.zzb()).zzb(2).zza();
        int i15 = 0;
        while (i15 < 2) {
            int length = jArr2[i15].length;
            if (length <= i8) {
                i7 = i9;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i16 = i9;
                while (true) {
                    long[] jArr6 = jArr2[i15];
                    double dLog = 0.0d;
                    if (i16 >= jArr6.length) {
                        break;
                    }
                    int i17 = i9;
                    long[][] jArr7 = jArr2;
                    long j8 = jArr6[i16];
                    if (j8 != -1) {
                        dLog = Math.log(j8);
                    }
                    dArr[i16] = dLog;
                    i16 += i8;
                    i9 = i17;
                    jArr2 = jArr7;
                }
                i7 = i9;
                jArr = jArr2;
                int i18 = length - 1;
                double d7 = dArr[i18] - dArr[i7];
                int i19 = i7;
                while (i19 < i18) {
                    double d8 = dArr[i19];
                    i19 += i8;
                    zzgkkVarZza.zze(Double.valueOf(d7 == 0.0d ? 1.0d : (((d8 + dArr[i19]) * 0.5d) - dArr[i7]) / d7), Integer.valueOf(i15));
                    i8 = i8;
                }
            }
            i15++;
            i9 = i7;
            jArr2 = jArr;
            i8 = i8;
        }
        int i20 = i9;
        long[][] jArr8 = jArr2;
        zzgjz zzgjzVarZzq = zzgjz.zzq(zzgkkVarZza.zzs());
        while (i9 < zzgjzVarZzq.size()) {
            int iIntValue = ((Integer) zzgjzVarZzq.get(i9)).intValue();
            int i21 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i21;
            jArr4[iIntValue] = jArr8[iIntValue][i21];
            zzi(arrayList, jArr4);
            i9++;
        }
        for (int i22 = i20; i22 < 2; i22++) {
            if (arrayList.get(i22) != null) {
                long j9 = jArr4[i22];
                jArr4[i22] = j9 + j9;
            }
        }
        zzi(arrayList, jArr4);
        zzgjw zzgjwVar2 = new zzgjw();
        for (int i23 = i20; i23 < arrayList.size(); i23++) {
            zzgjw zzgjwVar3 = (zzgjw) arrayList.get(i23);
            zzgjwVar2.zzf(zzgjwVar3 == null ? zzgjz.zzi() : zzgjwVar3.zzi());
        }
        return zzgjwVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j7 = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            j7 += jArr[i7];
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzgjw zzgjwVar = (zzgjw) list.get(i8);
            if (zzgjwVar != null) {
                zzgjwVar.zzf(new zzwv(j7, jArr[i8]));
            }
        }
    }
}
