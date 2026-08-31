package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzacq;
import com.google.android.gms.internal.p411firebaseauthapi.zzaen;
import com.google.android.gms.internal.p411firebaseauthapi.zzahv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p164V3.C1762g;
import p192Z3.AbstractC2087A;
import p192Z3.C2101O;
import p192Z3.C2104S;
import p192Z3.C2105T;
import p192Z3.C2109X;
import p192Z3.C2120e;
import p192Z3.C2146x;
import p192Z3.InterfaceC2108W;
import p192Z3.InterfaceC2111Z;
import p192Z3.InterfaceC2112a;
import p192Z3.InterfaceC2114b;
import p192Z3.InterfaceC2143u;
import p211b5.InterfaceC2972b;
import p253g5.C5518b;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseAuth implements InterfaceC2114b {

    /* JADX INFO: renamed from: A */
    protected final Executor f18437A;

    /* JADX INFO: renamed from: B */
    private String f18438B;

    /* JADX INFO: renamed from: a */
    private final C1762g f18439a;

    /* JADX INFO: renamed from: b */
    protected final List f18440b;

    /* JADX INFO: renamed from: c */
    protected final List f18441c;

    /* JADX INFO: renamed from: d */
    protected final List f18442d;

    /* JADX INFO: renamed from: e */
    protected final zzacq f18443e;

    /* JADX INFO: renamed from: f */
    private AbstractC4880u f18444f;

    /* JADX INFO: renamed from: g */
    private final C2120e f18445g;

    /* JADX INFO: renamed from: h */
    private final Object f18446h;

    /* JADX INFO: renamed from: i */
    private String f18447i;

    /* JADX INFO: renamed from: j */
    private final Object f18448j;

    /* JADX INFO: renamed from: k */
    private String f18449k;

    /* JADX INFO: renamed from: l */
    private C2101O f18450l;

    /* JADX INFO: renamed from: m */
    private final RecaptchaAction f18451m;

    /* JADX INFO: renamed from: n */
    private final RecaptchaAction f18452n;

    /* JADX INFO: renamed from: o */
    private final RecaptchaAction f18453o;

    /* JADX INFO: renamed from: p */
    private final RecaptchaAction f18454p;

    /* JADX INFO: renamed from: q */
    private final RecaptchaAction f18455q;

    /* JADX INFO: renamed from: r */
    private final RecaptchaAction f18456r;

    /* JADX INFO: renamed from: s */
    private final C2105T f18457s;

    /* JADX INFO: renamed from: t */
    private final C2109X f18458t;

    /* JADX INFO: renamed from: u */
    private final C2146x f18459u;

    /* JADX INFO: renamed from: v */
    private final InterfaceC2972b f18460v;

    /* JADX INFO: renamed from: w */
    private final InterfaceC2972b f18461w;

    /* JADX INFO: renamed from: x */
    private C2104S f18462x;

    /* JADX INFO: renamed from: y */
    private final Executor f18463y;

    /* JADX INFO: renamed from: z */
    private final Executor f18464z;

    /* JADX INFO: renamed from: com.google.firebase.auth.FirebaseAuth$a */
    class C4821a implements InterfaceC2111Z {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ FirebaseAuth f18465a;

        C4821a(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f18465a = firebaseAuth;
        }

        @Override // p192Z3.InterfaceC2111Z
        /* JADX INFO: renamed from: a */
        public final void mo8675a(zzahv zzahvVar, AbstractC4880u abstractC4880u) {
            AbstractC3718s.m18083l(zzahvVar);
            AbstractC3718s.m18083l(abstractC4880u);
            abstractC4880u.mo8715f0(zzahvVar);
            this.f18465a.m22000u(abstractC4880u, zzahvVar, true);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.auth.FirebaseAuth$b */
    class C4822b implements InterfaceC2143u, InterfaceC2111Z {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ FirebaseAuth f18466a;

        C4822b(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f18466a = firebaseAuth;
        }

        @Override // p192Z3.InterfaceC2111Z
        /* JADX INFO: renamed from: a */
        public final void mo8675a(zzahv zzahvVar, AbstractC4880u abstractC4880u) {
            AbstractC3718s.m18083l(zzahvVar);
            AbstractC3718s.m18083l(abstractC4880u);
            abstractC4880u.mo8715f0(zzahvVar);
            this.f18466a.m22001v(abstractC4880u, zzahvVar, true, true);
        }

        @Override // p192Z3.InterfaceC2143u
        public final void zza(Status status) {
            if (status.m17744U() == 17011 || status.m17744U() == 17021 || status.m17744U() == 17005 || status.m17744U() == 17091) {
                this.f18466a.m21995k();
            }
        }
    }

    public FirebaseAuth(C1762g c1762g, InterfaceC2972b interfaceC2972b, InterfaceC2972b interfaceC2972b2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this(c1762g, new zzacq(c1762g, executor2, scheduledExecutorService), new C2105T(c1762g.m7405l(), c1762g.m7408q()), C2109X.m8671c(), C2146x.m8749a(), interfaceC2972b, interfaceC2972b2, executor, executor2, executor3, executor4);
    }

    /* JADX INFO: renamed from: E */
    private static C2104S m21973E(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f18462x == null) {
            firebaseAuth.f18462x = new C2104S((C1762g) AbstractC3718s.m18083l(firebaseAuth.f18439a));
        }
        return firebaseAuth.f18462x;
    }

    /* JADX INFO: renamed from: G */
    private final synchronized C2104S m21974G() {
        return m21973E(this);
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C1762g.m7394m().m7404j(FirebaseAuth.class);
    }

    /* JADX INFO: renamed from: m */
    private final Task m21976m(C4856h c4856h, AbstractC4880u abstractC4880u, boolean z7) {
        return new C4835T(this, z7, abstractC4880u, c4856h).m8636c(this, this.f18449k, this.f18451m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX INFO: renamed from: q */
    private final Task m21977q(String str, String str2, String str3, AbstractC4880u abstractC4880u, boolean z7) {
        return new C4877r0(this, str, z7, abstractC4880u, str2, str3).m8636c(this, str3, this.f18452n, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX INFO: renamed from: s */
    private static void m21978s(FirebaseAuth firebaseAuth, AbstractC4880u abstractC4880u) {
        if (abstractC4880u != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + abstractC4880u.mo8711b0() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f18437A.execute(new RunnableC4875q0(firebaseAuth));
    }

    /* JADX INFO: renamed from: t */
    private static void m21979t(FirebaseAuth firebaseAuth, AbstractC4880u abstractC4880u, zzahv zzahvVar, boolean z7, boolean z8) {
        boolean z9;
        AbstractC3718s.m18083l(abstractC4880u);
        AbstractC3718s.m18083l(zzahvVar);
        boolean z10 = true;
        boolean z11 = firebaseAuth.f18444f != null && abstractC4880u.mo8711b0().equals(firebaseAuth.f18444f.mo8711b0());
        if (z11 || !z8) {
            AbstractC4880u abstractC4880u2 = firebaseAuth.f18444f;
            if (abstractC4880u2 == null) {
                z9 = true;
            } else {
                boolean z12 = (z11 && abstractC4880u2.mo8718i0().zzc().equals(zzahvVar.zzc())) ? false : true;
                z9 = z11 ? false : true;
                z10 = z12;
            }
            AbstractC3718s.m18083l(abstractC4880u);
            if (firebaseAuth.f18444f == null || !abstractC4880u.mo8711b0().equals(firebaseAuth.mo8683a())) {
                firebaseAuth.f18444f = abstractC4880u;
            } else {
                firebaseAuth.f18444f.mo8714e0(abstractC4880u.mo8709Z());
                if (!abstractC4880u.mo8712c0()) {
                    firebaseAuth.f18444f.mo8716g0();
                }
                List listMo8735a = abstractC4880u.mo8707X().mo8735a();
                List listMo8720k0 = abstractC4880u.mo8720k0();
                firebaseAuth.f18444f.mo8719j0(listMo8735a);
                firebaseAuth.f18444f.mo8717h0(listMo8720k0);
            }
            if (z7) {
                firebaseAuth.f18457s.m8668j(firebaseAuth.f18444f);
            }
            if (z10) {
                AbstractC4880u abstractC4880u3 = firebaseAuth.f18444f;
                if (abstractC4880u3 != null) {
                    abstractC4880u3.mo8715f0(zzahvVar);
                }
                m21981y(firebaseAuth, firebaseAuth.f18444f);
            }
            if (z9) {
                m21978s(firebaseAuth, firebaseAuth.f18444f);
            }
            if (z7) {
                firebaseAuth.f18457s.m8665e(abstractC4880u, zzahvVar);
            }
            AbstractC4880u abstractC4880u4 = firebaseAuth.f18444f;
            if (abstractC4880u4 != null) {
                m21973E(firebaseAuth).m8657e(abstractC4880u4.mo8718i0());
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m21981y(FirebaseAuth firebaseAuth, AbstractC4880u abstractC4880u) {
        if (abstractC4880u != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + abstractC4880u.mo8711b0() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.f18437A.execute(new RunnableC4871o0(firebaseAuth, new C5518b(abstractC4880u != null ? abstractC4880u.zzd() : null)));
    }

    /* JADX INFO: renamed from: z */
    private final boolean m21982z(String str) {
        C4850e c4850eM22032b = C4850e.m22032b(str);
        return (c4850eM22032b == null || TextUtils.equals(this.f18449k, c4850eM22032b.m22035c())) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC2972b m21983A() {
        return this.f18460v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [Z3.W, com.google.firebase.auth.FirebaseAuth$b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Z3.W, com.google.firebase.auth.FirebaseAuth$b] */
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
    /* JADX INFO: renamed from: B */
    public final Task m21984B(AbstractC4880u abstractC4880u, AbstractC4854g abstractC4854g) {
        AbstractC3718s.m18083l(abstractC4880u);
        AbstractC3718s.m18083l(abstractC4854g);
        AbstractC4854g abstractC4854gMo22007V = abstractC4854g.mo22007V();
        if (!(abstractC4854gMo22007V instanceof C4856h)) {
            return abstractC4854gMo22007V instanceof C4823G ? this.f18443e.zzb(this.f18439a, abstractC4880u, (C4823G) abstractC4854gMo22007V, this.f18449k, (InterfaceC2108W) new C4822b(this)) : this.f18443e.zzc(this.f18439a, abstractC4880u, abstractC4854gMo22007V, abstractC4880u.mo8710a0(), new C4822b(this));
        }
        C4856h c4856h = (C4856h) abstractC4854gMo22007V;
        if ("password".equals(c4856h.mo22006U())) {
            return m21977q(c4856h.zzc(), AbstractC3718s.m18077f(c4856h.zzd()), abstractC4880u.mo8710a0(), abstractC4880u, true);
        }
        return m21982z(AbstractC3718s.m18077f(c4856h.zze())) ? Tasks.forException(zzaen.zza(new Status(17072))) : m21976m(c4856h, abstractC4880u, true);
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC2972b m21985C() {
        return this.f18461w;
    }

    /* JADX INFO: renamed from: D */
    public final Executor m21986D() {
        return this.f18463y;
    }

    /* JADX INFO: renamed from: F */
    public final void m21987F() {
        AbstractC3718s.m18083l(this.f18457s);
        AbstractC4880u abstractC4880u = this.f18444f;
        if (abstractC4880u != null) {
            this.f18457s.m8667h(abstractC4880u);
            this.f18444f = null;
        }
        this.f18457s.m8666g();
        m21981y(this, null);
        m21978s(this, null);
    }

    @Override // p192Z3.InterfaceC2114b
    /* JADX INFO: renamed from: a */
    public String mo8683a() {
        AbstractC4880u abstractC4880u = this.f18444f;
        if (abstractC4880u == null) {
            return null;
        }
        return abstractC4880u.mo8711b0();
    }

    @Override // p192Z3.InterfaceC2114b
    /* JADX INFO: renamed from: b */
    public void mo8684b(InterfaceC2112a interfaceC2112a) {
        AbstractC3718s.m18083l(interfaceC2112a);
        this.f18442d.add(interfaceC2112a);
        m21974G().m8656c(this.f18442d.size());
    }

    @Override // p192Z3.InterfaceC2114b
    /* JADX INFO: renamed from: c */
    public Task mo8685c(boolean z7) {
        return m21997o(this.f18444f, z7);
    }

    /* JADX INFO: renamed from: d */
    public C1762g m21988d() {
        return this.f18439a;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC4880u m21989e() {
        return this.f18444f;
    }

    /* JADX INFO: renamed from: f */
    public String m21990f() {
        return this.f18438B;
    }

    /* JADX INFO: renamed from: g */
    public String m21991g() {
        String str;
        synchronized (this.f18446h) {
            str = this.f18447i;
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public String m21992h() {
        String str;
        synchronized (this.f18448j) {
            str = this.f18449k;
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public void m21993i(String str) {
        AbstractC3718s.m18077f(str);
        synchronized (this.f18448j) {
            this.f18449k = str;
        }
    }

    /* JADX INFO: renamed from: j */
    public Task m21994j(AbstractC4854g abstractC4854g) {
        AbstractC3718s.m18083l(abstractC4854g);
        AbstractC4854g abstractC4854gMo22007V = abstractC4854g.mo22007V();
        if (!(abstractC4854gMo22007V instanceof C4856h)) {
            if (abstractC4854gMo22007V instanceof C4823G) {
                return this.f18443e.zza(this.f18439a, (C4823G) abstractC4854gMo22007V, this.f18449k, (InterfaceC2111Z) new C4821a(this));
            }
            return this.f18443e.zza(this.f18439a, abstractC4854gMo22007V, this.f18449k, new C4821a(this));
        }
        C4856h c4856h = (C4856h) abstractC4854gMo22007V;
        if (c4856h.m22038Y()) {
            return m21982z(AbstractC3718s.m18077f(c4856h.zze())) ? Tasks.forException(zzaen.zza(new Status(17072))) : m21976m(c4856h, null, false);
        }
        return m21977q(c4856h.zzc(), (String) AbstractC3718s.m18083l(c4856h.zzd()), this.f18449k, null, false);
    }

    /* JADX INFO: renamed from: k */
    public void m21995k() {
        m21987F();
        C2104S c2104s = this.f18462x;
        if (c2104s != null) {
            c2104s.m8655b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [Z3.W, com.google.firebase.auth.FirebaseAuth$b] */
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
    /* JADX INFO: renamed from: n */
    public final Task m21996n(AbstractC4880u abstractC4880u, AbstractC4854g abstractC4854g) {
        AbstractC3718s.m18083l(abstractC4854g);
        AbstractC3718s.m18083l(abstractC4880u);
        return abstractC4854g instanceof C4856h ? new C4867m0(this, abstractC4880u, (C4856h) abstractC4854g.mo22007V()).m8636c(this, abstractC4880u.mo8710a0(), this.f18453o, "EMAIL_PASSWORD_PROVIDER") : this.f18443e.zza(this.f18439a, abstractC4880u, abstractC4854g.mo22007V(), (String) null, (InterfaceC2108W) new C4822b(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Z3.W, com.google.firebase.auth.p0] */
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
    /* JADX INFO: renamed from: o */
    public final Task m21997o(AbstractC4880u abstractC4880u, boolean z7) {
        if (abstractC4880u == null) {
            return Tasks.forException(zzaen.zza(new Status(17495)));
        }
        zzahv zzahvVarMo8718i0 = abstractC4880u.mo8718i0();
        return (!zzahvVarMo8718i0.zzg() || z7) ? this.f18443e.zza(this.f18439a, abstractC4880u, zzahvVarMo8718i0.zzd(), (InterfaceC2108W) new C4873p0(this)) : Tasks.forResult(AbstractC2087A.m8623a(zzahvVarMo8718i0.zzc()));
    }

    /* JADX INFO: renamed from: p */
    public final Task m21998p(String str) {
        return this.f18443e.zza(this.f18449k, str);
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m21999r(C2101O c2101o) {
        this.f18450l = c2101o;
    }

    /* JADX INFO: renamed from: u */
    public final void m22000u(AbstractC4880u abstractC4880u, zzahv zzahvVar, boolean z7) {
        m22001v(abstractC4880u, zzahvVar, true, false);
    }

    /* JADX INFO: renamed from: v */
    final void m22001v(AbstractC4880u abstractC4880u, zzahv zzahvVar, boolean z7, boolean z8) {
        m21979t(this, abstractC4880u, zzahvVar, true, z8);
    }

    /* JADX INFO: renamed from: w */
    public final synchronized C2101O m22002w() {
        return this.f18450l;
    }

    public static FirebaseAuth getInstance(C1762g c1762g) {
        return (FirebaseAuth) c1762g.m7404j(FirebaseAuth.class);
    }

    private FirebaseAuth(C1762g c1762g, zzacq zzacqVar, C2105T c2105t, C2109X c2109x, C2146x c2146x, InterfaceC2972b interfaceC2972b, InterfaceC2972b interfaceC2972b2, Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        zzahv zzahvVarM8663b;
        this.f18440b = new CopyOnWriteArrayList();
        this.f18441c = new CopyOnWriteArrayList();
        this.f18442d = new CopyOnWriteArrayList();
        this.f18446h = new Object();
        this.f18448j = new Object();
        this.f18451m = RecaptchaAction.custom("getOobCode");
        this.f18452n = RecaptchaAction.custom("signInWithPassword");
        this.f18453o = RecaptchaAction.custom("signUpPassword");
        this.f18454p = RecaptchaAction.custom("sendVerificationCode");
        this.f18455q = RecaptchaAction.custom("mfaSmsEnrollment");
        this.f18456r = RecaptchaAction.custom("mfaSmsSignIn");
        this.f18439a = (C1762g) AbstractC3718s.m18083l(c1762g);
        this.f18443e = (zzacq) AbstractC3718s.m18083l(zzacqVar);
        C2105T c2105t2 = (C2105T) AbstractC3718s.m18083l(c2105t);
        this.f18457s = c2105t2;
        this.f18445g = new C2120e();
        C2109X c2109x2 = (C2109X) AbstractC3718s.m18083l(c2109x);
        this.f18458t = c2109x2;
        this.f18459u = (C2146x) AbstractC3718s.m18083l(c2146x);
        this.f18460v = interfaceC2972b;
        this.f18461w = interfaceC2972b2;
        this.f18463y = executor2;
        this.f18464z = executor3;
        this.f18437A = executor4;
        AbstractC4880u abstractC4880uM8664c = c2105t2.m8664c();
        this.f18444f = abstractC4880uM8664c;
        if (abstractC4880uM8664c != null && (zzahvVarM8663b = c2105t2.m8663b(abstractC4880uM8664c)) != null) {
            m21979t(this, this.f18444f, zzahvVarM8663b, false, false);
        }
        c2109x2.m8673b(this);
    }
}
