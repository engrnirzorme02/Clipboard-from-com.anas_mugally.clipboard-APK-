package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzoi {
    private final zzbc zza;
    private zzgjz zzb = zzgjz.zzi();
    private zzgkc zzc = zzgkc.zza();
    private zzup zzd;
    private zzup zze;
    private zzup zzf;

    public zzoi(zzbc zzbcVar) {
        this.zza = zzbcVar;
    }

    private final void zzj(zzbe zzbeVar) {
        zzgkb zzgkbVar = new zzgkb();
        if (this.zzb.isEmpty()) {
            zzk(zzgkbVar, this.zze, zzbeVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzgkbVar, this.zzf, zzbeVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzgkbVar, this.zzd, zzbeVar);
            }
        } else {
            for (int i7 = 0; i7 < this.zzb.size(); i7++) {
                zzk(zzgkbVar, (zzup) this.zzb.get(i7), zzbeVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgkbVar, this.zzd, zzbeVar);
            }
        }
        this.zzc = zzgkbVar.zzc();
    }

    private final void zzk(zzgkb zzgkbVar, zzup zzupVar, zzbe zzbeVar) {
        if (zzupVar == null) {
            return;
        }
        if (zzbeVar.zze(zzupVar.zza) != -1) {
            zzgkbVar.zza(zzupVar, zzbeVar);
            return;
        }
        zzbe zzbeVar2 = (zzbe) this.zzc.get(zzupVar);
        if (zzbeVar2 != null) {
            zzgkbVar.zza(zzupVar, zzbeVar2);
        }
    }

    private static zzup zzl(zzba zzbaVar, zzgjz zzgjzVar, zzup zzupVar, zzbc zzbcVar) {
        zzbe zzbeVarZzo = zzbaVar.zzo();
        int iZzp = zzbaVar.zzp();
        Object objZzf = zzbeVarZzo.zzg() ? null : zzbeVarZzo.zzf(iZzp);
        int iZzf = -1;
        if (!zzbaVar.zzv() && !zzbeVarZzo.zzg()) {
            iZzf = zzbeVarZzo.zzd(iZzp, zzbcVar, false).zzf(zzeo.zzq(zzbaVar.zzs()));
        }
        int i7 = iZzf;
        for (int i8 = 0; i8 < zzgjzVar.size(); i8++) {
            zzup zzupVar2 = (zzup) zzgjzVar.get(i8);
            if (zzm(zzupVar2, objZzf, zzbaVar.zzv(), zzbaVar.zzw(), zzbaVar.zzx(), i7)) {
                return zzupVar2;
            }
        }
        if (zzgjzVar.isEmpty() && zzupVar != null && zzm(zzupVar, objZzf, zzbaVar.zzv(), zzbaVar.zzw(), zzbaVar.zzx(), i7)) {
            return zzupVar;
        }
        return null;
    }

    private static boolean zzm(zzup zzupVar, Object obj, boolean z7, int i7, int i8, int i9) {
        if (!zzupVar.zza.equals(obj)) {
            return false;
        }
        if (z7) {
            return zzupVar.zzb == i7 && zzupVar.zzc == i8;
        }
        return zzupVar.zzb == -1 && zzupVar.zze == i9;
    }

    public final zzup zza() {
        return this.zzd;
    }

    public final zzup zzb() {
        return this.zze;
    }

    public final zzup zzc() {
        return this.zzf;
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
    public final zzup zzd() {
        Object next;
        Object objLast;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (list != null) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            objLast = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            objLast = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            objLast = next;
        }
        return (zzup) objLast;
    }

    public final zzbe zze(zzup zzupVar) {
        return (zzbe) this.zzc.get(zzupVar);
    }

    public final void zzf(zzba zzbaVar) {
        this.zzd = zzl(zzbaVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzba zzbaVar) {
        this.zzd = zzl(zzbaVar, this.zzb, this.zze, this.zza);
        zzj(zzbaVar.zzo());
    }

    public final void zzh(List list, zzup zzupVar, zzba zzbaVar) {
        this.zzb = zzgjz.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzup) list.get(0);
            zzupVar.getClass();
            this.zzf = zzupVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbaVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbaVar.zzo());
    }

    final /* synthetic */ zzgjz zzi() {
        return this.zzb;
    }
}
