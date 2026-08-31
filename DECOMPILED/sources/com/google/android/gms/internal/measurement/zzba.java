package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzba {
    public static zzao zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
        byte b7;
        double dZzi;
        String strZzc;
        double d7;
        double dZzh;
        zzae zzaeVar2;
        zzae zzaeVar3;
        switch (str) {
            case "toString":
                b7 = 18;
                break;
            case "concat":
                b7 = 0;
                break;
            case "filter":
                b7 = 2;
                break;
            case "reduce":
                b7 = 10;
                break;
            case "splice":
                b7 = 17;
                break;
            case "forEach":
                b7 = 3;
                break;
            case "lastIndexOf":
                b7 = 6;
                break;
            case "unshift":
                b7 = 19;
                break;
            case "map":
                b7 = 7;
                break;
            case "pop":
                b7 = 8;
                break;
            case "join":
                b7 = 5;
                break;
            case "push":
                b7 = 9;
                break;
            case "some":
                b7 = 15;
                break;
            case "sort":
                b7 = 16;
                break;
            case "every":
                b7 = 1;
                break;
            case "shift":
                b7 = 13;
                break;
            case "slice":
                b7 = 14;
                break;
            case "reduceRight":
                b7 = 11;
                break;
            case "reverse":
                b7 = 12;
                break;
            case "indexOf":
                b7 = 4;
                break;
            default:
                b7 = -1;
                break;
        }
        zzai zzaiVar = null;
        switch (b7) {
            case 0:
                zzae zzaeVar4 = (zzae) zzaeVar.zzt();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzao zzaoVarZza = zzgVar.zza((zzao) it.next());
                        if (zzaoVarZza instanceof zzag) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int iZzh = zzaeVar4.zzh();
                        if (zzaoVarZza instanceof zzae) {
                            zzae zzaeVar5 = (zzae) zzaoVarZza;
                            Iterator itZzg = zzaeVar5.zzg();
                            while (itZzg.hasNext()) {
                                Integer num = (Integer) itZzg.next();
                                zzaeVar4.zzn(num.intValue() + iZzh, zzaeVar5.zzl(num.intValue()));
                            }
                        } else {
                            zzaeVar4.zzn(iZzh, zzaoVarZza);
                        }
                    }
                }
                return zzaeVar4;
            case 1:
                zzh.zza("every", 1, list);
                zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
                if (!(zzaoVarZza2 instanceof zzan)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzh() != 0 && zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza2, Boolean.FALSE, Boolean.TRUE).zzh() != zzaeVar.zzh()) {
                    return zzao.zzl;
                }
                return zzao.zzk;
            case 2:
                zzh.zza("filter", 1, list);
                zzao zzaoVarZza3 = zzgVar.zza((zzao) list.get(0));
                if (!(zzaoVarZza3 instanceof zzan)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzi() == 0) {
                    return new zzae();
                }
                zzae zzaeVar6 = (zzae) zzaeVar.zzt();
                zzae zzaeVarZzc = zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza3, null, Boolean.TRUE);
                zzae zzaeVar7 = new zzae();
                Iterator itZzg2 = zzaeVarZzc.zzg();
                while (itZzg2.hasNext()) {
                    zzaeVar7.zzn(zzaeVar7.zzh(), zzaeVar6.zzl(((Integer) itZzg2.next()).intValue()));
                }
                return zzaeVar7;
            case 3:
                zzh.zza("forEach", 1, list);
                zzao zzaoVarZza4 = zzgVar.zza((zzao) list.get(0));
                if (!(zzaoVarZza4 instanceof zzan)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzi() == 0) {
                    return zzao.zzf;
                }
                zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza4, null, null);
                return zzao.zzf;
            case 4:
                zzh.zzc("indexOf", 2, list);
                zzao zzaoVarZza5 = zzao.zzf;
                if (!list.isEmpty()) {
                    zzaoVarZza5 = zzgVar.zza((zzao) list.get(0));
                }
                if (list.size() > 1) {
                    dZzi = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                    if (dZzi >= zzaeVar.zzh()) {
                        return new zzah(Double.valueOf(-1.0d));
                    }
                    if (dZzi < 0.0d) {
                        dZzi += (double) zzaeVar.zzh();
                    }
                } else {
                    dZzi = 0.0d;
                }
                Iterator itZzg3 = zzaeVar.zzg();
                while (itZzg3.hasNext()) {
                    int iIntValue = ((Integer) itZzg3.next()).intValue();
                    double d8 = iIntValue;
                    if (d8 >= dZzi && zzh.zzf(zzaeVar.zzl(iIntValue), zzaoVarZza5)) {
                        return new zzah(Double.valueOf(d8));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 5:
                zzh.zzc("join", 1, list);
                if (zzaeVar.zzh() == 0) {
                    return zzao.zzm;
                }
                if (list.isEmpty()) {
                    strZzc = ",";
                } else {
                    zzao zzaoVarZza6 = zzgVar.zza((zzao) list.get(0));
                    strZzc = ((zzaoVarZza6 instanceof zzam) || (zzaoVarZza6 instanceof zzat)) ? "" : zzaoVarZza6.zzc();
                }
                return new zzas(zzaeVar.zzs(strZzc));
            case 6:
                zzh.zzc("lastIndexOf", 2, list);
                zzao zzaoVarZza7 = zzao.zzf;
                if (!list.isEmpty()) {
                    zzaoVarZza7 = zzgVar.zza((zzao) list.get(0));
                }
                int iZzh2 = zzaeVar.zzh() - 1;
                if (list.size() > 1) {
                    zzao zzaoVarZza8 = zzgVar.zza((zzao) list.get(1));
                    dZzh = Double.isNaN(zzaoVarZza8.zzd().doubleValue()) ? zzaeVar.zzh() - 1 : zzh.zzi(zzaoVarZza8.zzd().doubleValue());
                    d7 = 0.0d;
                    if (dZzh < 0.0d) {
                        dZzh += (double) zzaeVar.zzh();
                    }
                } else {
                    d7 = 0.0d;
                    dZzh = iZzh2;
                }
                if (dZzh < d7) {
                    return new zzah(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(zzaeVar.zzh(), dZzh); iMin >= 0; iMin--) {
                    if (zzaeVar.zzo(iMin) && zzh.zzf(zzaeVar.zzl(iMin), zzaoVarZza7)) {
                        return new zzah(Double.valueOf(iMin));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 7:
                zzh.zza("map", 1, list);
                zzao zzaoVarZza9 = zzgVar.zza((zzao) list.get(0));
                if (zzaoVarZza9 instanceof zzan) {
                    return zzaeVar.zzh() == 0 ? new zzae() : zzc(zzaeVar, zzgVar, (zzan) zzaoVarZza9, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 8:
                zzh.zza("pop", 0, list);
                int iZzh3 = zzaeVar.zzh();
                if (iZzh3 == 0) {
                    return zzao.zzf;
                }
                int i7 = iZzh3 - 1;
                zzao zzaoVarZzl = zzaeVar.zzl(i7);
                zzaeVar.zzr(i7);
                return zzaoVarZzl;
            case 9:
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaeVar.zzn(zzaeVar.zzh(), zzgVar.zza((zzao) it2.next()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzh()));
            case 10:
                return zzb(zzaeVar, zzgVar, list, true);
            case 11:
                return zzb(zzaeVar, zzgVar, list, false);
            case 12:
                zzaeVar2 = zzaeVar;
                zzh.zza("reverse", 0, list);
                int iZzh4 = zzaeVar2.zzh();
                if (iZzh4 != 0) {
                    for (int i8 = 0; i8 < iZzh4 / 2; i8++) {
                        if (zzaeVar2.zzo(i8)) {
                            zzao zzaoVarZzl2 = zzaeVar2.zzl(i8);
                            zzaeVar2.zzn(i8, null);
                            int i9 = (iZzh4 - 1) - i8;
                            if (zzaeVar2.zzo(i9)) {
                                zzaeVar2.zzn(i8, zzaeVar2.zzl(i9));
                            }
                            zzaeVar2.zzn(i9, zzaoVarZzl2);
                        }
                    }
                }
                return zzaeVar2;
            case 13:
                zzh.zza("shift", 0, list);
                if (zzaeVar.zzh() == 0) {
                    return zzao.zzf;
                }
                zzao zzaoVarZzl3 = zzaeVar.zzl(0);
                zzaeVar.zzr(0);
                return zzaoVarZzl3;
            case 14:
                zzh.zzc("slice", 2, list);
                if (list.isEmpty()) {
                    return zzaeVar.zzt();
                }
                double dZzh2 = zzaeVar.zzh();
                double dZzi2 = zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                double dMax = dZzi2 < 0.0d ? Math.max(dZzi2 + dZzh2, 0.0d) : Math.min(dZzi2, dZzh2);
                if (list.size() == 2) {
                    double dZzi3 = zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                    dZzh2 = dZzi3 < 0.0d ? Math.max(dZzh2 + dZzi3, 0.0d) : Math.min(dZzh2, dZzi3);
                }
                zzae zzaeVar8 = new zzae();
                for (int i10 = (int) dMax; i10 < dZzh2; i10++) {
                    zzaeVar8.zzn(zzaeVar8.zzh(), zzaeVar.zzl(i10));
                }
                return zzaeVar8;
            case 15:
                zzh.zza("some", 1, list);
                zzao zzaoVarZza10 = zzgVar.zza((zzao) list.get(0));
                if (!(zzaoVarZza10 instanceof zzai)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzh() == 0) {
                    return zzao.zzl;
                }
                zzai zzaiVar2 = (zzai) zzaoVarZza10;
                Iterator itZzg4 = zzaeVar.zzg();
                while (itZzg4.hasNext()) {
                    int iIntValue2 = ((Integer) itZzg4.next()).intValue();
                    if (zzaeVar.zzo(iIntValue2) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zzl(iIntValue2), new zzah(Double.valueOf(iIntValue2)), zzaeVar)).zze().booleanValue()) {
                        return zzao.zzk;
                    }
                }
                return zzao.zzl;
            case 16:
                zzaeVar2 = zzaeVar;
                zzh.zzc("sort", 1, list);
                if (zzaeVar2.zzh() >= 2) {
                    List listZzb = zzaeVar2.zzb();
                    if (!list.isEmpty()) {
                        zzao zzaoVarZza11 = zzgVar.zza((zzao) list.get(0));
                        if (!(zzaoVarZza11 instanceof zzai)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzaiVar = (zzai) zzaoVarZza11;
                    }
                    Collections.sort(listZzb, new zzaz(zzaiVar, zzgVar));
                    zzaeVar2.zzp();
                    Iterator it3 = listZzb.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        zzaeVar2.zzn(i11, (zzao) it3.next());
                        i11++;
                    }
                }
                return zzaeVar2;
            case 17:
                if (list.isEmpty()) {
                    return new zzae();
                }
                int iZzi = (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                if (iZzi < 0) {
                    iZzi = Math.max(0, iZzi + zzaeVar.zzh());
                } else if (iZzi > zzaeVar.zzh()) {
                    iZzi = zzaeVar.zzh();
                }
                int iZzh5 = zzaeVar.zzh();
                zzae zzaeVar9 = new zzae();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) zzh.zzi(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
                    if (iMax > 0) {
                        for (int i12 = iZzi; i12 < Math.min(iZzh5, iZzi + iMax); i12++) {
                            zzaeVar9.zzn(zzaeVar9.zzh(), zzaeVar.zzl(iZzi));
                            zzaeVar.zzr(iZzi);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i13 = 2; i13 < list.size(); i13++) {
                            zzao zzaoVarZza12 = zzgVar.zza((zzao) list.get(i13));
                            if (zzaoVarZza12 instanceof zzag) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            zzaeVar.zzq((iZzi + i13) - 2, zzaoVarZza12);
                        }
                    }
                } else {
                    while (iZzi < iZzh5) {
                        zzaeVar9.zzn(zzaeVar9.zzh(), zzaeVar.zzl(iZzi));
                        zzaeVar.zzn(iZzi, null);
                        iZzi++;
                    }
                }
                return zzaeVar9;
            case 18:
                zzh.zza("toString", 0, list);
                return new zzas(zzaeVar.zzs(","));
            case 19:
                if (list.isEmpty()) {
                    zzaeVar3 = zzaeVar;
                } else {
                    zzae zzaeVar10 = new zzae();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        zzao zzaoVarZza13 = zzgVar.zza((zzao) it4.next());
                        if (zzaoVarZza13 instanceof zzag) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        zzaeVar10.zzn(zzaeVar10.zzh(), zzaoVarZza13);
                    }
                    int iZzh6 = zzaeVar10.zzh();
                    Iterator itZzg5 = zzaeVar.zzg();
                    while (itZzg5.hasNext()) {
                        Integer num2 = (Integer) itZzg5.next();
                        zzaeVar10.zzn(num2.intValue() + iZzh6, zzaeVar.zzl(num2.intValue()));
                    }
                    zzaeVar3 = zzaeVar;
                    zzaeVar3.zzp();
                    Iterator itZzg6 = zzaeVar10.zzg();
                    while (itZzg6.hasNext()) {
                        Integer num3 = (Integer) itZzg6.next();
                        zzaeVar3.zzn(num3.intValue(), zzaeVar10.zzl(num3.intValue()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar3.zzh()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzao zzb(zzae zzaeVar, zzg zzgVar, List list, boolean z7) {
        zzao zzaoVarZza;
        zzh.zzb("reduce", 1, list);
        zzh.zzc("reduce", 2, list);
        zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(0));
        if (!(zzaoVarZza2 instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzaoVarZza = zzgVar.zza((zzao) list.get(1));
            if (zzaoVarZza instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzaeVar.zzh() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzaoVarZza = null;
        }
        zzai zzaiVar = (zzai) zzaoVarZza2;
        int iZzh = zzaeVar.zzh();
        int i7 = z7 ? 0 : iZzh - 1;
        int i8 = z7 ? iZzh - 1 : 0;
        int i9 = true == z7 ? 1 : -1;
        if (zzaoVarZza == null) {
            zzaoVarZza = zzaeVar.zzl(i7);
            i7 += i9;
        }
        while ((i8 - i7) * i9 >= 0) {
            if (zzaeVar.zzo(i7)) {
                zzaoVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaoVarZza, zzaeVar.zzl(i7), new zzah(Double.valueOf(i7)), zzaeVar));
                if (zzaoVarZza instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i7 += i9;
            } else {
                i7 += i9;
            }
        }
        return zzaoVarZza;
    }

    private static zzae zzc(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator itZzg = zzaeVar.zzg();
        while (itZzg.hasNext()) {
            int iIntValue = ((Integer) itZzg.next()).intValue();
            if (zzaeVar.zzo(iIntValue)) {
                zzao zzaoVarZza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zzl(iIntValue), new zzah(Double.valueOf(iIntValue)), zzaeVar));
                if (zzaoVarZza.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || zzaoVarZza.zze().equals(bool2)) {
                    zzaeVar2.zzn(iIntValue, zzaoVarZza);
                }
            }
        }
        return zzaeVar2;
    }
}
