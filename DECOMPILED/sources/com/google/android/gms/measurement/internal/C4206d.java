package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzpu;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d */
/* JADX INFO: loaded from: classes2.dex */
final class C4206d extends AbstractC4198c {

    /* JADX INFO: renamed from: g */
    private final zzfn f15592g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ C4214e f15593h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4206d(C4214e c4214e, String str, int i7, zzfn zzfnVar) {
        super(str, i7);
        Objects.requireNonNull(c4214e);
        this.f15593h = c4214e;
        this.f15592g = zzfnVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4198c
    /* JADX INFO: renamed from: a */
    final int mo18690a() {
        return this.f15592g.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4198c
    /* JADX INFO: renamed from: b */
    final boolean mo18691b() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4198c
    /* JADX INFO: renamed from: c */
    final boolean mo18692c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    final boolean m18711k(Long l7, Long l8, zziu zziuVar, boolean z7) {
        zzpu.zza();
        C4164X2 c4164x2 = this.f15593h.f15066a;
        boolean zM18800H = c4164x2.m18686w().m18800H(this.f15566a, AbstractC4209d2.f15605E0);
        zzfn zzfnVar = this.f15592g;
        boolean zZze = zzfnVar.zze();
        boolean zZzf = zzfnVar.zzf();
        boolean zZzh = zzfnVar.zzh();
        Object[] objArr = zZze || zZzf || zZzh;
        Boolean boolM18699e = null;
        boolM18699e = null;
        boolM18699e = null;
        boolM18699e = null;
        boolM18699e = null;
        if (z7 && objArr != true) {
            c4164x2.mo18421a().m18859w().m18836c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f15567b), zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
            return true;
        }
        zzfh zzfhVarZzd = zzfnVar.zzd();
        boolean zZzf2 = zzfhVarZzd.zzf();
        if (zziuVar.zzf()) {
            if (zzfhVarZzd.zzc()) {
                boolM18699e = AbstractC4198c.m18699e(AbstractC4198c.m18701g(zziuVar.zzg(), zzfhVarZzd.zzd()), zZzf2);
            } else {
                c4164x2.mo18421a().m18854r().m18835b("No number filter for long property. property", c4164x2.m18662D().m18777c(zziuVar.zzc()));
            }
        } else if (zziuVar.zzj()) {
            if (zzfhVarZzd.zzc()) {
                boolM18699e = AbstractC4198c.m18699e(AbstractC4198c.m18702h(zziuVar.zzk(), zzfhVarZzd.zzd()), zZzf2);
            } else {
                c4164x2.mo18421a().m18854r().m18835b("No number filter for double property. property", c4164x2.m18662D().m18777c(zziuVar.zzc()));
            }
        } else if (!zziuVar.zzd()) {
            c4164x2.mo18421a().m18854r().m18835b("User property has no value, property", c4164x2.m18662D().m18777c(zziuVar.zzc()));
        } else if (zzfhVarZzd.zza()) {
            boolM18699e = AbstractC4198c.m18699e(AbstractC4198c.m18700f(zziuVar.zze(), zzfhVarZzd.zzb(), c4164x2.mo18421a()), zZzf2);
        } else if (!zzfhVarZzd.zzc()) {
            c4164x2.mo18421a().m18854r().m18835b("No string or number filter defined. property", c4164x2.m18662D().m18777c(zziuVar.zzc()));
        } else if (C4349u6.m19068O(zziuVar.zze())) {
            boolM18699e = AbstractC4198c.m18699e(AbstractC4198c.m18703i(zziuVar.zze(), zzfhVarZzd.zzd()), zZzf2);
        } else {
            c4164x2.mo18421a().m18854r().m18836c("Invalid user property value for Numeric number filter. property, value", c4164x2.m18662D().m18777c(zziuVar.zzc()), zziuVar.zze());
        }
        c4164x2.mo18421a().m18859w().m18835b("Property filter result", boolM18699e == null ? "null" : boolM18699e);
        if (boolM18699e == null) {
            return false;
        }
        this.f15568c = Boolean.TRUE;
        if (zZzh && !boolM18699e.booleanValue()) {
            return true;
        }
        if (!z7 || zzfnVar.zze()) {
            this.f15569d = boolM18699e;
        }
        if (boolM18699e.booleanValue() && objArr != false && zziuVar.zza()) {
            long jZzb = zziuVar.zzb();
            if (l7 != null) {
                jZzb = l7.longValue();
            }
            if (zM18800H && zzfnVar.zze() && !zzfnVar.zzf() && l8 != null) {
                jZzb = l8.longValue();
            }
            if (zzfnVar.zzf()) {
                this.f15571f = Long.valueOf(jZzb);
            } else {
                this.f15570e = Long.valueOf(jZzb);
            }
        }
        return true;
    }
}
