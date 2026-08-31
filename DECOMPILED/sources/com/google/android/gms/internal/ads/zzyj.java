package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzyj extends zzym {
    protected abstract Pair zzh(zzyi zzyiVar, int[][][] iArr, int[] iArr2, zzup zzupVar, zzbe zzbeVar);

    @Override // com.google.android.gms.internal.ads.zzym
    public final void zzp(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzym
    public final zzyn zzq(zzln[] zzlnVarArr, zzwq zzwqVar, zzup zzupVar, zzbe zzbeVar) {
        List[] listArr;
        boolean z7;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbf[][] zzbfVarArr = new zzbf[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = zzwqVar.zzb;
            zzbfVarArr[i7] = new zzbf[i8];
            iArr3[i7] = new int[i8][];
        }
        int i9 = 2;
        int[] iArr4 = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr4[i10] = zzlnVarArr[i10].zzu();
        }
        int i11 = 0;
        while (i11 < zzwqVar.zzb) {
            zzbf zzbfVarZza = zzwqVar.zza(i11);
            int i12 = zzbfVarZza.zzc;
            int i13 = i9;
            int i14 = 0;
            int i15 = 0;
            boolean z8 = true;
            while (i14 < i9) {
                zzln zzlnVar = zzlnVarArr[i14];
                int iMax = 0;
                for (int i16 = 0; i16 < zzbfVarZza.zza; i16++) {
                    iMax = Math.max(iMax, zzlnVar.zzaa(zzbfVarZza.zza(i16)) & 7);
                }
                boolean z9 = iArr2[i14] == 0;
                if (iMax > i15) {
                    z8 = z9;
                    i13 = i14;
                    i15 = iMax;
                } else if (iMax == i15 && i12 == 5 && !z8 && z9) {
                    i13 = i14;
                    i15 = iMax;
                    z8 = true;
                }
                i14++;
                i9 = 2;
            }
            if (i13 == i9) {
                iArr = new int[zzbfVarZza.zza];
            } else {
                zzln zzlnVar2 = zzlnVarArr[i13];
                int i17 = zzbfVarZza.zza;
                int[] iArr5 = new int[i17];
                for (int i18 = 0; i18 < i17; i18++) {
                    iArr5[i18] = zzlnVar2.zzaa(zzbfVarZza.zza(i18));
                }
                iArr = iArr5;
            }
            int i19 = iArr2[i13];
            zzbfVarArr[i13][i19] = zzbfVarZza;
            iArr3[i13][i19] = iArr;
            iArr2[i13] = i19 + 1;
            i11++;
            i9 = 2;
        }
        zzwq[] zzwqVarArr = new zzwq[i9];
        String[] strArr = new String[i9];
        int[] iArr6 = new int[i9];
        int i20 = 0;
        while (i20 < i9) {
            int i21 = iArr2[i20];
            zzwqVarArr[i20] = new zzwq((zzbf[]) zzeo.zzb(zzbfVarArr[i20], i21));
            iArr3[i20] = (int[][]) zzeo.zzb(iArr3[i20], i21);
            strArr[i20] = zzlnVarArr[i20].zzS();
            iArr6[i20] = zzlnVarArr[i20].zza();
            i20++;
            i9 = 2;
        }
        int i22 = i9;
        zzyi zzyiVar = new zzyi(strArr, iArr6, zzwqVarArr, iArr4, iArr3, new zzwq((zzbf[]) zzeo.zzb(zzbfVarArr[i22], iArr2[i22])));
        Pair pairZzh = zzh(zzyiVar, iArr3, iArr4, zzupVar, zzbeVar);
        zzyk[] zzykVarArr = (zzyk[]) pairZzh.second;
        List[] listArr2 = new List[zzykVarArr.length];
        for (int i23 = 0; i23 < zzykVarArr.length; i23++) {
            zzyk zzykVar = zzykVarArr[i23];
            listArr2[i23] = zzykVar != null ? zzgjz.zzj(zzykVar) : zzgjz.zzi();
        }
        zzgjw zzgjwVar = new zzgjw();
        for (int i24 = 0; i24 < 2; i24++) {
            zzwq zzwqVarZzb = zzyiVar.zzb(i24);
            List list = listArr2[i24];
            int i25 = 0;
            while (i25 < zzwqVarZzb.zzb) {
                zzbf zzbfVarZza2 = zzwqVarZzb.zza(i25);
                boolean z10 = zzyiVar.zzd(i24, i25, false) != 0;
                int i26 = zzbfVarZza2.zza;
                int[] iArr7 = new int[i26];
                boolean[] zArr = new boolean[i26];
                int i27 = 0;
                while (i27 < i26) {
                    iArr7[i27] = zzyiVar.zzc(i24, i25, i27) & 7;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= list.size()) {
                            listArr = listArr2;
                            z7 = false;
                            break;
                        }
                        zzyk zzykVar2 = (zzyk) list.get(i28);
                        listArr = listArr2;
                        if (zzykVar2.zza().equals(zzbfVarZza2) && zzykVar2.zzg(i27) != -1) {
                            z7 = true;
                            break;
                        }
                        i28++;
                        listArr2 = listArr;
                    }
                    zArr[i27] = z7;
                    i27++;
                    listArr2 = listArr;
                }
                zzgjwVar.zzf(new zzbl(zzbfVarZza2, z10, iArr7, zArr));
                i25++;
                listArr2 = listArr2;
            }
        }
        zzwq zzwqVarZze = zzyiVar.zze();
        for (int i29 = 0; i29 < zzwqVarZze.zzb; i29++) {
            zzbf zzbfVarZza3 = zzwqVarZze.zza(i29);
            int i30 = zzbfVarZza3.zza;
            int[] iArr8 = new int[i30];
            Arrays.fill(iArr8, 0);
            zzgjwVar.zzf(new zzbl(zzbfVarZza3, false, iArr8, new boolean[i30]));
        }
        return new zzyn((zzlo[]) pairZzh.first, (zzyf[]) pairZzh.second, new zzbm(zzgjwVar.zzi()), zzyiVar);
    }
}
