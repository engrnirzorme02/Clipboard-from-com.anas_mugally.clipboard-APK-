package com.google.android.gms.internal.p411firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AbstractC4825I;
import com.google.firebase.auth.AbstractC4826J;
import com.google.firebase.auth.AbstractC4829M;
import com.google.firebase.auth.AbstractC4854g;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.C4823G;
import com.google.firebase.auth.C4827K;
import com.google.firebase.auth.C4833Q;
import com.google.firebase.auth.C4848d;
import com.google.firebase.auth.C4856h;
import com.google.firebase.auth.C4882w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p164V3.C1762g;
import p192Z3.AbstractC2089C;
import p192Z3.C2118d;
import p192Z3.C2126h;
import p192Z3.C2130j;
import p192Z3.C2135m;
import p192Z3.InterfaceC2108W;
import p192Z3.InterfaceC2111Z;
import p192Z3.InterfaceC2143u;
import p192Z3.InterfaceC2144v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacq extends zzafo {
    public zzacq(C1762g c1762g, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaeo(c1762g, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(C1762g c1762g, String str, String str2) {
        return zza((zzacp) new zzacp(str, str2).zza(c1762g));
    }

    public final Task<Object> zzb(C1762g c1762g, String str, String str2) {
        return zza((zzacs) new zzacs(str, str2).zza(c1762g));
    }

    public final Task<Object> zzc(C1762g c1762g, String str, String str2) {
        return zza((zzacw) new zzacw(str, str2).zza(c1762g));
    }

    public final Task<Void> zzd(C1762g c1762g, AbstractC4880u abstractC4880u, String str, InterfaceC2108W interfaceC2108W) {
        return zza((zzaeg) new zzaeg(str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(C1762g c1762g, String str, String str2, String str3) {
        return zza((zzacr) new zzacr(str, str2, str3).zza(c1762g));
    }

    public final Task<Void> zzb(C1762g c1762g, AbstractC4880u abstractC4880u, AbstractC4854g abstractC4854g, String str, InterfaceC2108W interfaceC2108W) {
        return zza((zzadg) new zzadg(abstractC4854g, str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Object> zzc(C1762g c1762g, AbstractC4880u abstractC4880u, AbstractC4854g abstractC4854g, String str, InterfaceC2108W interfaceC2108W) {
        return zza((zzadf) new zzadf(abstractC4854g, str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Object> zza(C1762g c1762g, String str, String str2, String str3, String str4, InterfaceC2111Z interfaceC2111Z) {
        return zza((zzacu) new zzacu(str, str2, str3, str4).zza(c1762g).zza(interfaceC2111Z));
    }

    public final Task<String> zzd(C1762g c1762g, String str, String str2) {
        return zza((zzaek) new zzaek(str, str2).zza(c1762g));
    }

    public final Task<Object> zzb(C1762g c1762g, AbstractC4880u abstractC4880u, C4856h c4856h, String str, InterfaceC2108W interfaceC2108W) {
        return zza((zzadh) new zzadh(c4856h, str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zzc(C1762g c1762g, AbstractC4880u abstractC4880u, String str, InterfaceC2108W interfaceC2108W) {
        return zza((zzaed) new zzaed(str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(AbstractC4880u abstractC4880u, InterfaceC2144v interfaceC2144v) {
        return zza((zzact) new zzact().zza(abstractC4880u).zza(interfaceC2144v).zza((InterfaceC2143u) interfaceC2144v));
    }

    public final Task<Void> zza(C1762g c1762g, AbstractC4826J abstractC4826J, AbstractC4880u abstractC4880u, String str, InterfaceC2111Z interfaceC2111Z) {
        zzagb.zza();
        zzacv zzacvVar = new zzacv(abstractC4826J, abstractC4880u.zze(), str, null);
        zzacvVar.zza(c1762g).zza(interfaceC2111Z);
        return zza(zzacvVar);
    }

    public final Task<Object> zzb(C1762g c1762g, AbstractC4880u abstractC4880u, String str, String str2, String str3, String str4, InterfaceC2108W interfaceC2108W) {
        return zza((zzadj) new zzadj(str, str2, str3, str4).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(C1762g c1762g, AbstractC4829M abstractC4829M, AbstractC4880u abstractC4880u, String str, String str2, InterfaceC2111Z interfaceC2111Z) {
        zzacv zzacvVar = new zzacv(abstractC4829M, abstractC4880u.zze(), str, str2);
        zzacvVar.zza(c1762g).zza(interfaceC2111Z);
        return zza(zzacvVar);
    }

    public final Task<Object> zzb(C1762g c1762g, AbstractC4880u abstractC4880u, C4823G c4823g, String str, InterfaceC2108W interfaceC2108W) {
        zzagb.zza();
        return zza((zzadl) new zzadl(c4823g, str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Object> zza(C1762g c1762g, AbstractC4880u abstractC4880u, AbstractC4826J abstractC4826J, String str, InterfaceC2111Z interfaceC2111Z) {
        zzagb.zza();
        zzacy zzacyVar = new zzacy(abstractC4826J, str, null);
        zzacyVar.zza(c1762g).zza(interfaceC2111Z);
        if (abstractC4880u != null) {
            zzacyVar.zza(abstractC4880u);
        }
        return zza(zzacyVar);
    }

    public final Task<Void> zzb(C1762g c1762g, String str, C4848d c4848d, String str2, String str3) {
        c4848d.m22031b0(6);
        return zza((zzadp) new zzadp(str, c4848d, str2, str3, "sendSignInLinkToEmail").zza(c1762g));
    }

    public final Task<Object> zza(C1762g c1762g, AbstractC4880u abstractC4880u, AbstractC4829M abstractC4829M, String str, String str2, InterfaceC2111Z interfaceC2111Z) {
        zzacy zzacyVar = new zzacy(abstractC4829M, str, str2);
        zzacyVar.zza(c1762g).zza(interfaceC2111Z);
        if (abstractC4880u != null) {
            zzacyVar.zza(abstractC4880u);
        }
        return zza(zzacyVar);
    }

    public final Task<Object> zzb(C1762g c1762g, String str, String str2, String str3, String str4, InterfaceC2111Z interfaceC2111Z) {
        return zza((zzadw) new zzadw(str, str2, str3, str4).zza(c1762g).zza(interfaceC2111Z));
    }

    public final Task<C4882w> zza(C1762g c1762g, AbstractC4880u abstractC4880u, String str, InterfaceC2108W interfaceC2108W) {
        return zza((zzacx) new zzacx(str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Object> zzb(C1762g c1762g, AbstractC4880u abstractC4880u, String str, InterfaceC2108W interfaceC2108W) {
        AbstractC3718s.m18083l(c1762g);
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(abstractC4880u);
        AbstractC3718s.m18083l(interfaceC2108W);
        List listZzg = abstractC4880u.zzg();
        if ((listZzg != null && !listZzg.contains(str)) || abstractC4880u.mo8712c0()) {
            return Tasks.forException(zzaen.zza(new Status(17016, str)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzaee) new zzaee(str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
        }
        return zza((zzaeb) new zzaeb().zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<zzahr> zza() {
        return zza(new zzada());
    }

    public final Task<zzahs> zza(String str, String str2) {
        return zza(new zzacz(str, str2));
    }

    public final Task<Object> zza(C1762g c1762g, AbstractC4880u abstractC4880u, AbstractC4854g abstractC4854g, String str, InterfaceC2108W interfaceC2108W) {
        AbstractC3718s.m18083l(c1762g);
        AbstractC3718s.m18083l(abstractC4854g);
        AbstractC3718s.m18083l(abstractC4880u);
        AbstractC3718s.m18083l(interfaceC2108W);
        List listZzg = abstractC4880u.zzg();
        if (listZzg != null && listZzg.contains(abstractC4854g.mo22005T())) {
            return Tasks.forException(zzaen.zza(new Status(17015)));
        }
        if (abstractC4854g instanceof C4856h) {
            C4856h c4856h = (C4856h) abstractC4854g;
            if (!c4856h.m22038Y()) {
                return zza((zzadc) new zzadc(c4856h, str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
            }
            return zza((zzadd) new zzadd(c4856h).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
        }
        if (abstractC4854g instanceof C4823G) {
            zzagb.zza();
            return zza((zzade) new zzade((C4823G) abstractC4854g).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
        }
        AbstractC3718s.m18083l(c1762g);
        AbstractC3718s.m18083l(abstractC4854g);
        AbstractC3718s.m18083l(abstractC4880u);
        AbstractC3718s.m18083l(interfaceC2108W);
        return zza((zzadb) new zzadb(abstractC4854g).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(C1762g c1762g, AbstractC4880u abstractC4880u, C4856h c4856h, String str, InterfaceC2108W interfaceC2108W) {
        return zza((zzadi) new zzadi(c4856h, str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(C1762g c1762g, AbstractC4880u abstractC4880u, String str, String str2, String str3, String str4, InterfaceC2108W interfaceC2108W) {
        return zza((zzadk) new zzadk(str, str2, str3, str4).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(C1762g c1762g, AbstractC4880u abstractC4880u, C4823G c4823g, String str, InterfaceC2108W interfaceC2108W) {
        zzagb.zza();
        return zza((zzadm) new zzadm(c4823g, str).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(C1762g c1762g, AbstractC4880u abstractC4880u, InterfaceC2108W interfaceC2108W) {
        return zza((zzado) new zzado().zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzadn(str, str2, str3, str4));
    }

    public final Task<Void> zza(C1762g c1762g, C4848d c4848d, String str) {
        return zza((zzadq) new zzadq(str, c4848d).zza(c1762g));
    }

    public final Task<Void> zza(C1762g c1762g, String str, C4848d c4848d, String str2, String str3) {
        c4848d.m22031b0(1);
        return zza((zzadp) new zzadp(str, c4848d, str2, str3, "sendPasswordResetEmail").zza(c1762g));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzads(str));
    }

    public final Task<Object> zza(C1762g c1762g, InterfaceC2111Z interfaceC2111Z, String str) {
        return zza((zzadr) new zzadr(str).zza(c1762g).zza(interfaceC2111Z));
    }

    public final Task<Object> zza(C1762g c1762g, AbstractC4854g abstractC4854g, String str, InterfaceC2111Z interfaceC2111Z) {
        return zza((zzadu) new zzadu(abstractC4854g, str).zza(c1762g).zza(interfaceC2111Z));
    }

    public final Task<Object> zza(C1762g c1762g, String str, String str2, InterfaceC2111Z interfaceC2111Z) {
        return zza((zzadt) new zzadt(str, str2).zza(c1762g).zza(interfaceC2111Z));
    }

    public final Task<Object> zza(C1762g c1762g, C4856h c4856h, String str, InterfaceC2111Z interfaceC2111Z) {
        return zza((zzadv) new zzadv(c4856h, str).zza(c1762g).zza(interfaceC2111Z));
    }

    public final Task<Object> zza(C1762g c1762g, C4823G c4823g, String str, InterfaceC2111Z interfaceC2111Z) {
        zzagb.zza();
        return zza((zzady) new zzady(c4823g, str).zza(c1762g).zza(interfaceC2111Z));
    }

    public final Task<Void> zza(C2135m c2135m, String str, String str2, long j7, boolean z7, boolean z8, String str3, String str4, String str5, boolean z9, AbstractC4825I abstractC4825I, Executor executor, Activity activity) {
        zzadx zzadxVar = new zzadx(c2135m, str, str2, j7, z7, z8, str3, str4, str5, z9);
        zzadxVar.zza(abstractC4825I, activity, executor, str);
        return zza(zzadxVar);
    }

    public final Task<zzair> zza(C2135m c2135m, String str) {
        return zza(new zzaea(c2135m, str));
    }

    public final Task<Void> zza(C2135m c2135m, C4827K c4827k, String str, long j7, boolean z7, boolean z8, String str2, String str3, String str4, boolean z9, AbstractC4825I abstractC4825I, Executor executor, Activity activity) {
        zzadz zzadzVar = new zzadz(c4827k, AbstractC3718s.m18077f(c2135m.zzc()), str, j7, z7, z8, str2, str3, str4, z9);
        zzadzVar.zza(abstractC4825I, activity, executor, c4827k.mo21968W());
        return zza(zzadzVar);
    }

    public final Task<Void> zza(C1762g c1762g, AbstractC4880u abstractC4880u, String str, String str2, InterfaceC2108W interfaceC2108W) {
        return zza((zzaec) new zzaec(abstractC4880u.zze(), str, str2).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(C1762g c1762g, AbstractC4880u abstractC4880u, C4823G c4823g, InterfaceC2108W interfaceC2108W) {
        zzagb.zza();
        return zza((zzaef) new zzaef(c4823g).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(C1762g c1762g, AbstractC4880u abstractC4880u, C4833Q c4833q, InterfaceC2108W interfaceC2108W) {
        return zza((zzaei) new zzaei(c4833q).zza(c1762g).zza(abstractC4880u).zza(interfaceC2108W).zza((InterfaceC2143u) interfaceC2108W));
    }

    public final Task<Void> zza(String str, String str2, C4848d c4848d) {
        c4848d.m22031b0(7);
        return zza(new zzaeh(str, str2, c4848d));
    }

    static C2126h zza(C1762g c1762g, zzahk zzahkVar) {
        AbstractC3718s.m18083l(c1762g);
        AbstractC3718s.m18083l(zzahkVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2118d(zzahkVar, "firebase"));
        List<zzaib> listZzl = zzahkVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i7 = 0; i7 < listZzl.size(); i7++) {
                arrayList.add(new C2118d(listZzl.get(i7)));
            }
        }
        C2126h c2126h = new C2126h(c1762g, arrayList);
        c2126h.m8722m0(new C2130j(zzahkVar.zzb(), zzahkVar.zza()));
        c2126h.m8724o0(zzahkVar.zzn());
        c2126h.m8723n0(zzahkVar.zze());
        c2126h.mo8719j0(AbstractC2089C.m8626b(zzahkVar.zzk()));
        c2126h.mo8717h0(zzahkVar.zzd());
        return c2126h;
    }

    public final void zza(C1762g c1762g, zzaij zzaijVar, AbstractC4825I abstractC4825I, Activity activity, Executor executor) {
        zza((zzaej) new zzaej(zzaijVar).zza(c1762g).zza(abstractC4825I, activity, executor, zzaijVar.zzd()));
    }
}
