package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzakp implements zzaol {
    private final zzakn zza;

    private zzakp(zzakn zzaknVar) {
        zzakn zzaknVar2 = (zzakn) zzalh.zza(zzaknVar, "output");
        this.zza = zzaknVar2;
        zzaknVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzb(int i7, List<Double> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzaks)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzb(i7, list.get(i8).doubleValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZza = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZza += zzakn.zza(list.get(i9).doubleValue());
            }
            this.zza.zzm(iZza);
            while (i8 < list.size()) {
                this.zza.zzb(list.get(i8).doubleValue());
                i8++;
            }
            return;
        }
        zzaks zzaksVar = (zzaks) list;
        if (!z7) {
            while (i8 < zzaksVar.size()) {
                this.zza.zzb(i7, zzaksVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZza2 = 0;
        for (int i10 = 0; i10 < zzaksVar.size(); i10++) {
            iZza2 += zzakn.zza(zzaksVar.zzb(i10));
        }
        this.zza.zzm(iZza2);
        while (i8 < zzaksVar.size()) {
            this.zza.zzb(zzaksVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzc(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzali)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZza = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZza += zzakn.zza(list.get(i9).intValue());
            }
            this.zza.zzm(iZza);
            while (i8 < list.size()) {
                this.zza.zzk(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z7) {
            while (i8 < zzaliVar.size()) {
                this.zza.zzh(i7, zzaliVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZza2 = 0;
        for (int i10 = 0; i10 < zzaliVar.size(); i10++) {
            iZza2 += zzakn.zza(zzaliVar.zzb(i10));
        }
        this.zza.zzm(iZza2);
        while (i8 < zzaliVar.size()) {
            this.zza.zzk(zzaliVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzd(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzali)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzg(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZzb = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzb += zzakn.zzb(list.get(i9).intValue());
            }
            this.zza.zzm(iZzb);
            while (i8 < list.size()) {
                this.zza.zzj(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z7) {
            while (i8 < zzaliVar.size()) {
                this.zza.zzg(i7, zzaliVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZzb2 = 0;
        for (int i10 = 0; i10 < zzaliVar.size(); i10++) {
            iZzb2 += zzakn.zzb(zzaliVar.zzb(i10));
        }
        this.zza.zzm(iZzb2);
        while (i8 < zzaliVar.size()) {
            this.zza.zzj(zzaliVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zze(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzalx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZza = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZza += zzakn.zza(list.get(i9).longValue());
            }
            this.zza.zzm(iZza);
            while (i8 < list.size()) {
                this.zza.zzf(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z7) {
            while (i8 < zzalxVar.size()) {
                this.zza.zzf(i7, zzalxVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZza2 = 0;
        for (int i10 = 0; i10 < zzalxVar.size(); i10++) {
            iZza2 += zzakn.zza(zzalxVar.zzb(i10));
        }
        this.zza.zzm(iZza2);
        while (i8 < zzalxVar.size()) {
            this.zza.zzf(zzalxVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzf(int i7, List<Float> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzald)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzb(i7, list.get(i8).floatValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZza = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZza += zzakn.zza(list.get(i9).floatValue());
            }
            this.zza.zzm(iZza);
            while (i8 < list.size()) {
                this.zza.zzb(list.get(i8).floatValue());
                i8++;
            }
            return;
        }
        zzald zzaldVar = (zzald) list;
        if (!z7) {
            while (i8 < zzaldVar.size()) {
                this.zza.zzb(i7, zzaldVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZza2 = 0;
        for (int i10 = 0; i10 < zzaldVar.size(); i10++) {
            iZza2 += zzakn.zza(zzaldVar.zzb(i10));
        }
        this.zza.zzm(iZza2);
        while (i8 < zzaldVar.size()) {
            this.zza.zzb(zzaldVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzg(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzali)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZzc = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzc += zzakn.zzc(list.get(i9).intValue());
            }
            this.zza.zzm(iZzc);
            while (i8 < list.size()) {
                this.zza.zzk(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z7) {
            while (i8 < zzaliVar.size()) {
                this.zza.zzh(i7, zzaliVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZzc2 = 0;
        for (int i10 = 0; i10 < zzaliVar.size(); i10++) {
            iZzc2 += zzakn.zzc(zzaliVar.zzb(i10));
        }
        this.zza.zzm(iZzc2);
        while (i8 < zzaliVar.size()) {
            this.zza.zzk(zzaliVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzh(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzalx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZzb = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzb += zzakn.zzb(list.get(i9).longValue());
            }
            this.zza.zzm(iZzb);
            while (i8 < list.size()) {
                this.zza.zzh(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z7) {
            while (i8 < zzalxVar.size()) {
                this.zza.zzh(i7, zzalxVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZzb2 = 0;
        for (int i10 = 0; i10 < zzalxVar.size(); i10++) {
            iZzb2 += zzakn.zzb(zzalxVar.zzb(i10));
        }
        this.zza.zzm(iZzb2);
        while (i8 < zzalxVar.size()) {
            this.zza.zzh(zzalxVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzi(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzali)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzg(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZzf = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzf += zzakn.zzf(list.get(i9).intValue());
            }
            this.zza.zzm(iZzf);
            while (i8 < list.size()) {
                this.zza.zzj(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z7) {
            while (i8 < zzaliVar.size()) {
                this.zza.zzg(i7, zzaliVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZzf2 = 0;
        for (int i10 = 0; i10 < zzaliVar.size(); i10++) {
            iZzf2 += zzakn.zzf(zzaliVar.zzb(i10));
        }
        this.zza.zzm(iZzf2);
        while (i8 < zzaliVar.size()) {
            this.zza.zzj(zzaliVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzj(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzalx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZzc = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzc += zzakn.zzc(list.get(i9).longValue());
            }
            this.zza.zzm(iZzc);
            while (i8 < list.size()) {
                this.zza.zzf(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z7) {
            while (i8 < zzalxVar.size()) {
                this.zza.zzf(i7, zzalxVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZzc2 = 0;
        for (int i10 = 0; i10 < zzalxVar.size(); i10++) {
            iZzc2 += zzakn.zzc(zzalxVar.zzb(i10));
        }
        this.zza.zzm(iZzc2);
        while (i8 < zzalxVar.size()) {
            this.zza.zzf(zzalxVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzk(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzali)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzi(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZzg = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzg += zzakn.zzg(list.get(i9).intValue());
            }
            this.zza.zzm(iZzg);
            while (i8 < list.size()) {
                this.zza.zzl(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z7) {
            while (i8 < zzaliVar.size()) {
                this.zza.zzi(i7, zzaliVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZzg2 = 0;
        for (int i10 = 0; i10 < zzaliVar.size(); i10++) {
            iZzg2 += zzakn.zzg(zzaliVar.zzb(i10));
        }
        this.zza.zzm(iZzg2);
        while (i8 < zzaliVar.size()) {
            this.zza.zzl(zzaliVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzl(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzalx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzg(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZzd = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzd += zzakn.zzd(list.get(i9).longValue());
            }
            this.zza.zzm(iZzd);
            while (i8 < list.size()) {
                this.zza.zzg(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z7) {
            while (i8 < zzalxVar.size()) {
                this.zza.zzg(i7, zzalxVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZzd2 = 0;
        for (int i10 = 0; i10 < zzalxVar.size(); i10++) {
            iZzd2 += zzakn.zzd(zzalxVar.zzb(i10));
        }
        this.zza.zzm(iZzd2);
        while (i8 < zzalxVar.size()) {
            this.zza.zzg(zzalxVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzm(int i7, List<Integer> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzali)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzk(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZzi = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZzi += zzakn.zzi(list.get(i9).intValue());
            }
            this.zza.zzm(iZzi);
            while (i8 < list.size()) {
                this.zza.zzm(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z7) {
            while (i8 < zzaliVar.size()) {
                this.zza.zzk(i7, zzaliVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZzi2 = 0;
        for (int i10 = 0; i10 < zzaliVar.size(); i10++) {
            iZzi2 += zzakn.zzi(zzaliVar.zzb(i10));
        }
        this.zza.zzm(iZzi2);
        while (i8 < zzaliVar.size()) {
            this.zza.zzm(zzaliVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzn(int i7, List<Long> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzalx)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzj(i7, 2);
            int iZze = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iZze += zzakn.zze(list.get(i9).longValue());
            }
            this.zza.zzm(iZze);
            while (i8 < list.size()) {
                this.zza.zzh(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z7) {
            while (i8 < zzalxVar.size()) {
                this.zza.zzh(i7, zzalxVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzj(i7, 2);
        int iZze2 = 0;
        for (int i10 = 0; i10 < zzalxVar.size(); i10++) {
            iZze2 += zzakn.zze(zzalxVar.zzb(i10));
        }
        this.zza.zzm(iZze2);
        while (i8 < zzalxVar.size()) {
            this.zza.zzh(zzalxVar.zzb(i8));
            i8++;
        }
    }

    public static zzakp zza(zzakn zzaknVar) {
        zzakp zzakpVar = zzaknVar.zza;
        return zzakpVar != null ? zzakpVar : new zzakp(zzaknVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, boolean z7) {
        this.zza.zzb(i7, z7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, List<Boolean> list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof zzajt)) {
            if (z7) {
                this.zza.zzj(i7, 2);
                int iZza = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    iZza += zzakn.zza(list.get(i9).booleanValue());
                }
                this.zza.zzm(iZza);
                while (i8 < list.size()) {
                    this.zza.zzb(list.get(i8).booleanValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                this.zza.zzb(i7, list.get(i8).booleanValue());
                i8++;
            }
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        if (z7) {
            this.zza.zzj(i7, 2);
            int iZza2 = 0;
            for (int i10 = 0; i10 < zzajtVar.size(); i10++) {
                iZza2 += zzakn.zza(zzajtVar.zzb(i10));
            }
            this.zza.zzm(iZza2);
            while (i8 < zzajtVar.size()) {
                this.zza.zzb(zzajtVar.zzb(i8));
                i8++;
            }
            return;
        }
        while (i8 < zzajtVar.size()) {
            this.zza.zzb(i7, zzajtVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzb(int i7, int i8) {
        this.zza.zzg(i7, i8);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzd(int i7, int i8) {
        this.zza.zzg(i7, i8);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zze(int i7, int i8) {
        this.zza.zzi(i7, i8);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzf(int i7, int i8) {
        this.zza.zzk(i7, i8);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzb(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zze(int i7, long j7) {
        this.zza.zzh(i7, j7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzd(int i7, long j7) {
        this.zza.zzg(i7, j7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzb(int i7, Object obj, zzanb zzanbVar) {
        zzajm zzajmVar = (zzajm) obj;
        this.zza.zzj(i7, 2);
        this.zza.zzm(zzajmVar.zza(zzanbVar));
        zzanbVar.zza(zzajmVar, this);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, zzajv zzajvVar) {
        this.zza.zzc(i7, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzc(int i7, int i8) {
        this.zza.zzh(i7, i8);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, List<zzajv> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zzc(i7, list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzc(int i7, long j7) {
        this.zza.zzf(i7, j7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, double d7) {
        this.zza.zzb(i7, d7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzb(int i7, List<?> list, zzanb zzanbVar) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzb(i7, list.get(i8), zzanbVar);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    @Deprecated
    public final void zza(int i7) {
        this.zza.zzj(i7, 4);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, int i8) {
        this.zza.zzh(i7, i8);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    @Deprecated
    public final void zzb(int i7) {
        this.zza.zzj(i7, 3);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zzb(int i7, List<String> list) {
        int i8 = 0;
        if (list instanceof zzalt) {
            zzalt zzaltVar = (zzalt) list;
            while (i8 < list.size()) {
                Object objZza = zzaltVar.zza(i8);
                if (objZza instanceof String) {
                    this.zza.zzb(i7, (String) objZza);
                } else {
                    this.zza.zzc(i7, (zzajv) objZza);
                }
                i8++;
            }
            return;
        }
        while (i8 < list.size()) {
            this.zza.zzb(i7, list.get(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, long j7) {
        this.zza.zzf(i7, j7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, float f7) {
        this.zza.zzb(i7, f7);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, Object obj, zzanb zzanbVar) {
        this.zza.zzj(i7, 3);
        zzanbVar.zza((zzajm) obj, this);
        this.zza.zzj(i7, 4);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, List<?> list, zzanb zzanbVar) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            zza(i7, list.get(i8), zzanbVar);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final <K, V> void zza(int i7, zzamd<K, V> zzamdVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzj(i7, 2);
            this.zza.zzm(zzame.zza(zzamdVar, entry.getKey(), entry.getValue()));
            zzame.zza(this.zza, zzamdVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, Object obj) {
        if (obj instanceof zzajv) {
            this.zza.zzd(i7, (zzajv) obj);
        } else {
            this.zza.zzb(i7, (zzamm) obj);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaol
    public final void zza(int i7, String str) {
        this.zza.zzb(i7, str);
    }
}
