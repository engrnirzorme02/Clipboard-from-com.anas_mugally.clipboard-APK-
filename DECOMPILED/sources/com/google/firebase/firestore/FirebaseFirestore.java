package com.google.firebase.firestore;

import android.content.Context;
import p123P4.AbstractC1221a;
import p123P4.C1224d;
import p123P4.C1228h;
import p137R4.AbstractC1363j;
import p137R4.C1365l;
import p137R4.C1379z;
import p158U4.C1682f;
import p158U4.C1696t;
import p164V3.C1762g;
import p179X4.C1998u;
import p179X4.InterfaceC1958E;
import p186Y4.AbstractC2051s;
import p186Y4.C2037e;
import p186Y4.InterfaceC2047o;
import p211b5.InterfaceC2971a;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseFirestore {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2047o f18646a;

    /* JADX INFO: renamed from: b */
    private final Context f18647b;

    /* JADX INFO: renamed from: c */
    private final C1682f f18648c;

    /* JADX INFO: renamed from: d */
    private final String f18649d;

    /* JADX INFO: renamed from: e */
    private final AbstractC1221a f18650e;

    /* JADX INFO: renamed from: f */
    private final AbstractC1221a f18651f;

    /* JADX INFO: renamed from: g */
    private final C1762g f18652g;

    /* JADX INFO: renamed from: h */
    private final C4940z f18653h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC4914a f18654i;

    /* JADX INFO: renamed from: l */
    private final InterfaceC1958E f18657l;

    /* JADX INFO: renamed from: k */
    final C4930p f18656k = new C4930p(new InterfaceC2047o() { // from class: com.google.firebase.firestore.m
        @Override // p186Y4.InterfaceC2047o
        public final Object apply(Object obj) {
            return this.f18684a.m22144g((C2037e) obj);
        }
    });

    /* JADX INFO: renamed from: j */
    private C4929o f18655j = new C4929o.b().m22186f();

    /* JADX INFO: renamed from: com.google.firebase.firestore.FirebaseFirestore$a */
    public interface InterfaceC4914a {
    }

    FirebaseFirestore(Context context, C1682f c1682f, String str, AbstractC1221a abstractC1221a, AbstractC1221a abstractC1221a2, InterfaceC2047o interfaceC2047o, C1762g c1762g, InterfaceC4914a interfaceC4914a, InterfaceC1958E interfaceC1958E) {
        this.f18647b = (Context) AbstractC2051s.m8520a(context);
        this.f18648c = (C1682f) AbstractC2051s.m8520a((C1682f) AbstractC2051s.m8520a(c1682f));
        this.f18653h = new C4940z(c1682f);
        this.f18649d = (String) AbstractC2051s.m8520a(str);
        this.f18650e = (AbstractC1221a) AbstractC2051s.m8520a(abstractC1221a);
        this.f18651f = (AbstractC1221a) AbstractC2051s.m8520a(abstractC1221a2);
        this.f18646a = (InterfaceC2047o) AbstractC2051s.m8520a(interfaceC2047o);
        this.f18652g = c1762g;
        this.f18654i = interfaceC4914a;
        this.f18657l = interfaceC1958E;
    }

    /* JADX INFO: renamed from: e */
    public static FirebaseFirestore m22142e(C1762g c1762g) {
        return m22143f(c1762g, "(default)");
    }

    /* JADX INFO: renamed from: f */
    public static FirebaseFirestore m22143f(C1762g c1762g, String str) {
        AbstractC2051s.m8521b(c1762g, "Provided FirebaseApp must not be null.");
        AbstractC2051s.m8521b(str, "Provided database name must not be null.");
        C4931q c4931q = (C4931q) c1762g.m7404j(C4931q.class);
        AbstractC2051s.m8521b(c4931q, "Firestore component is not present.");
        return c4931q.m22190a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public C1379z m22144g(C2037e c2037e) {
        C1379z c1379z;
        synchronized (this.f18656k) {
            c1379z = new C1379z(this.f18647b, new C1365l(this.f18648c, this.f18649d, this.f18655j.m22178c(), this.f18655j.m22180e()), this.f18650e, this.f18651f, c2037e, this.f18657l, (AbstractC1363j) this.f18646a.apply(this.f18655j));
        }
        return c1379z;
    }

    /* JADX INFO: renamed from: h */
    static FirebaseFirestore m22145h(Context context, C1762g c1762g, InterfaceC2971a interfaceC2971a, InterfaceC2971a interfaceC2971a2, String str, InterfaceC4914a interfaceC4914a, InterfaceC1958E interfaceC1958E) {
        String strM7426f = c1762g.m7407p().m7426f();
        if (strM7426f == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        return new FirebaseFirestore(context, C1682f.m7066d(strM7426f, str), c1762g.m7406o(), new C1228h(interfaceC2971a), new C1224d(interfaceC2971a2), new InterfaceC2047o() { // from class: com.google.firebase.firestore.l
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return AbstractC1363j.m5878h((C4929o) obj);
            }
        }, c1762g, interfaceC4914a, interfaceC1958E);
    }

    static void setClientLanguage(String str) {
        C1998u.m8361g(str);
    }

    /* JADX INFO: renamed from: b */
    Object m22146b(InterfaceC2047o interfaceC2047o) {
        return this.f18656k.m22187a(interfaceC2047o);
    }

    /* JADX INFO: renamed from: c */
    public C4916b m22147c(String str) {
        AbstractC2051s.m8521b(str, "Provided collection path must not be null.");
        this.f18656k.m22188b();
        return new C4916b(C1696t.m7147A(str), this);
    }

    /* JADX INFO: renamed from: d */
    C1682f m22148d() {
        return this.f18648c;
    }
}
