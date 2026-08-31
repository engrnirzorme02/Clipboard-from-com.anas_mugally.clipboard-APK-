package p268i4;

import androidx.lifecycle.AbstractC2636b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p228d4.C5235g;
import p260h4.C5653i;
import p300m4.C6346g;

/* JADX INFO: renamed from: i4.n */
/* JADX INFO: loaded from: classes.dex */
public class C5718n {

    /* JADX INFO: renamed from: a */
    private final C5711g f21820a;

    /* JADX INFO: renamed from: b */
    private final C5653i f21821b;

    /* JADX INFO: renamed from: c */
    private String f21822c;

    /* JADX INFO: renamed from: d */
    private final a f21823d = new a(false);

    /* JADX INFO: renamed from: e */
    private final a f21824e = new a(true);

    /* JADX INFO: renamed from: f */
    private final C5715k f21825f = new C5715k(128);

    /* JADX INFO: renamed from: g */
    private final AtomicMarkableReference f21826g = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4.n$a */
    class a {

        /* JADX INFO: renamed from: a */
        final AtomicMarkableReference f21827a;

        /* JADX INFO: renamed from: b */
        private final AtomicReference f21828b = new AtomicReference(null);

        /* JADX INFO: renamed from: c */
        private final boolean f21829c;

        public a(boolean z7) {
            this.f21829c = z7;
            this.f21827a = new AtomicMarkableReference(new C5709e(64, z7 ? 8192 : 1024), false);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m25361a(a aVar) throws Throwable {
            aVar.f21828b.set(null);
            aVar.m25363d();
        }

        /* JADX INFO: renamed from: c */
        private void m25362c() {
            Runnable runnable = new Runnable() { // from class: i4.m
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C5718n.a.m25361a(this.f21819a);
                }
            };
            if (AbstractC2636b.m12603a(this.f21828b, null, runnable)) {
                C5718n.this.f21821b.f21641b.m25132e(runnable);
            }
        }

        /* JADX INFO: renamed from: d */
        private void m25363d() throws Throwable {
            Map mapM25282a;
            synchronized (this) {
                try {
                    if (this.f21827a.isMarked()) {
                        mapM25282a = ((C5709e) this.f21827a.getReference()).m25282a();
                        AtomicMarkableReference atomicMarkableReference = this.f21827a;
                        atomicMarkableReference.set((C5709e) atomicMarkableReference.getReference(), false);
                    } else {
                        mapM25282a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapM25282a != null) {
                C5718n.this.f21820a.m25309r(C5718n.this.f21822c, mapM25282a, this.f21829c);
            }
        }

        /* JADX INFO: renamed from: b */
        public Map m25364b() {
            return ((C5709e) this.f21827a.getReference()).m25282a();
        }

        /* JADX INFO: renamed from: e */
        public boolean m25365e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((C5709e) this.f21827a.getReference()).m25283d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f21827a;
                    atomicMarkableReference.set((C5709e) atomicMarkableReference.getReference(), true);
                    m25362c();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C5718n(String str, C6346g c6346g, C5653i c5653i) {
        this.f21822c = str;
        this.f21820a = new C5711g(c6346g);
        this.f21821b = c5653i;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25349a(C5718n c5718n, String str, Map map, List list) throws Throwable {
        if (c5718n.m25358h() != null) {
            c5718n.f21820a.m25311t(str, c5718n.m25358h());
        }
        if (!map.isEmpty()) {
            c5718n.f21820a.m25308q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        c5718n.f21820a.m25310s(str, list);
    }

    /* JADX INFO: renamed from: i */
    public static C5718n m25353i(String str, C6346g c6346g, C5653i c5653i) {
        C5711g c5711g = new C5711g(c6346g);
        C5718n c5718n = new C5718n(str, c6346g, c5653i);
        ((C5709e) c5718n.f21823d.f21827a.getReference()).m25284e(c5711g.m25305i(str, false));
        ((C5709e) c5718n.f21824e.f21827a.getReference()).m25284e(c5711g.m25305i(str, true));
        c5718n.f21826g.set(c5711g.m25307k(str), false);
        c5718n.f21825f.m25348c(c5711g.m25306j(str));
        return c5718n;
    }

    /* JADX INFO: renamed from: j */
    public static String m25354j(String str, C6346g c6346g) {
        return new C5711g(c6346g).m25307k(str);
    }

    /* JADX INFO: renamed from: e */
    public Map m25355e(Map map) {
        if (map.isEmpty()) {
            return this.f21823d.m25364b();
        }
        HashMap map2 = new HashMap(this.f21823d.m25364b());
        int i7 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strM25281c = C5709e.m25281c((String) entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strM25281c)) {
                map2.put(strM25281c, C5709e.m25281c((String) entry.getValue(), 1024));
            } else {
                i7++;
            }
        }
        if (i7 > 0) {
            C5235g.m24179f().m24188k("Ignored " + i7 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: f */
    public Map m25356f() {
        return this.f21824e.m25364b();
    }

    /* JADX INFO: renamed from: g */
    public List m25357g() {
        return this.f21825f.m25346a();
    }

    /* JADX INFO: renamed from: h */
    public String m25358h() {
        return (String) this.f21826g.getReference();
    }

    /* JADX INFO: renamed from: k */
    public boolean m25359k(String str, String str2) {
        return this.f21824e.m25365e(str, str2);
    }

    /* JADX INFO: renamed from: l */
    public void m25360l(final String str) {
        synchronized (this.f21822c) {
            this.f21822c = str;
            final Map mapM25364b = this.f21823d.m25364b();
            final List listM25347b = this.f21825f.m25347b();
            this.f21821b.f21641b.m25132e(new Runnable() { // from class: i4.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C5718n.m25349a(this.f21815a, str, mapM25364b, listM25347b);
                }
            });
        }
    }
}
