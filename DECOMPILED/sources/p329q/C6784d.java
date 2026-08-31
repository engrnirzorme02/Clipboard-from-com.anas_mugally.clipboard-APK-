package p329q;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractC2599q;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.InterfaceC2612D;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p049G.C0466a;

/* JADX INFO: renamed from: q.d */
/* JADX INFO: loaded from: classes.dex */
public class C6784d extends AbstractComponentCallbacksC2591i {

    /* JADX INFO: renamed from: o0 */
    Handler f27248o0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: p0 */
    C6787g f27249p0;

    /* JADX INFO: renamed from: q.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f27250a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CharSequence f27251b;

        a(int i7, CharSequence charSequence) {
            this.f27250a = i7;
            this.f27251b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6784d.this.f27249p0.m29771l().mo29715a(this.f27250a, this.f27251b);
        }
    }

    /* JADX INFO: renamed from: q.d$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6784d.this.f27249p0.m29771l().mo29716b();
        }
    }

    /* JADX INFO: renamed from: q.d$c */
    class c implements InterfaceC2612D {
        c() {
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12097b(C6786f.b bVar) {
            if (bVar != null) {
                C6784d.this.m29669k2(bVar);
                C6784d.this.f27249p0.m29746K(null);
            }
        }
    }

    /* JADX INFO: renamed from: q.d$d */
    class d implements InterfaceC2612D {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12097b(C6783c c6783c) {
            if (c6783c != null) {
                C6784d.this.m29666h2(c6783c.m29640b(), c6783c.m29641c());
                C6784d.this.f27249p0.m29743H(null);
            }
        }
    }

    /* JADX INFO: renamed from: q.d$e */
    class e implements InterfaceC2612D {
        e() {
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12097b(CharSequence charSequence) {
            if (charSequence != null) {
                C6784d.this.m29668j2(charSequence);
                C6784d.this.f27249p0.m29743H(null);
            }
        }
    }

    /* JADX INFO: renamed from: q.d$f */
    class f implements InterfaceC2612D {
        f() {
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12097b(Boolean bool) {
            if (bool.booleanValue()) {
                C6784d.this.m29667i2();
                C6784d.this.f27249p0.m29744I(false);
            }
        }
    }

    /* JADX INFO: renamed from: q.d$g */
    class g implements InterfaceC2612D {
        g() {
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12097b(Boolean bool) {
            if (bool.booleanValue()) {
                if (C6784d.this.m29665d2()) {
                    C6784d.this.m29671m2();
                } else {
                    C6784d.this.m29670l2();
                }
                C6784d.this.f27249p0.m29760Y(false);
            }
        }
    }

    /* JADX INFO: renamed from: q.d$h */
    class h implements InterfaceC2612D {
        h() {
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12097b(Boolean bool) {
            if (bool.booleanValue()) {
                C6784d.this.m29663T1(1);
                C6784d.this.m29664W1();
                C6784d.this.f27249p0.m29754S(false);
            }
        }
    }

    /* JADX INFO: renamed from: q.d$i */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6784d.this.f27249p0.m29755T(false);
        }
    }

    /* JADX INFO: renamed from: q.d$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f27261a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CharSequence f27262b;

        j(int i7, CharSequence charSequence) {
            this.f27261a = i7;
            this.f27262b = charSequence;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6784d.this.m29672n2(this.f27261a, this.f27262b);
        }
    }

    /* JADX INFO: renamed from: q.d$k */
    class k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C6786f.b f27264a;

        k(C6786f.b bVar) {
            this.f27264a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6784d.this.f27249p0.m29771l().mo29717c(this.f27264a);
        }
    }

    /* JADX INFO: renamed from: q.d$l */
    private static class l {
        /* JADX INFO: renamed from: a */
        static Intent m29680a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: q.d$m */
    private static class m {
        /* JADX INFO: renamed from: a */
        static void m29681a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        /* JADX INFO: renamed from: b */
        static void m29682b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        /* JADX INFO: renamed from: c */
        static BiometricPrompt m29683c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        /* JADX INFO: renamed from: d */
        static BiometricPrompt.Builder m29684d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        /* JADX INFO: renamed from: e */
        static void m29685e(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        /* JADX INFO: renamed from: f */
        static void m29686f(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        /* JADX INFO: renamed from: g */
        static void m29687g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        /* JADX INFO: renamed from: h */
        static void m29688h(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: q.d$n */
    private static class n {
        /* JADX INFO: renamed from: a */
        static void m29689a(BiometricPrompt.Builder builder, boolean z7) {
            builder.setConfirmationRequired(z7);
        }

        /* JADX INFO: renamed from: b */
        static void m29690b(BiometricPrompt.Builder builder, boolean z7) {
            builder.setDeviceCredentialAllowed(z7);
        }
    }

    /* JADX INFO: renamed from: q.d$o */
    private static class o {
        /* JADX INFO: renamed from: a */
        static void m29691a(BiometricPrompt.Builder builder, int i7) {
            builder.setAllowedAuthenticators(i7);
        }
    }

    /* JADX INFO: renamed from: q.d$p */
    private static class p implements Executor {

        /* JADX INFO: renamed from: a */
        private final Handler f27266a = new Handler(Looper.getMainLooper());

        p() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f27266a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: q.d$q */
    private static class q implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WeakReference f27267a;

        q(C6784d c6784d) {
            this.f27267a = new WeakReference(c6784d);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27267a.get() != null) {
                ((C6784d) this.f27267a.get()).m29673v2();
            }
        }
    }

    /* JADX INFO: renamed from: q.d$r */
    private static class r implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WeakReference f27268a;

        r(C6787g c6787g) {
            this.f27268a = new WeakReference(c6787g);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27268a.get() != null) {
                ((C6787g) this.f27268a.get()).m29753R(false);
            }
        }
    }

    /* JADX INFO: renamed from: q.d$s */
    private static class s implements Runnable {

        /* JADX INFO: renamed from: a */
        private final WeakReference f27269a;

        s(C6787g c6787g) {
            this.f27269a = new WeakReference(c6787g);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f27269a.get() != null) {
                ((C6787g) this.f27269a.get()).m29759X(false);
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    private static int m29642U1(C0466a c0466a) {
        if (c0466a.m2013f()) {
            return !c0466a.m2012e() ? 11 : 0;
        }
        return 12;
    }

    /* JADX INFO: renamed from: V1 */
    private void m29643V1() {
        if (m12184m() == null) {
            return;
        }
        C6787g c6787g = (C6787g) new C2635a0(m12184m()).m12591a(C6787g.class);
        this.f27249p0 = c6787g;
        c6787g.m29768i().m12674k(this, new c());
        this.f27249p0.m29766g().m12674k(this, new d());
        this.f27249p0.m29767h().m12674k(this, new e());
        this.f27249p0.m29783x().m12674k(this, new f());
        this.f27249p0.m29741F().m12674k(this, new g());
        this.f27249p0.m29738C().m12674k(this, new h());
    }

    /* JADX INFO: renamed from: X1 */
    private void m29644X1() {
        this.f27249p0.m29763b0(false);
        if (m12169g0()) {
            AbstractC2599q abstractC2599qM12132K = m12132K();
            C6792l c6792l = (C6792l) abstractC2599qM12132K.m12379h0("androidx.biometric.FingerprintDialogFragment");
            if (c6792l != null) {
                if (c6792l.m12169g0()) {
                    c6792l.mo12083U1();
                } else {
                    abstractC2599qM12132K.m12391n().mo12023o(c6792l).mo12017h();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private int m29645Y1() {
        Context contextM12204u = m12204u();
        return (contextM12204u == null || !AbstractC6790j.m29816f(contextM12204u, Build.MODEL)) ? 2000 : 0;
    }

    /* JADX INFO: renamed from: Z1 */
    private void m29646Z1(int i7) {
        if (i7 == -1) {
            m29655q2(new C6786f.b(null, 1));
        } else {
            m29672n2(10, m12154X(AbstractC6800t.f27362l));
        }
    }

    /* JADX INFO: renamed from: a2 */
    private boolean m29647a2() {
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        return abstractActivityC2592jM12184m != null && abstractActivityC2592jM12184m.isChangingConfigurations();
    }

    /* JADX INFO: renamed from: b2 */
    private boolean m29648b2() {
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        return (abstractActivityC2592jM12184m == null || this.f27249p0.m29773n() == null || !AbstractC6790j.m29817g(abstractActivityC2592jM12184m, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    /* JADX INFO: renamed from: c2 */
    private boolean m29649c2() {
        return Build.VERSION.SDK_INT == 28 && !AbstractC6794n.m29838a(m12204u());
    }

    /* JADX INFO: renamed from: e2 */
    private boolean m29650e2() {
        return Build.VERSION.SDK_INT < 28 || m29648b2() || m29649c2();
    }

    /* JADX INFO: renamed from: f2 */
    private void m29651f2() {
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        if (abstractActivityC2592jM12184m == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerM29834a = AbstractC6793m.m29834a(abstractActivityC2592jM12184m);
        if (keyguardManagerM29834a == null) {
            m29672n2(12, m12154X(AbstractC6800t.f27361k));
            return;
        }
        CharSequence charSequenceM29782w = this.f27249p0.m29782w();
        CharSequence charSequenceM29781v = this.f27249p0.m29781v();
        CharSequence charSequenceM29774o = this.f27249p0.m29774o();
        if (charSequenceM29781v == null) {
            charSequenceM29781v = charSequenceM29774o;
        }
        Intent intentM29680a = l.m29680a(keyguardManagerM29834a, charSequenceM29782w, charSequenceM29781v);
        if (intentM29680a == null) {
            m29672n2(14, m12154X(AbstractC6800t.f27360j));
            return;
        }
        this.f27249p0.m29751P(true);
        if (m29650e2()) {
            m29644X1();
        }
        intentM29680a.setFlags(134742016);
        startActivityForResult(intentM29680a, 1);
    }

    /* JADX INFO: renamed from: g2 */
    static C6784d m29652g2() {
        return new C6784d();
    }

    /* JADX INFO: renamed from: o2 */
    private void m29653o2(int i7, CharSequence charSequence) {
        if (this.f27249p0.m29736A()) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!this.f27249p0.m29784y()) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            this.f27249p0.m29747L(false);
            this.f27249p0.m29772m().execute(new a(i7, charSequence));
        }
    }

    /* JADX INFO: renamed from: p2 */
    private void m29654p2() {
        if (this.f27249p0.m29784y()) {
            this.f27249p0.m29772m().execute(new b());
        } else {
            Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
        }
    }

    /* JADX INFO: renamed from: q2 */
    private void m29655q2(C6786f.b bVar) {
        m29656r2(bVar);
        m29664W1();
    }

    /* JADX INFO: renamed from: r2 */
    private void m29656r2(C6786f.b bVar) {
        if (!this.f27249p0.m29784y()) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            this.f27249p0.m29747L(false);
            this.f27249p0.m29772m().execute(new k(bVar));
        }
    }

    /* JADX INFO: renamed from: s2 */
    private void m29657s2() {
        BiometricPrompt.Builder builderM29684d = m.m29684d(m12214y1().getApplicationContext());
        CharSequence charSequenceM29782w = this.f27249p0.m29782w();
        CharSequence charSequenceM29781v = this.f27249p0.m29781v();
        CharSequence charSequenceM29774o = this.f27249p0.m29774o();
        if (charSequenceM29782w != null) {
            m.m29688h(builderM29684d, charSequenceM29782w);
        }
        if (charSequenceM29781v != null) {
            m.m29687g(builderM29684d, charSequenceM29781v);
        }
        if (charSequenceM29774o != null) {
            m.m29685e(builderM29684d, charSequenceM29774o);
        }
        CharSequence charSequenceM29780u = this.f27249p0.m29780u();
        if (!TextUtils.isEmpty(charSequenceM29780u)) {
            m.m29686f(builderM29684d, charSequenceM29780u, this.f27249p0.m29772m(), this.f27249p0.m29779t());
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            n.m29689a(builderM29684d, this.f27249p0.m29785z());
        }
        int iM29764e = this.f27249p0.m29764e();
        if (i7 >= 30) {
            o.m29691a(builderM29684d, iM29764e);
        } else if (i7 >= 29) {
            n.m29690b(builderM29684d, AbstractC6782b.m29634c(iM29764e));
        }
        m29661R1(m.m29683c(builderM29684d), m12204u());
    }

    /* JADX INFO: renamed from: t2 */
    private void m29658t2() {
        Context applicationContext = m12214y1().getApplicationContext();
        C0466a c0466aM2005c = C0466a.m2005c(applicationContext);
        int iM29642U1 = m29642U1(c0466aM2005c);
        if (iM29642U1 != 0) {
            m29672n2(iM29642U1, AbstractC6791k.m29818a(applicationContext, iM29642U1));
            return;
        }
        if (m12169g0()) {
            this.f27249p0.m29755T(true);
            if (!AbstractC6790j.m29816f(applicationContext, Build.MODEL)) {
                this.f27248o0.postDelayed(new i(), 500L);
                C6792l.m29824k2().mo7649g2(m12132K(), "androidx.biometric.FingerprintDialogFragment");
            }
            this.f27249p0.m29748M(0);
            m29662S1(c0466aM2005c, applicationContext);
        }
    }

    /* JADX INFO: renamed from: u2 */
    private void m29659u2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = m12154X(AbstractC6800t.f27352b);
        }
        this.f27249p0.m29758W(2);
        this.f27249p0.m29756U(charSequence);
    }

    /* JADX INFO: renamed from: Q1 */
    void m29660Q1(C6786f.d dVar, C6786f.c cVar) {
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        if (abstractActivityC2592jM12184m == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        this.f27249p0.m29762a0(dVar);
        int iM29633b = AbstractC6782b.m29633b(dVar, cVar);
        if (Build.VERSION.SDK_INT < 30 && iM29633b == 15 && cVar == null) {
            this.f27249p0.m29752Q(AbstractC6789i.m29793a());
        } else {
            this.f27249p0.m29752Q(cVar);
        }
        if (m29665d2()) {
            this.f27249p0.m29761Z(m12154X(AbstractC6800t.f27351a));
        } else {
            this.f27249p0.m29761Z(null);
        }
        if (m29665d2() && C6785e.m29697g(abstractActivityC2592jM12184m).m29698a(255) != 0) {
            this.f27249p0.m29747L(true);
            m29651f2();
        } else if (this.f27249p0.m29737B()) {
            this.f27248o0.postDelayed(new q(this), 600L);
        } else {
            m29673v2();
        }
    }

    /* JADX INFO: renamed from: R1 */
    void m29661R1(BiometricPrompt biometricPrompt, Context context) {
        BiometricPrompt.CryptoObject cryptoObjectM29796d = AbstractC6789i.m29796d(this.f27249p0.m29773n());
        CancellationSignal cancellationSignalM29787b = this.f27249p0.m29770k().m29787b();
        p pVar = new p();
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackM29624a = this.f27249p0.m29765f().m29624a();
        try {
            if (cryptoObjectM29796d == null) {
                m.m29682b(biometricPrompt, cancellationSignalM29787b, pVar, biometricPrompt$AuthenticationCallbackM29624a);
            } else {
                m.m29681a(biometricPrompt, cryptoObjectM29796d, cancellationSignalM29787b, pVar, biometricPrompt$AuthenticationCallbackM29624a);
            }
        } catch (NullPointerException e7) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e7);
            m29672n2(1, context != null ? context.getString(AbstractC6800t.f27352b) : "");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: S0 */
    public void mo12081S0() {
        super.mo12081S0();
        if (Build.VERSION.SDK_INT == 29 && AbstractC6782b.m29634c(this.f27249p0.m29764e())) {
            this.f27249p0.m29759X(true);
            this.f27248o0.postDelayed(new s(this.f27249p0), 250L);
        }
    }

    /* JADX INFO: renamed from: S1 */
    void m29662S1(C0466a c0466a, Context context) {
        try {
            c0466a.m2010a(AbstractC6789i.m29797e(this.f27249p0.m29773n()), 0, this.f27249p0.m29770k().m29788c(), this.f27249p0.m29765f().m29625b(), null);
        } catch (NullPointerException e7) {
            Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e7);
            m29672n2(1, AbstractC6791k.m29818a(context, 1));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: T0 */
    public void mo5868T0() {
        super.mo5868T0();
        if (Build.VERSION.SDK_INT >= 29 || this.f27249p0.m29736A() || m29647a2()) {
            return;
        }
        m29663T1(0);
    }

    /* JADX INFO: renamed from: T1 */
    void m29663T1(int i7) {
        if (i7 == 3 || !this.f27249p0.m29740E()) {
            if (m29650e2()) {
                this.f27249p0.m29748M(i7);
                if (i7 == 1) {
                    m29653o2(10, AbstractC6791k.m29818a(m12204u(), 10));
                }
            }
            this.f27249p0.m29770k().m29786a();
        }
    }

    /* JADX INFO: renamed from: W1 */
    void m29664W1() {
        this.f27249p0.m29763b0(false);
        m29644X1();
        if (!this.f27249p0.m29736A() && m12169g0()) {
            m12132K().m12391n().mo12023o(this).mo12017h();
        }
        Context contextM12204u = m12204u();
        if (contextM12204u == null || !AbstractC6790j.m29815e(contextM12204u, Build.MODEL)) {
            return;
        }
        this.f27249p0.m29753R(true);
        this.f27248o0.postDelayed(new r(this.f27249p0), 600L);
    }

    /* JADX INFO: renamed from: d2 */
    boolean m29665d2() {
        return Build.VERSION.SDK_INT <= 28 && AbstractC6782b.m29634c(this.f27249p0.m29764e());
    }

    /* JADX INFO: renamed from: h2 */
    void m29666h2(int i7, CharSequence charSequence) {
        if (!AbstractC6791k.m29819b(i7)) {
            i7 = 8;
        }
        Context contextM12204u = m12204u();
        if (Build.VERSION.SDK_INT < 29 && AbstractC6791k.m29820c(i7) && contextM12204u != null && AbstractC6793m.m29835b(contextM12204u) && AbstractC6782b.m29634c(this.f27249p0.m29764e())) {
            m29651f2();
            return;
        }
        if (!m29650e2()) {
            if (charSequence == null) {
                charSequence = m12154X(AbstractC6800t.f27352b) + " " + i7;
            }
            m29672n2(i7, charSequence);
            return;
        }
        if (charSequence == null) {
            charSequence = AbstractC6791k.m29818a(m12204u(), i7);
        }
        if (i7 == 5) {
            int iM29769j = this.f27249p0.m29769j();
            if (iM29769j == 0 || iM29769j == 3) {
                m29653o2(i7, charSequence);
            }
            m29664W1();
            return;
        }
        if (this.f27249p0.m29739D()) {
            m29672n2(i7, charSequence);
        } else {
            m29659u2(charSequence);
            this.f27248o0.postDelayed(new j(i7, charSequence), m29645Y1());
        }
        this.f27249p0.m29755T(true);
    }

    /* JADX INFO: renamed from: i2 */
    void m29667i2() {
        if (m29650e2()) {
            m29659u2(m12154X(AbstractC6800t.f27359i));
        }
        m29654p2();
    }

    /* JADX INFO: renamed from: j2 */
    void m29668j2(CharSequence charSequence) {
        if (m29650e2()) {
            m29659u2(charSequence);
        }
    }

    /* JADX INFO: renamed from: k2 */
    void m29669k2(C6786f.b bVar) {
        m29655q2(bVar);
    }

    /* JADX INFO: renamed from: l2 */
    void m29670l2() {
        CharSequence charSequenceM29780u = this.f27249p0.m29780u();
        if (charSequenceM29780u == null) {
            charSequenceM29780u = m12154X(AbstractC6800t.f27352b);
        }
        m29672n2(13, charSequenceM29780u);
        m29663T1(2);
    }

    /* JADX INFO: renamed from: m2 */
    void m29671m2() {
        m29651f2();
    }

    /* JADX INFO: renamed from: n2 */
    void m29672n2(int i7, CharSequence charSequence) {
        m29653o2(i7, charSequence);
        m29664W1();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: q0 */
    public void mo12194q0(int i7, int i8, Intent intent) {
        super.mo12194q0(i7, i8, intent);
        if (i7 == 1) {
            this.f27249p0.m29751P(false);
            m29646Z1(i8);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        m29643V1();
    }

    /* JADX INFO: renamed from: v2 */
    void m29673v2() {
        if (this.f27249p0.m29742G()) {
            return;
        }
        if (m12204u() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        this.f27249p0.m29763b0(true);
        this.f27249p0.m29747L(true);
        if (m29650e2()) {
            m29658t2();
        } else {
            m29657s2();
        }
    }
}
