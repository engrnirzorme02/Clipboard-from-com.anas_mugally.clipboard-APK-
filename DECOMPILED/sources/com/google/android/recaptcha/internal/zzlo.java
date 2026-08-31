package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzlo implements zzpy {
    private final zzln zza;

    private zzlo(zzln zzlnVar) {
        byte[] bArr = zznl.zzb;
        this.zza = zzlnVar;
        zzlnVar.zza = this;
    }

    public static zzlo zza(zzln zzlnVar) {
        zzlo zzloVar = zzlnVar.zza;
        return zzloVar != null ? zzloVar : new zzlo(zzlnVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzA(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z7) {
            while (i8 < zznxVar.size()) {
                this.zza.zzh(i7, zznxVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznxVar.size(); i12++) {
            zznxVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i8 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzB(int i7, int i8) {
        this.zza.zzs(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzC(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z7) {
                while (i8 < list.size()) {
                    zzln zzlnVar = this.zza;
                    int iIntValue = ((Integer) list.get(i8)).intValue();
                    zzlnVar.zzs(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int iZzA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int iIntValue2 = ((Integer) list.get(i9)).intValue();
                iZzA += zzln.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzA);
            while (i8 < list.size()) {
                zzln zzlnVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i8)).intValue();
                zzlnVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z7) {
            while (i8 < zzneVar.size()) {
                zzln zzlnVar3 = this.zza;
                int iZze = zzneVar.zze(i8);
                zzlnVar3.zzs(i7, (iZze >> 31) ^ (iZze + iZze));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzneVar.size(); i10++) {
            int iZze2 = zzneVar.zze(i10);
            iZzA2 += zzln.zzA((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzA2);
        while (i8 < zzneVar.size()) {
            zzln zzlnVar4 = this.zza;
            int iZze3 = zzneVar.zze(i8);
            zzlnVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzD(int i7, long j7) {
        this.zza.zzu(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzE(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    zzln zzlnVar = this.zza;
                    long jLongValue = ((Long) list.get(i8)).longValue();
                    zzlnVar.zzu(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long jLongValue2 = ((Long) list.get(i9)).longValue();
                iZzB += zzln.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzB);
            while (i8 < list.size()) {
                zzln zzlnVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i8)).longValue();
                zzlnVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z7) {
            while (i8 < zznxVar.size()) {
                zzln zzlnVar3 = this.zza;
                long jZze = zznxVar.zze(i8);
                zzlnVar3.zzu(i7, (jZze >> 63) ^ (jZze + jZze));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zznxVar.size(); i10++) {
            long jZze2 = zznxVar.zze(i10);
            iZzB2 += zzln.zzB((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzB2);
        while (i8 < zznxVar.size()) {
            zzln zzlnVar4 = this.zza;
            long jZze3 = zznxVar.zze(i8);
            zzlnVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzF(int i7) {
        this.zza.zzr(i7, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzG(int i7, String str) {
        this.zza.zzp(i7, str);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzH(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof zznu)) {
            while (i8 < list.size()) {
                this.zza.zzp(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        zznu zznuVar = (zznu) list;
        while (i8 < list.size()) {
            Object objZzc = zznuVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzp(i7, (String) objZzc);
            } else {
                this.zza.zze(i7, (zzle) objZzc);
            }
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzI(int i7, int i8) {
        this.zza.zzs(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzJ(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzs(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int iZzA = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzA += zzln.zzA(((Integer) list.get(i9)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i8 < list.size()) {
                this.zza.zzt(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z7) {
            while (i8 < zzneVar.size()) {
                this.zza.zzs(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int iZzA2 = 0;
        for (int i10 = 0; i10 < zzneVar.size(); i10++) {
            iZzA2 += zzln.zzA(zzneVar.zze(i10));
        }
        this.zza.zzt(iZzA2);
        while (i8 < zzneVar.size()) {
            this.zza.zzt(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzK(int i7, long j7) {
        this.zza.zzu(i7, j7);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzL(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzB += zzln.zzB(((Long) list.get(i9)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i8 < list.size()) {
                this.zza.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z7) {
            while (i8 < zznxVar.size()) {
                this.zza.zzu(i7, zznxVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zznxVar.size(); i10++) {
            iZzB2 += zzln.zzB(zznxVar.zze(i10));
        }
        this.zza.zzt(iZzB2);
        while (i8 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzb(int i7, boolean z7) {
        this.zza.zzd(i7, z7);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzc(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzkv)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzd(i7, ((Boolean) list.get(i8)).booleanValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).getClass();
                i9++;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
            return;
        }
        zzkv zzkvVar = (zzkv) list;
        if (!z7) {
            while (i8 < zzkvVar.size()) {
                this.zza.zzd(i7, zzkvVar.zzf(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzkvVar.size(); i12++) {
            zzkvVar.zzf(i12);
            i11++;
        }
        this.zza.zzt(i11);
        while (i8 < zzkvVar.size()) {
            this.zza.zzb(zzkvVar.zzf(i8) ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzd(int i7, zzle zzleVar) {
        this.zza.zze(i7, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zze(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zze(i7, (zzle) list.get(i8));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzf(int i7, double d7) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzg(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzmi)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).getClass();
                i9 += 8;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        zzmi zzmiVar = (zzmi) list;
        if (!z7) {
            while (i8 < zzmiVar.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(zzmiVar.zze(i8)));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmiVar.size(); i12++) {
            zzmiVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i8 < zzmiVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzmiVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzr(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzi(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzj(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzB += zzln.zzB(((Integer) list.get(i9)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i8 < list.size()) {
                this.zza.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z7) {
            while (i8 < zzneVar.size()) {
                this.zza.zzj(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzneVar.size(); i10++) {
            iZzB2 += zzln.zzB(zzneVar.zze(i10));
        }
        this.zza.zzt(iZzB2);
        while (i8 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzk(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzl(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z7) {
            while (i8 < zzneVar.size()) {
                this.zza.zzf(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzneVar.size(); i12++) {
            zzneVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i8 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzm(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzn(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzi(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z7) {
            while (i8 < zznxVar.size()) {
                this.zza.zzh(i7, zznxVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zznxVar.size(); i12++) {
            zznxVar.zze(i12);
            i11 += 8;
        }
        this.zza.zzt(i11);
        while (i8 < zznxVar.size()) {
            this.zza.zzi(zznxVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzo(int i7, float f7) {
        this.zza.zzf(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzp(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzmv)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).getClass();
                i9 += 4;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        zzmv zzmvVar = (zzmv) list;
        if (!z7) {
            while (i8 < zzmvVar.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(zzmvVar.zze(i8)));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzmvVar.size(); i12++) {
            zzmvVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i8 < zzmvVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzmvVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzq(int i7, Object obj, zzow zzowVar) {
        zzln zzlnVar = this.zza;
        zzlnVar.zzr(i7, 3);
        zzowVar.zzj((zzoi) obj, zzlnVar.zza);
        zzlnVar.zzr(i7, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzr(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzs(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzB += zzln.zzB(((Integer) list.get(i9)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i8 < list.size()) {
                this.zza.zzk(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z7) {
            while (i8 < zzneVar.size()) {
                this.zza.zzj(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zzneVar.size(); i10++) {
            iZzB2 += zzln.zzB(zzneVar.zze(i10));
        }
        this.zza.zzt(iZzB2);
        while (i8 < zzneVar.size()) {
            this.zza.zzk(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzt(int i7, long j7) {
        this.zza.zzu(i7, j7);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzu(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zznx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzu(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int iZzB = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzB += zzln.zzB(((Long) list.get(i9)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i8 < list.size()) {
                this.zza.zzv(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zznx zznxVar = (zznx) list;
        if (!z7) {
            while (i8 < zznxVar.size()) {
                this.zza.zzu(i7, zznxVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int iZzB2 = 0;
        for (int i10 = 0; i10 < zznxVar.size(); i10++) {
            iZzB2 += zzln.zzB(zznxVar.zze(i10));
        }
        this.zza.zzt(iZzB2);
        while (i8 < zznxVar.size()) {
            this.zza.zzv(zznxVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzv(int i7, Object obj, zzow zzowVar) {
        this.zza.zzm(i7, (zzoi) obj, zzowVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzw(int i7, Object obj) {
        if (obj instanceof zzle) {
            this.zza.zzo(i7, (zzle) obj);
        } else {
            this.zza.zzn(i7, (zzoi) obj);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzx(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzy(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzne)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzr(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            this.zza.zzt(i9);
            while (i8 < list.size()) {
                this.zza.zzg(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzne zzneVar = (zzne) list;
        if (!z7) {
            while (i8 < zzneVar.size()) {
                this.zza.zzf(i7, zzneVar.zze(i8));
                i8++;
            }
            return;
        }
        this.zza.zzr(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzneVar.size(); i12++) {
            zzneVar.zze(i12);
            i11 += 4;
        }
        this.zza.zzt(i11);
        while (i8 < zzneVar.size()) {
            this.zza.zzg(zzneVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpy
    public final void zzz(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }
}
