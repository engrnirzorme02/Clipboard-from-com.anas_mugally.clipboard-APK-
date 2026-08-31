package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzhhn implements zzhlk {
    private final zzhhm zza;

    private zzhhn(zzhhm zzhhmVar) {
        zzhiu.zza(zzhhmVar, "output");
        this.zza = zzhhmVar;
        zzhhmVar.zze = this;
    }

    public static zzhhn zza(zzhhm zzhhmVar) {
        Object obj = zzhhmVar.zze;
        return obj != null ? (zzhhn) obj : new zzhhn(zzhhmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzA(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            zzhhmVar.zzs(i9);
            while (i8 < list.size()) {
                zzhhmVar.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z7) {
            while (i8 < zzhjgVar.size()) {
                this.zza.zzh(i7, zzhjgVar.zzc(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhjgVar.size(); i12++) {
            zzhjgVar.zzc(i12);
            i11 += 8;
        }
        zzhhmVar2.zzs(i11);
        while (i8 < zzhjgVar.size()) {
            zzhhmVar2.zzv(zzhjgVar.zzc(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzB(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhhy)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzM(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).getClass();
                i9 += 4;
            }
            zzhhmVar.zzs(i9);
            while (i8 < list.size()) {
                zzhhmVar.zzt(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        zzhhy zzhhyVar = (zzhhy) list;
        if (!z7) {
            while (i8 < zzhhyVar.size()) {
                this.zza.zzM(i7, Float.floatToRawIntBits(zzhhyVar.zzf(i8)));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhhyVar.size(); i12++) {
            zzhhyVar.zzf(i12);
            i11 += 4;
        }
        zzhhmVar2.zzs(i11);
        while (i8 < zzhhyVar.size()) {
            zzhhmVar2.zzt(Float.floatToRawIntBits(zzhhyVar.zzf(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzC(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhho)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).getClass();
                i9 += 8;
            }
            zzhhmVar.zzs(i9);
            while (i8 < list.size()) {
                zzhhmVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        zzhho zzhhoVar = (zzhho) list;
        if (!z7) {
            while (i8 < zzhhoVar.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(zzhhoVar.zzf(i8)));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhhoVar.size(); i12++) {
            zzhhoVar.zzf(i12);
            i11 += 8;
        }
        zzhhmVar2.zzs(i11);
        while (i8 < zzhhoVar.size()) {
            zzhhmVar2.zzv(Double.doubleToRawLongBits(zzhhoVar.zzf(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzD(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhii)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzK(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzB += zzhhm.zzB(((Integer) list.get(i9)).intValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i8 < list.size()) {
                zzhhmVar.zzr(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z7) {
            while (i8 < zzhiiVar.size()) {
                this.zza.zzK(i7, zzhiiVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhiiVar.size(); i10++) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i10));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i8 < zzhiiVar.size()) {
            zzhhmVar2.zzr(zzhiiVar.zzf(i8));
            i8++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzE(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhgr)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzi(i7, ((Boolean) list.get(i8)).booleanValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).getClass();
                i9++;
            }
            zzhhmVar.zzs(i9);
            while (i8 < list.size()) {
                zzhhmVar.zzq(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
            return;
        }
        zzhgr zzhgrVar = (zzhgr) list;
        if (!z7) {
            while (i8 < zzhgrVar.size()) {
                this.zza.zzi(i7, zzhgrVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhgrVar.size(); i12++) {
            zzhgrVar.zzf(i12);
            i11++;
        }
        zzhhmVar2.zzs(i11);
        while (i8 < zzhgrVar.size()) {
            zzhhmVar2.zzq(zzhgrVar.zzf(i8) ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzF(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof zzhjd)) {
            while (i8 < list.size()) {
                this.zza.zzj(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        zzhjd zzhjdVar = (zzhjd) list;
        while (i8 < list.size()) {
            Object objZzc = zzhjdVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzj(i7, (String) objZzc);
            } else {
                this.zza.zzk(i7, (zzhhb) objZzc);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzG(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zzk(i7, (zzhhb) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzH(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhii)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzL(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int iZzA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzA += zzhhm.zzA(((Integer) list.get(i9)).intValue());
            }
            zzhhmVar.zzs(iZzA);
            while (i8 < list.size()) {
                zzhhmVar.zzs(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z7) {
            while (i8 < zzhiiVar.size()) {
                this.zza.zzL(i7, zzhiiVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzhiiVar.size(); i10++) {
            iZzA2 += zzhhm.zzA(zzhiiVar.zzf(i10));
        }
        zzhhmVar2.zzs(iZzA2);
        while (i8 < zzhiiVar.size()) {
            zzhhmVar2.zzs(zzhiiVar.zzf(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzI(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhii)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzM(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            zzhhmVar.zzs(i9);
            while (i8 < list.size()) {
                zzhhmVar.zzt(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z7) {
            while (i8 < zzhiiVar.size()) {
                this.zza.zzM(i7, zzhiiVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhiiVar.size(); i12++) {
            zzhiiVar.zzf(i12);
            i11 += 4;
        }
        zzhhmVar2.zzs(i11);
        while (i8 < zzhiiVar.size()) {
            zzhhmVar2.zzt(zzhiiVar.zzf(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzJ(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            zzhhmVar.zzs(i9);
            while (i8 < list.size()) {
                zzhhmVar.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z7) {
            while (i8 < zzhjgVar.size()) {
                this.zza.zzh(i7, zzhjgVar.zzc(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhjgVar.size(); i12++) {
            zzhjgVar.zzc(i12);
            i11 += 8;
        }
        zzhhmVar2.zzs(i11);
        while (i8 < zzhjgVar.size()) {
            zzhhmVar2.zzv(zzhjgVar.zzc(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzK(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhii)) {
            if (!z7) {
                while (i8 < list.size()) {
                    zzhhm zzhhmVar = this.zza;
                    int iIntValue = ((Integer) list.get(i8)).intValue();
                    zzhhmVar.zzL(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar2 = this.zza;
            zzhhmVar2.zzJ(i7, 2);
            int iZzA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int iIntValue2 = ((Integer) list.get(i9)).intValue();
                iZzA += zzhhm.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzhhmVar2.zzs(iZzA);
            while (i8 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i8)).intValue();
                zzhhmVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i8++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z7) {
            while (i8 < zzhiiVar.size()) {
                zzhhm zzhhmVar3 = this.zza;
                int iZzf = zzhiiVar.zzf(i8);
                zzhhmVar3.zzL(i7, (iZzf >> 31) ^ (iZzf + iZzf));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar4 = this.zza;
        zzhhmVar4.zzJ(i7, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzhiiVar.size(); i10++) {
            int iZzf2 = zzhiiVar.zzf(i10);
            iZzA2 += zzhhm.zzA((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzhhmVar4.zzs(iZzA2);
        while (i8 < zzhiiVar.size()) {
            int iZzf3 = zzhiiVar.zzf(i8);
            zzhhmVar4.zzs((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzL(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    zzhhm zzhhmVar = this.zza;
                    long jLongValue = ((Long) list.get(i8)).longValue();
                    zzhhmVar.zzN(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar2 = this.zza;
            zzhhmVar2.zzJ(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long jLongValue2 = ((Long) list.get(i9)).longValue();
                iZzB += zzhhm.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzhhmVar2.zzs(iZzB);
            while (i8 < list.size()) {
                long jLongValue3 = ((Long) list.get(i8)).longValue();
                zzhhmVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i8++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z7) {
            while (i8 < zzhjgVar.size()) {
                zzhhm zzhhmVar3 = this.zza;
                long jZzc = zzhjgVar.zzc(i8);
                zzhhmVar3.zzN(i7, (jZzc >> 63) ^ (jZzc + jZzc));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar4 = this.zza;
        zzhhmVar4.zzJ(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhjgVar.size(); i10++) {
            long jZzc2 = zzhjgVar.zzc(i10);
            iZzB2 += zzhhm.zzB((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzhhmVar4.zzs(iZzB2);
        while (i8 < zzhjgVar.size()) {
            long jZzc3 = zzhjgVar.zzc(i8);
            zzhhmVar4.zzu((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzM(int i7, zzhjk zzhjkVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            zzhhmVar.zzs(zzhjl.zzc(zzhjkVar, entry.getKey(), entry.getValue()));
            zzhjl.zzb(zzhhmVar, zzhjkVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzb(int i7, int i8) {
        this.zza.zzM(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzc(int i7, long j7) {
        this.zza.zzN(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzd(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zze(int i7, float f7) {
        this.zza.zzM(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzf(int i7, double d7) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzg(int i7, int i8) {
        this.zza.zzK(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzh(int i7, long j7) {
        this.zza.zzN(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzi(int i7, int i8) {
        this.zza.zzK(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzj(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzk(int i7, int i8) {
        this.zza.zzM(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzl(int i7, boolean z7) {
        this.zza.zzi(i7, z7);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzm(int i7, String str) {
        this.zza.zzj(i7, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzn(int i7, zzhhb zzhhbVar) {
        this.zza.zzk(i7, zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzo(int i7, int i8) {
        this.zza.zzL(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzp(int i7, int i8) {
        this.zza.zzL(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzq(int i7, long j7) {
        this.zza.zzN(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzr(int i7, Object obj, zzhkk zzhkkVar) {
        zzhhm zzhhmVar = this.zza;
        zzhgk zzhgkVar = (zzhgk) obj;
        zzhhmVar.zzJ(i7, 2);
        zzhhmVar.zzs(zzhgkVar.zzaT(zzhkkVar));
        zzhkkVar.zzf(zzhgkVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzs(int i7, Object obj, zzhkk zzhkkVar) {
        zzhhm zzhhmVar = this.zza;
        zzhhmVar.zzJ(i7, 3);
        zzhkkVar.zzf((zzhgk) obj, this);
        zzhhmVar.zzJ(i7, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    @Deprecated
    public final void zzt(int i7) {
        this.zza.zzJ(i7, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    @Deprecated
    public final void zzu(int i7) {
        this.zza.zzJ(i7, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzv(int i7, Object obj) {
        if (obj instanceof zzhhb) {
            this.zza.zzo(i7, (zzhhb) obj);
        } else {
            this.zza.zzn(i7, (zzhjs) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzw(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhii)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzK(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzB += zzhhm.zzB(((Integer) list.get(i9)).intValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i8 < list.size()) {
                zzhhmVar.zzr(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z7) {
            while (i8 < zzhiiVar.size()) {
                this.zza.zzK(i7, zzhiiVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhiiVar.size(); i10++) {
            iZzB2 += zzhhm.zzB(zzhiiVar.zzf(i10));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i8 < zzhiiVar.size()) {
            zzhhmVar2.zzr(zzhiiVar.zzf(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzx(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhii)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzM(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            zzhhmVar.zzs(i9);
            while (i8 < list.size()) {
                zzhhmVar.zzt(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzhii zzhiiVar = (zzhii) list;
        if (!z7) {
            while (i8 < zzhiiVar.size()) {
                this.zza.zzM(i7, zzhiiVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzhiiVar.size(); i12++) {
            zzhiiVar.zzf(i12);
            i11 += 4;
        }
        zzhhmVar2.zzs(i11);
        while (i8 < zzhiiVar.size()) {
            zzhhmVar2.zzt(zzhiiVar.zzf(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzy(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzN(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzB += zzhhm.zzB(((Long) list.get(i9)).longValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i8 < list.size()) {
                zzhhmVar.zzu(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z7) {
            while (i8 < zzhjgVar.size()) {
                this.zza.zzN(i7, zzhjgVar.zzc(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhjgVar.size(); i10++) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i10));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i8 < zzhjgVar.size()) {
            zzhhmVar2.zzu(zzhjgVar.zzc(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zzz(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzhjg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzN(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzhhm zzhhmVar = this.zza;
            zzhhmVar.zzJ(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzB += zzhhm.zzB(((Long) list.get(i9)).longValue());
            }
            zzhhmVar.zzs(iZzB);
            while (i8 < list.size()) {
                zzhhmVar.zzu(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        if (!z7) {
            while (i8 < zzhjgVar.size()) {
                this.zza.zzN(i7, zzhjgVar.zzc(i8));
                i8++;
            }
            return;
        }
        zzhhm zzhhmVar2 = this.zza;
        zzhhmVar2.zzJ(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzhjgVar.size(); i10++) {
            iZzB2 += zzhhm.zzB(zzhjgVar.zzc(i10));
        }
        zzhhmVar2.zzs(iZzB2);
        while (i8 < zzhjgVar.size()) {
            zzhhmVar2.zzu(zzhjgVar.zzc(i8));
            i8++;
        }
    }
}
