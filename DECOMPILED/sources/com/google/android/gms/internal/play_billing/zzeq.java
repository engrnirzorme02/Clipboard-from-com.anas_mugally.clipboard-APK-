package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzeq implements zzhu {
    private final zzep zza;

    private zzeq(zzep zzepVar) {
        byte[] bArr = zzfo.zzb;
        this.zza = zzepVar;
        zzepVar.zza = this;
    }

    public static zzeq zza(zzep zzepVar) {
        zzeq zzeqVar = zzepVar.zza;
        return zzeqVar != null ? zzeqVar : new zzeq(zzepVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzA(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzga)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzi(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            zzepVar.zzv(i9);
            while (i8 < list.size()) {
                zzepVar.zzj(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z7) {
            while (i8 < zzgaVar.size()) {
                this.zza.zzi(i7, zzgaVar.zze(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgaVar.size(); i12++) {
            zzgaVar.zze(i12);
            i11 += 8;
        }
        zzepVar2.zzv(i11);
        while (i8 < zzgaVar.size()) {
            zzepVar2.zzj(zzgaVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzB(int i7, int i8) {
        this.zza.zzu(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzC(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzfj)) {
            if (!z7) {
                while (i8 < list.size()) {
                    zzep zzepVar = this.zza;
                    int iIntValue = ((Integer) list.get(i8)).intValue();
                    zzepVar.zzu(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i8++;
                }
                return;
            }
            zzep zzepVar2 = this.zza;
            zzepVar2.zzt(i7, 2);
            int iZzC = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int iIntValue2 = ((Integer) list.get(i9)).intValue();
                iZzC += zzep.zzC((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzepVar2.zzv(iZzC);
            while (i8 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i8)).intValue();
                zzepVar2.zzv((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i8++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z7) {
            while (i8 < zzfjVar.size()) {
                zzep zzepVar3 = this.zza;
                int iZze = zzfjVar.zze(i8);
                zzepVar3.zzu(i7, (iZze >> 31) ^ (iZze + iZze));
                i8++;
            }
            return;
        }
        zzep zzepVar4 = this.zza;
        zzepVar4.zzt(i7, 2);
        int iZzC2 = 0;
        for (int i10 = 0; i10 < zzfjVar.size(); i10++) {
            int iZze2 = zzfjVar.zze(i10);
            iZzC2 += zzep.zzC((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        zzepVar4.zzv(iZzC2);
        while (i8 < zzfjVar.size()) {
            int iZze3 = zzfjVar.zze(i8);
            zzepVar4.zzv((iZze3 >> 31) ^ (iZze3 + iZze3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzD(int i7, long j7) {
        this.zza.zzw(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzE(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzga)) {
            if (!z7) {
                while (i8 < list.size()) {
                    zzep zzepVar = this.zza;
                    long jLongValue = ((Long) list.get(i8)).longValue();
                    zzepVar.zzw(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i8++;
                }
                return;
            }
            zzep zzepVar2 = this.zza;
            zzepVar2.zzt(i7, 2);
            int iZzD = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long jLongValue2 = ((Long) list.get(i9)).longValue();
                iZzD += zzep.zzD((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzepVar2.zzv(iZzD);
            while (i8 < list.size()) {
                long jLongValue3 = ((Long) list.get(i8)).longValue();
                zzepVar2.zzx((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i8++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z7) {
            while (i8 < zzgaVar.size()) {
                zzep zzepVar3 = this.zza;
                long jZze = zzgaVar.zze(i8);
                zzepVar3.zzw(i7, (jZze >> 63) ^ (jZze + jZze));
                i8++;
            }
            return;
        }
        zzep zzepVar4 = this.zza;
        zzepVar4.zzt(i7, 2);
        int iZzD2 = 0;
        for (int i10 = 0; i10 < zzgaVar.size(); i10++) {
            long jZze2 = zzgaVar.zze(i10);
            iZzD2 += zzep.zzD((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        zzepVar4.zzv(iZzD2);
        while (i8 < zzgaVar.size()) {
            long jZze3 = zzgaVar.zze(i8);
            zzepVar4.zzx((jZze3 >> 63) ^ (jZze3 + jZze3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    @Deprecated
    public final void zzF(int i7) {
        this.zza.zzt(i7, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzG(int i7, String str) {
        this.zza.zzr(i7, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzH(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof zzfx)) {
            while (i8 < list.size()) {
                this.zza.zzr(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        zzfx zzfxVar = (zzfx) list;
        while (i8 < list.size()) {
            Object objZza = zzfxVar.zza();
            if (objZza instanceof String) {
                this.zza.zzr(i7, (String) objZza);
            } else {
                this.zza.zze(i7, (zzei) objZza);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzI(int i7, int i8) {
        this.zza.zzu(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzJ(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzfj)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzu(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int iZzC = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzC += zzep.zzC(((Integer) list.get(i9)).intValue());
            }
            zzepVar.zzv(iZzC);
            while (i8 < list.size()) {
                zzepVar.zzv(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z7) {
            while (i8 < zzfjVar.size()) {
                this.zza.zzu(i7, zzfjVar.zze(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int iZzC2 = 0;
        for (int i10 = 0; i10 < zzfjVar.size(); i10++) {
            iZzC2 += zzep.zzC(zzfjVar.zze(i10));
        }
        zzepVar2.zzv(iZzC2);
        while (i8 < zzfjVar.size()) {
            zzepVar2.zzv(zzfjVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzK(int i7, long j7) {
        this.zza.zzw(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzL(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzga)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzw(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int iZzD = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzD += zzep.zzD(((Long) list.get(i9)).longValue());
            }
            zzepVar.zzv(iZzD);
            while (i8 < list.size()) {
                zzepVar.zzx(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z7) {
            while (i8 < zzgaVar.size()) {
                this.zza.zzw(i7, zzgaVar.zze(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int iZzD2 = 0;
        for (int i10 = 0; i10 < zzgaVar.size(); i10++) {
            iZzD2 += zzep.zzD(zzgaVar.zze(i10));
        }
        zzepVar2.zzv(iZzD2);
        while (i8 < zzgaVar.size()) {
            zzepVar2.zzx(zzgaVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzb(int i7, boolean z7) {
        this.zza.zzd(i7, z7);
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
    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzc(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzdy)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzd(i7, ((Boolean) list.get(i8)).booleanValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).getClass();
                i9++;
            }
            zzepVar.zzv(i9);
            while (i8 < list.size()) {
                zzepVar.zzb(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
            return;
        }
        zzdy zzdyVar = (zzdy) list;
        if (!z7) {
            while (i8 < zzdyVar.size()) {
                this.zza.zzd(i7, zzdyVar.zzf(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzdyVar.size(); i12++) {
            zzdyVar.zzf(i12);
            i11++;
        }
        zzepVar2.zzv(i11);
        while (i8 < zzdyVar.size()) {
            zzepVar2.zzb(zzdyVar.zzf(i8) ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzd(int i7, zzei zzeiVar) {
        this.zza.zze(i7, zzeiVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zze(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zze(i7, (zzei) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzf(int i7, double d7) {
        this.zza.zzi(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzg(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzer)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzi(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).getClass();
                i9 += 8;
            }
            zzepVar.zzv(i9);
            while (i8 < list.size()) {
                zzepVar.zzj(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        zzer zzerVar = (zzer) list;
        if (!z7) {
            while (i8 < zzerVar.size()) {
                this.zza.zzi(i7, Double.doubleToRawLongBits(zzerVar.zze(i8)));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzerVar.size(); i12++) {
            zzerVar.zze(i12);
            i11 += 8;
        }
        zzepVar2.zzv(i11);
        while (i8 < zzerVar.size()) {
            zzepVar2.zzj(Double.doubleToRawLongBits(zzerVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzt(i7, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzi(int i7, int i8) {
        this.zza.zzk(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzj(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzfj)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzk(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int iZzD = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzD += zzep.zzD(((Integer) list.get(i9)).intValue());
            }
            zzepVar.zzv(iZzD);
            while (i8 < list.size()) {
                zzepVar.zzl(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z7) {
            while (i8 < zzfjVar.size()) {
                this.zza.zzk(i7, zzfjVar.zze(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int iZzD2 = 0;
        for (int i10 = 0; i10 < zzfjVar.size(); i10++) {
            iZzD2 += zzep.zzD(zzfjVar.zze(i10));
        }
        zzepVar2.zzv(iZzD2);
        while (i8 < zzfjVar.size()) {
            zzepVar2.zzl(zzfjVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzk(int i7, int i8) {
        this.zza.zzg(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzl(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzfj)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzg(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            zzepVar.zzv(i9);
            while (i8 < list.size()) {
                zzepVar.zzh(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z7) {
            while (i8 < zzfjVar.size()) {
                this.zza.zzg(i7, zzfjVar.zze(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzfjVar.size(); i12++) {
            zzfjVar.zze(i12);
            i11 += 4;
        }
        zzepVar2.zzv(i11);
        while (i8 < zzfjVar.size()) {
            zzepVar2.zzh(zzfjVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzm(int i7, long j7) {
        this.zza.zzi(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzn(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzga)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzi(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            zzepVar.zzv(i9);
            while (i8 < list.size()) {
                zzepVar.zzj(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z7) {
            while (i8 < zzgaVar.size()) {
                this.zza.zzi(i7, zzgaVar.zze(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgaVar.size(); i12++) {
            zzgaVar.zze(i12);
            i11 += 8;
        }
        zzepVar2.zzv(i11);
        while (i8 < zzgaVar.size()) {
            zzepVar2.zzj(zzgaVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzo(int i7, float f7) {
        this.zza.zzg(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzp(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzfb)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzg(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).getClass();
                i9 += 4;
            }
            zzepVar.zzv(i9);
            while (i8 < list.size()) {
                zzepVar.zzh(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z7) {
            while (i8 < zzfbVar.size()) {
                this.zza.zzg(i7, Float.floatToRawIntBits(zzfbVar.zze(i8)));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzfbVar.size(); i12++) {
            zzfbVar.zze(i12);
            i11 += 4;
        }
        zzepVar2.zzv(i11);
        while (i8 < zzfbVar.size()) {
            zzepVar2.zzh(Float.floatToRawIntBits(zzfbVar.zze(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzq(int i7, Object obj, zzgv zzgvVar) {
        zzep zzepVar = this.zza;
        zzepVar.zzt(i7, 3);
        zzgvVar.zzi((zzgl) obj, zzepVar.zza);
        zzepVar.zzt(i7, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzr(int i7, int i8) {
        this.zza.zzk(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzs(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzfj)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzk(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int iZzD = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzD += zzep.zzD(((Integer) list.get(i9)).intValue());
            }
            zzepVar.zzv(iZzD);
            while (i8 < list.size()) {
                zzepVar.zzl(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z7) {
            while (i8 < zzfjVar.size()) {
                this.zza.zzk(i7, zzfjVar.zze(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int iZzD2 = 0;
        for (int i10 = 0; i10 < zzfjVar.size(); i10++) {
            iZzD2 += zzep.zzD(zzfjVar.zze(i10));
        }
        zzepVar2.zzv(iZzD2);
        while (i8 < zzfjVar.size()) {
            zzepVar2.zzl(zzfjVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzt(int i7, long j7) {
        this.zza.zzw(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzu(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzga)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzw(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int iZzD = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzD += zzep.zzD(((Long) list.get(i9)).longValue());
            }
            zzepVar.zzv(iZzD);
            while (i8 < list.size()) {
                zzepVar.zzx(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzga zzgaVar = (zzga) list;
        if (!z7) {
            while (i8 < zzgaVar.size()) {
                this.zza.zzw(i7, zzgaVar.zze(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int iZzD2 = 0;
        for (int i10 = 0; i10 < zzgaVar.size(); i10++) {
            iZzD2 += zzep.zzD(zzgaVar.zze(i10));
        }
        zzepVar2.zzv(iZzD2);
        while (i8 < zzgaVar.size()) {
            zzepVar2.zzx(zzgaVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzv(int i7, Object obj, zzgv zzgvVar) {
        this.zza.zzn(i7, (zzgl) obj, zzgvVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzw(int i7, Object obj) {
        if (obj instanceof zzei) {
            this.zza.zzq(i7, (zzei) obj);
        } else {
            this.zza.zzp(i7, (zzgl) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzx(int i7, int i8) {
        this.zza.zzg(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzy(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzfj)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzg(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            zzep zzepVar = this.zza;
            zzepVar.zzt(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            zzepVar.zzv(i9);
            while (i8 < list.size()) {
                zzepVar.zzh(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzfj zzfjVar = (zzfj) list;
        if (!z7) {
            while (i8 < zzfjVar.size()) {
                this.zza.zzg(i7, zzfjVar.zze(i8));
                i8++;
            }
            return;
        }
        zzep zzepVar2 = this.zza;
        zzepVar2.zzt(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzfjVar.size(); i12++) {
            zzfjVar.zze(i12);
            i11 += 4;
        }
        zzepVar2.zzv(i11);
        while (i8 < zzfjVar.size()) {
            zzepVar2.zzh(zzfjVar.zze(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhu
    public final void zzz(int i7, long j7) {
        this.zza.zzi(i7, j7);
    }
}
