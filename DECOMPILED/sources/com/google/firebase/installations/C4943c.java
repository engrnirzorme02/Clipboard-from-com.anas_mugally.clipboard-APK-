package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C4943c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p164V3.C1762g;
import p200a4.C2230w;
import p211b5.InterfaceC2972b;
import p219c5.C3024g;
import p219c5.InterfaceC3022e;
import p229d5.AbstractC5244d;
import p229d5.C5242b;
import p229d5.C5243c;
import p237e5.AbstractC5353d;
import p237e5.AbstractC5355f;
import p237e5.C5352c;

/* JADX INFO: renamed from: com.google.firebase.installations.c */
/* JADX INFO: loaded from: classes.dex */
public class C4943c implements InterfaceC3022e {

    /* JADX INFO: renamed from: m */
    private static final Object f18746m = new Object();

    /* JADX INFO: renamed from: n */
    private static final ThreadFactory f18747n = new a();

    /* JADX INFO: renamed from: a */
    private final C1762g f18748a;

    /* JADX INFO: renamed from: b */
    private final C5352c f18749b;

    /* JADX INFO: renamed from: c */
    private final C5243c f18750c;

    /* JADX INFO: renamed from: d */
    private final C4949i f18751d;

    /* JADX INFO: renamed from: e */
    private final C2230w f18752e;

    /* JADX INFO: renamed from: f */
    private final C3024g f18753f;

    /* JADX INFO: renamed from: g */
    private final Object f18754g;

    /* JADX INFO: renamed from: h */
    private final ExecutorService f18755h;

    /* JADX INFO: renamed from: i */
    private final Executor f18756i;

    /* JADX INFO: renamed from: j */
    private String f18757j;

    /* JADX INFO: renamed from: k */
    private Set f18758k;

    /* JADX INFO: renamed from: l */
    private final List f18759l;

    /* JADX INFO: renamed from: com.google.firebase.installations.c$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final AtomicInteger f18760a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f18760a.getAndIncrement())));
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.c$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f18761a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f18762b;

        static {
            int[] iArr = new int[AbstractC5355f.b.values().length];
            f18762b = iArr;
            try {
                iArr[AbstractC5355f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18762b[AbstractC5355f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18762b[AbstractC5355f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC5353d.b.values().length];
            f18761a = iArr2;
            try {
                iArr2[AbstractC5353d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18761a[AbstractC5353d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    C4943c(final C1762g c1762g, InterfaceC2972b interfaceC2972b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c1762g, new C5352c(c1762g.m7405l(), interfaceC2972b), new C5243c(c1762g), C4949i.m22237c(), new C2230w(new InterfaceC2972b() { // from class: c5.a
            @Override // p211b5.InterfaceC2972b
            public final Object get() {
                return C4943c.m22211e(c1762g);
            }
        }), new C3024g());
    }

    /* JADX INFO: renamed from: A */
    private synchronized void m22206A(String str) {
        this.f18757j = str;
    }

    /* JADX INFO: renamed from: B */
    private synchronized void m22207B(AbstractC5244d abstractC5244d, AbstractC5244d abstractC5244d2) {
        if (this.f18758k.size() != 0 && !TextUtils.equals(abstractC5244d.mo24201d(), abstractC5244d2.mo24201d())) {
            Iterator it = this.f18758k.iterator();
            if (it.hasNext()) {
                AbstractC2263x.m9328a(it.next());
                abstractC5244d2.mo24201d();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C5242b m22211e(C1762g c1762g) {
        return new C5242b(c1762g);
    }

    /* JADX INFO: renamed from: f */
    private Task m22212f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m22214h(new C4945e(this.f18751d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: g */
    private Task m22213g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m22214h(new C4946f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: h */
    private void m22214h(InterfaceC4948h interfaceC4948h) {
        synchronized (this.f18754g) {
            this.f18759l.add(interfaceC4948h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m22215i(boolean z7) {
        AbstractC5244d abstractC5244dM22227x;
        AbstractC5244d abstractC5244dM22222r = m22222r();
        try {
            if (abstractC5244dM22222r.m24230i() || abstractC5244dM22222r.m24233l()) {
                abstractC5244dM22227x = m22227x(abstractC5244dM22222r);
            } else {
                if (!z7 && !this.f18751d.m22244f(abstractC5244dM22222r)) {
                    return;
                }
                abstractC5244dM22227x = m22217k(abstractC5244dM22222r);
            }
            m22224u(abstractC5244dM22227x);
            m22207B(abstractC5244dM22222r, abstractC5244dM22227x);
            if (abstractC5244dM22227x.m24232k()) {
                m22206A(abstractC5244dM22227x.mo24201d());
            }
            if (abstractC5244dM22227x.m24230i()) {
                m22228y(new C4944d(C4944d.a.BAD_CONFIG));
            } else if (abstractC5244dM22227x.m24231j()) {
                m22228y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                m22229z(abstractC5244dM22227x);
            }
        } catch (C4944d e7) {
            m22228y(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m22216j(final boolean z7) {
        AbstractC5244d abstractC5244dM22223s = m22223s();
        if (z7) {
            abstractC5244dM22223s = abstractC5244dM22223s.m24236p();
        }
        m22229z(abstractC5244dM22223s);
        this.f18756i.execute(new Runnable() { // from class: c5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f12449a.m22215i(z7);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    private AbstractC5244d m22217k(AbstractC5244d abstractC5244d) throws C4944d {
        AbstractC5355f abstractC5355fM24373e = this.f18749b.m24373e(m22230l(), abstractC5244d.mo24201d(), m22232t(), abstractC5244d.mo24203f());
        int i7 = b.f18762b[abstractC5355fM24373e.mo24348b().ordinal()];
        if (i7 == 1) {
            return abstractC5244d.m24235o(abstractC5355fM24373e.mo24349c(), abstractC5355fM24373e.mo24350d(), this.f18751d.m22242b());
        }
        if (i7 == 2) {
            return abstractC5244d.m24237q("BAD CONFIG");
        }
        if (i7 != 3) {
            throw new C4944d("Firebase Installations Service is unavailable. Please try again later.", C4944d.a.UNAVAILABLE);
        }
        m22206A(null);
        return abstractC5244d.m24238r();
    }

    /* JADX INFO: renamed from: n */
    private synchronized String m22218n() {
        return this.f18757j;
    }

    /* JADX INFO: renamed from: o */
    private C5242b m22219o() {
        return (C5242b) this.f18752e.get();
    }

    /* JADX INFO: renamed from: p */
    public static C4943c m22220p() {
        return m22221q(C1762g.m7394m());
    }

    /* JADX INFO: renamed from: q */
    public static C4943c m22221q(C1762g c1762g) {
        AbstractC3718s.m18073b(c1762g != null, "Null is not a valid value of FirebaseApp.");
        return (C4943c) c1762g.m7404j(InterfaceC3022e.class);
    }

    /* JADX INFO: renamed from: r */
    private AbstractC5244d m22222r() {
        AbstractC5244d abstractC5244dM24227d;
        synchronized (f18746m) {
            try {
                C4942b c4942bM22204a = C4942b.m22204a(this.f18748a.m7405l(), "generatefid.lock");
                try {
                    abstractC5244dM24227d = this.f18750c.m24227d();
                    if (c4942bM22204a != null) {
                        c4942bM22204a.m22205b();
                    }
                } catch (Throwable th) {
                    if (c4942bM22204a != null) {
                        c4942bM22204a.m22205b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC5244dM24227d;
    }

    /* JADX INFO: renamed from: s */
    private AbstractC5244d m22223s() {
        AbstractC5244d abstractC5244dM24227d;
        synchronized (f18746m) {
            try {
                C4942b c4942bM22204a = C4942b.m22204a(this.f18748a.m7405l(), "generatefid.lock");
                try {
                    abstractC5244dM24227d = this.f18750c.m24227d();
                    if (abstractC5244dM24227d.m24231j()) {
                        abstractC5244dM24227d = this.f18750c.m24226b(abstractC5244dM24227d.m24240t(m22226w(abstractC5244dM24227d)));
                    }
                    if (c4942bM22204a != null) {
                        c4942bM22204a.m22205b();
                    }
                } catch (Throwable th) {
                    if (c4942bM22204a != null) {
                        c4942bM22204a.m22205b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC5244dM24227d;
    }

    /* JADX INFO: renamed from: u */
    private void m22224u(AbstractC5244d abstractC5244d) {
        synchronized (f18746m) {
            try {
                C4942b c4942bM22204a = C4942b.m22204a(this.f18748a.m7405l(), "generatefid.lock");
                try {
                    this.f18750c.m24226b(abstractC5244d);
                    if (c4942bM22204a != null) {
                        c4942bM22204a.m22205b();
                    }
                } catch (Throwable th) {
                    if (c4942bM22204a != null) {
                        c4942bM22204a.m22205b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private void m22225v() {
        AbstractC3718s.m18078g(m22231m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3718s.m18078g(m22232t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3718s.m18078g(m22230l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3718s.m18073b(C4949i.m22240h(m22231m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3718s.m18073b(C4949i.m22239g(m22230l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX INFO: renamed from: w */
    private String m22226w(AbstractC5244d abstractC5244d) {
        if ((!this.f18748a.m7406o().equals("CHIME_ANDROID_SDK") && !this.f18748a.m7410w()) || !abstractC5244d.m24234m()) {
            return this.f18753f.m14995a();
        }
        String strM24222f = m22219o().m24222f();
        return TextUtils.isEmpty(strM24222f) ? this.f18753f.m14995a() : strM24222f;
    }

    /* JADX INFO: renamed from: x */
    private AbstractC5244d m22227x(AbstractC5244d abstractC5244d) throws C4944d {
        AbstractC5353d abstractC5353dM24372d = this.f18749b.m24372d(m22230l(), abstractC5244d.mo24201d(), m22232t(), m22231m(), (abstractC5244d.mo24201d() == null || abstractC5244d.mo24201d().length() != 11) ? null : m22219o().m24223i());
        int i7 = b.f18761a[abstractC5353dM24372d.mo24340e().ordinal()];
        if (i7 == 1) {
            return abstractC5244d.m24239s(abstractC5353dM24372d.mo24338c(), abstractC5353dM24372d.mo24339d(), this.f18751d.m22242b(), abstractC5353dM24372d.mo24337b().mo24349c(), abstractC5353dM24372d.mo24337b().mo24350d());
        }
        if (i7 == 2) {
            return abstractC5244d.m24237q("BAD CONFIG");
        }
        throw new C4944d("Firebase Installations Service is unavailable. Please try again later.", C4944d.a.UNAVAILABLE);
    }

    /* JADX INFO: renamed from: y */
    private void m22228y(Exception exc) {
        synchronized (this.f18754g) {
            try {
                Iterator it = this.f18759l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC4948h) it.next()).mo22234a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    private void m22229z(AbstractC5244d abstractC5244d) {
        synchronized (this.f18754g) {
            try {
                Iterator it = this.f18759l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC4948h) it.next()).mo22235b(abstractC5244d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p219c5.InterfaceC3022e
    /* JADX INFO: renamed from: a */
    public Task mo14992a(final boolean z7) {
        m22225v();
        Task taskM22212f = m22212f();
        this.f18755h.execute(new Runnable() { // from class: c5.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f12447a.m22216j(z7);
            }
        });
        return taskM22212f;
    }

    @Override // p219c5.InterfaceC3022e
    public Task getId() {
        m22225v();
        String strM22218n = m22218n();
        if (strM22218n != null) {
            return Tasks.forResult(strM22218n);
        }
        Task taskM22213g = m22213g();
        this.f18755h.execute(new Runnable() { // from class: c5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f12446a.m22216j(false);
            }
        });
        return taskM22213g;
    }

    /* JADX INFO: renamed from: l */
    String m22230l() {
        return this.f18748a.m7407p().m7422b();
    }

    /* JADX INFO: renamed from: m */
    String m22231m() {
        return this.f18748a.m7407p().m7423c();
    }

    /* JADX INFO: renamed from: t */
    String m22232t() {
        return this.f18748a.m7407p().m7426f();
    }

    C4943c(ExecutorService executorService, Executor executor, C1762g c1762g, C5352c c5352c, C5243c c5243c, C4949i c4949i, C2230w c2230w, C3024g c3024g) {
        this.f18754g = new Object();
        this.f18758k = new HashSet();
        this.f18759l = new ArrayList();
        this.f18748a = c1762g;
        this.f18749b = c5352c;
        this.f18750c = c5243c;
        this.f18751d = c4949i;
        this.f18752e = c2230w;
        this.f18753f = c3024g;
        this.f18755h = executorService;
        this.f18756i = executor;
    }
}
