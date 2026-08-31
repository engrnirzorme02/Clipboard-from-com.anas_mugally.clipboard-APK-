package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzln implements zzov {
    private final zzlm zza;

    private zzln(zzlm zzlmVar) {
        byte[] bArr = zzmp.zzb;
        this.zza = zzlmVar;
        zzlmVar.zza = this;
    }

    public static zzln zza(zzlm zzlmVar) {
        zzln zzlnVar = zzlmVar.zza;
        return zzlnVar != null ? zzlnVar : new zzln(zzlmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzA(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzna)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            zzlmVar.zzr(i9);
            while (i8 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z7) {
            while (i8 < zznaVar.size()) {
                this.zza.zzf(i7, zznaVar.zzc(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznaVar.size(); i12++) {
            zznaVar.zzc(i12);
            i11 += 8;
        }
        zzlmVar2.zzr(i11);
        while (i8 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzB(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzly)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzd(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).getClass();
                i9 += 4;
            }
            zzlmVar.zzr(i9);
            while (i8 < list.size()) {
                zzlmVar.zzs(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        zzly zzlyVar = (zzly) list;
        if (!z7) {
            while (i8 < zzlyVar.size()) {
                this.zza.zzd(i7, Float.floatToRawIntBits(zzlyVar.zze(i8)));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzlyVar.size(); i12++) {
            zzlyVar.zze(i12);
            i11 += 4;
        }
        zzlmVar2.zzr(i11);
        while (i8 < zzlyVar.size()) {
            zzlmVar2.zzs(Float.floatToRawIntBits(zzlyVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzC(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzlo)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).getClass();
                i9 += 8;
            }
            zzlmVar.zzr(i9);
            while (i8 < list.size()) {
                zzlmVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        zzlo zzloVar = (zzlo) list;
        if (!z7) {
            while (i8 < zzloVar.size()) {
                this.zza.zzf(i7, Double.doubleToRawLongBits(zzloVar.zze(i8)));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzloVar.size(); i12++) {
            zzloVar.zze(i12);
            i11 += 8;
        }
        zzlmVar2.zzr(i11);
        while (i8 < zzloVar.size()) {
            zzlmVar2.zzu(Double.doubleToRawLongBits(zzloVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzD(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzmg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzb(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int iZzA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzA += zzlm.zzA(((Integer) list.get(i9)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i8 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z7) {
            while (i8 < zzmgVar.size()) {
                this.zza.zzb(i7, zzmgVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzmgVar.size(); i10++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i10));
        }
        zzlmVar2.zzr(iZzA2);
        while (i8 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i8));
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
    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzE(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzky)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzg(i7, ((Boolean) list.get(i8)).booleanValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).getClass();
                i9++;
            }
            zzlmVar.zzr(i9);
            while (i8 < list.size()) {
                zzlmVar.zzp(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
            return;
        }
        zzky zzkyVar = (zzky) list;
        if (!z7) {
            while (i8 < zzkyVar.size()) {
                this.zza.zzg(i7, zzkyVar.zze(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzkyVar.size(); i12++) {
            zzkyVar.zze(i12);
            i11++;
        }
        zzlmVar2.zzr(i11);
        while (i8 < zzkyVar.size()) {
            zzlmVar2.zzp(zzkyVar.zze(i8) ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzF(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof zzmx)) {
            while (i8 < list.size()) {
                this.zza.zzh(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        zzmx zzmxVar = (zzmx) list;
        while (i8 < list.size()) {
            Object objZzc = zzmxVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzh(i7, (String) objZzc);
            } else {
                this.zza.zzi(i7, (zzlh) objZzc);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzG(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zzi(i7, (zzlh) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzH(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzmg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzc(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int iZzz = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzz += zzlm.zzz(((Integer) list.get(i9)).intValue());
            }
            zzlmVar.zzr(iZzz);
            while (i8 < list.size()) {
                zzlmVar.zzr(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z7) {
            while (i8 < zzmgVar.size()) {
                this.zza.zzc(i7, zzmgVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int iZzz2 = 0;
        for (int i10 = 0; i10 < zzmgVar.size(); i10++) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i10));
        }
        zzlmVar2.zzr(iZzz2);
        while (i8 < zzmgVar.size()) {
            zzlmVar2.zzr(zzmgVar.zzf(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzI(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzmg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzd(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            zzlmVar.zzr(i9);
            while (i8 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z7) {
            while (i8 < zzmgVar.size()) {
                this.zza.zzd(i7, zzmgVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmgVar.size(); i12++) {
            zzmgVar.zzf(i12);
            i11 += 4;
        }
        zzlmVar2.zzr(i11);
        while (i8 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzJ(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzna)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            zzlmVar.zzr(i9);
            while (i8 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z7) {
            while (i8 < zznaVar.size()) {
                this.zza.zzf(i7, zznaVar.zzc(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznaVar.size(); i12++) {
            zznaVar.zzc(i12);
            i11 += 8;
        }
        zzlmVar2.zzr(i11);
        while (i8 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzK(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzmg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    int iIntValue = ((Integer) list.get(i8)).intValue();
                    zzlmVar.zzc(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i8++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i7, 2);
            int iZzz = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int iIntValue2 = ((Integer) list.get(i9)).intValue();
                iZzz += zzlm.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzlmVar2.zzr(iZzz);
            while (i8 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i8)).intValue();
                zzlmVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i8++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z7) {
            while (i8 < zzmgVar.size()) {
                zzlm zzlmVar3 = this.zza;
                int iZzf = zzmgVar.zzf(i8);
                zzlmVar3.zzc(i7, (iZzf >> 31) ^ (iZzf + iZzf));
                i8++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i7, 2);
        int iZzz2 = 0;
        for (int i10 = 0; i10 < zzmgVar.size(); i10++) {
            int iZzf2 = zzmgVar.zzf(i10);
            iZzz2 += zzlm.zzz((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzlmVar4.zzr(iZzz2);
        while (i8 < zzmgVar.size()) {
            int iZzf3 = zzmgVar.zzf(i8);
            zzlmVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzL(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzna)) {
            if (!z7) {
                while (i8 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    long jLongValue = ((Long) list.get(i8)).longValue();
                    zzlmVar.zze(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i8++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i7, 2);
            int iZzA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long jLongValue2 = ((Long) list.get(i9)).longValue();
                iZzA += zzlm.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzlmVar2.zzr(iZzA);
            while (i8 < list.size()) {
                long jLongValue3 = ((Long) list.get(i8)).longValue();
                zzlmVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i8++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z7) {
            while (i8 < zznaVar.size()) {
                zzlm zzlmVar3 = this.zza;
                long jZzc = zznaVar.zzc(i8);
                zzlmVar3.zze(i7, (jZzc >> 63) ^ (jZzc + jZzc));
                i8++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i7, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zznaVar.size(); i10++) {
            long jZzc2 = zznaVar.zzc(i10);
            iZzA2 += zzlm.zzA((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzlmVar4.zzr(iZzA2);
        while (i8 < zznaVar.size()) {
            long jZzc3 = zznaVar.zzc(i8);
            zzlmVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzM(int i7, zzne zzneVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            zzlmVar.zzr(zznf.zzc(zzneVar, entry.getKey(), entry.getValue()));
            zznf.zzb(zzlmVar, zzneVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzb(int i7, int i8) {
        this.zza.zzd(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzc(int i7, long j7) {
        this.zza.zze(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzd(int i7, long j7) {
        this.zza.zzf(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zze(int i7, float f7) {
        this.zza.zzd(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzf(int i7, double d7) {
        this.zza.zzf(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzg(int i7, int i8) {
        this.zza.zzb(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzh(int i7, long j7) {
        this.zza.zze(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzi(int i7, int i8) {
        this.zza.zzb(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzj(int i7, long j7) {
        this.zza.zzf(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzk(int i7, int i8) {
        this.zza.zzd(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzl(int i7, boolean z7) {
        this.zza.zzg(i7, z7);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzm(int i7, String str) {
        this.zza.zzh(i7, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzn(int i7, zzlh zzlhVar) {
        this.zza.zzi(i7, zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzo(int i7, int i8) {
        this.zza.zzc(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzp(int i7, int i8) {
        this.zza.zzc(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzq(int i7, long j7) {
        this.zza.zze(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzr(int i7, Object obj, zznx zznxVar) {
        this.zza.zzl(i7, (zznm) obj, zznxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzs(int i7, Object obj, zznx zznxVar) {
        zzlm zzlmVar = this.zza;
        zzlmVar.zza(i7, 3);
        zznxVar.zzf((zznm) obj, zzlmVar.zza);
        zzlmVar.zza(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzt(int i7) {
        this.zza.zza(i7, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzu(int i7) {
        this.zza.zza(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzv(int i7, Object obj) {
        if (obj instanceof zzlh) {
            this.zza.zzn(i7, (zzlh) obj);
        } else {
            this.zza.zzm(i7, (zznm) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzw(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzmg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzb(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int iZzA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzA += zzlm.zzA(((Integer) list.get(i9)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i8 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z7) {
            while (i8 < zzmgVar.size()) {
                this.zza.zzb(i7, zzmgVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzmgVar.size(); i10++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i10));
        }
        zzlmVar2.zzr(iZzA2);
        while (i8 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzx(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzmg)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzd(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            zzlmVar.zzr(i9);
            while (i8 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z7) {
            while (i8 < zzmgVar.size()) {
                this.zza.zzd(i7, zzmgVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmgVar.size(); i12++) {
            zzmgVar.zzf(i12);
            i11 += 4;
        }
        zzlmVar2.zzr(i11);
        while (i8 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzy(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzna)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zze(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int iZzA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzA += zzlm.zzA(((Long) list.get(i9)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i8 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z7) {
            while (i8 < zznaVar.size()) {
                this.zza.zze(i7, zznaVar.zzc(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zznaVar.size(); i10++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i10));
        }
        zzlmVar2.zzr(iZzA2);
        while (i8 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzz(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzna)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zze(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i7, 2);
            int iZzA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzA += zzlm.zzA(((Long) list.get(i9)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i8 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z7) {
            while (i8 < zznaVar.size()) {
                this.zza.zze(i7, zznaVar.zzc(i8));
                i8++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i7, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zznaVar.size(); i10++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i10));
        }
        zzlmVar2.zzr(iZzA2);
        while (i8 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i8));
            i8++;
        }
    }
}
